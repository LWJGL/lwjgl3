// dyncall's dynload JNIfied for LWJGL.

/*

 Package: dyncall
 Library: autovar
 File: autovar/autovar_OS.h
 Description:
 License:

   Copyright (c) 2011-2018 Daniel Adler <dadler@uni-goettingen.de>,
                           Tassilo Philipp <tphilipp@potion-studios.com>

   Permission to use, copy, modify, and distribute this software for any
   purpose with or without fee is hereby granted, provided that the above
   copyright notice and this permission notice appear in all copies.

   THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
   WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
   MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
   ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
   WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
   ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
   OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.

*/

#ifndef AUTOVAR_OS_H
#define AUTOVAR_OS_H

#if defined(WIN64) || defined(_WIN64) || defined(__WIN64__)
#  define OS_Win64
#elif defined(WIN32) || defined(_WIN32) || defined(__WIN32__) || defined(__NT__) || defined(__WINDOWS__) || defined(_WINDOWS)
#  define OS_Win32
#elif defined(__APPLE__) || defined(__Darwin__)
#  define OS_Darwin
#  if defined(__ENVIRONMENT_IPHONE_OS_VERSION_MIN_REQUIRED__)
#    define OS_IOS
#  else /* defined(__ENVIRONMENT_MAC_OS_X_VERSION_MIN_REQUIRED__) */
#    define OS_MacOSX
#  endif
#elif defined(__linux__) || defined(__linux) || defined(__gnu_linux__)
#  define OS_Linux
#elif defined(__FreeBSD__) || defined(__FreeBSD_kernel__) /* latter is (also) used by systems using FreeBSD kernel, e.g. Debian/kFreeBSD, which could be detected specifically by also checking for __GLIBC__ */
#  define OS_FreeBSD
#elif defined(__OpenBSD__)
#  define OS_OpenBSD
#elif defined(__NetBSD__)
#  define OS_NetBSD
#elif defined(__DragonFly__)
#  define OS_DragonFlyBSD
#elif defined(__sun__) || defined(__sun) || defined(sun)
#  define OS_SunOS
#elif defined(__CYGWIN__)
#  define OS_Cygwin
#elif defined(__MINGW__)
#  define OS_MinGW
#elif defined(__nds__)
#  define OS_NDS
#elif defined(__psp__) || defined(PSP)
#  define OS_PSP
#elif defined(__HAIKU__) || defined(__BEOS__)
#  define OS_BeOS
#elif defined(Plan9) || defined(__Plan9__)
#  define OS_Plan9
#elif defined(__vms)
#  define OS_VMS
#elif defined(__minix)
#  define OS_Minix
#else
#  define OS_Unknown
#endif

/** Platforms. */

#if defined(__ANDROID__)
#  define OS_Android
#endif

#endif /* AUTOVAR_OS */

/*

 Package: dyncall
 Library: dynload
 File: dynload/dynload_unix.c
 Description:
 License:

   Copyright (c) 2007-2018 Daniel Adler <dadler@uni-goettingen.de>,
                           Tassilo Philipp <tphilipp@potion-studios.com>

   Permission to use, copy, modify, and distribute this software for any
   purpose with or without fee is hereby granted, provided that the above
   copyright notice and this permission notice appear in all copies.

   THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
   WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
   MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
   ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
   WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
   ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
   OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.

*/


/*

  dynload_unix.c

  dynload module for .so (unix) and .dylib (mach-o darwin/OS X) files

*/


#include "common_tools.h"

#include <string.h>

#if defined(__GLIBC__)
/* @@@ version check glibc more precisely... dl_iterate_phdr(): glibc ver >= 2.2.4*/
#  if (__GLIBC__ >= 2) && (__GLIBC_MINOR__ >= 3)
#    define DL_USE_GLIBC_ITER_PHDR
#  endif
/* to access dl_iterate_phdr(), and related w/ glibc */
#  ifndef _GNU_SOURCE
#    define _GNU_SOURCE
#    define __USE_GNU
#  endif
#endif

#include <dlfcn.h>


/* for dlopen-based dlGetLibraryPath impls below, prefer RTLD_NOLOAD that
 * merely checks lib names */
#if defined(RTLD_NOLOAD)
#  define RTLD_LIGHTEST RTLD_LAZY|RTLD_NOLOAD
#else
#  define RTLD_LIGHTEST RTLD_LAZY
#endif


