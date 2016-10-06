/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
#ifdef LWJGL_WINDOWS
	__pragma(warning(disable : 4710 4711))
	#include "common_tools.h"
	DISABLE_WARNINGS()
	#include "../minhook/include/MinHook.h"
	ENABLE_WARNINGS()
#else
	#ifdef LWJGL_LINUX
		#define _GNU_SOURCE
	#endif
	#include <dlfcn.h>
	#include "common_tools.h"
	#include <string.h>

	#ifdef LWJGL_LINUX
		#include "../elf-hook/elf_hook.h"
	#endif
	#ifdef LWJGL_MACOSX
		#include "../mach-o-hook/mach_hook.h"
	#endif
#endif

static jclass CriticalNatives;
static jmethodID getFunctionAddress;

static void init(JNIEnv *env, jclass clazz, jobject method) {
	CriticalNatives = clazz;
	getFunctionAddress = (*env)->FromReflectedMethod(env, method);
}

static void* criticalLookup(const char *name) {
	if (
	#if defined(LWJGL_WINDOWS) && !defined(_WIN64)
		strncmp("_JavaCritical_org_lwjgl_", name, strlen("_JavaCritical_org_lwjgl_")) != 0
	#else
		strncmp("JavaCritical_org_lwjgl_", name, strlen("JavaCritical_org_lwjgl_")) != 0
	#endif
	)
		return NULL;

	JNIEnv* env = getThreadEnv();
	return (void *)(intptr_t)(*env)->CallStaticLongMethod(env,
        CriticalNatives,
        getFunctionAddress,
        (*env)->NewStringUTF(env, name)
    );
}

// -------------------------------------

#ifdef LWJGL_WINDOWS
	typedef FARPROC (WINAPI *GetProcAddressPROC)(HMODULE, LPCSTR);
	static GetProcAddressPROC SystemGetProcAddress = NULL;

	static FARPROC WINAPI LWJGLGetProcAddress(HMODULE hModule, LPCSTR lpProcName) {
		FARPROC functionAddress;
		if ( ((uintptr_t)lpProcName & 0xFFFF0000) != 0 ) {
			functionAddress = (FARPROC)(uintptr_t)criticalLookup((const char *)lpProcName);
			if ( functionAddress != NULL )
				return functionAddress;
		}

		functionAddress = SystemGetProcAddress(hModule, lpProcName);
		/*
		if ( functionAddress && ((uintptr_t)lpProcName & 0xFFFF0000) != 0 &&
        //#if defined(LWJGL_WINDOWS) && !defined(_WIN64)
            //strncmp("_JavaCritical_org_lwjgl_", lpProcName, strlen("_JavaCritical_org_lwjgl_")) == 0
        //#else
            strncmp("JavaCritical_org_lwjgl_", lpProcName, strlen("JavaCritical_org_lwjgl_")) == 0
        //#endif
        ) {
			fprintf(stderr, "GetProcAddress(%p, %s) = %p\n", (void *)(uintptr_t)hModule, lpProcName, (void *)(uintptr_t)functionAddress);
			fflush(stderr);
		}
		//*/
		return functionAddress;
	}

	static MH_STATUS minHookStatus = MH_UNKNOWN;

	EXTERN_C_ENTER

	JNIEXPORT void JNICALL Java_org_lwjgl_system_CriticalNatives_nenable(JNIEnv *env, jclass clazz, jobject method)
	{
		init(env, clazz, method);

		MH_STATUS status = MH_Initialize();
		if ( status != MH_OK ) {
			fprintf(stderr, "[LWJGL] MH_Initialize failed: %s\n", MH_StatusToString(status));
			fflush(stderr);
			return;
		}

		status = MH_CreateHook(
			(LPVOID)(uintptr_t)&GetProcAddress,
			(LPVOID)(uintptr_t)&LWJGLGetProcAddress,
			(LPVOID*)(uintptr_t)&SystemGetProcAddress
		);
		if ( status != MH_OK ) {
			fprintf(stderr, "[LWJGL] MH_CreateHook failed: %s\n", MH_StatusToString(status));
			fflush(stderr);
			MH_Uninitialize();
			return;
		}

		status = MH_EnableHook((LPVOID)(uintptr_t)&GetProcAddress);
		if ( status != MH_OK ) {
			fprintf(stderr, "[LWJGL] MH_EnableHook failed: %s\n", MH_StatusToString(status));
	        fflush(stderr);
	        MH_Uninitialize();
			return;
		}

		minHookStatus = MH_OK;
	}

	JNIEXPORT void JNICALL Java_org_lwjgl_system_CriticalNatives_disable(JNIEnv *env, jclass clazz)
	{
		UNUSED_PARAMS(env, clazz)

		if ( minHookStatus == MH_OK ) {
			MH_RemoveHook((LPVOID)(uintptr_t)GetProcAddress);
			MH_Uninitialize();
			minHookStatus = MH_UNKNOWN;
		}
	}

	EXTERN_C_EXIT
