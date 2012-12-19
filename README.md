meta-mavelousbox
================

A Yocto Project layer for the mavelous box: a mavelous server on an embedded linux computer.

Currently supports building an image for the Raspberry Pi (and it doesn't quite include Mavelous yet, either...)

## Dependencies

* poky, tag '1.3' (danny release) `git://git.yoctoproject.org/poky`
* meta-openembedded, danny branch: `git://git.openembedded.org/meta-openembedded`
* meta-raspberrypi, master branch: `git://github.com/djwillis/meta-raspberrypi`


## Instructions

Clone this repo and the three dependencies listed above into the same directory (in the example below, `~/src`).

Install the required software listed on the [Openembedded wiki](http://www.openembedded.org/wiki/Getting_started)
for your system.

Initialize a poky project in the subdirectory `mavelousbox`. 

```
~/src $ source poky/oe-init-build-env mavelousbox
```

In `~/src/mavelousbox/conf/bblayers.conf` add the following lines to the end of the `BBLAYERS` definition:

```
  ${TOPDIR}/../meta-openembedded/meta-oe \
  ${TOPDIR}/../meta-raspberrypi \
  ${TOPDIR}/../meta-mavelousbox \
```

In `~/src/mavelousbox/conf/local.conf` add the following line to the top:

```
MACHINE = "raspberrypi"
```

Then you can build an image for the raspberry pi with the following command:

```
~/src/mavelousbox $ bitbake rpi-mavelousbox-image
```

Building the image will probably take a couple of hours the first time around.
