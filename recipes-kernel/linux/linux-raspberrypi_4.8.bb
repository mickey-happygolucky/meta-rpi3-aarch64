FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

LINUX_VERSION ?= "4.8.0"

SRCREV = "be887b1e7f532f0e253d6fcf2a1c8781b8df7aa2"
SRC_URI = "git://github.com/raspberrypi/linux.git;branch=rpi-4.8.y"

KERNEL_DEFCONFIG_raspberrypi2 = "bcmrpi3_defconfig"

require recipes-kernel/linux/linux-raspberrypi.inc