/* helper copying string if buffer big enough, returning length (without \0) */
static int dl_strlen_strcpy(char* dst, const char* src, int dstSize)
{
  int l = strlen(src);
  if(l < dstSize) /* l+'\0' <= bufSize */
    strcpy(dst, src);
  return l;
}

/* code for dlGetLibraryPath() is platform specific */

/* if dlinfo() exists use it (except on glibc, where it exists since version
 * 2.3.3, but its implementation is dangerous, as no checks are done whether
 * the handle is valid, thus rendering the returned values useless) check for
 * RTLD_DI_LINKMAP and RTLD_SELF, which are #defines used by dlinfo() on most
 * supported targets, or specifically check the OS (e.g. dlinfo() is originally
 * from Solaris) */
#if ((defined(RTLD_DI_LINKMAP) && defined(RTLD_SELF)) || defined(OS_SunOS)) && !defined(DL_USE_GLIBC_ITER_PHDR)

#include <link.h>

EXTERN_C_ENTER

JNIEXPORT int JNICALL Java_org_lwjgl_system_SharedLibraryUtil_getLibraryPath(JNIEnv *env, jclass clazz, jlong pLibAddress, jlong sOutAddress, int bufSize)
{
  UNUSED_PARAMS(env, clazz)
  void *pLib = (void *)(intptr_t)pLibAddress;
  char *sOut = (char *)(intptr_t)sOutAddress;

  struct link_map* p = NULL;
  int l = -1;
  if(dlinfo(pLib ? pLib : RTLD_SELF, RTLD_DI_LINKMAP, &p) == 0)
    l = dl_strlen_strcpy(sOut, p->l_name, bufSize);

  return l+1; /* strlen + '\0' */
}

EXTERN_C_EXIT

/* specific implementation needed on Darwin -----> */
#elif defined(OS_Darwin)

#include <stdint.h>
#include <mach-o/dyld.h>

EXTERN_C_ENTER

JNIEXPORT int JNICALL Java_org_lwjgl_system_SharedLibraryUtil_getLibraryPath(JNIEnv *env, jclass clazz, jlong pLibAddress, jlong sOutAddress, jint bufSize)
{
  UNUSED_PARAMS(env, clazz)
  void *pLib = (void *)(intptr_t)pLibAddress;
  char *sOut = (char *)(intptr_t)sOutAddress;

  uint32_t i;
  int l = -1;

  UNUSED_PARAMS(env, clazz)

  /* request info about own process? lookup first loaded image */
  if(pLib == NULL) {
    const char* libPath = _dyld_get_image_name(0); //@@@ consider using _NSGetExecutablePath()
    if(libPath)
      l = dl_strlen_strcpy(sOut, libPath, bufSize);
  }
  else {
    /* Darwin's code doesn't come with (non-standard) dlinfo(), so use dyld(1)
     * code. There doesn't seem to be a direct way to query the library path,
     * so "double-load" temporarily all already loaded images (just increases
     * ref count) and compare handles until we found ours. Return the name. */
    for(i=_dyld_image_count(); i>0;) /* backwards, ours is more likely at end */
    {
      const char* libPath = _dyld_get_image_name(--i);
      void* lib = dlopen(libPath, RTLD_LIGHTEST);
      if(lib) {
        dlclose(lib);

        /* compare handle pointers' high bits (in low 2 bits some flags might */
        /* be stored - should be safe b/c address needs alignment, anyways) */
        if(((uintptr_t)pLib ^ (uintptr_t)lib) < 4) {
          l = dl_strlen_strcpy(sOut, libPath, bufSize);
          break;
        }
      }
    }
  }

  return l+1; /* strlen + '\0' */
}

EXTERN_C_EXIT


/* - OpenBSD >= 3.7 has dl_iterate_phdr(), as well as glibc >= 2.2.4
   - also some libc impls (like musl) provide dlinfo(), but not RTLD_SELF (see above), however they might come
     with dl_iterate_phdr (which comes from ELF program header iteration), so base it on that
   - skip and use dladdr()-based guessing (see below) if explicitly requested, e.g. by ./configure */
#elif !defined(DL_DLADDR_TO_LIBPATH) && (defined(OS_OpenBSD) || defined(DL_USE_GLIBC_ITER_PHDR) || (!defined(RTLD_SELF) && defined(__ELF__)))

