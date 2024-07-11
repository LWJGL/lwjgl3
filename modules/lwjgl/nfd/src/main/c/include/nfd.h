/*
  Native File Dialog Extended
  Repository: https://github.com/btzy/nativefiledialog-extended
  License: Zlib
  Authors: Bernard Teo, Michael Labbe

  This header contains the functions that can be called by user code.
 */

#ifndef _NFD_H
#define _NFD_H

#if defined(_WIN32)
#if defined(NFD_EXPORT)
#define NFD_API __declspec(dllexport)
#elif defined(NFD_SHARED)
#define NFD_API __declspec(dllimport)
#endif
#else
#if defined(NFD_EXPORT) || defined(NFD_SHARED)
#if defined(__GNUC__) || defined(__clang__)
#define NFD_API __attribute__((visibility("default")))
#endif
#endif
#endif
#ifndef NFD_API
#define NFD_API
#endif

#ifdef __cplusplus
extern "C" {
#define NFD_INLINE inline
#else
#define NFD_INLINE static inline
#endif  // __cplusplus

#include <stddef.h>

typedef char nfdu8char_t;

#ifdef _WIN32
/** @typedef UTF-16 character */
typedef wchar_t nfdnchar_t;
#else
/** @typedef UTF-8 character */
typedef nfdu8char_t nfdnchar_t;
#endif  // _WIN32

/** @typedef Opaque data structure -- see NFD_PathSet_* */
typedef void nfdpathset_t;
#ifndef NFD_PORTAL
typedef struct {
    void* ptr;
} nfdpathsetenum_t;
#else
typedef struct {
    void* d1;
    void* d2;
    unsigned int d3;
    int d4;
    int d5;
    int d6;
    int d7;
    int d8;
    int d9;
    int d10;
    int d11;
    int p1;
    void* p2;
    void* p3;
} nfdpathsetenum_t;
#endif

typedef unsigned int nfdfiltersize_t;

typedef enum {
    NFD_ERROR, /**< Programmatic error */
    NFD_OKAY,  /**< User pressed okay, or successful return */
    NFD_CANCEL /**< User pressed cancel */
} nfdresult_t;

/** @typedef UTF-8 Filter Item */
typedef struct {
    const nfdu8char_t* name;
    const nfdu8char_t* spec;
} nfdu8filteritem_t;

#ifdef _WIN32
/** @typedef UTF-16 Filter Item */
typedef struct {
    const nfdnchar_t* name;
    const nfdnchar_t* spec;
} nfdnfilteritem_t;
#else
/** @typedef UTF-8 Filter Item */
typedef nfdu8filteritem_t nfdnfilteritem_t;
#endif  // _WIN32

// The native window handle type.
enum {
    NFD_WINDOW_HANDLE_TYPE_UNSET = 0,
    // Windows: handle is HWND (the Windows API typedefs this to void*)
    NFD_WINDOW_HANDLE_TYPE_WINDOWS = 1,
    // Cocoa: handle is NSWindow*
    NFD_WINDOW_HANDLE_TYPE_COCOA = 2,
    // X11: handle is Window
    NFD_WINDOW_HANDLE_TYPE_X11 = 3,
    // Wayland support will be implemented separately in the future
};
// The native window handle.  If using a platform abstraction framework (e.g. SDL2), this should be
// obtained using the corresponding NFD glue header (e.g. nfd_sdl2.h).
typedef struct {
    size_t type;  // this is one of the values of the enum above
    void* handle;
} nfdwindowhandle_t;

typedef size_t nfdversion_t;

typedef struct {
    const nfdu8filteritem_t* filterList;
    nfdfiltersize_t filterCount;
    const nfdu8char_t* defaultPath;
    nfdwindowhandle_t parentWindow;
} nfdopendialogu8args_t;

#ifdef _WIN32
typedef struct {
    const nfdnfilteritem_t* filterList;
    nfdfiltersize_t filterCount;
    const nfdnchar_t* defaultPath;
    nfdwindowhandle_t parentWindow;
} nfdopendialognargs_t;
#else
typedef nfdopendialogu8args_t nfdopendialognargs_t;
#endif  // _WIN32

typedef struct {
    const nfdu8filteritem_t* filterList;
    nfdfiltersize_t filterCount;
    const nfdu8char_t* defaultPath;
    const nfdu8char_t* defaultName;
    nfdwindowhandle_t parentWindow;
} nfdsavedialogu8args_t;

#ifdef _WIN32
typedef struct {
    const nfdnfilteritem_t* filterList;
    nfdfiltersize_t filterCount;
    const nfdnchar_t* defaultPath;
    const nfdnchar_t* defaultName;
    nfdwindowhandle_t parentWindow;
} nfdsavedialognargs_t;
#else
typedef nfdsavedialogu8args_t nfdsavedialognargs_t;
#endif  // _WIN32

typedef struct {
    const nfdu8char_t* defaultPath;
    nfdwindowhandle_t parentWindow;
} nfdpickfolderu8args_t;

#ifdef _WIN32
typedef struct {
    const nfdnchar_t* defaultPath;
    nfdwindowhandle_t parentWindow;
} nfdpickfoldernargs_t;
#else
typedef nfdpickfolderu8args_t nfdpickfoldernargs_t;
#endif  // _WIN32

// This is a unique identifier tagged to all the NFD_*With() function calls, for backward
// compatibility purposes.  There is usually no need to use this directly, unless you want to use
// NFD differently depending on the version you're building with.
#define NFD_INTERFACE_VERSION 1

/** Free a file path that was returned by the dialogs.
 *
 *  Note: use NFD_PathSet_FreePathN() to free path from pathset instead of this function. */
NFD_API void NFD_FreePathN(nfdnchar_t* filePath);

/** Free a file path that was returned by the dialogs.
 *
 *  Note: use NFD_PathSet_FreePathU8() to free path from pathset instead of this function. */
NFD_API void NFD_FreePathU8(nfdu8char_t* filePath);

/** Initialize NFD. Call this for every thread that might use NFD, before calling any other NFD
 *  functions on that thread. */
NFD_API nfdresult_t NFD_Init(void);

/** Call this to de-initialize NFD, if NFD_Init returned NFD_OKAY. */
NFD_API void NFD_Quit(void);

/** Single file open dialog
 *
 *  It's the caller's responsibility to free `outPath` via NFD_FreePathN() if this function returns
 *  NFD_OKAY.
 *  @param[out] outPath
 *  @param filterCount If zero, filterList is ignored (you can use null).
 *  @param defaultPath If null, the operating system will decide. */
NFD_API nfdresult_t NFD_OpenDialogN(nfdnchar_t** outPath,
                                    const nfdnfilteritem_t* filterList,
                                    nfdfiltersize_t filterCount,
                                    const nfdnchar_t* defaultPath);

/** Single file open dialog
 *
 *  It is the caller's responsibility to free `outPath` via NFD_FreePathU8() if this function
 *  returns NFD_OKAY.
 *  @param[out] outPath
 *  @param filterCount If zero, filterList is ignored (you can use null).
 *  @param defaultPath If null, the operating system will decide. */
NFD_API nfdresult_t NFD_OpenDialogU8(nfdu8char_t** outPath,
                                     const nfdu8filteritem_t* filterList,
                                     nfdfiltersize_t filterCount,
                                     const nfdu8char_t* defaultPath);

/** This function is a library implementation detail.  Please use NFD_OpenDialogN_With() instead. */
NFD_API nfdresult_t NFD_OpenDialogN_With_Impl(nfdversion_t version,
                                              nfdnchar_t** outPath,
                                              const nfdopendialognargs_t* args);

/** Single file open dialog, with additional parameters.
 *
 *  It is the caller's responsibility to free `outPath` via NFD_FreePathN() if this function
 *  returns NFD_OKAY.  See documentation of nfdopendialognargs_t for details. */
NFD_INLINE nfdresult_t NFD_OpenDialogN_With(nfdnchar_t** outPath,
                                            const nfdopendialognargs_t* args) {
    return NFD_OpenDialogN_With_Impl(NFD_INTERFACE_VERSION, outPath, args);
}

/** This function is a library implementation detail.  Please use NFD_OpenDialogU8_With() instead.
 */
NFD_API nfdresult_t NFD_OpenDialogU8_With_Impl(nfdversion_t version,
                                               nfdu8char_t** outPath,
                                               const nfdopendialogu8args_t* args);

/** Single file open dialog, with additional parameters.
 *
 *  It is the caller's responsibility to free `outPath` via NFD_FreePathU8() if this function
 *  returns NFD_OKAY.  See documentation of nfdopendialogu8args_t for details. */
NFD_INLINE nfdresult_t NFD_OpenDialogU8_With(nfdu8char_t** outPath,
                                             const nfdopendialogu8args_t* args) {
    return NFD_OpenDialogU8_With_Impl(NFD_INTERFACE_VERSION, outPath, args);
}

/** Multiple file open dialog
 *
 *  It is the caller's responsibility to free `outPaths` via NFD_PathSet_FreeN() if this function
 *  returns NFD_OKAY.
 *  @param[out] outPaths
 *  @param filterCount If zero, filterList is ignored (you can use null).
 *  @param defaultPath If null, the operating system will decide. */
NFD_API nfdresult_t NFD_OpenDialogMultipleN(const nfdpathset_t** outPaths,
                                            const nfdnfilteritem_t* filterList,
                                            nfdfiltersize_t filterCount,
                                            const nfdnchar_t* defaultPath);

/** Multiple file open dialog
 *
 *  It is the caller's responsibility to free `outPaths` via NFD_PathSet_FreeU8() if this function
 *  returns NFD_OKAY.
 *  @param[out] outPaths
 *  @param filterCount If zero, filterList is ignored (you can use null).
 *  @param defaultPath If null, the operating system will decide. */
NFD_API nfdresult_t NFD_OpenDialogMultipleU8(const nfdpathset_t** outPaths,
                                             const nfdu8filteritem_t* filterList,
                                             nfdfiltersize_t filterCount,
                                             const nfdu8char_t* defaultPath);

/** This function is a library implementation detail.  Please use NFD_OpenDialogMultipleN_With()
 * instead. */
NFD_API nfdresult_t NFD_OpenDialogMultipleN_With_Impl(nfdversion_t version,
                                                      const nfdpathset_t** outPaths,
                                                      const nfdopendialognargs_t* args);

/** Multiple file open dialog, with additional parameters.
 *
 *  It is the caller's responsibility to free `outPaths` via NFD_PathSet_FreeN() if this function
 *  returns NFD_OKAY.  See documentation of nfdopendialognargs_t for details. */
NFD_INLINE nfdresult_t NFD_OpenDialogMultipleN_With(const nfdpathset_t** outPaths,
                                                    const nfdopendialognargs_t* args) {
    return NFD_OpenDialogMultipleN_With_Impl(NFD_INTERFACE_VERSION, outPaths, args);
}

/** This function is a library implementation detail.  Please use NFD_OpenDialogU8_With() instead.
 */
NFD_API nfdresult_t NFD_OpenDialogMultipleU8_With_Impl(nfdversion_t version,
                                                       const nfdpathset_t** outPaths,
                                                       const nfdopendialogu8args_t* args);

/** Multiple file open dialog, with additional parameters.
 *
 *  It is the caller's responsibility to free `outPaths` via NFD_PathSet_FreeU8() if this function
 *  returns NFD_OKAY.  See documentation of nfdopendialogu8args_t for details. */
NFD_INLINE nfdresult_t NFD_OpenDialogMultipleU8_With(const nfdpathset_t** outPaths,
                                                     const nfdopendialogu8args_t* args) {
    return NFD_OpenDialogMultipleU8_With_Impl(NFD_INTERFACE_VERSION, outPaths, args);
}

/** Save dialog
 *
 *  It is the caller's responsibility to free `outPath` via NFD_FreePathN() if this function returns
 *  NFD_OKAY.
 *  @param[out] outPath
 *  @param filterCount If zero, filterList is ignored (you can use null).
 *  @param defaultPath If null, the operating system will decide. */
NFD_API nfdresult_t NFD_SaveDialogN(nfdnchar_t** outPath,
                                    const nfdnfilteritem_t* filterList,
                                    nfdfiltersize_t filterCount,
                                    const nfdnchar_t* defaultPath,
                                    const nfdnchar_t* defaultName);

/** Save dialog
 *
 *  It is the caller's responsibility to free `outPath` via NFD_FreePathU8() if this function
 *  returns NFD_OKAY.
 *  @param[out] outPath
 *  @param filterCount If zero, filterList is ignored (you can use null).
 *  @param defaultPath If null, the operating system will decide. */
NFD_API nfdresult_t NFD_SaveDialogU8(nfdu8char_t** outPath,
                                     const nfdu8filteritem_t* filterList,
                                     nfdfiltersize_t filterCount,
                                     const nfdu8char_t* defaultPath,
                                     const nfdu8char_t* defaultName);

/** This function is a library implementation detail.  Please use NFD_SaveDialogN_With() instead. */
NFD_API nfdresult_t NFD_SaveDialogN_With_Impl(nfdversion_t version,
                                              nfdnchar_t** outPath,
                                              const nfdsavedialognargs_t* args);

/** Single file save dialog, with additional parameters.
 *
 *  It is the caller's responsibility to free `outPath` via NFD_FreePathN() if this function
 *  returns NFD_OKAY.  See documentation of nfdsavedialognargs_t for details. */
NFD_INLINE nfdresult_t NFD_SaveDialogN_With(nfdnchar_t** outPath,
                                            const nfdsavedialognargs_t* args) {
    return NFD_SaveDialogN_With_Impl(NFD_INTERFACE_VERSION, outPath, args);
}

/** This function is a library implementation detail.  Please use NFD_SaveDialogU8_With() instead.
 */
NFD_API nfdresult_t NFD_SaveDialogU8_With_Impl(nfdversion_t version,
                                               nfdu8char_t** outPath,
                                               const nfdsavedialogu8args_t* args);

/** Single file save dialog, with additional parameters.
 *
 *  It is the caller's responsibility to free `outPath` via NFD_FreePathU8() if this function
 *  returns NFD_OKAY.  See documentation of nfdsavedialogu8args_t for details. */
NFD_INLINE nfdresult_t NFD_SaveDialogU8_With(nfdu8char_t** outPath,
                                             const nfdsavedialogu8args_t* args) {
    return NFD_SaveDialogU8_With_Impl(NFD_INTERFACE_VERSION, outPath, args);
}

/** Select single folder dialog
 *
 *  It is the caller's responsibility to free `outPath` via NFD_FreePathN() if this function returns
 *  NFD_OKAY.
 *  @param[out] outPath
 *  @param defaultPath If null, the operating system will decide. */
NFD_API nfdresult_t NFD_PickFolderN(nfdnchar_t** outPath, const nfdnchar_t* defaultPath);

/** Select single folder dialog
 *
 *  It is the caller's responsibility to free `outPath` via NFD_FreePathU8() if this function
 *  returns NFD_OKAY.
 *  @param[out] outPath
 *  @param defaultPath If null, the operating system will decide. */
NFD_API nfdresult_t NFD_PickFolderU8(nfdu8char_t** outPath, const nfdu8char_t* defaultPath);

/** This function is a library implementation detail.  Please use NFD_PickFolderN_With() instead. */
NFD_API nfdresult_t NFD_PickFolderN_With_Impl(nfdversion_t version,
                                              nfdnchar_t** outPath,
                                              const nfdpickfoldernargs_t* args);

/** Select single folder dialog, with additional parameters.
 *
 *  It is the caller's responsibility to free `outPath` via NFD_FreePathN() if this function
 *  returns NFD_OKAY.  See documentation of nfdpickfoldernargs_t for details. */
NFD_INLINE nfdresult_t NFD_PickFolderN_With(nfdnchar_t** outPath,
                                            const nfdpickfoldernargs_t* args) {
    return NFD_PickFolderN_With_Impl(NFD_INTERFACE_VERSION, outPath, args);
}

/** This function is a library implementation detail.  Please use NFD_PickFolderU8_With() instead.
 */
NFD_API nfdresult_t NFD_PickFolderU8_With_Impl(nfdversion_t version,
                                               nfdu8char_t** outPath,
                                               const nfdpickfolderu8args_t* args);

/** Select single folder dialog, with additional parameters.
 *
 *  It is the caller's responsibility to free `outPath` via NFD_FreePathU8() if this function
 *  returns NFD_OKAY.  See documentation of nfdpickfolderu8args_t for details. */
NFD_INLINE nfdresult_t NFD_PickFolderU8_With(nfdu8char_t** outPath,
                                             const nfdpickfolderu8args_t* args) {
    return NFD_PickFolderU8_With_Impl(NFD_INTERFACE_VERSION, outPath, args);
}

/** Select multiple folder dialog
 *
 *  It is the caller's responsibility to free `outPaths` via NFD_PathSet_FreeN() if this function
 *  returns NFD_OKAY.
 *  @param[out] outPaths
 *  @param defaultPath If null, the operating system will decide. */
NFD_API nfdresult_t NFD_PickFolderMultipleN(const nfdpathset_t** outPaths,
                                            const nfdnchar_t* defaultPath);

/** Select multiple folder dialog
 *
 *  It is the caller's responsibility to free `outPaths` via NFD_PathSet_FreeU8() if this function
 *  returns NFD_OKAY.
 *  @param[out] outPaths
 *  @param defaultPath If null, the operating system will decide. */
NFD_API nfdresult_t NFD_PickFolderMultipleU8(const nfdpathset_t** outPaths,
                                             const nfdu8char_t* defaultPath);

/** This function is a library implementation detail.  Please use NFD_PickFolderMultipleN_With()
 * instead. */
NFD_API nfdresult_t NFD_PickFolderMultipleN_With_Impl(nfdversion_t version,
                                                      const nfdpathset_t** outPaths,
                                                      const nfdpickfoldernargs_t* args);

/** Select multiple folder dialog, with additional parameters.
 *
 *  It is the caller's responsibility to free `outPaths` via NFD_PathSet_FreeN() if this function
 *  returns NFD_OKAY.  See documentation of nfdopendialogargs_t for details. */
NFD_INLINE nfdresult_t NFD_PickFolderMultipleN_With(const nfdpathset_t** outPaths,
                                                    const nfdpickfoldernargs_t* args) {
    return NFD_PickFolderMultipleN_With_Impl(NFD_INTERFACE_VERSION, outPaths, args);
}

/** This function is a library implementation detail.  Please use NFD_PickFolderMultipleU8_With()
 * instead.
 */
NFD_API nfdresult_t NFD_PickFolderMultipleU8_With_Impl(nfdversion_t version,
                                                       const nfdpathset_t** outPaths,
                                                       const nfdpickfolderu8args_t* args);

/** Select multiple folder dialog, with additional parameters.
 *
 *  It is the caller's responsibility to free `outPaths` via NFD_PathSet_FreeU8() if this function
 *  returns NFD_OKAY.  See documentation of nfdpickfolderargs_t for details. */
NFD_INLINE nfdresult_t NFD_PickFolderMultipleU8_With(const nfdpathset_t** outPaths,
                                                     const nfdpickfolderu8args_t* args) {
    return NFD_PickFolderMultipleU8_With_Impl(NFD_INTERFACE_VERSION, outPaths, args);
}

/** Get the last error
 *
 *  This is set when a function returns NFD_ERROR.
 *  The memory is owned by NFD and should not be freed by user code.
 *  This is *always* ASCII printable characters, so it can be interpreted as UTF-8 without any
 *  conversion.
 *  @return The last error that was set, or null if there is no error. */
NFD_API const char* NFD_GetError(void);

/** Clear the error. */
NFD_API void NFD_ClearError(void);

/* path set operations */
#ifdef _WIN32
typedef unsigned long nfdpathsetsize_t;
#elif __APPLE__
typedef unsigned long nfdpathsetsize_t;
#else
typedef unsigned int nfdpathsetsize_t;
#endif  // _WIN32, __APPLE__

/** Get the number of entries stored in pathSet.
 *
 *  Note: some paths might be invalid (NFD_ERROR will be returned by NFD_PathSet_GetPath),
 *  so we might not actually have this number of usable paths. */
NFD_API nfdresult_t NFD_PathSet_GetCount(const nfdpathset_t* pathSet, nfdpathsetsize_t* count);

/** Get the UTF-8 path at offset index.
 *
 *  It is the caller's responsibility to free `outPath` via NFD_PathSet_FreePathN() if this function
 *  returns NFD_OKAY. */
NFD_API nfdresult_t NFD_PathSet_GetPathN(const nfdpathset_t* pathSet,
                                         nfdpathsetsize_t index,
                                         nfdnchar_t** outPath);

/** Get the native path at offset index.
 *
 *  It is the caller's responsibility to free `outPath` via NFD_PathSet_FreePathU8() if this
 *  function returns NFD_OKAY. */
NFD_API nfdresult_t NFD_PathSet_GetPathU8(const nfdpathset_t* pathSet,
                                          nfdpathsetsize_t index,
                                          nfdu8char_t** outPath);

/** Free the path gotten by NFD_PathSet_GetPathN(). */
NFD_API void NFD_PathSet_FreePathN(nfdnchar_t* filePath);

/** Free the path gotten by NFD_PathSet_GetPathU8(). */
NFD_API void NFD_PathSet_FreePathU8(nfdu8char_t* filePath);

/** Gets an enumerator of the path set.
 *
 *  It is the caller's responsibility to free `enumerator` via NFD_PathSet_FreeEnum()
 *  if this function returns NFD_OKAY, and it should be freed before freeing the pathset. */
NFD_API nfdresult_t NFD_PathSet_GetEnum(const nfdpathset_t* pathSet,
                                        nfdpathsetenum_t* outEnumerator);

/** Frees an enumerator of the path set. */
NFD_API void NFD_PathSet_FreeEnum(nfdpathsetenum_t* enumerator);

/** Gets the next item from the path set enumerator.
 *
 *  If there are no more items, then *outPaths will be set to null.
 *  It is the caller's responsibility to free `*outPath` via NFD_PathSet_FreePathN()
 *  if this function returns NFD_OKAY and `*outPath` is not null. */
NFD_API nfdresult_t NFD_PathSet_EnumNextN(nfdpathsetenum_t* enumerator, nfdnchar_t** outPath);

/** Gets the next item from the path set enumerator.
 *
 *  If there are no more items, then *outPaths will be set to null.
 *  It is the caller's responsibility to free `*outPath` via NFD_PathSet_FreePathU8()
 *  if this function returns NFD_OKAY and `*outPath` is not null. */
NFD_API nfdresult_t NFD_PathSet_EnumNextU8(nfdpathsetenum_t* enumerator, nfdu8char_t** outPath);

/** Free the pathSet */
NFD_API void NFD_PathSet_Free(const nfdpathset_t* pathSet);

#ifdef _WIN32

/* say that the U8 versions of functions are not just __attribute__((alias(""))) to the native
 * versions */
#define NFD_DIFFERENT_NATIVE_FUNCTIONS

#endif  // _WIN32

#ifdef NFD_NATIVE
typedef nfdnchar_t nfdchar_t;
typedef nfdnfilteritem_t nfdfilteritem_t;
#define NFD_FreePath NFD_FreePathN
#define NFD_OpenDialog NFD_OpenDialogN
#define NFD_OpenDialog_With NFD_OpenDialogN_With
#define NFD_OpenDialogMultiple NFD_OpenDialogMultipleN
#define NFD_OpenDialogMultiple_With NFD_OpenDialogMultipleN_With
#define NFD_SaveDialog NFD_SaveDialogN
#define NFD_SaveDialog_With NFD_SaveDialogN_With
#define NFD_PickFolder NFD_PickFolderN
#define NFD_PickFolder_With NFD_PickFolderN_With
#define NFD_PickFolderMultiple NFD_PickFolderMultipleN
#define NFD_PickFolderMultiple_With NFD_PickFolderMultipleN_With
#define NFD_PathSet_GetPath NFD_PathSet_GetPathN
#define NFD_PathSet_FreePath NFD_PathSet_FreePathN
#define NFD_PathSet_EnumNext NFD_PathSet_EnumNextN
#else
typedef nfdu8char_t nfdchar_t;
typedef nfdu8filteritem_t nfdfilteritem_t;
#define NFD_FreePath NFD_FreePathU8
#define NFD_OpenDialog NFD_OpenDialogU8
#define NFD_OpenDialog_With NFD_OpenDialogU8_With
#define NFD_OpenDialogMultiple NFD_OpenDialogMultipleU8
#define NFD_OpenDialogMultiple_With NFD_OpenDialogMultipleU8_With
#define NFD_SaveDialog NFD_SaveDialogU8
#define NFD_SaveDialog_With NFD_SaveDialogU8_With
#define NFD_PickFolder NFD_PickFolderU8
#define NFD_PickFolder_With NFD_PickFolderU8_With
#define NFD_PickFolderMultiple NFD_PickFolderMultipleU8
#define NFD_PickFolderMultiple_With NFD_PickFolderMultipleU8_With
#define NFD_PathSet_GetPath NFD_PathSet_GetPathU8
#define NFD_PathSet_FreePath NFD_PathSet_FreePathU8
#define NFD_PathSet_EnumNext NFD_PathSet_EnumNextU8
#endif  // NFD_NATIVE

#undef NFD_INLINE
#ifdef __cplusplus
}
#endif  // __cplusplus

#endif  // _NFD_H
