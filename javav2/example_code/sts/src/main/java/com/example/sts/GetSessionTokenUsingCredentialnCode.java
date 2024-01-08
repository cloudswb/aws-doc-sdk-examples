package com.example.sts;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.sts.StsClient;
import software.amazon.awssdk.services.sts.model.GetSessionTokenRequest;

public class GetSessionTokenUsingCredentialnCode {

    public static void main(String[] args) {
        Region region = Region.US_EAST_1;


        AwsBasicCredentials creds = AwsBasicCredentials.create("ACCESS-KEY-TO-REPLACE", "SECRET-KEY-TO-REPLACE");
        // Create StaticCredentialsProvider
        StaticCredentialsProvider staticCredentialsProvider = StaticCredentialsProvider.create(creds);

        StsClient stsClient = StsClient.builder()
                .credentialsProvider(staticCredentialsProvider)
                .region(region)
                .build();

        getToken(stsClient);
        stsClient.close();
    }

    public static String getToken(StsClient stsClient)
    {

        GetSessionTokenRequest tokenRequest = GetSessionTokenRequest.builder()
                .durationSeconds(15 * 60) // 15 minutes
                .build();

        return stsClient.getSessionToken(tokenRequest).credentials().toString();
    }


}
