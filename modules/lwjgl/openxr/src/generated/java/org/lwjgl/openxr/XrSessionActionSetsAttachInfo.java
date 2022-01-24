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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Information to attach action sets to a session.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be {@link XR10#XR_TYPE_SESSION_ACTION_SETS_ATTACH_INFO TYPE_SESSION_ACTION_SETS_ATTACH_INFO}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code actionSets} <b>must</b> be a pointer to an array of {@code countActionSets} valid {@code XrActionSet} handles</li>
 * <li>The {@code countActionSets} parameter <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XR10#xrAttachSessionActionSets AttachSessionActionSets}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSessionActionSetsAttachInfo {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     uint32_t {@link #countActionSets};
 *     XrActionSet const * {@link #actionSets};
 * }</code></pre>
 */
public class XrSessionActionSetsAttachInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        COUNTACTIONSETS,
        ACTIONSETS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        COUNTACTIONSETS = layout.offsetof(2);
        ACTIONSETS = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrSessionActionSetsAttachInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSessionActionSetsAttachInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** an integer specifying the number of valid elements in the {@code actionSets} array. */
    @NativeType("uint32_t")
    public int countActionSets() { return ncountActionSets(address()); }
    /** a pointer to an array of one or more {@code XrActionSet} handles to be attached to the session. */
    @NativeType("XrActionSet const *")
    public PointerBuffer actionSets() { return nactionSets(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSessionActionSetsAttachInfo type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_SESSION_ACTION_SETS_ATTACH_INFO TYPE_SESSION_ACTION_SETS_ATTACH_INFO} value to the {@link #type} field. */
    public XrSessionActionSetsAttachInfo type$Default() { return type(XR10.XR_TYPE_SESSION_ACTION_SETS_ATTACH_INFO); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSessionActionSetsAttachInfo next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@link #actionSets} field. */
    public XrSessionActionSetsAttachInfo actionSets(@NativeType("XrActionSet const *") PointerBuffer value) { nactionSets(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSessionActionSetsAttachInfo set(
        int type,
        long next,
        PointerBuffer actionSets
    ) {
        type(type);
        next(next);
        actionSets(actionSets);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSessionActionSetsAttachInfo set(XrSessionActionSetsAttachInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSessionActionSetsAttachInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSessionActionSetsAttachInfo malloc() {
        return wrap(XrSessionActionSetsAttachInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSessionActionSetsAttachInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSessionActionSetsAttachInfo calloc() {
        return wrap(XrSessionActionSetsAttachInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSessionActionSetsAttachInfo} instance allocated with {@link BufferUtils}. */
    public static XrSessionActionSetsAttachInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSessionActionSetsAttachInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSessionActionSetsAttachInfo} instance for the specified memory address. */
    public static XrSessionActionSetsAttachInfo create(long address) {
        return wrap(XrSessionActionSetsAttachInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSessionActionSetsAttachInfo createSafe(long address) {
        return address == NULL ? null : wrap(XrSessionActionSetsAttachInfo.class, address);
    }

    /**
     * Returns a new {@link XrSessionActionSetsAttachInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSessionActionSetsAttachInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSessionActionSetsAttachInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSessionActionSetsAttachInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSessionActionSetsAttachInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSessionActionSetsAttachInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSessionActionSetsAttachInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSessionActionSetsAttachInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSessionActionSetsAttachInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSessionActionSetsAttachInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSessionActionSetsAttachInfo malloc(MemoryStack stack) {
        return wrap(XrSessionActionSetsAttachInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSessionActionSetsAttachInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSessionActionSetsAttachInfo calloc(MemoryStack stack) {
        return wrap(XrSessionActionSetsAttachInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSessionActionSetsAttachInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSessionActionSetsAttachInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSessionActionSetsAttachInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSessionActionSetsAttachInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSessionActionSetsAttachInfo.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSessionActionSetsAttachInfo.NEXT); }
    /** Unsafe version of {@link #countActionSets}. */
    public static int ncountActionSets(long struct) { return UNSAFE.getInt(null, struct + XrSessionActionSetsAttachInfo.COUNTACTIONSETS); }
    /** Unsafe version of {@link #actionSets() actionSets}. */
    public static PointerBuffer nactionSets(long struct) { return memPointerBuffer(memGetAddress(struct + XrSessionActionSetsAttachInfo.ACTIONSETS), ncountActionSets(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSessionActionSetsAttachInfo.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSessionActionSetsAttachInfo.NEXT, value); }
    /** Sets the specified value to the {@code countActionSets} field of the specified {@code struct}. */
    public static void ncountActionSets(long struct, int value) { UNSAFE.putInt(null, struct + XrSessionActionSetsAttachInfo.COUNTACTIONSETS, value); }
    /** Unsafe version of {@link #actionSets(PointerBuffer) actionSets}. */
    public static void nactionSets(long struct, PointerBuffer value) { memPutAddress(struct + XrSessionActionSetsAttachInfo.ACTIONSETS, memAddress(value)); ncountActionSets(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSessionActionSetsAttachInfo.ACTIONSETS));
    }

    // -----------------------------------

    /** An array of {@link XrSessionActionSetsAttachInfo} structs. */
    public static class Buffer extends StructBuffer<XrSessionActionSetsAttachInfo, Buffer> implements NativeResource {

        private static final XrSessionActionSetsAttachInfo ELEMENT_FACTORY = XrSessionActionSetsAttachInfo.create(-1L);

        /**
         * Creates a new {@code XrSessionActionSetsAttachInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSessionActionSetsAttachInfo#SIZEOF}, and its mark will be undefined.
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
        protected XrSessionActionSetsAttachInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSessionActionSetsAttachInfo#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSessionActionSetsAttachInfo.ntype(address()); }
        /** @return the value of the {@link XrSessionActionSetsAttachInfo#next} field. */
        @NativeType("void const *")
        public long next() { return XrSessionActionSetsAttachInfo.nnext(address()); }
        /** @return the value of the {@link XrSessionActionSetsAttachInfo#countActionSets} field. */
        @NativeType("uint32_t")
        public int countActionSets() { return XrSessionActionSetsAttachInfo.ncountActionSets(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@link XrSessionActionSetsAttachInfo#actionSets} field. */
        @NativeType("XrActionSet const *")
        public PointerBuffer actionSets() { return XrSessionActionSetsAttachInfo.nactionSets(address()); }

        /** Sets the specified value to the {@link XrSessionActionSetsAttachInfo#type} field. */
        public XrSessionActionSetsAttachInfo.Buffer type(@NativeType("XrStructureType") int value) { XrSessionActionSetsAttachInfo.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_SESSION_ACTION_SETS_ATTACH_INFO TYPE_SESSION_ACTION_SETS_ATTACH_INFO} value to the {@link XrSessionActionSetsAttachInfo#type} field. */
        public XrSessionActionSetsAttachInfo.Buffer type$Default() { return type(XR10.XR_TYPE_SESSION_ACTION_SETS_ATTACH_INFO); }
        /** Sets the specified value to the {@link XrSessionActionSetsAttachInfo#next} field. */
        public XrSessionActionSetsAttachInfo.Buffer next(@NativeType("void const *") long value) { XrSessionActionSetsAttachInfo.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@link XrSessionActionSetsAttachInfo#actionSets} field. */
        public XrSessionActionSetsAttachInfo.Buffer actionSets(@NativeType("XrActionSet const *") PointerBuffer value) { XrSessionActionSetsAttachInfo.nactionSets(address(), value); return this; }

    }

}