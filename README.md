# Alien Neighbourhood Watch

Based on the [Vonage Java Server SDK](https://github.com/Vonage/vonage-java-sdk).

## VCR Deployment
This demo is designed to be deployed to [Vonage Cloud Runtime](https://developer.vonage.com/en/vcr/overview).
You need to [install the Cloud Runtime CLI](https://github.com/Vonage/cloud-runtime-cli?tab=readme-ov-file#installation),
and [configure it](https://github.com/Vonage/cloud-runtime-cli/blob/main/docs/vcr.md).

Make sure the project is built using `mvn clean install`. Then run `vcr deploy --app-id $VONAGE_APPLICATION_ID`.
The manifest for VCR deployment is defined in [vcr.yml](vcr.yml).
