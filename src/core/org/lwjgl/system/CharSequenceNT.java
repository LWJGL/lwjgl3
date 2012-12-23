/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

/** A null-terminated CharSequence. */
final class CharSequenceNT implements CharSequence {

	final CharSequence source;

	CharSequenceNT(final CharSequence source) {
		this.source = source;
	}

	public int length() {
		return source.length() + 1;

	}

	public char charAt(final int index) {
		return index == source.length() ? '\0' : source.charAt(index);

	}

	public CharSequence subSequence(final int start, final int end) {
		return new CharSequenceNT(source.subSequence(start, Math.min(end, source.length())));
	}

}