#include <sys/types.h>
#include <link.h>

typedef struct {
  void* pLib;
  char*  sOut;
  int    bufSize;
} iter_phdr_data;

static int iter_phdr_cb(struct dl_phdr_info* info, size_t size, void* data)
{
  UNUSED_PARAM(size);
  int l = -1;
  iter_phdr_data* d = (iter_phdr_data*)data;
  void* lib = NULL;

  /* get loaded object's handle if not requesting info about process itself */
  if(d->pLib != NULL) {
    /* unable to relate info->dlpi_addr directly to our dlopen handle, let's
     * do what we do on macOS above, re-dlopen the already loaded lib (just
     * increases ref count) and compare handles */
    /* @@@ might be b/c it's the reloc addr... see below */
    lib = dlopen(info->dlpi_name, RTLD_LIGHTEST);
    if(lib)
      dlclose(lib);
  }

  /* compare handles and get name if found; if d->pLib == NULL this will
     enter info on first iterated object, which is the process itself */
  if(lib == (void*)d->pLib) {
    l = dl_strlen_strcpy(d->sOut, info->dlpi_name, d->bufSize);

    /* if dlpi_name is empty, lookup name via dladdr(proc_load_addr, ...) */
    if(l == 0 && d->pLib == NULL) {
      /* dlpi_addr is the reloc base (0 if PIE), find real virtual load addr */
      void* vladdr = (void*)info->dlpi_addr;
      int i = 0;
      for(; i < info->dlpi_phnum; ++i) {
        if(info->dlpi_phdr[i].p_type == PT_LOAD) {
          vladdr = (void*)(info->dlpi_addr + info->dlpi_phdr[i].p_vaddr);
          break;
        }
      }
      Dl_info di;
      if(dladdr(vladdr, &di) != 0)
        l = dl_strlen_strcpy(d->sOut, di.dli_fname, d->bufSize);
    }
  }

  return l+1; /* strlen + '\0'; is 0 if lib not found, which continues iter */
}

EXTERN_C_ENTER

JNIEXPORT int JNICALL Java_org_lwjgl_system_SharedLibraryUtil_getLibraryPath(JNIEnv *env, jclass clazz, jlong pLibAddress, jlong sOutAddress, jint bufSize)
{
  UNUSED_PARAMS(env, clazz)
  void *pLib = (void *)(intptr_t)pLibAddress;
  char *sOut = (char *)(intptr_t)sOutAddress;

  iter_phdr_data d = { pLib, sOut, bufSize };
  return dl_iterate_phdr(iter_phdr_cb, &d);
}

EXTERN_C_EXIT

/* glibc with neither dl_iterate_phdr() nor dlinfo() (latter introduced after former) @@@
#elif defined(__GLIBC__) && !defined(DL_USE_GLIBC_ITER_PHDR)

@@@impl */

/* fallback to dladdr() hack */
#else

#warning "Using non-optimal code for dlGetLibraryPath() b/c of platform limitations."

/* if nothing else is available, fall back to guessing using dladdr() - this */
/* might not always work, as it's trying to getit via the _fini() symbol,    */
/* which is usually defined in ELF files, but not guaranteed                 */

/* @@@Note: On some platforms this might be improved, e.g. on BeOS we have */
/* lt_dlgetinfo, which requires iterating over ltdl stuff, but was unable  */
/* to get that to work (would also introduce a link dependency on libltdl) */

EXTERN_C_ENTER

JNIEXPORT int JNICALL Java_org_lwjgl_system_SharedLibraryUtil_getLibraryPath(JNIEnv *env, jclass clazz, jlong pLibAddress, jlong sOutAddress, jint bufSize)
{
  UNUSED_PARAMS(env, clazz)
  void *pLib = (void *)(intptr_t)pLibAddress;
  char *sOut = (char *)(intptr_t)sOutAddress;

/*@@@ missing handler for pLib == NULL*/
  /* cross fingers that shared object is standard ELF and look for _fini */
  int l = -1;
  void* s = dlsym((void*)pLib, "_fini");
  if(s) {
    Dl_info i;
    if(dladdr(s, &i) != 0)
      l = dl_strlen_strcpy(sOut, i.dli_fname, bufSize);
  }
  return l+1; /* strlen + '\0' */
}

EXTERN_C_EXIT

#endif
