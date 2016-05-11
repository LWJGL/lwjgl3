/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.hwloc.templates

import org.lwjgl.generator.*
import org.lwjgl.hwloc.*

val hwloc_bitmap = "HWLocBitmap".nativeClass(HWLOC_PACKAGE, prefix = "HWLOC_", binding = HWLOC_BINDING_DELEGATE) {
	documentation =
		"""
		Native bindings to hwloc's bitmap API.

		The {@code hwloc_bitmap_t} type represents a set of objects, typically OS processors -- which may actually be hardware threads (represented by
		{@code hwloc_cpuset_t}, which is a typedef for {@code hwloc_bitmap_t}) -- or memory nodes (represented by {@code hwloc_nodeset_t}, which is also a
		typedef for {@code hwloc_bitmap_t}).

		<em>Both CPU and node sets are always indexed by OS physical number.</em>

		CPU sets and nodesets are described in {@code hwlocality_object_sets}.

		A bitmap may be of infinite size.

		Several examples of using the bitmap API are available under the doc/examples/ directory in the source tree. Regression tests such as
		tests/hwloc/hwloc_bitmap*.c also make intensive use of this API.
		"""

	/*
	hwloc_bitmap_t(
		"bitmap_alloc",
		""
	)

	hwloc_bitmap_t(
		"bitmap_alloc_full",
		""
	)

	void(
		"bitmap_free",
		"",

		hwloc_bitmap_t.IN("bitmap", "")
	)

	hwloc_bitmap_t(
		"bitmap_dup",
		"",

		hwloc_const_bitmap_t.IN("bitmap", "")
	)

	void(
		"bitmap_copy",
		"",

		hwloc_bitmap_t.IN("dst", ""),
		hwloc_const_bitmap_t.IN("src", "")
	)

	int(
		"bitmap_snprintf",
		"",

		char_p.OUT("buf", ""),
		size_t.IN("buflen", ""),
		hwloc_const_bitmap_t.IN("bitmap", "")
	)

	int(
		"bitmap_asprintf",
		"",

		char_pp.OUT("strp", ""),
		hwloc_const_bitmap_t.IN("bitmap", "")
	)

	int(
		"bitmap_sscanf",
		"",

		hwloc_bitmap_t.IN("bitmap", ""),
		const..char_p.IN("string", "")
	)

	int(
		"bitmap_list_snprintf",
		"",

		char_p.OUT("buf", ""),
		size_t.IN("buflen", ""),
		hwloc_const_bitmap_t.IN("bitmap", "")
	)

	int(
		"bitmap_list_asprintf",
		"",

		char_pp.OUT("strp", ""),
		hwloc_const_bitmap_t.IN("bitmap", "")
	)

	int(
		"bitmap_list_sscanf",
		"",

		hwloc_bitmap_t.IN("bitmap", ""),
		const..char_p.IN("string", "")
	)

	int(
		"bitmap_taskset_snprintf",
		"",

		char_p.OUT("buf", ""),
		size_t.IN("buflen", ""),
		hwloc_const_bitmap_t.IN("bitmap", "")
	)

	int(
		"bitmap_taskset_asprintf",
		"",

		char_pp.OUT("strp", ""),
		hwloc_const_bitmap_t.IN("bitmap", "")
	)

	int(
		"bitmap_taskset_sscanf",
		"",

		hwloc_bitmap_t.IN("bitmap", ""),
		const..char_p.IN("string", "")
	)

	void(
		"bitmap_zero",
		"",

		hwloc_bitmap_t.IN("bitmap", "")
	)

	void(
		"bitmap_fill",
		"",

		hwloc_bitmap_t.IN("bitmap", "")
	)

	void(
		"bitmap_only",
		"",

		hwloc_bitmap_t.IN("bitmap", ""),
		unsigned_int.IN("id", "")
	)

	void(
		"bitmap_allbut",
		"",

		hwloc_bitmap_t.IN("bitmap", ""),
		unsigned_int.IN("id", "")
	)

	void(
		"bitmap_from_ulong",
		"",

		hwloc_bitmap_t.IN("bitmap", ""),
		unsigned_long.IN("mask", "")
	)

	void(
		"bitmap_from_ith_ulong",
		"",

		hwloc_bitmap_t.IN("bitmap", ""),
		unsigned_int.IN("i", ""),
		unsigned_long.IN("mask", "")
	)

	void(
		"bitmap_set",
		"",

		hwloc_bitmap_t.IN("bitmap", ""),
		unsigned_int.IN("id", "")
	)

	void(
		"bitmap_set_range",
		"",

		hwloc_bitmap_t.IN("bitmap", ""),
		unsigned_int.IN("begin", ""),
		int.IN("end", "")
	)

	void(
		"bitmap_set_ith_ulong",
		"",

		hwloc_bitmap_t.IN("bitmap", ""),
		unsigned_int.IN("i", ""),
		unsigned_long.IN("mask", "")
	)

	void(
		"bitmap_clr",
		"",

		hwloc_bitmap_t.IN("bitmap", ""),
		unsigned_int.IN("id", "")
	)

	void(
		"bitmap_clr_range",
		"",

		hwloc_bitmap_t.IN("bitmap", ""),
		unsigned_int.IN("begin", ""),
		int.IN("end", "")
	)

	void(
		"bitmap_singlify",
		"",

		hwloc_bitmap_t.IN("bitmap", "")
	)

	unsigned_long(
		"bitmap_to_ulong",
		"",

		hwloc_const_bitmap_t.IN("bitmap", "")
	)

	unsigned_long(
		"bitmap_to_ith_ulong",
		"",

		hwloc_const_bitmap_t.IN("bitmap", ""),
		unsigned_int.IN("i", "")
	)

	int(
		"bitmap_isset",
		"",

		hwloc_const_bitmap_t.IN("bitmap", ""),
		unsigned_int.IN("id", "")
	)

	int(
		"bitmap_iszero",
		"",

		hwloc_const_bitmap_t.IN("bitmap", "")
	)

	int(
		"bitmap_isfull",
		"",

		hwloc_const_bitmap_t.IN("bitmap", "")
	)

	int(
		"bitmap_first",
		"",

		hwloc_const_bitmap_t.IN("bitmap", "")
	)

	int(
		"bitmap_next",
		"",

		hwloc_const_bitmap_t.IN("bitmap", ""),
		int.IN("prev", "")
	)

	int(
		"bitmap_last",
		"",

		hwloc_const_bitmap_t.IN("bitmap", "")
	)

	int(
		"bitmap_weight",
		"",

		hwloc_const_bitmap_t.IN("bitmap", "")
	)

	void(
		"bitmap_or",
		"",

		hwloc_bitmap_t.IN("res", ""),
		hwloc_const_bitmap_t.IN("bitmap1", ""),
		hwloc_const_bitmap_t.IN("bitmap2", "")
	)

	void(
		"bitmap_and",
		"",

		hwloc_bitmap_t.IN("res", ""),
		hwloc_const_bitmap_t.IN("bitmap1", ""),
		hwloc_const_bitmap_t.IN("bitmap2", "")
	)

	void(
		"bitmap_andnot",
		"",

		hwloc_bitmap_t.IN("res", ""),
		hwloc_const_bitmap_t.IN("bitmap1", ""),
		hwloc_const_bitmap_t.IN("bitmap2", "")
	)

	void(
		"bitmap_xor",
		"",

		hwloc_bitmap_t.IN("res", ""),
		hwloc_const_bitmap_t.IN("bitmap1", ""),
		hwloc_const_bitmap_t.IN("bitmap2", "")
	)

	void(
		"bitmap_not",
		"",

		hwloc_bitmap_t.IN("res", ""),
		hwloc_const_bitmap_t.IN("bitmap", "")
	)

	int(
		"bitmap_intersects",
		"",

		hwloc_const_bitmap_t.IN("bitmap1", ""),
		hwloc_const_bitmap_t.IN("bitmap2", "")
	)

	int(
		"bitmap_isincluded",
		"",

		hwloc_const_bitmap_t.IN("sub_bitmap", ""),
		hwloc_const_bitmap_t.IN("super_bitmap", "")
	)

	int(
		"bitmap_isequal",
		"",

		hwloc_const_bitmap_t.IN("bitmap1", ""),
		hwloc_const_bitmap_t.IN("bitmap2", "")
	)

	int(
		"bitmap_compare_first",
		"",

		hwloc_const_bitmap_t.IN("bitmap1", ""),
		hwloc_const_bitmap_t.IN("bitmap2", "")
	)

	int(
		"bitmap_compare",
		"",

		hwloc_const_bitmap_t.IN("bitmap1", ""),
		hwloc_const_bitmap_t.IN("bitmap2", "")
	)
	*/
}