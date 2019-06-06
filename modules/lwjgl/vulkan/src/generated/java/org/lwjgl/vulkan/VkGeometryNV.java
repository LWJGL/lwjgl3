/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying a geometry in a bottom-level acceleration structure.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVRayTracing#VK_STRUCTURE_TYPE_GEOMETRY_NV STRUCTURE_TYPE_GEOMETRY_NV}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code geometryType} <b>must</b> be a valid {@code VkGeometryTypeNV} value</li>
 * <li>{@code geometry} <b>must</b> be a valid {@link VkGeometryDataNV} structure</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkGeometryFlagBitsNV} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAccelerationStructureInfoNV}, {@link VkGeometryDataNV}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code geometryType} &ndash; describes which type of geometry this {@link VkGeometryNV} refers to.</li>
 * <li>{@code geometry} &ndash; contains the geometry data as described in {@link VkGeometryDataNV}.</li>
 * <li>{@code flags} &ndash; has flags describing options for this geometry.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkGeometryNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkGeometryTypeNV geometryType;
 *     {@link VkGeometryDataNV VkGeometryDataNV} geometry;
 *     VkGeometryFlagsNV flags;
 * }</code></pre>
 */
public class VkGeometryNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        GEOMETRYTYPE,
        GEOMETRY,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkGeometryDataNV.SIZEOF, VkGeometryDataNV.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        GEOMETRYTYPE = layout.offsetof(2);
        GEOMETRY = layout.offsetof(3);
        FLAGS = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkGeometryNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkGeometryNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code geometryType} field. */
    @NativeType("VkGeometryTypeNV")
    public int geometryType() { return ngeometryType(address()); }
    /** Returns a {@link VkGeometryDataNV} view of the {@code geometry} field. */
    public VkGeometryDataNV geometry() { return ngeometry(address()); }
    /** Returns the value of the {@code flags} field. */
    @NativeType("VkGeometryFlagsNV")
    public int flags() { return nflags(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkGeometryNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkGeometryNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code geometryType} field. */
    public VkGeometryNV geometryType(@NativeType("VkGeometryTypeNV") int value) { ngeometryType(address(), value); return this; }
    /** Copies the specified {@link VkGeometryDataNV} to the {@code geometry} field. */
    public VkGeometryNV geometry(VkGeometryDataNV value) { ngeometry(address(), value); return this; }
    /** Passes the {@code geometry} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkGeometryNV geometry(java.util.function.Consumer<VkGeometryDataNV> consumer) { consumer.accept(geometry()); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkGeometryNV flags(@NativeType("VkGeometryFlagsNV") int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkGeometryNV set(
        int sType,
        long pNext,
        int geometryType,
        VkGeometryDataNV geometry,
        int flags
    ) {
        sType(sType);
        pNext(pNext);
        geometryType(geometryType);
        geometry(geometry);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkGeometryNV set(VkGeometryNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkGeometryNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkGeometryNV malloc() {
        return wrap(VkGeometryNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkGeometryNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkGeometryNV calloc() {
        return wrap(VkGeometryNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkGeometryNV} instance allocated with {@link BufferUtils}. */
    public static VkGeometryNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkGeometryNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkGeometryNV} instance for the specified memory address. */
    public static VkGeometryNV create(long address) {
        return wrap(VkGeometryNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkGeometryNV createSafe(long address) {
        return address == NULL ? null : wrap(VkGeometryNV.class, address);
    }

    /**
     * Returns a new {@link VkGeometryNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkGeometryNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeometryNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkGeometryNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkGeometryNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkGeometryNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkGeometryNV} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkGeometryNV mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkGeometryNV} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkGeometryNV callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkGeometryNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeometryNV mallocStack(MemoryStack stack) {
        return wrap(VkGeometryNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkGeometryNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeometryNV callocStack(MemoryStack stack) {
        return wrap(VkGeometryNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkGeometryNV.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryNV.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkGeometryNV.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryNV.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkGeometryNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeometryNV.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeometryNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeometryNV.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkGeometryNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkGeometryNV.PNEXT); }
    /** Unsafe version of {@link #geometryType}. */
    public static int ngeometryType(long struct) { return UNSAFE.getInt(null, struct + VkGeometryNV.GEOMETRYTYPE); }
    /** Unsafe version of {@link #geometry}. */
    public static VkGeometryDataNV ngeometry(long struct) { return VkGeometryDataNV.create(struct + VkGeometryNV.GEOMETRY); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkGeometryNV.FLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkGeometryNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkGeometryNV.PNEXT, value); }
    /** Unsafe version of {@link #geometryType(int) geometryType}. */
    public static void ngeometryType(long struct, int value) { UNSAFE.putInt(null, struct + VkGeometryNV.GEOMETRYTYPE, value); }
    /** Unsafe version of {@link #geometry(VkGeometryDataNV) geometry}. */
    public static void ngeometry(long struct, VkGeometryDataNV value) { memCopy(value.address(), struct + VkGeometryNV.GEOMETRY, VkGeometryDataNV.SIZEOF); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkGeometryNV.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkGeometryNV} structs. */
    public static class Buffer extends StructBuffer<VkGeometryNV, Buffer> implements NativeResource {

        private static final VkGeometryNV ELEMENT_FACTORY = VkGeometryNV.create(-1L);

        /**
         * Creates a new {@code VkGeometryNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkGeometryNV#SIZEOF}, and its mark will be undefined.
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
        protected VkGeometryNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkGeometryNV.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkGeometryNV.npNext(address()); }
        /** Returns the value of the {@code geometryType} field. */
        @NativeType("VkGeometryTypeNV")
        public int geometryType() { return VkGeometryNV.ngeometryType(address()); }
        /** Returns a {@link VkGeometryDataNV} view of the {@code geometry} field. */
        public VkGeometryDataNV geometry() { return VkGeometryNV.ngeometry(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkGeometryFlagsNV")
        public int flags() { return VkGeometryNV.nflags(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkGeometryNV.Buffer sType(@NativeType("VkStructureType") int value) { VkGeometryNV.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkGeometryNV.Buffer pNext(@NativeType("void const *") long value) { VkGeometryNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code geometryType} field. */
        public VkGeometryNV.Buffer geometryType(@NativeType("VkGeometryTypeNV") int value) { VkGeometryNV.ngeometryType(address(), value); return this; }
        /** Copies the specified {@link VkGeometryDataNV} to the {@code geometry} field. */
        public VkGeometryNV.Buffer geometry(VkGeometryDataNV value) { VkGeometryNV.ngeometry(address(), value); return this; }
        /** Passes the {@code geometry} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkGeometryNV.Buffer geometry(java.util.function.Consumer<VkGeometryDataNV> consumer) { consumer.accept(geometry()); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkGeometryNV.Buffer flags(@NativeType("VkGeometryFlagsNV") int value) { VkGeometryNV.nflags(address(), value); return this; }

    }

}