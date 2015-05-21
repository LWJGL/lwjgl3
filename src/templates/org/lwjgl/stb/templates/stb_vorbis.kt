/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.stb.templates

import org.lwjgl.generator.*
import org.lwjgl.stb.*

val stb_vorbis = "STBVorbis".nativeClass(packageName = STB_PACKAGE, prefixMethod = "stb_vorbis_", prefixConstant = "VORBIS") {
	includeSTBAPI("#include \"stb_vorbis.c\"")

	documentation =
		"""
		Native bindings to stb_vorbis.c from the <a href="https://github.com/nothings/stb">stb library</a>.

		Ogg Vorbis audio decoder.

		<h3>Limitations</h3>
		${ul(
			"seeking not supported except manually via PUSHDATA api",
			"floor 0 not supported (used in old ogg vorbis files pre-2004)",
			"lossless sample-truncation at beginning ignored",
			"cannot concatenate multiple vorbis streams",
			"sample positions are 32-bit, limiting seekable 192Khz files to around 6 hours (Ogg supports 64-bit)"
		)}

		<h3>THREAD SAFETY</h3>

		Individual stb_vorbis* handles are not thread-safe; you cannot decode from them from multiple threads at the same time. However, you can have multiple
		{@code stb_vorbis*} handles and decode from them independently in multiple threads.

		<h3>PUSHDATA API</h3>

		This API allows you to get blocks of data from any source and hand them to stb_vorbis. you have to buffer them; stb_vorbis will tell you how much it
		used, and you have to give it the rest next time; and stb_vorbis may not have enough data to work with and you will need to give it the same data
		again PLUS more. Note that the Vorbis specification does not bound the size of an individual frame.

		<h3>PULLING INPUT API</h3>

		This API assumes stb_vorbis is allowed to pull data from a source -- either a block of memory containing the _entire_ vorbis stream, or a FILE * that
		you or it create, or possibly some other reading mechanism if you go modify the source to replace the FILE * case with some kind of callback to your
		code. (But if you don't support seeking, you may just want to go ahead and use pushdata.)
		"""

	IntConstant(
		"Error code.",

		"_no_error" _ 0,

		"need_more_data" _ 1, // not a real error

		"invalid_api_mixing" _ 2, // can't mix API modes
		"outofmem" _ 3, // not enough memory
		"feature_not_supported" _ 4, // uses floor 0
		"too_many_channels" _ 5, // STB_"MAX_CHANNELS" _  is too small
		"file_open_failure" _ 6, // fopen() failed
		"seek_without_length" _ 7, // can't seek in unknown-length file

		"unexpected_eof" _ 10, // file is truncated?
		"seek_invalid" _ 11, // seek past EOF

		// decoding errors (corrupt/invalid stream) -- you probably
		// don't care about the exact details of these

		// vorbis errors:
		"invalid_setup" _ 20,
		"invalid_stream" _ 21,

		// ogg errors:
		"missing_capture_pattern" _ 30,
		"invalid_stream_structure_version" _ 31,
		"continued_packet_flag_invalid" _ 32,
		"incorrect_stream_serial_number" _ 33,
		"invalid_first_page" _ 34,
		"bad_packet_type" _ 35,
		"cant_find_last_page" _ 36,
		"seek_failed" _ 37
	)

	// FUNCTIONS USEABLE WITH ALL INPUT MODES

	val DECODER = stb_vorbis_p.IN("f", "an ogg vorbis file decoder")

	stb_vorbis_info(
		"get_info",
		"Returns general information about the specified file.",

		DECODER
	)

	int(
		"get_error",
		"Returns the last error detected (clears it, too).",

		DECODER
	)

	void(
		"close",
		"Closes an ogg vorbis file and free all memory in use",

		DECODER
	)

	int(
		"get_sample_offset",
		"""
		Returns the offset (in samples) from the beginning of the file that will be returned by the next decode, if it is known, or -1 otherwise. After a
		#flush_pushdata() call, this may take a while before it becomes valid again.

		NOT WORKING YET after a seek with PULLDATA API.
		""",

		DECODER
	)

	unsigned_int(
		"get_file_offset",
		"Returns the current seek point within the file, or offset from the beginning of the memory buffer. In pushdata mode it returns 0.",

		DECODER
	)

	// PUSHDATA API

	stb_vorbis_p(
		"open_pushdata",
		"""
		Creates a vorbis decoder by passing in the initial data block containing the ogg&vorbis headers (you don't need to do parse them, just provide the
		first N bytes of the file -- you're told if it's not enough, see below)
		""",

		unsigned_char_p.OUT("datablock", "the data block containing the ogg vorbis headers"),
		AutoSize("datablock") _ int.IN("datablock_length_in_bytes", "the length of {@code datablock}, in bytes"),
		int_p.OUT("datablock_memory_consumed_in_bytes", "returns the amount of data parsed/consumed, in bytes"),
		int_p.OUT("error", "returns the error code"),
		nullable _ stb_vorbis_alloc_p.IN("alloc_buffer", "an ##STBVorbisAlloc struct"),

		returnDoc =
		"""
		On success, returns an {@code stb_vorbis *}, does not set error, returns the amount of data parsed/consumed on this call in
		{@code *datablock_memory_consumed_in_bytes}; On failure, returns $NULL on error and sets {@code *error}, does not change
		{@code *datablock_memory_consumed}. If it returns $NULL and {@code *error} is #need_more_data, then the input block was incomplete and you need to pass
		in a larger block from the start of the file.
		"""
	)

	int(
		"decode_frame_pushdata",
		"""
		Decodes a frame of audio sample data if possible from the passed-in data block.

		Note that on resynch, stb_vorbis will rarely consume all of the buffer, instead only {@code datablock_length_in_bytes-3} or less. This is because it
		wants to avoid missing parts of a page header if they cross a datablock boundary, without writing state-machiney code to record a partial detection.

		The number of channels returned are stored in *channels (which can be NULL -- it is always the same as the number of channels reported by #get_info()).
		{@code *output} will contain an array of {@code float*} buffers, one per channel. In other words, {@code (*output)[0][0]} contains the first sample
		from the first channel, and {@code (*output)[1][0]} contains the first sample from the second channel.
		""",

		DECODER,
		unsigned_char_p.IN("datablock", ""),
		AutoSize("datablock") _ int.IN("datablock_length_in_bytes", ""),
		Check(1) _ int_p.OUT("channels", "place to write number of {@code float *} buffers"),
		Check(1) _ float_ppp.OUT("output", "place to write float ** array of float * buffers"),
		Check(1) _ int_p.OUT("samples", "place to write number of output samples"),

		returnDoc =
		"""
		the number of bytes we used from datablock. Possible cases:
		${ul(
			"0 bytes used, 0 samples output (need more data)",
			"N bytes used, 0 samples output (resynching the stream, keep going)",
			"N bytes used, M samples output (one frame of data)"
		)}
		Note that after opening a file, you will ALWAYS get one N-bytes,0-sample frame, because Vorbis always "discards" the first frame.
		"""
	)

	void(
		"flush_pushdata",
		"""
		Inform stb_vorbis that your next datablock will not be contiguous with previous ones (e.g. you've seeked in the data); future attempts to decode frames
		will cause stb_vorbis to resynchronize (as noted above), and once it sees a valid Ogg page (typically 4-8KB, as large as 64KB), it will begin decoding
		the <b>next</b> frame.

		If you want to seek using pushdata, you need to seek in your file, then call stb_vorbis_flush_pushdata(), then start calling decoding, then once
		decoding is returning you data, call #get_sample_offset(), and if you don't like the result, seek your file again and repeat.
		""",

		DECODER
	)

	// PULLING INPUT API

	int(
		"decode_filename",
		"""
		Decode an entire file and output the data interleaved into a {@code malloc()ed} buffer stored in {@code *output}. When you're done with it, just
		MemoryUtil##memFree() the pointer returned in {@code *output}.
		""",

		const _ charASCII_p.IN("filename", "the file name"),
		Check(1) _ int_p.OUT("channels", "returns the number of channels"),
		Check(1) _ int_p.OUT("sample_rate", "returns the sample rate"),
		Check(1) _ short_pp.OUT("output", "returns a pointer to the decoded data"),

	    returnDoc = "the number of samples decoded, or -1 if the file could not be opened or was not an ogg vorbis file"
	)

	int(
		"decode_memory",
		"In-memory version of #decode_filename().",

		const _ unsigned_char_p.IN("mem", "the data to decode"),
		AutoSize("mem") _ int.IN("len", "the {@code data} length, in bytes"),
		Check(1) _ int_p.OUT("channels", "returns the number of channels"),
		Check(1) _ int_p.OUT("sample_rate", "returns the sample rate"),
		Check(1) _ short_pp.OUT("output", "returns a pointer to the decoded data")
	)

	stb_vorbis_p(
		"open_memory",
		"Creates an ogg vorbis decoder from an ogg vorbis stream in memory (note this must be the entire stream!).",

		const _ unsigned_char_p.IN("mem", "the data to decode"),
		AutoSize("mem") _ int.IN("len", "the {@code data} length, in bytes"),
		Check(1) _ int_p.OUT("error", "returns an error code"),
		nullable _ stb_vorbis_alloc_p.IN("alloc_buffer", "an ##STBVorbisAlloc struct"),

	    returnDoc = "the ogg vorbis decoder. On failure, returns $NULL and sets {@code *error}."
	)

	stb_vorbis_p(
		"open_filename",
		"Creates an ogg vorbis decoder from a file name.",

		const _ charASCII_p.IN("filename", "the file name"),
		Check(1) _ int_p.OUT("error", "returns an error code"),
		nullable _ stb_vorbis_alloc_p.IN("alloc_buffer", "an ##STBVorbisAlloc struct"),

		returnDoc = "the ogg vorbis decoder. On failure, returns $NULL and sets {@code *error}."
	)

	int(
		"seek_frame",
		"""
		<h3>NOT WORKING YET</h3>

		Seeks in the Vorbis file to (approximately) {@code sample_number}. After calling seek_frame(), the next call to {@code get_frame_*()} will include the
		specified sample.
		""",

		DECODER,
		unsigned_int.IN("sample_number", "the sample index")
	)

	int(
		"seek",
		"""
		<h3>NOT WORKING YET</h3>

		Seeks in the Vorbis file to (approximately) {@code sample_number}. After calling stb_vorbis_seek(), the next call to {@code stb_vorbis_get_samples_*}
		will start with the specified sample.
		""",

		DECODER,
		unsigned_int.IN("sample_number", "the sample index")
	)

	void(
		"seek_start",
		"This function is equivalent to #seek()(f,0), but it actually works.",

		DECODER
	)

	unsigned_int(
		"stream_length_in_samples",
		"Returns the total length of the vorbis stream, in samples.",

		DECODER
	)

	float(
		"stream_length_in_seconds",
		"Returns the total length of the vorbis stream, in samples.",

		DECODER
	)

	int(
		"get_frame_float",
		"""
		Decodes the next frame and return the number of samples.

		You generally should not intermix calls to {@code stb_vorbis_get_frame_*()} and {@code stb_vorbis_get_samples_*()}, since the latter calls the former.
		""",

		DECODER,
		Check(1) _ nullable _ int_p.OUT(
			"channels",
			"returns the number of channels. Can be $NULL -- it is always the same as the number of channels reported by #get_info()."
		),
		float_ppp.OUT(
			"output",
			"""
			returns a pointer to an array of float* buffers, one per channel. These outputs will be overwritten on the next call to
			{@code stb_vorbis_get_frame_*}.
			"""
		),

	    returnDoc = "the number of samples per channel"
	)

	int(
		"get_frame_short",
		"""
		Decodes the next frame and return the number of samples per channel. The data is coerced to the number of channels you request according to the channel
		coercion rules (see below). You must pass in the size of your buffer(s) so that stb_vorbis will not overwrite the end of the buffer. The maximum buffer
		size needed can be gotten from #get_info(); however, the Vorbis I specification implies an absolute maximum of 4096 samples per channel.

		<h3>Channel coercion rules</h3>

		Let M be the number of channels requested, and N the number of channels present, and Cn be the nth channel; let stereo L be the sum of all L and center
		channels, and stereo R be the sum of all R and center channels (channel assignment from the vorbis spec).
		${codeBlock("""
M    N      output
1    k      sum(Ck) for all k
2    *      stereo L, stereo R
k    l      k > l, the first l channels, then 0s
k    l      k <= l, the first k channels""")}
		Note that this is not <b>good</b> surround etc. mixing at all! It's just so you get something useful.
		""",

		DECODER,
		AutoSize("buffer") _ int.IN("num_c", "the number of channels"),
		short_pp.OUT(
			"buffer",
			"the output buffer, an array of pointers with length {@code num_c}, each pointing to a short array with length {@code num_samples}"
		),
		int.IN("num_samples", "the number of samples"),

		returnDoc = "the number of samples per channel"
	)

	int(
		"get_frame_short_interleaved",
		"""
		Interleaved version of #get_frame_short().

		Note that for interleaved data, you pass in the number of shorts (the size of your array), but the return value is the number of samples per channel,
		not the total number of samples.
		""",

		DECODER,
		int.IN("num_c", "the number of channels"),
		short_p.OUT("buffer", "the output buffer"),
		AutoSize("buffer") _ int.IN("num_shorts", "the size of {@code buffer}"),

		returnDoc = "the number of samples per channel"
	)

	int(
		"get_samples_float",
		"""
		Gets {@code num_samples} samples, not necessarily on a frame boundary -- this requires buffering so you have to supply the buffers. DOES NOT APPLY THE
		COERCION RULES.
		""",

		DECODER,
		AutoSize("buffer") _ int.IN("channels", "the number of channels to decode"),
		float_pp.OUT(
			"buffer",
			"the output buffer, an array of pointers with length {@code channels}, each pointing to a float array with length {@code num_samples}"
		),
		int.IN("num_samples", "the number of samples to decode"),

	    returnDoc =
		"the number of samples stored per channel; it may be less than requested at the end of the file. If there are no more samples in the file, returns 0."
	)

	int(
		"get_samples_float_interleaved",
		"Interleaved version of #get_samples_float().",

		DECODER,
		int.IN("channels", "the number of channels"),
		float_p.OUT("buffer", "the output buffer"),
		AutoSize("buffer") _ int.IN("num_floats", "the size of {@code buffer}"),

		returnDoc =
		"the number of samples stored per channel; it may be less than requested at the end of the file. If there are no more samples in the file, returns 0."
	)

	int(
		"get_samples_short",
		"""
		Gets {@code num_samples} samples, not necessarily on a frame boundary -- this requires buffering so you have to supply the buffers. Applies the
		coercion rules above to produce {@code channels} channels.
		""",

		DECODER,
		AutoSize("buffer") _ int.IN("channels", "the number of channels"),
		short_pp.OUT(
			"buffer",
		    "the output buffer, an array of pointers with length {@code channels}, each pointing to a short array with length {@code num_samples}"
		),
		int.IN("num_samples", "the number of samples"),

	    returnDoc =
		"the number of samples stored per channel; it may be less than requested at the end of the file. If there are no more samples in the file, returns 0."
	)

	int(
		"get_samples_short_interleaved",
		"Interleaved version of #get_samples_short().",

		DECODER,
		int.IN("channels", "the number of channels"),
		short_p.OUT("buffer", "the output buffer"),
		AutoSize("buffer") _ int.IN("num_shorts", "the size of {@code buffer}"),

		returnDoc =
		"the number of samples stored per channel; it may be less than requested at the end of the file. If there are no more samples in the file, returns 0."
	)
}