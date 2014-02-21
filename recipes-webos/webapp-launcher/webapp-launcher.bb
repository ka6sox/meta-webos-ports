SUMMARY = "This is the web application launcher for the Luna Next webOS UI platform."
LICENSE = "GPL-3.0 & Apache-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=0f93d2cf04b94ac3f04a789a1fb11ead \
    file://COPYING-Apache-2.0;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

DEPENDS = "qtbase qtdeclarative qtwebkit luna-sysmgr-common libwebos-application"
RDEPENDS_${PN} += " \
    qtdeclarative-qmlplugins \
    qtwebkit-qmlplugins \
    libconnman-qt \
"

WEBOS_VERSION = "0.1.0-14_b3b365fb1e3af261305d7b55f2deb5adfd8fd71b"

inherit webos_component
inherit webos_public_repo
inherit webos_enhanced_submissions
inherit webos_system_bus

SRC_URI = "git://github.com/webOS-ports/${PN};protocol=git;branch=master"
S = "${WORKDIR}/git"

# We need to warrant the correct order for the following two inherits as webos_cmake is
# setting the build dir to be outside of the source dir which is overriden by cmake_qt5
# again if we inherit it afterwards.
inherit cmake_qt5
inherit webos_cmake

FILES_${PN} += "${webos_frameworksdir}"