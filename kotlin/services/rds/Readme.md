# Amazon RDS code examples for the SDK for Kotlin

## Overview

Shows how to use the AWS SDK for Kotlin to work with Amazon Relational Database Service (Amazon RDS).

<!--custom.overview.start-->
<!--custom.overview.end-->

_Amazon RDS is a web service that makes it easier to set up, operate, and scale a relational database in the cloud._

## ⚠ Important

* Running this code might result in charges to your AWS account. For more details, see [AWS Pricing](https://aws.amazon.com/pricing/?aws-products-pricing.sort-by=item.additionalFields.productNameLowercase&aws-products-pricing.sort-order=asc&awsf.Free%20Tier%20Type=*all&awsf.tech-category=*all) and [Free Tier](https://aws.amazon.com/free/?all-free-tier.sort-by=item.additionalFields.SortRank&all-free-tier.sort-order=asc&awsf.Free%20Tier%20Types=*all&awsf.Free%20Tier%20Categories=*all).
* Running the tests might result in charges to your AWS account.
* We recommend that you grant your code least privilege. At most, grant only the minimum permissions required to perform the task. For more information, see [Grant least privilege](https://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html#grant-least-privilege).
* This code is not tested in every AWS Region. For more information, see [AWS Regional Services](https://aws.amazon.com/about-aws/global-infrastructure/regional-product-services).

<!--custom.important.start-->
<!--custom.important.end-->

## Code examples

### Prerequisites

For prerequisites, see the [README](../../README.md#Prerequisites) in the `kotlin` folder.


<!--custom.prerequisites.start-->
<!--custom.prerequisites.end-->

### Single actions

Code excerpts that show you how to call individual service functions.

- [Create a DB instance](src/main/kotlin/com/kotlin/rds/CreateDBInstance.kt#L61) (`CreateDBInstance`)
- [Delete a DB instance](src/main/kotlin/com/kotlin/rds/DeleteDBInstance.kt#L44) (`DeleteDBInstance`)
- [Describe DB instances](src/main/kotlin/com/kotlin/rds/DescribeDBInstances.kt#L27) (`DescribeDBInstances`)
- [Modify a DB instance](src/main/kotlin/com/kotlin/rds/ModifyDBInstance.kt#L46) (`ModifyDBInstance`)
- [Retrieve attributes](src/main/kotlin/com/kotlin/rds/DescribeAccountAttributes.kt#L28) (`DescribeAccountAttributes`)

### Scenarios

Code examples that show you how to accomplish a specific task by calling multiple
functions within the same service.

- [Get started with DB instances](src/main/kotlin/com/kotlin/rds/RDSScenario.kt)


<!--custom.examples.start-->

### Custom Examples

- [Create an Amazon RDS snapshot](https://github.com/awsdocs/aws-doc-sdk-examples/tree/main/kotlin/services/rds/src/main/kotlin/com/kotlin/rds/CreateDBSnapshot.kt) (CreateDBSnapshot command)
<!--custom.examples.end-->

## Run the examples

### Instructions


<!--custom.instructions.start-->
<!--custom.instructions.end-->



#### Get started with DB instances

This example shows you how to do the following:

- Create a custom DB parameter group and set parameter values.
- Create a DB instance that's configured to use the parameter group. The DB instance also contains a database.
- Take a snapshot of the instance.
- Delete the instance and parameter group.

<!--custom.scenario_prereqs.rds_Scenario_GetStartedInstances.start-->
<!--custom.scenario_prereqs.rds_Scenario_GetStartedInstances.end-->


<!--custom.scenarios.rds_Scenario_GetStartedInstances.start-->
<!--custom.scenarios.rds_Scenario_GetStartedInstances.end-->

### Tests

⚠ Running tests might result in charges to your AWS account.


To find instructions for running these tests, see the [README](../../README.md#Tests)
in the `kotlin` folder.



<!--custom.tests.start-->
<!--custom.tests.end-->

## Additional resources

- [Amazon RDS User Guide](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Welcome.html)
- [Amazon RDS API Reference](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/Welcome.html)
- [SDK for Kotlin Amazon RDS reference](https://sdk.amazonaws.com/kotlin/api/latest/rds/index.html)

<!--custom.resources.start-->
<!--custom.resources.end-->

---

Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.

SPDX-License-Identifier: Apache-2.0