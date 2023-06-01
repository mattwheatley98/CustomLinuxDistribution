SUMMARY = "My custom Linux image"

IMAGE_FEATURES += "splash"

LICENSE = "MIT"

inherit core-image

# Include your custom application
IMAGE_INSTALL += "helloapp"
IMAGE_INSTALL += "carcontrol"
