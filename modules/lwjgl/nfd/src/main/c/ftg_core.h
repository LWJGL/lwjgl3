/* clang-format off */
/* ftg_core.h - v0.5  - Frogtoss Toolbox.  Public domain-like license below.

   ftg libraries are copyright (C) 2015 Frogtoss Games, Inc.
   http://github.com/mlabbe/ftg_toolbox

   ftg header files are single file header files intended to be useful
   in C/C++.  ftg_core contains generally useful functions

   Special thanks to STB for the inspiration.


   ****
   You must

     #define FTG_IMPLEMENT_CORE

   in exactly one C or C++ file.
   ****

   If _DEBUG is defined, assert behaviors change.

   OPTIONS

   1. define FTG_ENABLE_ASSERT to enable FTG_ASSERT and related macros.
   2. define FTG_ENABLE_STOPWATCH to enable code timing stopwatch macros.
   3. See SELF-TESTING below to enable self testing.
   4. define FTG_BIG_ENDIAN if you are compiling for big
      endian. Otherwise FTG_LITTLE_ENDIAN will be set.

   PURPOSE

   ftg_core.h contains common routines and aims to smooth over the
   differences between compilers and their libraries.  It is tested on
   Visual C++ 98 (c89), Visual Studio 2015 (roughly c99), modern Clang
   and modern GCC both in --std=gnu89 and --std=gnu99 dialects.

   It also contains a grab bag of commonly-useful routines and is
   somewhat unfocused.


   SELF-TESTING

   This file contains unit tests.  In order to run them, add
   ftg_core.h as follows:

   #define FTG_IMPLEMENT_TEST
   #define FTG_IMPLEMENT_CORE
   #define <ftg_test.h>
   #define <ftg_core.h>

   {
       ftg_decl_suite();
       int num_failures = ftgt_run_all_tests(NULL);
   }


   Version history
   0.6              windows console alloc/free
   0.5              file management
                    limited utf-8 support (u8 functions)
                    FTG_MALLOC/FREE/REALLOC macros
   0.4              stopwatch timers
   0.3              ftg_index_array,
                    64-bit file management
   0.2              ftg_strncpy, ftg_tests,
                    ftg_va
   0.1              ftg_stristr, ftg_stricmp,
                    compiler macros


   Future additions
     delete file, dir
     unit test 64-bit file functions
     wrap allocations in ifdefs
     standard utf-8 string ops


 */
#ifndef FTG__INCLUDE_CORE_H
#define FTG__INCLUDE_CORE_H

#if defined(_WIN32) && !defined(__MINGW32__)
#  ifndef _CRT_SECURE_NO_WARNINGS
#     define _CRT_SECURE_NO_WARNINGS
#  endif
#endif

#ifndef FTG_CORE_NO_STDIO
#  include <stdio.h>
#else
#  include <stddef.h>  // for size_t
#endif

/* for off64_t */
#if defined(__linux__) && _FILE_OFFSET_BITS == 64
#  include <sys/types.h>
#endif

/* set FTG_DEBUG to either 0 or 1, and ensure both debug and !debug aren't
   set across popular macros */
#if defined(NDEBUG)
#  define FTG_DEBUG 0
#endif

#if defined(_DEBUG) || defined(DEBUG)
#  if defined(FTG_DEBUG)
#    error "Both DEBUG and NDEBUG are set."
#  endif
#  define FTG_DEBUG 1
#endif


/* broad test for OSes that are vaguely POSIX compliant */
#if defined(__linux__) || defined(__APPLE__) || defined(ANDROID) || \
    defined(TARGET_OS_IPHONE) || defined(TARGET_IPHONE_SIMULATOR) || \
    defined(__FreeBSD__) || defined(__OpenBSD__) || defined(__EMSCRIPTEN__)
#  define FTG_POSIX_LIKE 1
#endif

#if defined(__EMSCRIPTEN__)
#  define FTG_WASM 1
#endif

/* detect target enviroment bits */
#if _WIN64
#  define FTG_BITS 64
#elif _WIN32
#  define FTG_BITS 32
#endif
#if __GNUC__
#  if __x86_64__ || __ppc64__ || __aarch64__
#    define FTG_BITS 64
#  else
#    define FTG_BITS 32  // todo: confirm emscripten sets this
#  endif
#endif

/* unicode strategy:  UTF-8 everywhere, except when dealing with Windows functions.
   On Windows, define UNICODE and directly call wide versions of functions.

   By defining UNICODE, TCHAR functions don't accept char* which is a safety mechanism.

   I agree with and attempt to comply with utf8everywhere.org.

   Define FTG_IGNORE_UNICODE at your own peril.
   */
#ifndef FTG_IGNORE_UNICODE
#  ifdef _WIN32
#    if !defined(UNICODE) || !defined(_UNICODE)
#       error _UNICODE and UNICODE not defined -- see header comment for justification
#    endif
#  endif
#endif

#ifndef FTG_BITS
#  error "ftg_core.h could not determine 32-bit or 64-bit"
#endif

/* min/max  */
#define FTG_MAX(a,b) ((a) > (b) ? (a) : (b))
#define FTG_MIN(a,b) ((a) < (b) ? (a) : (b))
#define FTG_CLAMP(x,xmin,xmax) ((x) < (xmin) ? (xmin) : (x) > (xmax) ? (xmax) : (x))

/* portable specifiers -- used to portably printf these types, ex:
   printf("size_t is %" FTG_SPEC_SIZE_T, (size_t)1);

   These are piecemeal, as encountered, and best-guess.
   If using C99, just use inttypes.h.
*/
#if defined(_MSC_VER) && _MSC_VER < 1310
#  define FTG_SPEC_SIZE_T    "u"
#  define FTG_SPEC_SSIZE_T   "d"
#  define FTG_SPEC_PTRDIFF_T "d"
#elif defined(_MSC_VER) || defined(__MINGW32__)
#  define FTG_SPEC_SIZE_T    "Iu"
#  define FTG_SPEC_SSIZE_T   "Id"
#  define FTG_SPEC_PTRDIFF_T "Id"
#elif defined(__GNUC__)
#  define FTG_SPEC_SIZE_T    "zu"
#  define FTG_SPEC_SSIZE_T   "zd"
#  define FTG_SPEC_PTRDIFF_T "zd"
#endif

#if defined(_MSC_VER)
#  define FTG_SPEC_INT64     "I64d"
#  define FTG_SPEC_UINT64    "I64d"
#else
#  if FTG_BITS == 64 && !defined(__APPLE__) && !defined(__OpenBSD__)
#    define FTG_SPEC_INT64   "li"
#    define FTG_SPEC_UINT64  "lu"
#  elif FTG_BITS == 32 || defined(__APPLE__) || defined(__OpenBSD__)
#    define FTG_SPEC_INT64   "lli"
#    define FTG_SPEC_UINT64  "lld"
#  endif
#endif

/* ftg_off_t printing */
#ifndef FTG_CORE_NO_STDIO
#  define FTG_SPEC_OFF_T     FTG_SPEC_INT64
#endif

/* octal directory creation mode for posix-like OSes; override if needed */
#ifndef FTG_DIRECTORY_MODE
#  define FTG_DIRECTORY_MODE 0750
#endif

#if defined(_MSC_VER) && (_MSC_VER >= 1800)
// VS doesn't define STDC_VERSION because it isn't fully compliant, but this
// actually lets us compile code that we couldn't without it.
#  if !defined(__STDC_VERSION__) && !defined(__cplusplus)
#    define __STDC_VERSION__ 199901L
#  endif

// Because VS doesn't support C99, it thinks non-constant aggregate initializers
// are non-standard per C89 3.5.7, but they are in C99.  Disable warning
// in vs2013 and greater.
#  ifndef __cplusplus
#    pragma warning(disable : 4204)
#  endif
#endif

#if __STDC_VERSION__ < 199901L
#define FTG_FUNC ""
#else
#define FTG_FUNC __func__
#endif

/* break */

#ifdef FTGT_TESTS_ENABLED
#  define FTG_BREAK() do{}while(0)
#endif

#ifndef FTG_BREAK
    #if defined(_WIN32) && _MSC_VER >= 1310
        #define FTG_BREAK() __debugbreak();
    #elif defined(_WIN32) && defined(_MSC_VER)
		#define FTG_BREAK() __asm{ int 0x3 }
    #elif defined(__MINGW32__)
        #define FTG_BREAK() __asm__ volatile("int $0x03");
    #elif defined(__linux__)
        #ifdef __arm__
          #define FTG_BREAK() __asm__ volatile(".inst 0xde01");
        #elif defined(__aarch64__)
          #define FTG_BREAK() __builtin_trap();
        #else
          #define FTG_BREAK() __asm__("int $0x3");
        #endif
    #elif defined(TARGET_OS_MAC) && defined(__LITTLE_ENDIAN__)
        #define FTG_BREAK() __builtin_trap();
    #elif defined(ANDROID)
        #define FTG_BREAK() __android_log_assert("breakpoint()", "ftg", "breakpoint");
    #elif defined(TARGET_IPHONE_SIMULATOR)
        #define FTG_BREAK() { __builtin_trap(); }
    #elif defined(TARGET_OS_IPHONE)
        #ifdef __ARM_ARCH_ISA_A64
            asm("svc 0");
        #else
            asm("trap");
        #endif
    #else
        #include <assert.h>
        #define FTG_BREAK() assert(0)
    #endif
#endif

/* Make true/false/bool universal macros */
#ifndef __cplusplus
    #if __STDC_VERSION__ < 199901L
        #if !__bool_true_false_are_defined
            #define true 1
            #define false 0
            #define bool int
        #endif
    #else
        #include <stdbool.h>
    #endif
#endif

/* assert

define FTG_ENABLE_ASSERT with FTG_DEBUG=1 to prevent asserts from being noops

Further, define FTG_CUSTOM_ASSERT_REPORTER to provide alternative diagnostics for FTG_ASSERT calls.
Alternatively, undef it to use system assert.
*/

#if !defined(FTG_CUSTOM_ASSERT_REPORTER) && defined(FTGT_TESTS_ENABLED)
#  define FTG_CUSTOM_ASSERT_REPORTER ftg__test_assert_reporter
#elif !defined(FTG_CUSTOM_ASSERT_REPORTER)
#  define FTG_CUSTOM_ASSERT_REPORTER ftg__default_assert_reporter
#endif

