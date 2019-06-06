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
 * Structure describing fragment density map properties that can be supported by an implementation.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTFragmentDensityMap#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_PROPERTIES_EXT}</li>
 * </ul>
 * 
 * <p>If the {@link VkPhysicalDeviceFragmentDensityMapPropertiesEXT} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceProperties2KHR}, it is filled with the implementation-dependent limits and properties.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent2D}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code minFragmentDensityTexelSize} &ndash; the minimum <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#glossary-fragment-density-texel-size">fragment density texel size</a>.</li>
 * <li>{@code maxFragmentDensityTexelSize} &ndash; the maximum fragment density texel size.</li>
 * <li>{@code fragmentDensityInvocations} &ndash; specifies whether the implementation <b>may</b> invoke additional fragment shader invocations for each covered sample.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceFragmentDensityMapPropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     {@link VkExtent2D VkExtent2D} minFragmentDensityTexelSize;
 *     {@link VkExtent2D VkExtent2D} maxFragmentDensityTexelSize;
 *     VkBool32 fragmentDensityInvocations;
 * }</code></pre>
 */
public class VkPhysicalDeviceFragmentDensityMapPropertiesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MINFRAGMENTDENSITYTEXELSIZE,
        MAXFRAGMENTDENSITYTEXELSIZE,
        FRAGMENTDENSITYINVOCATIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MINFRAGMENTDENSITYTEXELSIZE = layout.offsetof(2);
        MAXFRAGMENTDENSITYTEXELSIZE = layout.offsetof(3);
        FRAGMENTDENSITYINVOCATIONS = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkPhysicalDeviceFragmentDensityMapPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns a {@link VkExtent2D} view of the {@code minFragmentDensityTexelSize} field. */
    public VkExtent2D minFragmentDensityTexelSize() { return nminFragmentDensityTexelSize(address()); }
    /** Returns a {@link VkExtent2D} view of the {@code maxFragmentDensityTexelSize} field. */
    public VkExtent2D maxFragmentDensityTexelSize() { return nmaxFragmentDensityTexelSize(address()); }
    /** Returns the value of the {@code fragmentDensityInvocations} field. */
    @NativeType("VkBool32")
    public boolean fragmentDensityInvocations() { return nfragmentDensityInvocations(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT set(VkPhysicalDeviceFragmentDensityMapPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMapPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT malloc() {
        return wrap(VkPhysicalDeviceFragmentDensityMapPropertiesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMapPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT calloc() {
        return wrap(VkPhysicalDeviceFragmentDensityMapPropertiesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMapPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceFragmentDensityMapPropertiesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMapPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT create(long address) {
        return wrap(VkPhysicalDeviceFragmentDensityMapPropertiesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceFragmentDensityMapPropertiesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMapPropertiesEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMapPropertiesEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentDensityMapPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFragmentDensityMapPropertiesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentDensityMapPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFragmentDensityMapPropertiesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentDensityMapPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceFragmentDensityMapPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #minFragmentDensityTexelSize}. */
    public static VkExtent2D nminFragmentDensityTexelSize(long struct) { return VkExtent2D.create(struct + VkPhysicalDeviceFragmentDensityMapPropertiesEXT.MINFRAGMENTDENSITYTEXELSIZE); }
    /** Unsafe version of {@link #maxFragmentDensityTexelSize}. */
    public static VkExtent2D nmaxFragmentDensityTexelSize(long struct) { return VkExtent2D.create(struct + VkPhysicalDeviceFragmentDensityMapPropertiesEXT.MAXFRAGMENTDENSITYTEXELSIZE); }
    /** Unsafe version of {@link #fragmentDensityInvocations}. */
    public static int nfragmentDensityInvocations(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentDensityMapPropertiesEXT.FRAGMENTDENSITYINVOCATIONS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFragmentDensityMapPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceFragmentDensityMapPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFragmentDensityMapPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFragmentDensityMapPropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceFragmentDensityMapPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceFragmentDensityMapPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFragmentDensityMapPropertiesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceFragmentDensityMapPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceFragmentDensityMapPropertiesEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceFragmentDensityMapPropertiesEXT.npNext(address()); }
        /** Returns a {@link VkExtent2D} view of the {@code minFragmentDensityTexelSize} field. */
        public VkExtent2D minFragmentDensityTexelSize() { return VkPhysicalDeviceFragmentDensityMapPropertiesEXT.nminFragmentDensityTexelSize(address()); }
        /** Returns a {@link VkExtent2D} view of the {@code maxFragmentDensityTexelSize} field. */
        public VkExtent2D maxFragmentDensityTexelSize() { return VkPhysicalDeviceFragmentDensityMapPropertiesEXT.nmaxFragmentDensityTexelSize(address()); }
        /** Returns the value of the {@code fragmentDensityInvocations} field. */
        @NativeType("VkBool32")
        public boolean fragmentDensityInvocations() { return VkPhysicalDeviceFragmentDensityMapPropertiesEXT.nfragmentDensityInvocations(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFragmentDensityMapPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceFragmentDensityMapPropertiesEXT.npNext(address(), value); return this; }

    }

}