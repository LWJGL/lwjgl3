/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

/** A null-terminated CharSequence. */
final class CharSequenceNT implements CharSequence {

	final CharSequence source;

	CharSequenceNT(CharSequence source) {
		this.source = source;
	}

	@Override
	public int length() {
		return source.length() + 1;

	}

	@Override
	public char charAt(int index) {
		return index == source.length() ? '\0' : source.charAt(index);

	}

	@Override
	public CharSequence subSequence(int start, int end) {
		return new CharSequenceNT(source.subSequence(start, Math.min(end, source.length())));
	}

}