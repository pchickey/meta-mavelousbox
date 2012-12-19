# base this image on rpi-hwup-image
include recipes-core/images/rpi-hwup-image.bb

IMAGE_FEATURES += "ssh-server-dropbear splash"

IMAGE_INSTALL_append = " usbutils compat-wireless-all iw wireless-tools wpa-supplicant hostap-daemon hostap-conf hostap-utils"

