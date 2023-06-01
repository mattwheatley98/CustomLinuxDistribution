SUMMARY = "Car Control"
DESCRIPTION = "This recipe provides a master interface for the car"

LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://src"

S = "${WORKDIR}/src"

TARGET_CC_ARCH += "${LDFLAGS}"

do_compile() {
    ${CC} carcontrol.c -o carcontrol
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 carcontrol ${D}${bindir}
}

