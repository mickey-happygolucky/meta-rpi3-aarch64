do_deploy_append() {
	for i in ${S}/*.uimg; do
        cp $i ${DEPLOYDIR}/${PN}
    done
}