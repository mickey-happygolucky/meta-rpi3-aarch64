# Summary

meta-rpi3-aarch64 support to work aarch64 linux on Raspberrypi3.

Raspberrypi3 has cortex-A53 however meta-raspberrypi support 32bit os only.

This layer provides aarch64 linux exprimentally.

This layer is unofficial.

## Dependency

This layers depdends on meta-raspberrypi(master branch).

# How to use

In order to build aarch64 linux, add the following line to your local.conf

```txt
MACHINE ?= "raspberrypi3-64"
```

Then bitbaking image as follows:

```bash
$ bitbake rpi-basic-image
```

# Known issue

userland_git.bb could not build, because it depended 32bit code strongly.

therefore this layer cannot build GUI such as X11 or wayland...

# Special Thanks

A porting of aarch64 kernel for Raspberrypi is important factor of this layer. [https://github.com/Electron752/linux](https://github.com/Electron752/linux) is very helpful. Thanks.

# Maintainers

* Yusuke Mitsuki <mickey.happygolucky@gmail.com>
