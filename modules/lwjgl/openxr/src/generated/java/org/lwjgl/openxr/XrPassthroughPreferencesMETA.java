/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Passthrough preferences.
 * 
 * <h5>Description</h5>
 * 
 * <p>The runtime <b>must</b> populate the {@link XrPassthroughPreferencesMETA} structure with the relevant information when the app calls {@link METAPassthroughPreferences#xrGetPassthroughPreferencesMETA GetPassthroughPreferencesMETA}.</p>
 * 
 * <p>Presence of the bit flag {@link METAPassthroughPreferences#XR_PASSTHROUGH_PREFERENCE_DEFAULT_TO_ACTIVE_BIT_META PASSTHROUGH_PREFERENCE_DEFAULT_TO_ACTIVE_BIT_META} does not indicate a guarantee that applications <b>can</b> enable and use passthrough in practice. The runtime <b>may</b> impose restrictions on passthrough usage (e.g. based on hardware availability or permission models) independently of the state of this flag bit. Apps <b>should</b> test for this flag explicitly, as more flag bits <b>may</b> be introduced in the future.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link METAPassthroughPreferences XR_META_passthrough_preferences} extension <b>must</b> be enabled prior to using {@link XrPassthroughPreferencesMETA}</li>
 * <li>{@code type} <b>must</b> be {@link METAPassthroughPreferences#XR_TYPE_PASSTHROUGH_PREFERENCES_META TYPE_PASSTHROUGH_PREFERENCES_META}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link METAPassthroughPreferences#xrGetPassthroughPreferencesMETA GetPassthroughPreferencesMETA}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrPassthroughPreferencesMETA {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrPassthroughPreferenceFlagsMETA {@link #flags};
 * }</code></pre>
 */
public class XrPassthroughPreferencesMETA extends Struct<XrPassthroughPreferencesMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
    }

    protected XrPassthroughPreferencesMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrPassthroughPreferencesMETA create(long address, @Nullable ByteBuffer container) {
        return new XrPassthroughPreferencesMETA(address, container);
    }

    /**
     * Creates a {@code XrPassthroughPreferencesMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrPassthroughPreferencesMETA(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** a bitmask of {@code XrPassthroughPreferenceFlagBitsMETA} describing boolean passthrough preferences. */
    @NativeType("XrPassthroughPreferenceFlagsMETA")
    public long flags() { return nflags(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrPassthroughPreferencesMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAPassthroughPreferences#XR_TYPE_PASSTHROUGH_PREFERENCES_META TYPE_PASSTHROUGH_PREFERENCES_META} value to the {@link #type} field. */
    public XrPassthroughPreferencesMETA type$Default() { return type(METAPassthroughPreferences.XR_TYPE_PASSTHROUGH_PREFERENCES_META); }
    /** Sets the specified value to the {@link #next} field. */
    public XrPassthroughPreferencesMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrPassthroughPreferencesMETA set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrPassthroughPreferencesMETA set(XrPassthroughPreferencesMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrPassthroughPreferencesMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrPassthroughPreferencesMETA malloc() {
        return new XrPassthroughPreferencesMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrPassthroughPreferencesMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrPassthroughPreferencesMETA calloc() {
        return new XrPassthroughPreferencesMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrPassthroughPreferencesMETA} instance allocated with {@link BufferUtils}. */
    public static XrPassthroughPreferencesMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrPassthroughPreferencesMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrPassthroughPreferencesMETA} instance for the specified memory address. */
    public static XrPassthroughPreferencesMETA create(long address) {
        return new XrPassthroughPreferencesMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrPassthroughPreferencesMETA createSafe(long address) {
        return address == NULL ? null : new XrPassthroughPreferencesMETA(address, null);
    }

    /**
     * Returns a new {@link XrPassthroughPreferencesMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughPreferencesMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughPreferencesMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughPreferencesMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughPreferencesMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughPreferencesMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrPassthroughPreferencesMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrPassthroughPreferencesMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrPassthroughPreferencesMETA.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrPassthroughPreferencesMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughPreferencesMETA malloc(MemoryStack stack) {
        return new XrPassthroughPreferencesMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrPassthroughPreferencesMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughPreferencesMETA calloc(MemoryStack stack) {
        return new XrPassthroughPreferencesMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrPassthroughPreferencesMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughPreferencesMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughPreferencesMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughPreferencesMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrPassthroughPreferencesMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrPassthroughPreferencesMETA.NEXT); }
    /** Unsafe version of {@link #flags}. */
    public static long nflags(long struct) { return UNSAFE.getLong(null, struct + XrPassthroughPreferencesMETA.FLAGS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrPassthroughPreferencesMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrPassthroughPreferencesMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrPassthroughPreferencesMETA} structs. */
    public static class Buffer extends StructBuffer<XrPassthroughPreferencesMETA, Buffer> implements NativeResource {

        private static final XrPassthroughPreferencesMETA ELEMENT_FACTORY = XrPassthroughPreferencesMETA.create(-1L);

        /**
         * Creates a new {@code XrPassthroughPreferencesMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrPassthroughPreferencesMETA#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected XrPassthroughPreferencesMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrPassthroughPreferencesMETA#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrPassthroughPreferencesMETA.ntype(address()); }
        /** @return the value of the {@link XrPassthroughPreferencesMETA#next} field. */
        @NativeType("void const *")
        public long next() { return XrPassthroughPreferencesMETA.nnext(address()); }
        /** @return the value of the {@link XrPassthroughPreferencesMETA#flags} field. */
        @NativeType("XrPassthroughPreferenceFlagsMETA")
        public long flags() { return XrPassthroughPreferencesMETA.nflags(address()); }

        /** Sets the specified value to the {@link XrPassthroughPreferencesMETA#type} field. */
        public XrPassthroughPreferencesMETA.Buffer type(@NativeType("XrStructureType") int value) { XrPassthroughPreferencesMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAPassthroughPreferences#XR_TYPE_PASSTHROUGH_PREFERENCES_META TYPE_PASSTHROUGH_PREFERENCES_META} value to the {@link XrPassthroughPreferencesMETA#type} field. */
        public XrPassthroughPreferencesMETA.Buffer type$Default() { return type(METAPassthroughPreferences.XR_TYPE_PASSTHROUGH_PREFERENCES_META); }
        /** Sets the specified value to the {@link XrPassthroughPreferencesMETA#next} field. */
        public XrPassthroughPreferencesMETA.Buffer next(@NativeType("void const *") long value) { XrPassthroughPreferencesMETA.nnext(address(), value); return this; }

    }

}