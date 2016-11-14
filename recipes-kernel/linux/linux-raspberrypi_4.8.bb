FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

LINUX_VERSION ?= "4.8.6"

SRCREV = "6927ac4dfe2dddffb55c5c12ba072aff5d312f4e"
SRC_URI = "git://github.com/raspberrypi/linux.git;branch=rpi-4.8.y"

KERNEL_DEFCONFIG_raspberrypi2 = "bcmrpi3_defconfig"

require recipes-kernel/linux/linux-raspberrypi.inc