#else
	static void *dlsymLWJGL(void *handle, const char* name) {
		void *functionAddress = criticalLookup(name);
		if ( functionAddress != NULL )
			return functionAddress;

		functionAddress = dlsym(handle, name);
		/*
		if ( functionAddress && strncmp("JavaCritical_org_lwjgl_", name, strlen("JavaCritical_org_lwjgl_")) == 0 ) {
			fprintf(stderr, "dlsym(%p, %s) = %p\n", handle, name, (void *)(uintptr_t)functionAddress);
			fflush(stderr);
		}
		//*/
		return functionAddress;
	}

	#ifdef LWJGL_LINUX
		/*
		// This requires the JVM to be launched with LD_PRELOAD=liblwjgl.so
		typedef void *(*dlsymPROC)(void *, const char *);

		static dlsymPROC dlsymSystem = NULL;

		EXTERN_C_ENTER
		void *dlsym(void *handle, const char* name) {
			if ( dlsymSystem == NULL ) {
				void *dl = dlopen("dl", RTLD_LAZY | RTLD_GLOBAL);
				dlsymSystem = (dlsymPROC)(uintptr_t)dlvsym(dl, "dlsym", "GLIBC_2.2.5");
			}

			void *functionAddress;
		    if ( CriticalNatives && criticalLookup(name, &functionAddress) == JNI_TRUE )
		        return functionAddress;

			return dlsymSystem(handle, name);
		}
		EXTERN_C_EXIT
		*/

		static void *dlsymSystem = 0;

		static void *hook(JNIEnv *env, void *function) {
			Dl_info info;
			if ( !dladdr((void const *)(uintptr_t)(*env)->GetJavaVM, &info) ) {
		        fprintf(stderr, "[LWJGL][ELF-hook] dladdr failed.\n");
		        fflush(stderr);
		        return NULL;
		    }

			void *original = elf_hook(info.dli_fname, info.dli_fbase, "dlsym", function);
            if ( !original ) {
                fprintf(stderr, "[LWJGL] elf_hook failed.\n");
                fflush(stderr);
                return NULL;
            }
            return original;
		}

		EXTERN_C_ENTER

		JNIEXPORT void JNICALL Java_org_lwjgl_system_CriticalNatives_nenable(JNIEnv *env, jclass clazz, jobject method)
		{
			init(env, clazz, method);
			dlsymSystem = hook(env, (void *)(uintptr_t)dlsymLWJGL);
		}

		JNIEXPORT void JNICALL Java_org_lwjgl_system_CriticalNatives_disable(JNIEnv *env, jclass clazz)
		{
			UNUSED_PARAMS(env, clazz)
			if ( dlsymSystem ) {
				hook(env, dlsymSystem);
				dlsymSystem = NULL;
			}
		}

		EXTERN_C_EXIT
	#endif
	#ifdef LWJGL_MACOSX
		/*
		// This requires the JVM to be launched with DYLD_INSERT_LIBRARIES=liblwjgl.dylib
		#define DYLD_INTERPOSE(_replacement,_replacee) \
		   __attribute__((used)) static struct{ const void* replacement; const void* replacee; } _interpose_##_replacee \
		            __attribute__ ((section ("__DATA,__interpose"))) = { (const void*)(unsigned long)&_replacement, (const void*)(unsigned long)&_replacee };

		static void *dlsymLWJGL(void* handle, const char* name) {
			void *functionAddress;
			if ( CriticalNatives && criticalLookup(name, &functionAddress) == JNI_TRUE )
				return functionAddress;

			return dlsym(handle, name);
		}
		DYLD_INTERPOSE(dlsymLWJGL, dlsym)
		*/

		static void *handle = NULL;
		static mach_substitution dlsymSystem = 0;

		EXTERN_C_ENTER

		JNIEXPORT void JNICALL Java_org_lwjgl_system_CriticalNatives_nenable(JNIEnv *env, jclass clazz, jobject method)
		{
			init(env, clazz, method);

			Dl_info info;
			if ( !dladdr((void const *)(*env)->GetJavaVM, &info) )
		    {
		        fprintf(stderr, "[LWJGL][Mach-O-Hook] dladdr failed.\n");
		        fflush(stderr);
		        return;
		    }

		    handle = mach_hook_init(info.dli_fname, info.dli_fbase);
		    if ( !handle ) {
		        fprintf(stderr, "[LWJGL] mach_hook_init failed.\n");
		        fflush(stderr);
		        return;
		    }

		    dlsymSystem = mach_hook(handle, "dlsym", (mach_substitution)(uintptr_t)dlsymLWJGL);
		    if ( !dlsymSystem ) {
		        fprintf(stderr, "[LWJGL] mach_hook failed.\n");
		        fflush(stderr);
				mach_hook_free(handle);
		    }
		}

		JNIEXPORT void JNICALL Java_org_lwjgl_system_CriticalNatives_disable(JNIEnv *env, jclass clazz)
		{
			UNUSED_PARAMS(env, clazz)

			if ( handle != NULL ) {
				if ( dlsymSystem ) {
					mach_hook(handle, "dlsym", dlsymSystem);
					dlsymSystem = 0;
				}

				mach_hook_free(handle);
		        handle = NULL;
		    }
		}

		EXTERN_C_EXIT
	#endif
#endif
