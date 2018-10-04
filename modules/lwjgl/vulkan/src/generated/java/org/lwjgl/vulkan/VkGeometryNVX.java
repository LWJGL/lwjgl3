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
 * <h5>Description</h5>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVXRaytracing#VK_STRUCTURE_TYPE_GEOMETRY_NVX STRUCTURE_TYPE_GEOMETRY_NVX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code geometryType} <b>must</b> be a valid {@code VkGeometryTypeNVX} value</li>
 * <li>{@code geometry} <b>must</b> be a valid {@link VkGeometryDataNVX} structure</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkGeometryFlagBitsNVX} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAccelerationStructureCreateInfoNVX}, {@link VkGeometryDataNVX}, {@link NVXRaytracing#vkCmdBuildAccelerationStructureNVX CmdBuildAccelerationStructureNVX}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code geometryType} &ndash; describes which type of geometry this VkGeometryNVX refers to.</li>
 * <li>{@code geometry} &ndash; contains the geometry data.</li>
 * <li>{@code flags} &ndash; has flags describing options for this geometry.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkGeometryNVX {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkGeometryTypeNVX geometryType;
 *     {@link VkGeometryDataNVX VkGeometryDataNVX} geometry;
 *     VkGeometryFlagsNVX flags;
 * }</code></pre>
 */
public class VkGeometryNVX extends Struct implements NativeResource {

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
            __member(VkGeometryDataNVX.SIZEOF, VkGeometryDataNVX.ALIGNOF),
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
     * Creates a {@link VkGeometryNVX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkGeometryNVX(ByteBuffer container) {
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
    @NativeType("VkGeometryTypeNVX")
    public int geometryType() { return ngeometryType(address()); }
    /** Returns a {@link VkGeometryDataNVX} view of the {@code geometry} field. */
    public VkGeometryDataNVX geometry() { return ngeometry(address()); }
    /** Passes the {@code geometry} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkGeometryNVX geometry(java.util.function.Consumer<VkGeometryDataNVX> consumer) { consumer.accept(geometry()); return this; }
    /** Returns the value of the {@code flags} field. */
    @NativeType("VkGeometryFlagsNVX")
    public int flags() { return nflags(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkGeometryNVX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkGeometryNVX pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code geometryType} field. */
    public VkGeometryNVX geometryType(@NativeType("VkGeometryTypeNVX") int value) { ngeometryType(address(), value); return this; }
    /** Copies the specified {@link VkGeometryDataNVX} to the {@code geometry} field. */
    public VkGeometryNVX geometry(VkGeometryDataNVX value) { ngeometry(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkGeometryNVX flags(@NativeType("VkGeometryFlagsNVX") int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkGeometryNVX set(
        int sType,
        long pNext,
        int geometryType,
        VkGeometryDataNVX geometry,
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
    public VkGeometryNVX set(VkGeometryNVX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkGeometryNVX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkGeometryNVX malloc() {
        return wrap(VkGeometryNVX.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkGeometryNVX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkGeometryNVX calloc() {
        return wrap(VkGeometryNVX.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkGeometryNVX} instance allocated with {@link BufferUtils}. */
    public static VkGeometryNVX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkGeometryNVX.class, memAddress(container), container);
    }

    /** Returns a new {@link VkGeometryNVX} instance for the specified memory address. */
    public static VkGeometryNVX create(long address) {
        return wrap(VkGeometryNVX.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkGeometryNVX createSafe(long address) {
        return address == NULL ? null : wrap(VkGeometryNVX.class, address);
    }

    /**
     * Returns a new {@link VkGeometryNVX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryNVX.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkGeometryNVX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryNVX.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeometryNVX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryNVX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkGeometryNVX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkGeometryNVX.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkGeometryNVX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkGeometryNVX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkGeometryNVX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkGeometryNVX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkGeometryNVX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkGeometryNVX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeometryNVX mallocStack(MemoryStack stack) {
        return wrap(VkGeometryNVX.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkGeometryNVX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeometryNVX callocStack(MemoryStack stack) {
        return wrap(VkGeometryNVX.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkGeometryNVX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryNVX.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkGeometryNVX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryNVX.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkGeometryNVX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeometryNVX.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeometryNVX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeometryNVX.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkGeometryNVX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkGeometryNVX.PNEXT); }
    /** Unsafe version of {@link #geometryType}. */
    public static int ngeometryType(long struct) { return UNSAFE.getInt(null, struct + VkGeometryNVX.GEOMETRYTYPE); }
    /** Unsafe version of {@link #geometry}. */
    public static VkGeometryDataNVX ngeometry(long struct) { return VkGeometryDataNVX.create(struct + VkGeometryNVX.GEOMETRY); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkGeometryNVX.FLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkGeometryNVX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkGeometryNVX.PNEXT, value); }
    /** Unsafe version of {@link #geometryType(int) geometryType}. */
    public static void ngeometryType(long struct, int value) { UNSAFE.putInt(null, struct + VkGeometryNVX.GEOMETRYTYPE, value); }
    /** Unsafe version of {@link #geometry(VkGeometryDataNVX) geometry}. */
    public static void ngeometry(long struct, VkGeometryDataNVX value) { memCopy(value.address(), struct + VkGeometryNVX.GEOMETRY, VkGeometryDataNVX.SIZEOF); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkGeometryNVX.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkGeometryNVX} structs. */
    public static class Buffer extends StructBuffer<VkGeometryNVX, Buffer> implements NativeResource {

        private static final VkGeometryNVX ELEMENT_FACTORY = VkGeometryNVX.create(-1L);

        /**
         * Creates a new {@link VkGeometryNVX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkGeometryNVX#SIZEOF}, and its mark will be undefined.
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
        protected VkGeometryNVX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkGeometryNVX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkGeometryNVX.npNext(address()); }
        /** Returns the value of the {@code geometryType} field. */
        @NativeType("VkGeometryTypeNVX")
        public int geometryType() { return VkGeometryNVX.ngeometryType(address()); }
        /** Returns a {@link VkGeometryDataNVX} view of the {@code geometry} field. */
        public VkGeometryDataNVX geometry() { return VkGeometryNVX.ngeometry(address()); }
        /** Passes the {@code geometry} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkGeometryNVX.Buffer geometry(java.util.function.Consumer<VkGeometryDataNVX> consumer) { consumer.accept(geometry()); return this; }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkGeometryFlagsNVX")
        public int flags() { return VkGeometryNVX.nflags(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkGeometryNVX.Buffer sType(@NativeType("VkStructureType") int value) { VkGeometryNVX.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkGeometryNVX.Buffer pNext(@NativeType("void const *") long value) { VkGeometryNVX.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code geometryType} field. */
        public VkGeometryNVX.Buffer geometryType(@NativeType("VkGeometryTypeNVX") int value) { VkGeometryNVX.ngeometryType(address(), value); return this; }
        /** Copies the specified {@link VkGeometryDataNVX} to the {@code geometry} field. */
        public VkGeometryNVX.Buffer geometry(VkGeometryDataNVX value) { VkGeometryNVX.ngeometry(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkGeometryNVX.Buffer flags(@NativeType("VkGeometryFlagsNVX") int value) { VkGeometryNVX.nflags(address(), value); return this; }

    }

}