FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

LINUX_VERSION ?= "4.8.2"

SRCREV = "0105b0ea92b1614ac00329a530da940053e64a4a"
SRC_URI = "git://github.com/raspberrypi/linux.git;branch=rpi-4.8.y"

KERNEL_DEFCONFIG_raspberrypi2 = "bcmrpi3_defconfig"

require recipes-kernel/linux/linux-raspberrypi.inc
