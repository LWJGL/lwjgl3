### 3.1.5

_Released 2017 Nov 22_

This build includes the following changes:

#### Bindings

- Added [AMD Tootle](https://github.com/GPUOpen-Tools/amd-tootle) bindings.
    * Only the software rasterizer is supported.

#### Fixes

- Fixed various javadoc links.
- par: Parsing of floating point values in L-systems is now locale-insensitive. 
- stb: Fixed buffer checks to account for row stride, when specified.
- Generator: Fixed auto-size transformations by non-constant expressions.

#### Breaking Changes

- Removed array overloads from the LZ4 & ODBC bindings.
    * They were added by mistake in LWJGL `3.1.4`.