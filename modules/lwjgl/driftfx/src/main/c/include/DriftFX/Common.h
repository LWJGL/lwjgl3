
#ifndef _DRIFTFX_COMMON_H_
#define _DRIFTFX_COMMON_H_

#if defined _WIN32

	#ifdef BUILDING_DLL
		#ifdef __GNUC__
			#define DRIFT_API __attribute__ ((dllexport))
		#else
			#define DRIFT_API __declspec(dllexport)
		#endif
	#else
		#ifdef __GNUC__
			#define DRIFT_API __attribute__ ((dllimport))
		#else
			#define DRIFT_API __declspec(dllimport)
		#endif
	#endif
	#define DLL_LOCAL
#else
	#if __GNUC__ >= 4
		#define DRIFT_API __attribute__ ((visibility ("default")))
		#define DLL_LOCAL  __attribute__ ((visibility ("hidden")))
	#else
		#define DRIFT_API
		#define DLL_LOCAL
	#endif
#endif

#endif