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
 * Information to sync actions.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be {@link XR10#XR_TYPE_ACTIONS_SYNC_INFO TYPE_ACTIONS_SYNC_INFO}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>If {@code countActiveActionSets} is not 0, {@code activeActionSets} <b>must</b> be a pointer to an array of {@code countActiveActionSets} valid {@link XrActiveActionSet} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrActiveActionSet}, {@link XR10#xrSyncActions SyncActions}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrActionsSyncInfo {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     uint32_t {@link #countActiveActionSets};
 *     {@link XrActiveActionSet XrActiveActionSet} const * {@link #activeActionSets};
 * }</code></pre>
 */
public class XrActionsSyncInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        COUNTACTIVEACTIONSETS,
        ACTIVEACTIONSETS;

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
        COUNTACTIVEACTIONSETS = layout.offsetof(2);
        ACTIVEACTIONSETS = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrActionsSyncInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrActionsSyncInfo(ByteBuffer container) {
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
    /** an integer specifying the number of valid elements in the {@code activeActionSets} array. */
    @NativeType("uint32_t")
    public int countActiveActionSets() { return ncountActiveActionSets(address()); }
    /** {@code NULL} or a pointer to an array of one or more {@link XrActiveActionSet} structures that should be synchronized. */
    @Nullable
    @NativeType("XrActiveActionSet const *")
    public XrActiveActionSet.Buffer activeActionSets() { return nactiveActionSets(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrActionsSyncInfo type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_ACTIONS_SYNC_INFO TYPE_ACTIONS_SYNC_INFO} value to the {@link #type} field. */
    public XrActionsSyncInfo type$Default() { return type(XR10.XR_TYPE_ACTIONS_SYNC_INFO); }
    /** Sets the specified value to the {@link #next} field. */
    public XrActionsSyncInfo next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #countActiveActionSets} field. */
    public XrActionsSyncInfo countActiveActionSets(@NativeType("uint32_t") int value) { ncountActiveActionSets(address(), value); return this; }
    /** Sets the address of the specified {@link XrActiveActionSet.Buffer} to the {@link #activeActionSets} field. */
    public XrActionsSyncInfo activeActionSets(@Nullable @NativeType("XrActiveActionSet const *") XrActiveActionSet.Buffer value) { nactiveActionSets(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrActionsSyncInfo set(
        int type,
        long next,
        int countActiveActionSets,
        @Nullable XrActiveActionSet.Buffer activeActionSets
    ) {
        type(type);
        next(next);
        countActiveActionSets(countActiveActionSets);
        activeActionSets(activeActionSets);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrActionsSyncInfo set(XrActionsSyncInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrActionsSyncInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrActionsSyncInfo malloc() {
        return wrap(XrActionsSyncInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrActionsSyncInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrActionsSyncInfo calloc() {
        return wrap(XrActionsSyncInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrActionsSyncInfo} instance allocated with {@link BufferUtils}. */
    public static XrActionsSyncInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrActionsSyncInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code XrActionsSyncInfo} instance for the specified memory address. */
    public static XrActionsSyncInfo create(long address) {
        return wrap(XrActionsSyncInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrActionsSyncInfo createSafe(long address) {
        return address == NULL ? null : wrap(XrActionsSyncInfo.class, address);
    }

    /**
     * Returns a new {@link XrActionsSyncInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionsSyncInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrActionsSyncInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionsSyncInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrActionsSyncInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionsSyncInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrActionsSyncInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrActionsSyncInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrActionsSyncInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrActionsSyncInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrActionsSyncInfo malloc(MemoryStack stack) {
        return wrap(XrActionsSyncInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrActionsSyncInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrActionsSyncInfo calloc(MemoryStack stack) {
        return wrap(XrActionsSyncInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrActionsSyncInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrActionsSyncInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrActionsSyncInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrActionsSyncInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrActionsSyncInfo.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrActionsSyncInfo.NEXT); }
    /** Unsafe version of {@link #countActiveActionSets}. */
    public static int ncountActiveActionSets(long struct) { return UNSAFE.getInt(null, struct + XrActionsSyncInfo.COUNTACTIVEACTIONSETS); }
    /** Unsafe version of {@link #activeActionSets}. */
    @Nullable public static XrActiveActionSet.Buffer nactiveActionSets(long struct) { return XrActiveActionSet.createSafe(memGetAddress(struct + XrActionsSyncInfo.ACTIVEACTIONSETS), ncountActiveActionSets(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrActionsSyncInfo.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrActionsSyncInfo.NEXT, value); }
    /** Sets the specified value to the {@code countActiveActionSets} field of the specified {@code struct}. */
    public static void ncountActiveActionSets(long struct, int value) { UNSAFE.putInt(null, struct + XrActionsSyncInfo.COUNTACTIVEACTIONSETS, value); }
    /** Unsafe version of {@link #activeActionSets(XrActiveActionSet.Buffer) activeActionSets}. */
    public static void nactiveActionSets(long struct, @Nullable XrActiveActionSet.Buffer value) { memPutAddress(struct + XrActionsSyncInfo.ACTIVEACTIONSETS, memAddressSafe(value)); if (value != null) { ncountActiveActionSets(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrActionsSyncInfo} structs. */
    public static class Buffer extends StructBuffer<XrActionsSyncInfo, Buffer> implements NativeResource {

        private static final XrActionsSyncInfo ELEMENT_FACTORY = XrActionsSyncInfo.create(-1L);

        /**
         * Creates a new {@code XrActionsSyncInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrActionsSyncInfo#SIZEOF}, and its mark will be undefined.
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
        protected XrActionsSyncInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrActionsSyncInfo#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrActionsSyncInfo.ntype(address()); }
        /** @return the value of the {@link XrActionsSyncInfo#next} field. */
        @NativeType("void const *")
        public long next() { return XrActionsSyncInfo.nnext(address()); }
        /** @return the value of the {@link XrActionsSyncInfo#countActiveActionSets} field. */
        @NativeType("uint32_t")
        public int countActiveActionSets() { return XrActionsSyncInfo.ncountActiveActionSets(address()); }
        /** @return a {@link XrActiveActionSet.Buffer} view of the struct array pointed to by the {@link XrActionsSyncInfo#activeActionSets} field. */
        @Nullable
        @NativeType("XrActiveActionSet const *")
        public XrActiveActionSet.Buffer activeActionSets() { return XrActionsSyncInfo.nactiveActionSets(address()); }

        /** Sets the specified value to the {@link XrActionsSyncInfo#type} field. */
        public XrActionsSyncInfo.Buffer type(@NativeType("XrStructureType") int value) { XrActionsSyncInfo.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_ACTIONS_SYNC_INFO TYPE_ACTIONS_SYNC_INFO} value to the {@link XrActionsSyncInfo#type} field. */
        public XrActionsSyncInfo.Buffer type$Default() { return type(XR10.XR_TYPE_ACTIONS_SYNC_INFO); }
        /** Sets the specified value to the {@link XrActionsSyncInfo#next} field. */
        public XrActionsSyncInfo.Buffer next(@NativeType("void const *") long value) { XrActionsSyncInfo.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrActionsSyncInfo#countActiveActionSets} field. */
        public XrActionsSyncInfo.Buffer countActiveActionSets(@NativeType("uint32_t") int value) { XrActionsSyncInfo.ncountActiveActionSets(address(), value); return this; }
        /** Sets the address of the specified {@link XrActiveActionSet.Buffer} to the {@link XrActionsSyncInfo#activeActionSets} field. */
        public XrActionsSyncInfo.Buffer activeActionSets(@Nullable @NativeType("XrActiveActionSet const *") XrActiveActionSet.Buffer value) { XrActionsSyncInfo.nactiveActionSets(address(), value); return this; }

    }

}