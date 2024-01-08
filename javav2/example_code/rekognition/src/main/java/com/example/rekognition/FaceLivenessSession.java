// snippet-sourcedescription:[DetectFaces.java demonstrates how to detect faces in an image.]
//snippet-keyword:[AWS SDK for Java v2]
// snippet-service:[Amazon Rekognition]

/*
   Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
   SPDX-License-Identifier: Apache-2.0
*/

package com.example.rekognition;

// snippet-start:[rekognition.java2.detect_faces.main]
// snippet-start:[rekognition.java2.detect_faces.import]
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.rekognition.RekognitionClient;
import software.amazon.awssdk.services.rekognition.model.*;
// snippet-end:[rekognition.java2.detect_faces.import]

/**
 * Before running this Java V2 code example, you can set up your development environment, including your credentials. Or you can specify credential in code use CustomAwsCredentialsProvider
 *
 * For more information, see the following documentation topic:
 *
 * https://docs.aws.amazon.com/sdk-for-java/latest/developer-guide/get-started.html
 */
public class FaceLivenessSession {
    public static void main(String[] args) {
        final String usage = """

            Usage:    <sourceImage>

            Where:
               sourceImage - The path to the image (for example, C:\\AWS\\pic1.png).\s
            """;

        if (args.length != 1) {
            System.out.println(usage);
            System.exit(1);
        }

        String sourceImage = args[0];
        Region region = Region.US_EAST_1;

        // Use credential from system environment
        /*
            RekognitionClient rekClient = RekognitionClient.builder()
            .credentialsProvider(EnvironmentVariableCredentialsProvider.create())
            .region(region)
            .build();
        */

        // Use customized credential
        RekognitionClient rekClient = RekognitionClient.builder()
                .credentialsProvider(new CustomAwsCredentialsProvider("ACCESS-KEY", "SECRET-KEY"))
                .region(region)
                .build();

        String sessionId = createFaceLivenessSession(rekClient);
        getFaceLivenessSessionResults(rekClient, sessionId);

        rekClient.close();
    }

    private static String createFaceLivenessSession(RekognitionClient rekClient) {
        try {

            CreateFaceLivenessSessionRequest livenessSessionRequest = CreateFaceLivenessSessionRequest
                    .builder()
                    .build();

            CreateFaceLivenessSessionResponse livenessSessionResponse = rekClient.createFaceLivenessSession(livenessSessionRequest);
            System.out.println("There is a session id : " + livenessSessionResponse.sessionId());
            return livenessSessionResponse.sessionId();
        } catch (RekognitionException e) {
            System.out.println(e.getMessage());
            System.exit(1);
            return null;
        }
    }

    private static String getFaceLivenessSessionResults(RekognitionClient rekClient, String sessionId) {
        try {
            GetFaceLivenessSessionResultsRequest livenessSessionRequest = GetFaceLivenessSessionResultsRequest
                    .builder()
                    .sessionId(sessionId)
                    .build();

            GetFaceLivenessSessionResultsResponse livenessSessionResponse = rekClient.getFaceLivenessSessionResults(livenessSessionRequest);
            System.out.println("There is a session result : " + livenessSessionResponse.toString());
            return livenessSessionResponse.toString();
        } catch (RekognitionException e) {
            System.out.println(e.getMessage());
            System.exit(1);
            return null;
        }
    }
}
// snippet-end:[rekognition.java2.detect_faces.main]
