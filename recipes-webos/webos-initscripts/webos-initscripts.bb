# Copyright (c) 2012-2013 LG Electronics, Inc.

SUMMARY = "Event-driven startup scripts for system services"
SECTION = "webos/base"
LICENSE = "Apache-2.0 & MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

RDEPENDS_${PN} = "upstart"

# corresponds to tag submissions/123
SRCREV = "e0a37c804adee5fa58e5ed40d527b08bba912c86"
PV = "2.0.0-123"

inherit webos_component
inherit webos_public_repo
inherit webos_enhanced_submissions
inherit webos_cmake
inherit webos_arch_indep

WEBOS_GIT_TAG = "submissions/${WEBOS_SUBMISSION}"
SRC_URI = "${OPENWEBOS_GIT_REPO_COMPLETE}"
S = "${WORKDIR}/git"

SRC_URI += "file://cpufreq-setup.upstart"

do_install_append() {
    install -d ${D}${webos_upstartconfdir}
    install -m 0644 ${WORKDIR}/cpufreq-setup.upstart ${D}${webos_upstartconfdir}/cpufreq-setup
}
