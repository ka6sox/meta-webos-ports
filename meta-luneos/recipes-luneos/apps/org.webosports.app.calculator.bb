SUMMARY = "Calculator app re-written from scratch for Open webOS"
SECTION = "webos/apps"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

inherit webos_ports_repo
inherit allarch
inherit webos_enyojs_application
inherit webos_cordova_application
inherit webos_filesystem_paths

PV = "0.1.1+gitr${SRCPV}"
SRCREV = "8ab24b1f72f22a7c006b2460f10a805bf6741c35"

SRC_URI = "${WEBOS_PORTS_GIT_REPO_COMPLETE}"
S = "${WORKDIR}/git"
