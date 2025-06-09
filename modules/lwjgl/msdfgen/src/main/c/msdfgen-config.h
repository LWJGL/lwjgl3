/**
  * A hand crafted config header for msdfgen which allows it to build
  * without its sorrounding CMake infrastructure.
  *
  * @author Alexander Hinze
  * @since 03/05/2024
  */

#pragma once

// Detect if this is MSVC or GCC/Clang and define our export macros
#ifdef _MSC_VER
#define MSDFGEN_PUBLIC __declspec(dllexport)
#else
#define MSDFGEN_PUBLIC __attribute__((visibility("default")))
#endif

#define MSDFGEN_EXT_PUBLIC MSDFGEN_PUBLIC

#define MSDFGEN_VERSION 1.12.1
#define MSDFGEN_VERSION_MAJOR 1
#define MSDFGEN_VERSION_MINOR 12
#define MSDFGEN_VERSION_REVISION 1
#define MSDFGEN_COPYRIGHT_YEAR 2025

#define MSDFGEN_USE_CPP11 1 // We always want to use C++11
#define MSDFGEN_EXTENSIONS 1 // We want to use FreeType support
