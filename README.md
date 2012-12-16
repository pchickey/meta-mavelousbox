meta-mavelousbox
================

A Yocto Project layer for the mavelous box: a mavelous server on an embedded linux computer.

Currently supports building an image for the Raspberry Pi (and it doesn't quite include Mavelous yet, either...)

## Dependencies

poky HEAD: `git://git.yoctoproject.org/poky`
meta-openembedded HEAD: `git://git.openembedded.org/meta-openembedded`
meta-raspberrypi HEAD: `git://github.com/djwillis/meta-raspberrypi`


## Instructions

Clone this repo and the three dependencies listed above into the same directory (in the example below, `~/src`).

```
~/src $ source poky/oe-init-build-env mavelousbox
```

In `~/src/mavelousbox/conf/local.conf` add the following lines:

```
MACHINE = "raspberrypi"
BBMASK = "/qt4"
```

Then you can build an image for the raspberry pi with the following command:

```
~/src/mavelousbox $ bitbake rpi-mavelousbox-image
```

