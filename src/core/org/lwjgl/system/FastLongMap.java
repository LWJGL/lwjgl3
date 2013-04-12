/*
 * Copyright 2002-2004 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.lwjgl.system;

import java.util.Iterator;

import static org.lwjgl.system.MathUtil.*;

/**
 * A hash map using primitive longs as keys rather than objects.
 *
 * @author Justin Couch
 * @author Alex Chaffee (alex@apache.org)
 * @author Stephen Colebourne
 * @author Nathan Sweet
 */
public class FastLongMap<V> implements Iterable<FastLongMap.Entry<V>> {

	private Entry<V>[] table;
	private int        size, mask, capacity, threshold;

	/** Same as: FastLongMap(16, 0.75f); */
	public FastLongMap() {
		this(16, 0.75f);
	}

	/** Same as: FastLongMap(initialCapacity, 0.75f); */
	FastLongMap(int initialCapacity) {
		this(initialCapacity, 0.75f);
	}

	@SuppressWarnings("unchecked")
	FastLongMap(int initialCapacity, float loadFactor) {
		if ( initialCapacity > 1 << 30 ) throw new IllegalArgumentException("initialCapacity is too large.");
		if ( initialCapacity < 0 ) throw new IllegalArgumentException("initialCapacity must be greater than zero.");
		if ( loadFactor <= 0 ) throw new IllegalArgumentException("loadFactor must be greater than zero.");

		this.capacity = mathNextPoT(initialCapacity);

		this.threshold = (int)(capacity * loadFactor);
		this.table = new Entry[capacity];
		this.mask = capacity - 1;
	}

	private int index(long key) {
		return index(key, mask);
	}

	private static int index(long key, int mask) {
		int hash = (int)(key ^ (key >>> 32));
		return hash & mask;
	}

	public V put(long key, V value) {
		Entry<V>[] table = this.table;
		int index = index(key);

		// Check if key already exists.
		for ( Entry<V> e = table[index]; e != null; e = e.next ) {
			if ( e.key != key ) continue;
			V oldValue = e.value;
			e.value = value;
			return oldValue;
		}

		table[index] = new Entry<V>(key, value, table[index]);

		if ( size++ >= threshold )
			rehash(table);

		return null;
	}

	@SuppressWarnings("unchecked")
	private void rehash(Entry<V>[] table) {
		int newCapacity = capacity << 1;
		int newMask = newCapacity - 1;

		Entry<V>[] newTable = new Entry[newCapacity];

		for ( int i = 0, index; i < table.length; i++ ) {
			Entry<V> e = table[i];
			if ( e == null ) continue;
			do {
				Entry<V> next = e.next;
				index = index(e.key, newMask);
				e.next = newTable[index];
				newTable[index] = e;
				e = next;
			} while ( e != null );
		}

		this.table = newTable;
		capacity = newCapacity;
		mask = newMask;
		threshold <<= 1;
	}

	public V get(long key) {
		int index = index(key);
		Entry<V>[] table = this.table;
		for ( Entry<V> e = table[index]; e != null; e = e.next )
			if ( e.key == key ) return e.value;
		return null;
	}

	public boolean containsValue(Object value) {
		Entry<V>[] table = this.table;
		for ( int i = table.length - 1; 0 <= i; i-- )
			for ( Entry<V> e = table[i]; e != null; e = e.next )
				if ( e.value.equals(value) ) return true;
		return false;
	}

	public boolean containsKey(long key) {
		int index = index(key);
		Entry<V>[] table = this.table;
		for ( Entry<V> e = table[index]; e != null; e = e.next )
			if ( e.key == key ) return true;
		return false;
	}

	public V remove(long key) {
		int index = index(key);
		Entry<V>[] table = this.table;

		Entry<V> prev = table[index];
		Entry<V> e = prev;
		while ( e != null ) {
			Entry<V> next = e.next;
			if ( e.key == key ) {
				size--;
				if ( prev == e )
					table[index] = next;
				else
					prev.next = next;
				return e.value;
			}
			prev = e;
			e = next;
		}
		return null;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void clear() {
		Entry<V>[] table = this.table;
		for ( int index = table.length - 1; index >= 0; index-- )
			table[index] = null;
		size = 0;
	}

	@Override
	public EntryIterator iterator() {
		return new EntryIterator();
	}

	public class EntryIterator implements Iterator<Entry<V>> {

		private int      nextIndex;
		private Entry<V> current;

		EntryIterator() {
			reset();
		}

		public void reset() {
			current = null;
			// Find first bucket.
			Entry<V>[] table = FastLongMap.this.table;
			int i;
			for ( i = table.length - 1; i >= 0; i-- )
				if ( table[i] != null ) break;
			nextIndex = i;
		}

		@Override
		public boolean hasNext() {
			if ( nextIndex >= 0 ) return true;
			Entry e = current;
			return e != null && e.next != null;
		}

		@Override
		public Entry<V> next() {
			// Next entry in current bucket.
			Entry<V> e = current;
			if ( e != null ) {
				e = e.next;
				if ( e != null ) {
					current = e;
					return e;
				}
			}
			// Use the bucket at nextIndex and find the next nextIndex.
			Entry<V>[] table = FastLongMap.this.table;
			int i = nextIndex;
			e = current = table[i];
			while ( --i >= 0 )
				if ( table[i] != null ) break;
			nextIndex = i;
			return e;
		}

		@Override
		public void remove() {
			FastLongMap.this.remove(current.key);
		}
	}

	public static class Entry<T> {

		final long key;
		T        value;
		Entry<T> next;

		Entry(long key, T value, Entry<T> next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}

		public long getKey() {
			return key;
		}

		public T getValue() {
			return value;
		}

	}

}