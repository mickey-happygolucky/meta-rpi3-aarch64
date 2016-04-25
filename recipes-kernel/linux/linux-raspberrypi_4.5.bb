FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

LINUX_VERSION ?= "4.5.0"

SRCREV = "51d1fa5c3208f15e80d25d85ce03330909916cc8"
SRC_URI = "git://github.com/Electron752/linux.git;branch=rpi-4.5.y+rpi364"

KERNEL_DEFCONFIG_raspberrypi2 = "bcmrpi3_defconfig"


#require ${TOPDIR}/meta-raspberrypi/recipes-kernel/linux/linux-raspberrypi.inc
require recipes-kernel/linux/linux-raspberrypi.inc
