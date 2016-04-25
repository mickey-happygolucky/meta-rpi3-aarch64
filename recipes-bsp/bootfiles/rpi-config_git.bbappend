do_deploy_append() {
     echo ""
	 echo "## settings for aarch64 kernel" >>${DEPLOYDIR}/bcm2835-bootfiles/config.txt
	 echo "##"
	 echo "enable_uart=1" >>${DEPLOYDIR}/bcm2835-bootfiles/config.txt
	 echo "arm_control=0x200" >>${DEPLOYDIR}/bcm2835-bootfiles/config.txt
	 sed -i '/#kernel_old=/ c\kernel_old=1' ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
	 sed -i '/#kernel=/ c\kernel=u-boot-stubbed.bin' ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
	 sed -i '/#disable_commandline_tags=/ c\disable_commandline_tags=1' ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
}