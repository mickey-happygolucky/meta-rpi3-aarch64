FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

LINUX_VERSION ?= "4.6.0"

SRCREV = "b48d47a32b2f27f55904e7248dbe5f8ff434db0a"
SRC_URI = "git://github.com/Electron752/linux.git;branch=rpi-4.6.y+rpi364"

KERNEL_DEFCONFIG_raspberrypi2 = "bcmrpi3_defconfig"

#require ${TOPDIR}/meta-raspberrypi/recipes-kernel/linux/linux-raspberrypi.inc
require recipes-kernel/linux/linux-raspberrypi.inc