#if defined(FTG_ENABLE_ASSERT) || FTG_DEBUG==1 || defined(FTGT_TESTS_ENABLED)
#  ifdef FTG_CUSTOM_ASSERT_REPORTER
#    define FTG_ASSERT(exp) \
	    { if (!(exp) && FTG_CUSTOM_ASSERT_REPORTER(#exp, __FILE__, FTG_FUNC, __LINE__)) FTG_BREAK() \
                                                                                            ;}
#    define FTG_ASSERT_FAIL(exp) \
        { FTG_CUSTOM_ASSERT_REPORTER(#exp, __FILE__, FTG_FUNC, __LINE__); FTG_BREAK() \
                                                                              ;((void)exp);}
#  else
#    include <assert.h>
#    define FTG_ASSERT(exp) (void)((exp)||(assert(exp)))
#    define FTG_ASSERT_FAIL(exp) (assert(0);)
#  endif
#else
#  define FTG_ASSERT(exp) ((void)0)
#  define FTG_ASSERT_FAIL(exp) ((void)0)
#endif

#define FTG_ASSERT_ALWAYS(exp) \
    { if (!(exp) && FTG_CUSTOM_ASSERT_REPORTER(#exp, __FILE__, FTG_FUNC, __LINE__)) FTG_BREAK(); }

/* static assert */

#define FTG_STATIC_ASSERT_MSG(x, msg) typedef int FTG__StaticAssert_##msg[(x) ? 1 : -1]
#define FTG__STATIC_ASSERT_3(x,L) FTG_STATIC_ASSERT_MSG(x, assertion_at_line_##L)
#define FTG__STATIC_ASSERT_2(x,L) FTG__STATIC_ASSERT_3(x,L)
#define FTG_STATIC_ASSERT(x) FTG__STATIC_ASSERT_2(x,__LINE__)

/* int types */
#if (defined(_MSC_VER) && (_MSC_VER >= 1800)) || defined (__GNUC__) || defined(__clang__)
#  include <stdint.h>
#else
typedef unsigned char      uint8_t;
typedef signed char        int8_t;
typedef unsigned short     uint16_t;
typedef signed short       int16_t;
typedef unsigned int       uint32_t;
typedef signed int         int32_t;

#  if defined(_MSC_VER)
typedef unsigned __int64   uint64_t;
typedef signed __int64     int64_t;

#  if FTG_BITS == 64
#    define SIZE_MAX		(18446744073709551615UL)
#  else
#    define SIZE_MAX		(4294967295U)
#  endif

#  else
typedef unsigned long long uint64_t;
typedef signed long long   int64_t;
#  endif
#endif


/* portable 64-bit offset types
    ftg_off_t is guaranteed to be 64-bit, even on 32-bit builds
    on all OSes.
    ftg_fopen, ftg_ftell, etc. all operate on 64-bit values.
    */
#ifndef FTG_CORE_NO_STDIO

struct ftg_dirhandle_s;
typedef struct ftg_dirhandle_s ftg_dirhandle_t;


#if defined(__APPLE__)
#  define FTG_IO64_EXPLICIT 0
#  if _FILE_OFFSET_BITS == 64 || defined(__LP64__)
   typedef off_t            ftg_off_t;
#  else
   typedef off64_t          ftg_off_t
#  endif
#elif defined(__linux__)
   /* Linux is a fun one.  It offers three separate ways to get a
      64-bit file descriptor.  The first is through explicit 64-bit
      calls and typedefs: defining _LARGEFILE64_SOURCE.  The
      alternative is specifying _FILE_OFFSET_BITS=64 and then using
      transparently using the normal routines.  Finally, if __LP64__
      is defined, off_t is 64-bit anyway.

      As a library trying to work in all cases, we use explicit calls
      if they are available, or fall back on transparent calls if they
      are not.  To simplify preprocessor tests, we define
      FTG__IO64_EXPLICIT.

      And we statically assert if neither of these are defined. */
#  if defined(_LARGEFILE64_SOURCE)
#    define FTG__IO64_EXPLICIT 1
     typedef off64_t       ftg_off_t;
#  elif _FILE_OFFSET_BITS == 64
#    define FTG__IO64_EXPLICIT 0
     typedef off_t         ftg_off_t;
#  else
#    define FTG__IO64_EXPLICIT 0
#    if defined(__LP64__)
     typedef off_t         ftg_off_t;
#    else
/* if this is hit, define _FILE_OFFSET_BITS=64 across your compile, or
   define FTG_CORE_NO_STDIO to disable all ftg_core I/O */
#       error "no 64-bit fopen support."
#    endif
#  endif
#elif defined(_WIN32)
typedef int64_t            ftg_off_t;
typedef wchar_t            ftg_wchar_t;
#elif defined(__FreeBSD__) || defined(__OpenBSD__)
typedef off_t         ftg_off_t;
#elif defined(FTG_WASM)
typedef off_t ftg_off_t;
#endif

FTG_STATIC_ASSERT(sizeof(ftg_off_t)==8);

#endif /* !FTG_CORE_NO_STDIO */

FTG_STATIC_ASSERT(sizeof(int8_t)==1);
FTG_STATIC_ASSERT(sizeof(int16_t)==2);
FTG_STATIC_ASSERT(sizeof(int32_t)==4);
FTG_STATIC_ASSERT(sizeof(int64_t)==8);

#define FTG_ARRAY_ELEMENTS(n) (sizeof((n)) / sizeof((*n)))
/*
 Compiler extensions made portable

 USAGE

 In MSVC, attributes must be on declarations in addition to prototypes.
 Use FTG_ATTRIBUTES to declare them.

 Prototype
 FTG_EXT_warn_unused_result FTG_EXT_force_inline int SomeFunc( void );

 Declaration
 FTG_ATTRIBUTES(FTG_EXT_warn_unused_result) int SomeFunc( void );


 Keyword extensions made portable

 Goal is to use language and compiler-native versions of keywords added
 after the c89 standard.

 ftg_inline
 ftg_restrict
*/

#if defined(__GNUC__) || defined(__clang__)
    #define FTG_EXT_warn_unused_result __attribute__((warn_unused_result))
    #define FTG_EXT_force_inline __attribute__((always_inline))
    #define FTG_EXT_pure_function __attribute__((pure))
    #define FTG_EXT_const_function __attribute__((const))
    #define FTG_EXT_unused __attribute__((unused))
    #define FTG_EXT_no_vtable
    #ifdef __cplusplus
     	#define ftg_restrict __restrict
    #else
        #if __STDC_VERSION__ >= 199901L
            #define ftg_restrict restrict
        #endif
    #endif
    #if __STDC_VERSION__ < 199901L
        #define ftg_inline __inline
    #else
        #define ftg_inline inline
    #endif
    #define FTG_ATTRIBUTES(x)

// todo: investigate https://twitter.com/deplinenoise/status/971873640609300480
#elif defined(_MSC_VER) && (_MSC_VER >= 1700) /* vs2012 */
	#define ftg_restrict __restrict
    #define ftg_inline __inline
    #define FTG_EXT_warn_unused_result _Check_return_
    #define FTG_EXT_force_inline __forceinline
    #define FTG_EXT_unused
    #define FTG_ATTRIBUTES(x) x
#elif defined(_MSC_VER) && (_MSC_VER >= 1400) /* vs2005 */
    #define FTG_EXT_no_vtable __declspec(novtable)
	#define ftg_restrict __restrict
    #define ftg_inline __inline
    #define FTG_EXT_unused
    #define FTG_ATTRIBUTES(x) x
#endif

#ifndef FTG_EXT_warn_unused_result
    #define FTG_EXT_warn_unused_result
#endif
#ifndef FTG_EXT_force_inline
    #define FTG_EXT_force_inline
#endif
#ifndef FTG_EXT_pure_function
    #define FTG_EXT_pure_function
#endif
#ifndef FTG_EXT_const_function
    #define FTG_EXT_const_function
#endif
#ifndef ftg_restrict
    #define ftg_restrict
#endif
#ifndef ftg_inline
    #define ftg_inline
#endif
#ifndef FTG_ATTRIBUTES
    #define FTG_ATTRIBUTES(x)
#endif

#ifdef FTG_CORE_STATIC
#  define FTGDEF static FTG_EXT_unused
#else
#  define FTGDEF extern
#endif

/* endianness

   use little endian unless FTG_BIG_ENDIAN is defined.
 */

#ifndef FTG_BIG_ENDIAN
#  define FTG_LITTLE_ENDIAN
#endif

/* fourcc */
#ifdef FTG_LITTLE_ENDIAN
#  define FTG_FOURCC(a,b,c,d) ((d) | ((c)<<8) | ((b)<<16) | ((a)<<24))
#elif FTG_BIG_ENDIAN
#  define FTG_FOURCC(a,b,c,d) ((a) | ((b)<<8) | ((c)<<16) | ((d)<<24))
#endif

/* misc macros */

#define FTG_UNUSED(x) ((void)x)
#define FTG_STRLEN 255
#define FTG_STRLEN_SHORT 16
#define FTG_STRLEN_LONG 1024

#define FTG_UNDEFINED_HUE 360.f*2

#define FTG_IA_INIT_ZERO {NULL, 0, 0}
#define FTG_IA_INITIAL_RECORD_COUNT 8

/* usually better to use ftg_correct_dirslash than reference this directly */
#ifdef _WIN32
#  define FTG_DIRSLASH '\\'
#  define FTG_DIRSLASH_STR "\\"
#elif defined(FTG_POSIX_LIKE)
#  define FTG_DIRSLASH '/'
#  define FTG_DIRSLASH_STR "/"
#endif

#if defined(__linux__)
#  define FTG__HAVE_EXPLICIT_BZERO
#elif defined(__APPLE__)
#  define FTG__HAVE_MEMSET_S
#endif

/*
  stopwatch -- portable, high precision start/next/stop timer

  #define FTG_ENABLE_STOPWATCH before calling this function, or every
   call is a noop.


  USAGE
    1. Declare a stopwatch variable mytimer:
    FTG_STOPWATCH_DECL(mytimer);

    2. Start the timer, storing time in the bucket named "0":
    FTG_STOPWATCH_START(mytimer, 0)

    3. (optional) Track additional times within the timer.
       This buckets the remaining code into bucket "1":
    FTG_STOPWATCH_NEXT(mytimer, 1)

    4. Stop the timer
    FTG_STOPWATCH_STOP(mytimer)


  TIMING AFTER STOP
  If FTG_STOPWATCH_NEXT() is encountered after a timer has stopped,
  no additional time is counted.  This is a key subtlety.
  Time spent in subfunction c() of a() is accumulated, but when c()
  is a subfunction of b(), it is not accumulated, providing the timer
  was stopped before b() was called.


  DESCRIBING THE STEPS (optional)
  Instead of using numerical steps, you can use named steps like this:
      #define A_STEP_NAME 1
  Then,
      FTG_STOPWATCH_NEXT(mytimer, A_STEP_NAME)
  This increases the readability of the reporting.


  CUSTOM REPORTING (optional)
  After a stopwatch ends, a function with the following prototype is called
  to report the stopwatch:

  void ftg__default_stopwatch_reporter(const struct ftg_stopwatch_s *);

  #define FTG_STOPWATCH_REPORTER to your own function in the file that implements ftg_core
  to call that instead.
 */

#ifdef FTG_ENABLE_STOPWATCH

#  define FTG_STOPWATCH_DECL(sw)           struct ftg_stopwatch_s sw = {"", {0}, {""}, 0, FTG__MAX_STOPWATCH_TIMES+100, false};
#  define FTG_STOPWATCH_START(sw, bucket)  ftg__stopwatch_start(&sw, #sw, #bucket, bucket)
#  define FTG_STOPWATCH_NEXT(sw, bucket)   ftg__stopwatch_next_bucket(&sw, #bucket, bucket)
#  define FTG_STOPWATCH_STOP(sw)           ftg__stopwatch_stop(&sw)
#  define FTG_STOPWATCH_EXPR(exp)          exp

#define FTG__MAX_STOPWATCH_TIMES 12

struct ftg_stopwatch_s {
    char name[FTG_STRLEN_SHORT];

    uint64_t times[FTG__MAX_STOPWATCH_TIMES];
    char time_names[FTG__MAX_STOPWATCH_TIMES][FTG_STRLEN_SHORT];

    uint64_t start_time;

    size_t current_bucket;
    bool currently_logging;
};

#else
#  define FTG_STOPWATCH_DECL(sw)
#  define FTG_STOPWATCH_START(sw, bucket)
#  define FTG_STOPWATCH_NEXT(sw, bucket)
#  define FTG_STOPWATCH_STOP(sw)
#  define FTG_STOPWATCH_EXPR(exp)
struct ftg_stopwatch_s;
#endif

/* Define a type by its language-native class type.  Useful for
   creating types as forward declarations which are ignored when
   actually compiling in C.

Usage:
#define TYPE_MACRO FTG_DECL_CLASS(some_type)
TYPE_MACRO;
void some_func(TYPE_MACRO *);
   */
#ifdef __cplusplus
#define FTG_DECL_CLASS(T) class T
#elif __OBJC__
#define FTG_DECL_CLASS(T) @class T
#else
#define FTG_DECL_CLASS(T) struct T
#endif

/* exported decls */

#ifdef __cplusplus
extern "C" {
#endif

/* MSVC earlier than 2005 does not include these in stdio.h. */
#if defined(_MSC_VER) && _MSC_VER < 1400
extern int __cdecl _fseeki64(FILE *, __int64, int);
extern  __int64 __cdecl _ftelli64(FILE *);
#endif


#if defined(FTG_MALLOC) && defined(FTG_FREE) && defined(FTG_REALLOC)
// okay
#elif !defined(FTG_MALLOC) && !defined(FTG_FREE) && !defined(FTG_REALLOC)
// also okay
#else
#error "Must define all or none of FTG_MALLOC, FTG_FREE and FTG_REALLOC."
#endif

/* default implementations just call system malloc with assert guards
   for OOM and overflow.

   ftg_free zeroes pointer in calling code after free.

   num - number of elements, size - size of each element  */
#ifndef FTG_MALLOC
#  define FTG_MALLOC(size, num)       ftg_malloc(size, num);
#  define FTG_FREE(ptr)               ftg_free((void**)&ptr);
#  define FTG_REALLOC(ptr, size, num) ftg_realloc(ptr, size, num)
#endif

FTGDEF void *
ftg_malloc(size_t size, size_t num);

FTGDEF void
ftg_free(void **heap);

FTGDEF int
ftg_stricmp(const char *s1, const char *s2);

FTGDEF void *
ftg_realloc(void *ptr, size_t size, size_t num);

FTGDEF char *
ftg_stristr(const char *haystack, const char *needle);

FTGDEF FTG_EXT_warn_unused_result int
ftg_strncpy(char *ftg_restrict dst, const char *ftg_restrict src, size_t max_copy);

FTGDEF FTG_EXT_warn_unused_result char *
ftg_strcatall(size_t num, ...);

FTGDEF const char*
ftg_strsplit(const char *str, char split_ch, size_t index, size_t *out_len);

FTGDEF void
ftg_bzero(void *ptr, size_t num);

FTGDEF char *
ftg_va(const char *fmt, ...);

FTGDEF uint32_t
ftg_hash_fast(const void *p, uint32_t len);

FTGDEF uint32_t
ftg_hash_number(uint32_t number);

FTGDEF int
ftg__default_assert_reporter(const char *expr, const char *filename, const char *func, unsigned int lineno);

#ifdef FTGT_TESTS_ENABLED
FTGDEF int
ftg__test_assert_reporter(const char *expr, const char *filename, const char *func, unsigned int lineno);
#endif

#ifndef FTG_CORE_NO_STDIO
FTGDEF unsigned char *
ftg_file_read(const char *path, bool make_string, ftg_off_t *len);

FTGDEF bool
ftg_file_write(const char *path, const uint8_t *buf, size_t buf_bytes);

FTGDEF bool
ftg_file_write_string(const char *path, const char *str);
#endif

FTGDEF void
ftg_gethsv(float r, float g, float b, float *ftg_restrict h, float *ftg_restrict s, float *ftg_restrict v);

FTGDEF void
ftg_getrgb(float h, float s, float v, float *ftg_restrict r, float *ftg_restrict g, float *ftg_restrict b);

FTGDEF float
ftg_aspect_correct_scale_for_rect(const float screen[2], const float rect[2]);

FTGDEF size_t
ftg_u8_strlen(const char *s);

struct ftg_index_array_s {
    size_t *indices;
    size_t count;    /* num used */
    size_t records;  /* alloced, always > count */
};

/* warning: ftg_ia api will be deprecated and moved to a container-specific header file */
FTGDEF bool
ftg_ia_is_init(struct ftg_index_array_s *i);

FTGDEF bool
ftg_ia_append(struct ftg_index_array_s *i, size_t index);

FTGDEF void
ftg_ia_prealloc(struct ftg_index_array_s *i, size_t initial_record_count);

FTGDEF void
ftg_ia_free(struct ftg_index_array_s *i);

FTGDEF const char *
ftg_correct_dirslash(char *path);

FTGDEF char *
ftg_get_filename_ext(const char *path);

FTGDEF char *
ftg_get_filename_from_path(const char *path);

FTGDEF bool
ftg_is_dirslash(char c);

FTGDEF bool
ftg_push_path(char *dst_path, const char *src_path, size_t max_path);

FTGDEF void
ftg_pop_path(char *dst_path);

#ifndef FTG_CORE_NO_STDIO
FTGDEF FILE *
ftg_fopen64(const char *filename, const char *type);

FTGDEF ftg_off_t
ftg_ftell64(FILE *stream);

FTGDEF int64_t
ftg_fseek64(FILE *stream, ftg_off_t offset, int origin);

FTGDEF const char *
ftg_opendir(ftg_dirhandle_t *handle, const char *path, char *out, size_t out_len);

FTGDEF const char *
ftg_readdir(ftg_dirhandle_t *handle, char *out, size_t out_len);

FTGDEF void
ftg_closedir(ftg_dirhandle_t *handle);

FTGDEF bool
ftg_is_dir(const char *path);

FTGDEF bool
ftg_path_exists(const char *path);

FTGDEF bool
ftg_mkdir(const char *path);

FTGDEF void
ftg_mkalldirs(const char *path);

FTGDEF void
ftg_rmalldirs(const char *path);

FTGDEF bool
ftg_rmdir(const char *path);

FTGDEF void
ftg_alloc_console(void);

FTGDEF void
ftg_free_console(void);
#endif

#ifdef FTG_ENABLE_STOPWATCH
FTGDEF void
ftg__stopwatch_start(struct ftg_stopwatch_s *stopwatch,
                     const char *name, const char *bucket_name, size_t bucket);

FTGDEF void
ftg__stopwatch_stop(struct ftg_stopwatch_s *stopwatch);

FTGDEF void
ftg__stopwatch_next_bucket(struct ftg_stopwatch_s *stopwatch,
                           const char *bucket_name, size_t bucket);

FTGDEF void
ftg__default_stopwatch_reporter(struct ftg_stopwatch_s *sw);
#endif

#ifdef __cplusplus
}
#endif

/* implementation */

#ifdef FTG_IMPLEMENT_CORE

#ifndef FTG_CORE_NO_STDIO
#  include <stdio.h>
#  ifdef FTG_POSIX_LIKE
#    include <unistd.h>
#    include <dirent.h>
#    include <sys/stat.h>
#    include <sys/types.h>
#    include <errno.h>
#  elif defined(_WIN32)
#    define WIN32_LEAN_AND_MEAN
#    include <windows.h>  /* for HANDLE in ftg_opendir */
#    include <direct.h>
#    ifndef INVALID_FILE_ATTRIBUTES
#      define INVALID_FILE_ATTRIBUTES ((DWORD)-1)  /* missing in older sdks */
#    endif
#    undef WIN32_LEAN_AND_MEAN
#  endif
#endif

#include <ctype.h>
#include <stdlib.h>
#include <string.h>
#include <stdarg.h>
#include <math.h>
#include <stddef.h>

/* SIZE_MAX may not be defined in C++ because C++ does not know about this C99 addition. */
#ifndef SIZE_MAX
#  if FTG_BITS == 64
#    define FTG__SIZE_MAX  (18446744073709551615UL)
#  else
#    define FTG__SIZE_MAX  (4294967295U)
#  endif
#else
#  define FTG__SIZE_MAX  SIZE_MAX
#endif

int
ftg__default_assert_reporter(const char *expr, const char *filename, const char *func, unsigned int lineno)
{
	((void)filename);
	fprintf(stderr, "assert %s(%d)%s: %s\n", filename, lineno, func, expr);
    return 1;
}

#ifdef FTGT_TESTS_ENABLED
int
ftg__test_assert_reporter(const char *expr, const char *filename, const char *func, unsigned int lineno)
{
    printf("\n[ftg_test intercepted assert] ");
    ftg__default_assert_reporter(expr, filename, func, lineno);

    ftgt_notify_assert_hit();

    return 1;
}
#endif

/* memory */

void *
ftg_malloc(size_t size, size_t num)
{
    void *heap = NULL;
    FTG_ASSERT(size != 0 && num != 0);

    if (size > 0 && num > 0 && FTG__SIZE_MAX/size >= num)
    {
        size_t alloc_size = size * num;
        heap = malloc(alloc_size);
        if (!heap)
        {
            FTG_ASSERT_FAIL("oom");
        }
    }
    else
    {
        FTG_ASSERT_FAIL("ftg_malloc overflow - no memory allocated");
    }

    return heap;
}

void
ftg_free(void **heap)
{
    FTG_ASSERT(heap && *heap);
    free(*heap);
    *heap = NULL;
}

/* strings */

/* ascii case folded string compare */
int
ftg_stricmp(const char *s1, const char *s2)
{
	int result;
	const char *p1;
	const char *p2;
    if ( s1==s2)
        return 0;

    p1 = s1;
    p2 = s2;
    result = 0;
    if ( p1 == p2 )
        return result;

    while (!result)
    {
        result = tolower(*p1) - tolower(*p2);
        if ( *p1 == '\0' )
            break;
        ++p1;
        ++p2;
    }

    return result;
}


/* Fill up to max_copy characters in dst, including null.  Unlike strncpy(), a null
   terminating character is guaranteed to be appended, EVEN if it overwrites
   the last character in the string.

   Only appends a single NULL character instead of NULL filling the string.  The
   trailing bytes are left uninitialized.

   No bytes are written if max_copy is 0, and FTG_ASSERT is thrown.

   \return 1 on truncation or max_copy==0, zero otherwise.
                                                                                   */
FTG_ATTRIBUTES(FTG_EXT_warn_unused_result) int
ftg_strncpy(char *ftg_restrict dst, const char *ftg_restrict src, size_t max_copy)
{
    size_t n;
    char *d;

    FTG_ASSERT(dst);
    FTG_ASSERT(src);
	FTG_ASSERT(max_copy > 0);

	if (max_copy == 0)
		return 1;

    n = max_copy;
    d = dst;
    while ( n > 0 && *src != '\0' )
    {
        *d++ = *src++;
        --n;
    }

    /* Truncation case -
       terminate string and return true */
    if ( n == 0 )
    {
        dst[max_copy-1] = '\0';
        return 1;
    }

    /* No truncation.  Append a single NULL and return. */
    *d = '\0';
    return 0;
}

/* case insensitive strstr */
char *
ftg_stristr(const char *haystack, const char *needle)
{
    if ( !*needle )
        return (char*)(haystack+strlen(haystack));

    for ( ; *haystack; ++haystack )
    {
        if ( tolower( *haystack ) == tolower( *needle ) )
        {
            const char *h,*n;
            for ( h = haystack, n = needle; *h && *n; ++h, ++n )
            {
                if ( tolower( *h ) != tolower( *n ) )
                    break;
            }
            if ( !*n )
                return (char*)haystack;
        }
    }

    return NULL;
}

/* append num strings, returning heap-allocated string.
   caller must free() returned ptr. */
FTG_ATTRIBUTES(FTG_EXT_warn_unused_result) char *
ftg_strcatall(size_t num, ...)
{
    size_t i, alloc_size = 0;
    va_list va1, va2;
    char *buf, *p_buf;

    va_start(va1, num);
    for (i = 0; i < num; i++)
    {
        alloc_size += strlen(va_arg(va1, char*));
    }
    va_end(va1);
    alloc_size += 1;

    buf = p_buf = (char*)FTG_MALLOC(sizeof(char), alloc_size);
    if (!buf) return NULL;
    va_start(va2, num);
    for (i = 0; i < num; i++)
    {
        char *s = va_arg(va2, char*);
        while (*s)
        {
            *p_buf = *s;
            p_buf++; s++;
        }
    }
    va_end(va2);

    buf[alloc_size-1] = '\0';
    return buf;
}


/* split *str on split_chr, returing the split number 'index'.
   index 0 = beginning of string, NULL when index exceeds number of splits
   len is set to the length of the string or 0 if NULL is returned */
FTGDEF const char*
ftg_strsplit(const char *str, char split_ch, size_t index, size_t *len) {
    size_t encounters = 0;
    const char *p = str;
    const char *end;

    if (index == 0) {
        goto find_next_split;
    }

    for (p = str; *p; p++) {
        if (*p == split_ch)
            encounters++;
        if (encounters == index) {
            break;
        }

    }

    // hit end of string; requested index does not exist
    if (!*p) {
        if (len) *len = 0;
        return NULL;
    }

    p++;

find_next_split:
    // skip search for next split char if not needed
    if (!len)
        return p;

    for (end = p; *end && *end != split_ch; end++)
        ;
    *len = end-p;

    return p;
}


/* avoids memset argument order confusion for most common use case,
   guards against 0 num, works on platforms that don't have bzero,
   can't be optimized away. */
void
ftg_bzero(void *ptr, size_t num)
{
    FTG_ASSERT(num > 0);
    FTG_ASSERT(ptr);

#ifdef FTG__HAVE_MEMSET_S
    errno_t err = memset_s(ptr, num, 0, num);
    FTG_ASSERT(err == 0);
    FTG_UNUSED(err);
#elif defined(FTG__HAVE_EXPLICIT_BZERO)
    explicit_bzero(ptr, num);
#else
    memset(ptr, 0, num);
#endif
}

/* calls realloc with guards -- behaves the same way */
void *
ftg_realloc(void *ptr, size_t size, size_t num)
{
    void *alloc_ptr = NULL;
    FTG_ASSERT(size != 0 && num != 0);
    if (size > 0 && num > 0 && FTG__SIZE_MAX/size >= num)
    {
        size_t alloc_size = size * num;

        alloc_ptr = realloc(ptr, alloc_size);
        FTG_ASSERT(alloc_ptr);
    }
    else
    {
        FTG_ASSERT_FAIL("ftg_realloc overflow - no memory allocated");
    }

    /* return result from realloc even if null */
    return alloc_ptr;
}

char *
ftg_va(const char *fmt, ...)
{
    static char buf[FTG_STRLEN_LONG];
    int len;

    va_list ap;
    va_start(ap, fmt);
#ifdef _WIN32
    len = _vsnprintf(buf, FTG_STRLEN_LONG, fmt, ap);
    FTG_ASSERT(len != -1);
    FTG_UNUSED(len);
#else
    len = vsnprintf(buf, FTG_STRLEN_LONG, fmt, ap);
    FTG_ASSERT(len < FTG_STRLEN_LONG);
    FTG_UNUSED(len);
#endif
    va_end(ap);
    buf[FTG_STRLEN_LONG-1] = 0;

    return buf;
}

/* in-place swapping of slashes to match executing platform's
   directory slash order.  returns a pointer to *path
 */
const char *ftg_correct_dirslash(char *path)
{
#ifdef _WIN32
    char bad_slash = '/';
    char good_slash = '\\';
#elif defined(FTG_POSIX_LIKE)
    char bad_slash = '\\';
    char good_slash = '/';
#endif

    char *p = &path[0];
    while(*p)
    {
        if (*p == bad_slash)
            *p = good_slash;
        p++;
    }

    return path;
}

/* get extension of the filename, not including the '.' */
FTGDEF char *
ftg_get_filename_ext(const char *path)
{
    size_t len = strlen(path);
    const char *end = &path[len];

    while(len > 0)
    {
        char c;

        len--;
        c = path[len];

        if (c == FTG_DIRSLASH)
            break;

        if (c == '.')
            return (char*)&path[len+1];
    }

    return (char*)end; /* return null terminator */
}

/* return the filename part of a path using the current OS's slash char */
FTGDEF char *
ftg_get_filename_from_path(const char *path)
{
    const char *p = path + strlen(path)-1;
    while (p != path)
    {
        if (*p == FTG_DIRSLASH)
            return (char*)p+1;
        p--;
    }

    return (char*)path;
}

/* cross-environment dir slash check */
FTGDEF bool
ftg_is_dirslash(char c)
{
    return (c == '/' || c == '\\');
}

/* append a directory to a path, separated by a directory slash ('/' or '\')
   return true if truncation occurs */
FTGDEF bool
ftg_push_path(char *dst_path, const char *src_path, size_t max_path)
{
    char *dst = dst_path;
    const char *src = dst_path;
    bool slashing = false;
    char c;

#define FTG__CHECK_MAX_PATH \
    if ((ptrdiff_t)(dst - dst_path + 1) >= (ptrdiff_t)max_path) return true;

    FTG_ASSERT(src_path && dst_path);

    // start with a slash if src_path is absolute
    if (ftg_is_dirslash(dst_path[0]))
    {
        FTG__CHECK_MAX_PATH;
        dst++;
        src++;
        slashing = true;
    }

    while ((c = *src) != '\0')
    {
        bool is_slash;
        FTG__CHECK_MAX_PATH;
        is_slash = ftg_is_dirslash(c);
        if (!slashing || !is_slash)
            *dst++ = c;

        slashing = is_slash;
        src++;
    }

    // begin reading from src_path
    src = src_path;

    // insert a separating slash (or leading slash for an abs path)
    if (((dst != dst_path) && !slashing) ||
        ((dst == dst_path) && (ftg_is_dirslash(src_path[0]))))
    {
        FTG__CHECK_MAX_PATH;
        *dst++ = FTG_DIRSLASH;
        slashing = true;
    }

    while ((c = *src) != '\0')
    {
        bool is_slash;
        FTG__CHECK_MAX_PATH;
        is_slash = ftg_is_dirslash(c);
        if (!slashing || !is_slash)
            *dst++ = c;

        slashing = is_slash;
        src++;
    }

    *dst = '\0';

    // strip any trailing slash
    if (slashing && ((dst - dst_path) > 1))
    {
        dst--;
        *dst = '\0';
    }

    return false;
#undef FTG__CHECK_MAX_PATH
}

/* in-place truncate dst_path to remove last path component:
   filename or directory. */
FTGDEF void
ftg_pop_path(char *dst_path)
{
    size_t length = strlen(dst_path);

    if (length == 0)
        return;

    if ((length == 1) && (ftg_is_dirslash(dst_path[0])))
        return;

    if (ftg_is_dirslash(dst_path[length-1]))
        length--;

    // don't strip the root / of an abs path
    if (ftg_is_dirslash(dst_path[0]))
    {
        dst_path++;
        length--;
    }

    while(length > 0)
    {
        char c;
        length--;
        c = dst_path[length];
        if (ftg_is_dirslash(c))
            break;
    }

    dst_path[length] = '\0';
}

/* read a file into a memory buffer.  clear the memory with ftg_free.
   if make_string is true, a null terminator is attached.

   len is the number of bytes returned, including the null terminator if
   return is non-NULL, otherwise it is unchanged.

   Uses 64-bit file routines internally.
*/
#ifndef FTG_CORE_NO_STDIO
FTGDEF uint8_t *
ftg_file_read(const char *path, bool make_string, ftg_off_t *len)
{
    int64_t file_len;
    ftg_off_t out_size;
    size_t size;
    unsigned char *buf;
    size_t num_elements;
    FILE *fp = ftg_fopen64(path, "rb");
    if (!fp)
        return NULL;

    ftg_fseek64(fp, 0L, SEEK_END);
    file_len = ftg_ftell64(fp);
    ftg_fseek64(fp, 0L, SEEK_SET);

    out_size = make_string ? file_len+1 : file_len;

#ifdef _MSC_VER
#  pragma warning(push)
#  pragma warning(disable: 4127)
#endif
    if (sizeof(int64_t) > sizeof(size_t) && (size_t)file_len > FTG__SIZE_MAX)
    {
        // fread will truncate if trying to read more than 2GB on a 32-bit OS in one call.
        FTG_ASSERT_FAIL("File is larger than a single fread() call and will be truncated.");
        file_len = FTG__SIZE_MAX;
    }
#ifdef _MSC_VER
#  pragma warning(pop)
#endif

    /* ftg_off_t is a signed value, size_t is an unsigned value.
       rather than work with memory with a signed value, cast
       to size_t. */
    FTG_ASSERT(out_size >= 0);
    size = (size_t)out_size;

    buf = (unsigned char*)FTG_MALLOC(sizeof(unsigned char), size);
    if (!buf)
        return NULL;

    num_elements = fread(buf, (size_t)file_len, 1, fp);
    if (num_elements != 1)
        goto fail;

    fclose(fp);

    if (make_string)
        buf[size-1] = '\0';

    if (len)
        *len = out_size;

    return buf;

 fail:
    FTG_FREE(buf);
    return NULL;
}

/* write *buf bytes into a file.  Returns whether all the bytes were written.
   buf does not necessarily point to a string. */
FTGDEF bool
ftg_file_write(const char *path, const uint8_t *buf, size_t buf_bytes)
{
    size_t write_bytes;
    FILE *fp = ftg_fopen64(path, "wb");

    if (!fp)
        return false;

    write_bytes = fwrite(buf, sizeof(uint8_t), buf_bytes, fp);
    fclose(fp);

    FTG_ASSERT(write_bytes == buf_bytes);

    return write_bytes == buf_bytes;
}

/* writes a string to a file, not including the terminator */
FTGDEF bool
ftg_file_write_string(const char *path, const char *str)
{
    size_t byte_count = strlen(str);
    return ftg_file_write(path, (const uint8_t*)str, byte_count);
}
#endif /* !FTG_CORE_NO_STDIO */


static ftg_inline
float ftg__get_min(float a, float b, float c)
{
    float r = a;
    if (r > b) r = b;
    if (r > c) r = c;
    return r;
}

static ftg_inline
float ftg__get_max(float a, float b, float c)
{
    float r = a;
    if (r < b) r = b;
    if (r < c) r = c;
    return r;
}


void
ftg_gethsv(float r, float g, float b, float *ftg_restrict h, float *ftg_restrict s, float *ftg_restrict v)
{
    float max_chan = ftg__get_max(r,g,b);
    float min_chan = ftg__get_min(r,g,b);
    float delta;

    *v = max_chan;

    *s = (max_chan != 0.0f) ? (( max_chan - min_chan) / max_chan ): 0.0f;

    if ( *s == 0.0f )
    {
        *h = FTG_UNDEFINED_HUE; /* undefined */
    }
    else
    {
        delta = max_chan - min_chan;

        if (r == max_chan)
            *h = (g - b) / delta;       /* Color between yellow and magenta */
        else if ( g == max_chan )
            *h = 2.0f + (b-r) / delta;   /* Color between cyan and yellow */
        else if ( b == max_chan )
            *h = 4.0f + (r-g) / delta;   /* Color between magenta and cyan */

        *h *= 60.0f;                    /* Convert hue to degrees */
        if ( *h < 0.0f )
            *h += 360.0f;
    }
}

void
ftg_getrgb(float h, float s, float v, float *ftg_restrict r, float *ftg_restrict g, float *ftg_restrict b)
{
    FTG_ASSERT( h==FTG_UNDEFINED_HUE || (h >= 0.0f && h <= 360.0f) );
    FTG_ASSERT( s >= 0.0f && s <= 1.0f );
    FTG_ASSERT( v >= 0.0f && v <= 1.0f );

    if ( s == 0.0f )
    {
        /* Achromatic color */
        if ( h == FTG_UNDEFINED_HUE )
        {
            *r = *g = *b = v;
        }
        else
        {
            FTG_ASSERT_FAIL("If s == 0 and hue has value, this is an invalid HSV set");
            return;
        }
    }
    else
    {
        // Chromatic case: s != 0 so there is a hue.
        float f,p,q,t;
        int i;

        if ( h == 360.0f )
            h = 0.0f;
        h /= 60.0f;

        i = (int)h;
        f = h - i;

        p = v * (1.0f - s);
        q = v * (1.0f - (s * f ));
        t = v * (1.0f - (s * (1.0f - f )));

        switch(i)
        {
        case 0: *r = v; *g = t; *b = p; break;
        case 1: *r = q; *g = v; *b = p; break;
        case 2: *r = p; *g = v; *b = t; break;
        case 3: *r = p; *g = q; *b = v; break;
        case 4: *r = t; *g = p; *b = v; break;
        case 5: *r = v; *g = p; *b = q; break;
        }
    }
}


/* For a rectangle inside a screen, get the scale factor that permits the rectangle
   to be scaled without stretching or squashing. */
float
ftg_aspect_correct_scale_for_rect(const float screen[2], const float rect[2])
{
    float screenAspect = screen[0] / screen[1];
    float rectAspect = rect[0] / rect[1];

    float scaleFactor;
    if (screenAspect > rectAspect)
        scaleFactor = screen[1] / rect[1];
    else
        scaleFactor = screen[0] / rect[0];

    return scaleFactor;
}

FTGDEF size_t
ftg_u8_strlen(const char *s)
{
    const char *p = s;
    size_t j = 0;

    while (*p) {
        if ((*p & 0xc0) != 0x80)
            j++;
        p++;
    }

    return j;
}

bool
ftg_ia_is_init(struct ftg_index_array_s *i)
{
    return (i && i->indices && i->records > 0);
}

void
ftg_ia_prealloc(struct ftg_index_array_s *i, size_t initial_record_count)
{
    FTG_ASSERT(initial_record_count > 0);

    if (i->records > initial_record_count || initial_record_count == 0)
        return;

    i->indices = (size_t*)FTG_MALLOC(initial_record_count, sizeof(size_t));
    if (!i->indices)
        return;
    i->records = initial_record_count;
    i->count = 0;
}

bool
ftg_ia_append(struct ftg_index_array_s *i, size_t index_value)
{
    if (i->count+1 > i->records)
    {
        size_t new_record_count;
        size_t *new_frame_indices;

        if (i->count == 0)
            new_record_count = FTG_IA_INITIAL_RECORD_COUNT;
        else
            new_record_count = i->count*2;

        new_frame_indices = (size_t*)FTG_REALLOC(i->indices,
                                                 sizeof(size_t), new_record_count);

        if (!new_frame_indices) {
            FTG_ASSERT_FAIL("Could not reallocate index array.");
            return false;
        }

        i->records = new_record_count;
        i->indices = new_frame_indices;
    }

    i->indices[i->count] = index_value;
    i->count++;

    return true;
}

void
ftg_ia_free(struct ftg_index_array_s *i)
{
    if (i->indices)
        FTG_FREE(i->indices);
    i->records = i->count = 0;
}

/* portable 64-bit UTF-8 file routines */
#ifndef FTG_CORE_NO_STDIO

#ifdef _WIN32
/* these utf8 conversion routines are taken from public domain stb.h
   with minor tweaks */
FTGDEF ftg_wchar_t *
ftg_wchar_from_u8(const char *in_str, ftg_wchar_t *out_str, size_t n)
{
    unsigned char *str = (unsigned char *)in_str;
    uint32_t c;
    unsigned int i = 0;
    --n;
    while (*str) {
        if (i >= n)
            return NULL;
        if (!(*str & 0x80))
            out_str[i++] = *str++;
        else if ((*str & 0xe0) == 0xc0) {
            if (*str < 0xc2) return NULL;
            c = (*str++ & 0x1f) << 6;
            if ((*str & 0xc0) != 0x80) return NULL;
            out_str[i++] = (ftg_wchar_t)(c + (*str++ & 0x3f));
        } else if ((*str & 0xf0) == 0xe0) {
            if (*str == 0xe0 && (str[1] < 0xa0 || str[1] > 0xbf)) return NULL;
            if (*str == 0xed && str[1] > 0x9f) return NULL; // str[1] < 0x80 is checked below
            c = (*str++ & 0x0f) << 12;
            if ((*str & 0xc0) != 0x80) return NULL;
            c += (*str++ & 0x3f) << 6;
            if ((*str & 0xc0) != 0x80) return NULL;
            out_str[i++] = (ftg_wchar_t)(c + (*str++ & 0x3f));
        } else if ((*str & 0xf8) == 0xf0) {
            if (*str > 0xf4) return NULL;
            if (*str == 0xf0 && (str[1] < 0x90 || str[1] > 0xbf)) return NULL;
            if (*str == 0xf4 && str[1] > 0x8f) return NULL; // str[1] < 0x80 is checked below
            c = (*str++ & 0x07) << 18;
            if ((*str & 0xc0) != 0x80) return NULL;
            c += (*str++ & 0x3f) << 12;
            if ((*str & 0xc0) != 0x80) return NULL;
            c += (*str++ & 0x3f) << 6;
            if ((*str & 0xc0) != 0x80) return NULL;
            c += (*str++ & 0x3f);
            // utf-8 encodings of values used in surrogate pairs are invalid
            if ((c & 0xFFFFF800) == 0xD800) return NULL;
            if (c >= 0x10000) {
                c -= 0x10000;
                if ((size_t)i + 2 > n) return NULL;
                out_str[i++] = 0xD800 | (0x3ff & (c >> 10));
                out_str[i++] = 0xDC00 | (0x3ff & (c      ));
            }
        } else
            return NULL;
    }
    out_str[i] = 0;
    return out_str;
}

FTGDEF char *
ftg_wchar_to_u8(const ftg_wchar_t *in_str, char *out_str, size_t n)
{
    unsigned int i = 0;
    --n;
    while (*in_str) {
        if (*in_str < 0x80) {
            if ((size_t)i+1 > n) return NULL;
            out_str[i++] = (char) *in_str++;
        } else if (*in_str < 0x800) {
            if ((size_t)i+2 > n) return NULL;
            out_str[i++] = (char)(0xc0 + (*in_str >> 6));
            out_str[i++] = 0x80 + (*in_str & 0x3f);
            in_str += 1;
        } else if (*in_str >= 0xd800 && *in_str < 0xdc00) {
            uint32_t c;
            if ((size_t)i+4 > n) return NULL;
            c = ((in_str[0] - 0xd800) << 10) + ((in_str[1]) - 0xdc00) + 0x10000;
            out_str[i++] = (char)(0xf0 + (c >> 18));
            out_str[i++] = 0x80 + ((c >> 12) & 0x3f);
            out_str[i++] = 0x80 + ((c >>  6) & 0x3f);
            out_str[i++] = 0x80 + ((c      ) & 0x3f);
            in_str += 2;
        } else if (*in_str >= 0xdc00 && *in_str < 0xe000) {
            return NULL;
        } else {
            if ((size_t)i+3 > n) return NULL;
            out_str[i++] = 0xe0 + (*in_str >> 12);
            out_str[i++] = 0x80 + ((*in_str >> 6) & 0x3f);
            out_str[i++] = 0x80 + ((*in_str     ) & 0x3f);
            in_str += 1;
        }
    }
    out_str[i] = 0;
    return out_str;
}
#endif

FILE *
ftg_fopen64(const char *filename, const char *type)
{
#ifdef _WIN32
    /* win32 fopen is not utf-8, it's some stupid codepage */
    ftg_wchar_t wfilename[FTG_STRLEN_LONG];
    ftg_wchar_t wtype[4];

    ftg_wchar_from_u8(filename, wfilename, FTG_STRLEN_LONG);
    ftg_wchar_from_u8(type, wtype, 4);
    return _wfopen(wfilename, wtype);
#else

#  if FTG__IO64_EXPLICIT
    return fopen64(filename, type);
#  else
    return fopen(filename, type);
#  endif

#endif
}

ftg_off_t
ftg_ftell64(FILE *stream)
{
#ifdef _WIN32
    int64_t tell = _ftelli64(stream);

#if FTG_DEBUG
    if (tell == -1L)
    {
        const char *fail_reason = strerror(errno);
        FTG_ASSERT_FAIL(fail_reason);
    }
#endif
    return tell;

#else

#  if FTG__IO64_EXPLICIT
    off64_t tell = ftello64(stream);
#  else
    off_t tell = ftello(stream);
#  endif

    FTG_ASSERT(tell >= 0);
    return tell;
#endif
}

int64_t
ftg_fseek64(FILE *stream, ftg_off_t offset, int origin)
{
#ifdef _WIN32
    int seek = _fseeki64(stream, offset, origin);
    FTG_ASSERT(seek == 0);
    return (int64_t)seek;
#else

#  if FTG__IO64_EXPLICIT
    int seek = fseeko64(stream, offset, origin);
#  else
    int seek = fseeko(stream, offset, origin);
#  endif

    FTG_ASSERT(seek != -1);
    return (int64_t)seek;
#endif
}

struct ftg_dirhandle_s {
#if defined(_WIN32)
    HANDLE d;
#  elif defined(FTG_POSIX_LIKE)
    DIR *d;
#endif
};

/* see ftg__test_opendir for iteration example
   returns *out, the first file in the directory.
 */
FTGDEF const char *
ftg_opendir(ftg_dirhandle_t *handle, const char *path, char *out, size_t out_len)
{
#ifdef FTG_POSIX_LIKE
    struct dirent *dirent;
    bool trunc;

    handle->d = opendir(path);
    if (handle->d == NULL)
    {
        FTG_ASSERT_FAIL("OpenDir failed.");

        *out = 0;
        return out;
    }

    dirent = readdir(handle->d);
    trunc = ftg_strncpy(out, dirent->d_name, out_len);
    if (trunc)
    {
        FTG_ASSERT_FAIL(ftg_va("Truncation on ftg_opendir for path %s.", path));
        /* never return truncated paths */
        *out = 0;
        return out;
    }

    return out;
#elif defined(_WIN32)
    WIN32_FIND_DATAW fd;
    ftg_wchar_t search_path[MAX_PATH+3];

    if (ftg_u8_strlen(path) > MAX_PATH + 3)
    {
        FTG_ASSERT_FAIL("path is too long");
        *out = 0;
        return out;
    }

    ftg_wchar_from_u8(path, search_path, MAX_PATH+3);
    wcsncat(search_path, L"\\*", 2);

    handle->d = FindFirstFileW(search_path, &fd);
    if (handle->d == INVALID_HANDLE_VALUE)
    {
        FTG_ASSERT_FAIL("OpenDir failed.");
        *out = 0;
        return out;
    }

    ftg_wchar_to_u8(fd.cFileName, out, out_len);

    return out;
#endif
}

FTGDEF const char *
ftg_readdir(ftg_dirhandle_t *handle, char *out, size_t out_len)
{
#ifdef FTG_POSIX_LIKE
    struct dirent *dirent;
    bool trunc;

    dirent = readdir(handle->d);
    if (dirent==NULL)
    {
        *out = 0;
        return out;
    }

    trunc = ftg_strncpy(out, dirent->d_name, out_len);
    if (trunc)
    {
        FTG_ASSERT_FAIL(ftg_va("Truncation on ftg_readdir for path %s.",
                               dirent->d_name));
        *out = 0;
        return out;
    }

    return out;

#elif defined(_WIN32)
    WIN32_FIND_DATAW fd;

    if (FindNextFileW(handle->d, &fd) != 0)
    {
        ftg_wchar_to_u8(fd.cFileName, out, out_len);
    }
    else
    {
        DWORD error = GetLastError();
        if (error == ERROR_NO_MORE_FILES)
        {
            *out = 0;
            return out;
        }
        else
        {
            FTG_ASSERT_FAIL(ftg_va("ftg_readdir() error %d", error));
            *out = 0;
            return out;
        }
    }

    return out;
#endif
}

FTGDEF void
ftg_closedir(ftg_dirhandle_t *handle)
{
#ifdef FTG_POSIX_LIKE
    int ret = closedir(handle->d);
    FTG_ASSERT(ret != -1);
    FTG_UNUSED(ret);

    return;

#elif defined(_WIN32)
    if (!FindClose(handle->d))
    {
        FTG_ASSERT_FAIL(ftg_va("ftg_closedir() error: %d", GetLastError()));
    }
#endif
}

/* returns true if path exists and is a directory */
FTGDEF bool
ftg_is_dir(const char *path)
{
#ifdef FTG_POSIX_LIKE
    struct stat buf;
    if (stat(path, &buf) == -1)
        return false; /* does not exist */

    return (S_ISDIR(buf.st_mode));
#elif defined(_WIN32)
    ftg_wchar_t wpath[FTG_STRLEN_LONG];

    DWORD attr = GetFileAttributesW(ftg_wchar_from_u8(path, wpath, FTG_STRLEN_LONG));
    if (attr == INVALID_FILE_ATTRIBUTES)
        return false; /* does not exist */

    return ((attr & FILE_ATTRIBUTE_DIRECTORY) == FILE_ATTRIBUTE_DIRECTORY);
#endif
}

/* returns true if the dir or file exists */
FTGDEF bool
ftg_path_exists(const char *path)
{
#ifdef FTG_POSIX_LIKE
    return access(path, F_OK) != -1;
#elif defined(_WIN32)
    ftg_wchar_t wide_path[MAX_PATH];
    DWORD attrib;

    ftg_wchar_from_u8(path, wide_path, MAX_PATH);
    attrib = GetFileAttributesW(wide_path);

    return (attrib != INVALID_FILE_ATTRIBUTES);
#endif
}

/* make a directory that must not already exist */
FTGDEF bool
ftg_mkdir(const char *path)
{
#ifdef FTG_POSIX_LIKE
    int result = mkdir(path, FTG_DIRECTORY_MODE);
    if (result != 0)
    {
        FTG_ASSERT_FAIL(strerror(errno));
    }

    return (result == 0);
#elif defined(_WIN32)
    ftg_wchar_t wide_path[MAX_PATH];
    int result;

    ftg_wchar_from_u8(path, wide_path, MAX_PATH);
    result = _wmkdir(wide_path);
    if (result != 0)
    {
        FTG_ASSERT_FAIL(strerror(errno));
    }

    return (result == 0);
#endif
}

/* recursively make all directories in *path that are not yet created */
FTGDEF void
ftg_mkalldirs(const char *path)
{
    if (!ftg_is_dir(path))
    {
        if(path[0] != '\0')
        {
            bool trunc;
            char parent_path[FTG_STRLEN_LONG] = {'\0'};

            trunc = ftg_push_path(parent_path, path, FTG_STRLEN_LONG);
            FTG_ASSERT(!trunc);
            FTG_UNUSED(trunc);
            ftg_pop_path(parent_path);

            ftg_mkalldirs(parent_path);
            ftg_mkdir(path);
        }
    }
}

static void
ftg__remove_dir_contents(const char *path)
{
    ftg_dirhandle_t dir_handle;
    char dir_path[FTG_STRLEN_LONG];
    const char *filename;

    int i = 5;

    filename = ftg_opendir(&dir_handle, path, dir_path, FTG_STRLEN_LONG);
    while(*filename)
    {
        if (strcmp(filename, ".") && strcmp(filename, ".."))
        {
            char child_path[FTG_STRLEN_LONG] = {'\0'};
            ftg_push_path(child_path, path, FTG_STRLEN_LONG);
            ftg_push_path(child_path, filename, FTG_STRLEN_LONG);

            i--;
            if (i == 0)
                exit(0);
            ftg_rmalldirs(child_path);
        }

        filename = ftg_readdir(&dir_handle, dir_path, FTG_STRLEN_LONG);
    }

    ftg_closedir(&dir_handle);
}

/* recursively remove all directories in *path, deleting contents */
FTGDEF void
ftg_rmalldirs(const char *path)
{
    if (ftg_is_dir(path))
    {
        ftg__remove_dir_contents(path);
        ftg_rmdir(path);
    }
    else
    {
        int result = remove(path);
        FTG_ASSERT(result == 0);
        FTG_UNUSED(result);
    }
}

/* remove a directory that must already exist and be empty */
FTGDEF bool
ftg_rmdir(const char *path)
{
#ifdef FTG_POSIX_LIKE
    int result = rmdir(path);
    if (result != 0)
    {
        FTG_ASSERT_FAIL(strerror(errno));
    }

    return (result == 0);
#elif defined(_WIN32)
    ftg_wchar_t wide_path[MAX_PATH];
    int result;

    ftg_wchar_from_u8(path, wide_path, MAX_PATH);
    result = _wrmdir(wide_path);
    if (result != 0)
    {
        FTG_ASSERT_FAIL(strerror(errno));
    }

    return (result == 0);
#endif
}

/* add a console on windows -- exit silently on others.
   note that only one console can exist per process */
#ifdef _WIN32
static FILE *ftg__io[3] = {0,0,0};
#endif

FTGDEF void
ftg_alloc_console(void)
{
#if defined(_WIN32)
    int i;
    bool result = AllocConsole();
    FTG_ASSERT(result); FTG_UNUSED(result);
    if (!result)
        return;

#if FTG_DEBUG
    for (i = 0; i < 3; i++)
        FTG_ASSERT(!ftg__io[i]);
#endif
    FTG_UNUSED(i);

    ftg__io[0] = freopen("conin$","r",stdin);
    ftg__io[1] = freopen("conout$","w",stdout);
    ftg__io[2] = freopen("conout$","w",stderr);
#endif
}

FTGDEF void
ftg_free_console(void)
{
#if defined(_WIN32)
    int i;

    FreeConsole();
    for (i = 0; i < 3; i++)
    {
        if (!ftg__io[i]) continue;
        fclose(ftg__io[i]);
        ftg__io[i] = NULL;
    }
#endif
}

#endif /* !FTG_CORE_NO_STDIO */


// Paul Hsieh hash (borrowed from stb.h with type changes for
// portability)
#define ftg__get16_slow(p) ((p)[0] + ((p)[1] << 8))
#if defined(_MSC_VER)
#define ftg__get16(p) (*((unsigned short *) (p)))
#else
#define ftg__get16(p) ftg__get16_slow(p)
#endif

FTGDEF uint32_t
ftg_hash_fast(const void *p, uint32_t len)
{
    unsigned char *q = (unsigned char *) p;
    uint32_t hash = len;

    if (len <= 0 || q == NULL) return 0;

    /* Main loop */
    if (((size_t) q & 1) == 0) {
        for (;len > 3; len -= 4) {
            uint32_t val;
            hash +=  ftg__get16(q);
            val   = (ftg__get16(q+2) << 11);
            hash  = (hash << 16) ^ hash ^ val;
            q    += 4;
            hash += hash >> 11;
        }
    } else {
        for (;len > 3; len -= 4) {
            uint32_t val;
            hash +=  ftg__get16_slow(q);
            val   = (ftg__get16_slow(q+2) << 11);
            hash  = (hash << 16) ^ hash ^ val;
            q    += 4;
            hash += hash >> 11;
        }
    }

    /* Handle end cases */
    switch (len) {
    case 3: hash += ftg__get16_slow(q);
        hash ^= hash << 16;
        hash ^= q[2] << 18;
        hash += hash >> 11;
        break;
    case 2: hash += ftg__get16_slow(q);
        hash ^= hash << 11;
        hash += hash >> 17;
        break;
    case 1: hash += q[0];
        hash ^= hash << 10;
        hash += hash >> 1;
        break;
    case 0: break;
    }

    /* Force "avalanching" of final 127 bits */
    hash ^= hash << 3;
    hash += hash >> 5;
    hash ^= hash << 4;
    hash += hash >> 17;
    hash ^= hash << 25;
    hash += hash >> 6;

    return hash;
}

FTGDEF uint32_t
ftg_hash_number(uint32_t hash)
{
    hash ^= hash << 3;
    hash += hash >> 5;
    hash ^= hash << 4;
    hash += hash >> 17;
    hash ^= hash << 25;
    hash += hash >> 6;

    return hash;
}




/* stopwatch (code timing routines) */

#ifdef FTG_ENABLE_STOPWATCH

#ifdef _WIN32
#  define WIN32_LEAN_AND_MEAN
#  include <windows.h>
#  undef WIN32_LEAN_AND_MEAN
#elif defined(__APPLE__)
#  include <mach/mach_time.h>
#  define FTG__CLOCK_MACH
#else
#  include <time.h>
#  define FTG__CLOCK_GETTIME
#  ifdef CLOCK_MONOTONIC_RAW
#    define FTG__CLOCK_MONOTONIC CLOCK_MONOTONIC_RAW
#  else
#    define FTG__CLOCK_MONOTONIC CLOCK_MONOTONIC
#  endif
#endif

#ifndef FTG_STOPWATCH_REPORTER
#  define FTG_STOPWATCH_REPORTER ftg__default_stopwatch_reporter
#endif


#ifdef FTG__CLOCK_GETTIME
static uint64_t ftg__stopwatch_get_usec_since_init(void)
{
    static struct timespec ftg__init_time = {0,0};
    struct timespec now, since_init;
    uint64_t usec;
    int ret;

    if (ftg__init_time.tv_sec == 0 && ftg__init_time.tv_nsec == 0)
    {
        ret = clock_gettime(FTG__CLOCK_MONOTONIC, &ftg__init_time);
        FTG_ASSERT(ret==0); FTG_UNUSED(ret);
    }

    ret = clock_gettime(FTG__CLOCK_MONOTONIC, &now);
    FTG_ASSERT(ret==0); FTG_UNUSED(ret);

    since_init.tv_sec = now.tv_sec - ftg__init_time.tv_sec;
    since_init.tv_nsec = now.tv_nsec - ftg__init_time.tv_nsec;

    usec = (since_init.tv_sec * 1000000) + (since_init.tv_nsec / 1000);

    return usec;
}
#endif


static uint64_t
ftg__stopwatch_elapsed_usec(struct ftg_stopwatch_s *sw)
{
#ifdef _WIN32
    LARGE_INTEGER end_time, freq, elapsed;

    QueryPerformanceCounter(&end_time);
    QueryPerformanceFrequency(&freq);

    // calculate elapsed time
    elapsed.QuadPart = end_time.QuadPart - sw->start_time;

    // convert to microseconds
    elapsed.QuadPart *= 1000000;

    // divide by ticks per second
    elapsed.QuadPart /= freq.QuadPart;

    return (uint64_t)elapsed.QuadPart;
#elif defined(FTG__CLOCK_MACH)
    static mach_timebase_info_data_t timebase = {0,0};

    uint64_t end, elapsed;

    if (timebase.denom == 0)
        mach_timebase_info(&timebase);

    end = mach_absolute_time();
    elapsed = end - sw->start_time;

    // convert to microseconds before applying timebase
    elapsed /= 1000;
    elapsed *= timebase.numer / timebase.denom;

    return elapsed;

#elif defined(FTG__CLOCK_GETTIME)
    return ftg__stopwatch_get_usec_since_init() - sw->start_time;
#endif
}

static void
ftg__stopwatch_set_start_time(struct ftg_stopwatch_s *sw)
{
#ifdef _WIN32
    LARGE_INTEGER start_time;

    QueryPerformanceCounter(&start_time);
    sw->start_time = (int64_t)start_time.QuadPart;

#elif defined(FTG__CLOCK_MACH)
    sw->start_time = mach_absolute_time();

#elif defined(FTG__CLOCK_GETTIME)
    sw->start_time = ftg__stopwatch_get_usec_since_init();
#endif
}

void
ftg__stopwatch_next_bucket(struct ftg_stopwatch_s *sw, const char *bucket_name, size_t bucket_idx)
{
    // if this is hit then FTG_STOPWATCH_START was not called after FTG_STOPWATCH_DECL.
    FTG_ASSERT(sw->current_bucket != FTG__MAX_STOPWATCH_TIMES+100);

    // it is possible to end up entering a sub-function that is being logged without coming
    // from the parent which is logging.  This guards against incorrectly logging the time.
    if (sw->currently_logging == false)
        return;

    if (sw->times[bucket_idx] == 0)
    {
        bool truncate = ftg_strncpy(sw->time_names[bucket_idx], bucket_name, FTG_STRLEN_SHORT);
        FTG_UNUSED(truncate);
    }

    sw->times[sw->current_bucket] += ftg__stopwatch_elapsed_usec(sw);
    ftg__stopwatch_set_start_time(sw);

    if (bucket_idx >= FTG__MAX_STOPWATCH_TIMES)
    {
        FTG_ASSERT_FAIL("stopwatch with bucket index > FTG__MAX_STOPWATCH_TIMES specified.  not dumped.");
        sw->currently_logging = false;
        return;
    }

    sw->current_bucket = bucket_idx;
}

void
ftg__stopwatch_start(struct ftg_stopwatch_s *sw, const char *name, const char *bucket_name, size_t bucket_idx)
{
    bool truncate = ftg_strncpy(sw->name, name, FTG_STRLEN_SHORT);
    FTG_UNUSED(truncate);

    sw->currently_logging = true;
    ftg_bzero(sw->times, sizeof(sw->times));
    ftg_bzero(sw->time_names, sizeof(sw->time_names));

	// todo: compress this
    if (bucket_idx >= FTG__MAX_STOPWATCH_TIMES)
    {
        FTG_ASSERT_FAIL("stopwatch with bucket index > FTG__MAX_STOPWATCH_TIMES specified.  not dumped.");
        return;
    }

    sw->current_bucket = bucket_idx;
    truncate = ftg_strncpy(sw->time_names[bucket_idx], bucket_name, FTG_STRLEN_SHORT);
    FTG_UNUSED(truncate);

    // start counter at the end of this function to avoid profiling setup work.
    ftg__stopwatch_set_start_time(sw);
}

void
ftg__stopwatch_stop(struct ftg_stopwatch_s *sw)
{
    // if this is hit then FTG_STOPWATCH_START was not called after FTG_STOPWATCH_DECL.
    FTG_ASSERT(sw->current_bucket != FTG__MAX_STOPWATCH_TIMES+100);

    sw->times[sw->current_bucket] += ftg__stopwatch_elapsed_usec(sw);

    sw->currently_logging = false;
    FTG_STOPWATCH_REPORTER(sw);
}

void
ftg__default_stopwatch_reporter(struct ftg_stopwatch_s *sw)
{
    size_t i;
    uint64_t accum_ms = 0;
#if FTG_DEBUG
    const char debug_str[] = "FTG_DEBUG=1 ";
#else
    const char debug_str[] = "";
#endif

    printf("%sstopwatch %s completed:\n", debug_str, sw->name);
    for (i = 0; i < FTG__MAX_STOPWATCH_TIMES; ++i)
    {
        if (sw->times[i] == 0 && sw->time_names[i][0] == '\0')
            continue;

        accum_ms += sw->times[i] / 1000;
        printf("\t%s[%" FTG_SPEC_SIZE_T "]: %" FTG_SPEC_UINT64 " usec\n",
            sw->time_names[i], i, sw->times[i]);
    }

    printf("total ms: %" FTG_SPEC_UINT64 "\n", accum_ms);
}

#endif /* FTG_ENABLE_STOPWATCH */

/* test suite

   ftg_decl_suite() should be called somewhere in the declaring
   C file.
 */
#ifdef FTGT_TESTS_ENABLED

#include<string.h>

struct ftg_testvars_s {
    char *s1, *s2, *s3;
};

static struct ftg_testvars_s tv;

static int ftg__test_setup(void) {
    tv.s1 = (char*)FTG_MALLOC(sizeof(char*), FTG_STRLEN);
    tv.s2 = (char*)FTG_MALLOC(sizeof(char*), FTG_STRLEN);
    tv.s3 = (char*)FTG_MALLOC(sizeof(char*), FTG_STRLEN);

    strcpy(tv.s1, "catdoghamster");
    strcpy(tv.s2, "CATDOGhamster");
    strcpy(tv.s3, "fooballs");

    return (tv.s1&&tv.s2&&tv.s3)?0:1;
}

static int ftg__test_teardown(void) {
    FTG_FREE(tv.s1);
    FTG_FREE(tv.s2);
    FTG_FREE(tv.s3);

    return 0;
}

static int ftg__test_stricmp(void)
{
    FTGT_ASSERT(ftg_stricmp(tv.s1,tv.s2)==0);
    FTGT_ASSERT(ftg_stricmp(tv.s1,tv.s2)==0);
    FTGT_ASSERT(ftg_stricmp(tv.s1,tv.s2)==0);
    FTGT_ASSERT(ftg_stricmp(tv.s1,tv.s3)!=0);
    FTGT_ASSERT(ftg_stricmp(tv.s1,tv.s1)==0);

    return ftgt_test_errorlevel();
}

static int ftg__test_stristr(void)
{
    FTGT_ASSERT(ftg_stristr(tv.s1, "dog") == tv.s1+3);
    FTGT_ASSERT(ftg_stristr(tv.s1, "DOG") == tv.s1+3);
    FTGT_ASSERT(ftg_stristr(tv.s1, tv.s1) == tv.s1);
    FTGT_ASSERT(ftg_stristr(tv.s1, "\0") == tv.s1+strlen(tv.s1));

    return ftgt_test_errorlevel();
}

static int ftg__test_strncpy(void)
{
    int trunc = 0;
    char buf[FTG_STRLEN];
    trunc = ftg_strncpy(buf, tv.s1, FTG_STRLEN);
    FTGT_ASSERT(strlen(buf)==strlen(tv.s1));
    FTGT_ASSERT(!trunc);

    trunc = ftg_strncpy(buf, tv.s1, 0);
    FTGT_ASSERT(ftgt_test_errorlevel());

    trunc = ftg_strncpy(buf, tv.s1, 7);
    FTGT_ASSERT(strcmp(buf, "catdog")==0);
    FTGT_ASSERT(trunc);

    return ftgt_test_errorlevel();
}

static int ftg__test_strcatall(void)
{
    char *str = ftg_strcatall(3, "one", "two", "three");
    FTGT_ASSERT(strcmp(str, "onetwothree")==0);
    FTG_FREE(str);

    str = ftg_strcatall(0);
    FTGT_ASSERT(str[0] == '\0');
    FTG_FREE(str);

    return ftgt_test_errorlevel();
}

static int ftg__test_va(void)
{
    char *buf = ftg_va("hello");
    FTGT_ASSERT(strcmp(buf, "hello")==0);

    buf = ftg_va("%d %d", 2, 3);
    FTGT_ASSERT(strcmp(buf, "2 3")==0);

    buf = ftg_va("%d", (int)1048576);
    FTGT_ASSERT(strcmp(buf, "1048576")==0);

    return ftgt_test_errorlevel();
}

static int ftg__test_correct_dirslash(void)
{
    char dir[255];

    strcpy(dir, "/dir/a");
    ftg_correct_dirslash(dir);
    FTGT_ASSERT(dir[0] == FTG_DIRSLASH);
    FTGT_ASSERT(dir[4] == FTG_DIRSLASH);

    strcpy(dir, "\\dir\\a");
    ftg_correct_dirslash(dir);
    FTGT_ASSERT(dir[0] == FTG_DIRSLASH);
    FTGT_ASSERT(dir[4] == FTG_DIRSLASH);

    return ftgt_test_errorlevel();
}

static int ftg__test_opendir(void)
{
#ifndef FTG_CORE_NO_STDIO
    ftg_dirhandle_t dir;
    char path_str[FTG_STRLEN_LONG];
    int dot_count = 0;

    ftg_opendir(&dir, ".", path_str, FTG_STRLEN_LONG);
    while (*path_str)
    {
        if (strcmp(path_str, ".")==0)
            dot_count++;

        if (strcmp(path_str, "..")==0)
            dot_count++;

        /* finished with path_str, get the next one */
        ftg_readdir(&dir, path_str, FTG_STRLEN_LONG);
    }
    ftg_closedir(&dir);

    FTGT_ASSERT(dot_count==2);
#endif
    return ftgt_test_errorlevel();
}

static int ftg__test_is_dir(void)
{
#ifndef FTG_CORE_NO_STDIO

#ifdef FTG_POSIX_LIKE
    FTGT_ASSERT(ftg_is_dir("/"));
#elif _WIN32
    FTGT_ASSERT(ftg_is_dir("c:\\"));
#endif

    FTGT_ASSERT(!ftg_is_dir("this does not exist"));

    FTGT_ASSERT(ftg_is_dirslash('/'));
    FTGT_ASSERT(ftg_is_dirslash('\\'));
    FTGT_ASSERT(!ftg_is_dirslash(' '));
#endif

    return ftgt_test_errorlevel();
}

static int ftg__test_get_filename_ext(void)
{
    char *ext;
    char str[1024];

    /* regular */
    ext = ftg_get_filename_ext("hello.txt");
    FTGT_ASSERT(strcmp(ext, "txt") == 0);

    /* multiple extensions */
    ext = ftg_get_filename_ext("hello.wat.txt");
    FTGT_ASSERT(strcmp(ext, "txt") == 0);

    /* dot in directory part of path */
    strcpy(str, "/some.ext/hello.txt");
    ftg_correct_dirslash(str);
    ext = ftg_get_filename_ext(str);
    FTGT_ASSERT(strcmp(ext, "txt") == 0);

    strcpy(str, "/some.ext/hello");
    ftg_correct_dirslash(str);
    ext = ftg_get_filename_ext(str);
    FTGT_ASSERT(ext[0] == '\0');

    strcpy(str, "/some.ext/");
    ftg_correct_dirslash(str);
    ext = ftg_get_filename_ext(str);
    FTGT_ASSERT(ext[0] == '\0');

    /* no extension */
    ext = ftg_get_filename_ext("hello");
    FTGT_ASSERT(ext[0] == '\0');

    /* empty */
    ext = ftg_get_filename_ext("");
    FTGT_ASSERT(ext[0] == '\0');

    return ftgt_test_errorlevel();
}

static int ftg__test_get_filename_from_path(void)
{
    int i;
    const char *tests[][2] =
    {
        {"bar.txt", "bar.txt"},
        {"foo/bar.txt", "bar.txt"},
        {"/a/b/", ""},
        {NULL, NULL}
    };

    for (i = 0; tests[i][0] != NULL; i++)
    {
        const char *q = tests[i][0];
        const char *a = tests[i][1];
        char q_buf[FTG_STRLEN];
        bool trunc;

        trunc = ftg_strncpy(q_buf, q, FTG_STRLEN);
        FTG_ASSERT(!trunc);
        ftg_correct_dirslash(q_buf);

        FTGT_ASSERT(strcmp(ftg_get_filename_from_path(q_buf), a)==0);
    }

    return ftgt_test_errorlevel();
}

static int ftg__test_file_rw(void)
{
#ifndef FTG_CORE_NO_STDIO
    const char tmp_file[] = "ftg_core_tmp_file.txt";
    const char test_str[] = "hello\nworld!";
    unsigned char *read_str;
    ftg_off_t read_len;
    bool result;

    result = ftg_file_write(tmp_file, (uint8_t*)test_str, strlen(test_str)+1);
    FTGT_ASSERT(result);

    read_str = ftg_file_read(tmp_file, true, &read_len);
    FTGT_ASSERT(memcmp(read_str, test_str, strlen(test_str)+1)==0);

    FTG_FREE(read_str);
    // todo: rm temp file
#endif

    return ftgt_test_errorlevel();
}

static int ftg__test_ia(void)
{
    struct ftg_index_array_s ia = FTG_IA_INIT_ZERO;
    size_t i;
    FTGT_ASSERT(!ftg_ia_is_init(&ia));

    for (i = 0; i < FTG_IA_INITIAL_RECORD_COUNT * 2; ++i)
    {
        bool success = ftg_ia_append(&ia, i*2);
        FTGT_ASSERT(success);
    }

    FTGT_ASSERT(ia.records > FTG_IA_INITIAL_RECORD_COUNT);

    for (i = 0; i < ia.count; i++)
    {
        FTGT_ASSERT(ia.indices[i] == i*2);
    }

    ftg_ia_free(&ia);

    return ftgt_test_errorlevel();
}

static int ftg__test_dircreate(void)
{
#ifndef FTG_CORE_NO_STDIO
    bool success;
    if (ftg_is_dir("testdir"))
    {
        printf("removing testdir which shouldn't exist");
        success = ftg_rmdir("testdir");
        FTG_ASSERT(success);
    }

    success = ftg_mkdir("testdir");
    FTGT_ASSERT(success);
    FTGT_ASSERT(ftg_is_dir("testdir"));

    // this assumes FTG_DIRECTORY_MODE allows for the deletion
    // of the created directory.
    success = ftg_rmdir("testdir");
    FTGT_ASSERT(success);
    FTGT_ASSERT(!ftg_is_dir("testdir"));

    ftg_mkalldirs("one/two/three");
    FTGT_ASSERT(ftg_is_dir("one/two/three"));
    ftg_rmalldirs("one");
    FTGT_ASSERT(!ftg_is_dir("one"));
#endif

    return ftgt_test_errorlevel();
}

static int ftg__test_push_path(void)
{
    char buffer[64];
    bool trunc;
    int i;

    // [0] + [1] must equal [2] to pass the test
    const char * tests[][3] =
    {
        { "/a",     "b",    "/a/b"  },
        { "/a",     "/b",   "/a/b"  },
        { "/a",     "b/",   "/a/b"  },
        { "/a",     "/b/",  "/a/b"  },
        { "/a/",    "b",    "/a/b"  },
        { "/a/",    "/b",   "/a/b"  },
        { "/a/",    "b/",   "/a/b"  },
        { "/a/",    "/b/",  "/a/b"  },

        { "a",      "b",    "a/b"   },
        { "a",      "/b",   "a/b"   },
        { "a",      "b/",   "a/b"   },
        { "a",      "/b/",  "a/b"   },
        { "a/",     "b",    "a/b"   },
        { "a/",     "/b",   "a/b"   },
        { "a/",     "b/",   "a/b"   },
        { "a/",     "/b/",  "a/b"   },

        { "",      "b",     "b"     },
        { "",      "/b",    "/b"    },
        { "",      "b/",    "b"     },
        { "",      "/b/",   "/b"    },
        { "/",     "b",     "/b"    },
        { "/",     "/b",    "/b"    },
        { "/",     "b/",    "/b"    },
        { "/",     "/b/",   "/b"    },

        { "a",      "",     "a"     },
        { "a/",     "",     "a"     },
        { "/a",     "",     "/a"    },
        { "/a/",    "",     "/a"    },
        { "a",      "/",    "a"     },
        { "a/",     "/",    "a"     },
        { "/a",     "/",    "/a"    },
        { "/a/",    "/",    "/a"    },

        { "",       "",     ""      },
        { "/",      "",     "/"     },
        { "",       "/",    "/"     },
        { "/",      "/",    "/"     },

        { "//a",    "",     "/a"    },
        { "a//",    "",     "a"     },
        { "",       "//b",  "/b"    },
        { "",       "b//",  "b"     },
        { "//a//",  "//b//","/a/b"  },

        { NULL, NULL, NULL }
    };

    for(i = 0; tests[i][0] != NULL; i++)
    {
        const char *a = tests[i][0];
        const char *b = tests[i][1];
        const char *c = tests[i][2];
        char c_buf[64];

        trunc = ftg_strncpy(buffer, a, 8);
        FTG_ASSERT(!trunc);
        ftg_push_path(buffer, b, 8);
        ftg_correct_dirslash(buffer);

        trunc = ftg_strncpy(c_buf, c, 64);
        FTG_ASSERT(!trunc);
        ftg_correct_dirslash(c_buf);

        FTGT_ASSERT(strcmp(buffer, c_buf) == 0);
    }

    // test truncation cases
    trunc = ftg_strncpy(buffer, "aaaaaaa", 8);
    FTG_ASSERT(!trunc);
    trunc = ftg_push_path(buffer, "a", 8);
    FTGT_ASSERT(trunc);
    FTGT_ASSERT(strcmp(buffer, "aaaaaaa") == 0);

    trunc = ftg_strncpy(buffer, "aaaaaa", 8);
    FTG_ASSERT(!trunc);
    trunc = ftg_push_path(buffer, "a", 8);
    ftg_correct_dirslash(buffer);
    FTGT_ASSERT(trunc);
    FTGT_ASSERT(strcmp(buffer, ftg_va("aaaaaa%c", FTG_DIRSLASH))==0);

    trunc = ftg_strncpy(buffer, "aaaaaa/", 8);
    FTG_ASSERT(!trunc);
    trunc = ftg_push_path(buffer, "a", 8);
    ftg_correct_dirslash(buffer);
    FTGT_ASSERT(trunc);
    FTGT_ASSERT(strcmp(buffer, ftg_va("aaaaaa%c", FTG_DIRSLASH))==0);

    trunc = ftg_strncpy(buffer, "a/", 8);
    FTG_ASSERT(!trunc);
    trunc = ftg_push_path(buffer, "aaaaaa", 8);
    ftg_correct_dirslash(buffer);
    FTGT_ASSERT(trunc);
    FTGT_ASSERT(strcmp(buffer, ftg_va("a%caaaaa", FTG_DIRSLASH))==0);

    return ftgt_test_errorlevel();
}


static int ftg__test_pop_path(void)
{
    const char * paths[][2] =
    {
        { "/dir/file.ext",      "/dir" },
        { "/dir/file",          "/dir" },
        { "/dir/",              "/" },
        { "/dir",               "/" },
        { "/",                  "/" },
        { "dir",                "" },
        { "",                   "" },
        { NULL, NULL }
    };

    int i;
    for (i = 0; paths[i][0] != NULL; i++)
    {
        const char *a = paths[i][0];
        const char *b = paths[i][1];
        char path[FTG_STRLEN];
        bool trunc;

        trunc = ftg_strncpy(path, a, FTG_STRLEN);
        FTG_ASSERT(!trunc);
        ftg_pop_path(path);
        FTGT_ASSERT(strcmp(path, b) == 0);
    }

    return ftgt_test_errorlevel();
}

static int ftg__test_strsplit(void)
{
    const char *p;
    size_t i;
    size_t len;

    const char PATH[] = "ab:cd:ef";
    const char WILL_REACH_END[] = "abc";
    const char EMPTY[] = "";

    FTGT_ASSERT(ftg_strsplit(PATH, ':', 0, &len) == &PATH[0] && len == 2);
    FTGT_ASSERT(ftg_strsplit(PATH, ':', 1, &len) == &PATH[3] && len == 2);
    FTGT_ASSERT(ftg_strsplit(PATH, ':', 2, &len) == &PATH[6] && len == 2);
    FTGT_ASSERT(ftg_strsplit(PATH, ':', 3, &len) == NULL && len == 0);


    FTGT_ASSERT(ftg_strsplit(WILL_REACH_END, ':', 1, &len) == NULL && len == 0);

    FTGT_ASSERT(ftg_strsplit(EMPTY, ':', 0, &len) == &EMPTY[0] && len == 0);
    FTGT_ASSERT(ftg_strsplit(EMPTY, ':', 1, &len) == NULL && len == 0);

    // iteration usage example
    for (p = PATH, i = 0; (p = ftg_strsplit(PATH, ':', i, &len)) != NULL; i++) {

        switch(i) {
        case 0:
            FTGT_ASSERT(p == &PATH[0] && len == 2);
            break;

        case 1:
            FTGT_ASSERT(p == &PATH[3] && len == 2);
            break;

        case 2:
            FTGT_ASSERT(p == &PATH[6] && len == 2);
            break;

        default:
            FTGT_ASSERT(0);
        }

    }

    return ftgt_test_errorlevel();
}

FTGDEF
void ftg_decl_suite(void)
{
    ftgt_suite_s *suite = ftgt_create_suite(NULL, "ftg_core", ftg__test_setup, ftg__test_teardown);
    FTGT_ADD_TEST(suite, ftg__test_stricmp);
    FTGT_ADD_TEST(suite, ftg__test_stristr);
    FTGT_ADD_TEST(suite, ftg__test_strncpy);
    FTGT_ADD_TEST(suite, ftg__test_strcatall);
    FTGT_ADD_TEST(suite, ftg__test_va);
    FTGT_ADD_TEST(suite, ftg__test_correct_dirslash);
    FTGT_ADD_TEST(suite, ftg__test_opendir);
    FTGT_ADD_TEST(suite, ftg__test_is_dir);
    FTGT_ADD_TEST(suite, ftg__test_get_filename_ext);
    FTGT_ADD_TEST(suite, ftg__test_get_filename_from_path);
    FTGT_ADD_TEST(suite, ftg__test_file_rw);
    FTGT_ADD_TEST(suite, ftg__test_ia);
    FTGT_ADD_TEST(suite, ftg__test_dircreate);
    FTGT_ADD_TEST(suite, ftg__test_push_path);
    FTGT_ADD_TEST(suite, ftg__test_pop_path);
    FTGT_ADD_TEST(suite, ftg__test_strsplit);
}


#ifdef FTG_JUST_TEST
int main(void)
{
    ftg_decl_suite();
    return ftgt_run_all_tests(NULL);
}
#endif /* FTG_JUST_TEST */
#endif /* FTGT_TESTS_ENABLED */
#endif /* FTG_IMPLEMENT_CORE */
#endif /* eof */
