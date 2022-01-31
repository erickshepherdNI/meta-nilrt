SUMMARY = "Open-source package dependencies of NI proprietary and internal products."
LICENSE = "MIT"

inherit packagegroup

# NI-RFSA/G
# Contact: Dharaniprakash Kurdimath <dharaniprakash.kurdimath@ni.com>
RDEPENDS_${PN} += "\
	tbb \
"

# nissl and nissleay
# Contact: Haris Okanovic <haris.okanovic@ni.com>
RDEPENDS_${PN} += "\
	apache-websocket \
	apache2 \
	apr-iconv \
"

# ni-sync
RDEPENDS_${PN} += "\
	ni-grpc-device \
"

# Required components for Veristand.
# Engineering contact: Marcelo Izaguirre
RDEPENDS_${PN} += "\
	libfmi \
"
