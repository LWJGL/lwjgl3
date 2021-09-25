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
 * Structure describing full screen exclusive capabilities of a surface.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure <b>can</b> be included in the {@code pNext} chain of {@link VkSurfaceCapabilities2KHR} to determine support for exclusive full-screen access. If {@code fullScreenExclusiveSupported} is {@link VK10#VK_FALSE FALSE}, it indicates that exclusive full-screen access is not obtainable for this surface.</p>
 * 
 * <p>Applications <b>must</b> not attempt to create swapchains with {@link EXTFullScreenExclusive#VK_FULL_SCREEN_EXCLUSIVE_APPLICATION_CONTROLLED_EXT FULL_SCREEN_EXCLUSIVE_APPLICATION_CONTROLLED_EXT} set if {@code fullScreenExclusiveSupported} is {@link VK10#VK_FALSE FALSE}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTFullScreenExclusive#VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_FULL_SCREEN_EXCLUSIVE_EXT STRUCTURE_TYPE_SURFACE_CAPABILITIES_FULL_SCREEN_EXCLUSIVE_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSurfaceCapabilitiesFullScreenExclusiveEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 fullScreenExclusiveSupported;
 * }</code></pre>
 */
public class VkSurfaceCapabilitiesFullScreenExclusiveEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FULLSCREENEXCLUSIVESUPPORTED;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FULLSCREENEXCLUSIVESUPPORTED = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkSurfaceCapabilitiesFullScreenExclusiveEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSurfaceCapabilitiesFullScreenExclusiveEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code fullScreenExclusiveSupported} field. */
    @NativeType("VkBool32")
    public boolean fullScreenExclusiveSupported() { return nfullScreenExclusiveSupported(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSurfaceCapabilitiesFullScreenExclusiveEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTFullScreenExclusive#VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_FULL_SCREEN_EXCLUSIVE_EXT STRUCTURE_TYPE_SURFACE_CAPABILITIES_FULL_SCREEN_EXCLUSIVE_EXT} value to the {@link #sType} field. */
    public VkSurfaceCapabilitiesFullScreenExclusiveEXT sType$Default() { return sType(EXTFullScreenExclusive.VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_FULL_SCREEN_EXCLUSIVE_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSurfaceCapabilitiesFullScreenExclusiveEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code fullScreenExclusiveSupported} field. */
    public VkSurfaceCapabilitiesFullScreenExclusiveEXT fullScreenExclusiveSupported(@NativeType("VkBool32") boolean value) { nfullScreenExclusiveSupported(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkSurfaceCapabilitiesFullScreenExclusiveEXT set(
        int sType,
        long pNext,
        boolean fullScreenExclusiveSupported
    ) {
        sType(sType);
        pNext(pNext);
        fullScreenExclusiveSupported(fullScreenExclusiveSupported);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSurfaceCapabilitiesFullScreenExclusiveEXT set(VkSurfaceCapabilitiesFullScreenExclusiveEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSurfaceCapabilitiesFullScreenExclusiveEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSurfaceCapabilitiesFullScreenExclusiveEXT malloc() {
        return wrap(VkSurfaceCapabilitiesFullScreenExclusiveEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSurfaceCapabilitiesFullScreenExclusiveEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSurfaceCapabilitiesFullScreenExclusiveEXT calloc() {
        return wrap(VkSurfaceCapabilitiesFullScreenExclusiveEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSurfaceCapabilitiesFullScreenExclusiveEXT} instance allocated with {@link BufferUtils}. */
    public static VkSurfaceCapabilitiesFullScreenExclusiveEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSurfaceCapabilitiesFullScreenExclusiveEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSurfaceCapabilitiesFullScreenExclusiveEXT} instance for the specified memory address. */
    public static VkSurfaceCapabilitiesFullScreenExclusiveEXT create(long address) {
        return wrap(VkSurfaceCapabilitiesFullScreenExclusiveEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSurfaceCapabilitiesFullScreenExclusiveEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkSurfaceCapabilitiesFullScreenExclusiveEXT.class, address);
    }

    /**
     * Returns a new {@link VkSurfaceCapabilitiesFullScreenExclusiveEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilitiesFullScreenExclusiveEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceCapabilitiesFullScreenExclusiveEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilitiesFullScreenExclusiveEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceCapabilitiesFullScreenExclusiveEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilitiesFullScreenExclusiveEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSurfaceCapabilitiesFullScreenExclusiveEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilitiesFullScreenExclusiveEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSurfaceCapabilitiesFullScreenExclusiveEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSurfaceCapabilitiesFullScreenExclusiveEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSurfaceCapabilitiesFullScreenExclusiveEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSurfaceCapabilitiesFullScreenExclusiveEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSurfaceCapabilitiesFullScreenExclusiveEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSurfaceCapabilitiesFullScreenExclusiveEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSurfaceCapabilitiesFullScreenExclusiveEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSurfaceCapabilitiesFullScreenExclusiveEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSurfaceCapabilitiesFullScreenExclusiveEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSurfaceCapabilitiesFullScreenExclusiveEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfaceCapabilitiesFullScreenExclusiveEXT malloc(MemoryStack stack) {
        return wrap(VkSurfaceCapabilitiesFullScreenExclusiveEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSurfaceCapabilitiesFullScreenExclusiveEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfaceCapabilitiesFullScreenExclusiveEXT calloc(MemoryStack stack) {
        return wrap(VkSurfaceCapabilitiesFullScreenExclusiveEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSurfaceCapabilitiesFullScreenExclusiveEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilitiesFullScreenExclusiveEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceCapabilitiesFullScreenExclusiveEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilitiesFullScreenExclusiveEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSurfaceCapabilitiesFullScreenExclusiveEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSurfaceCapabilitiesFullScreenExclusiveEXT.PNEXT); }
    /** Unsafe version of {@link #fullScreenExclusiveSupported}. */
    public static int nfullScreenExclusiveSupported(long struct) { return UNSAFE.getInt(null, struct + VkSurfaceCapabilitiesFullScreenExclusiveEXT.FULLSCREENEXCLUSIVESUPPORTED); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSurfaceCapabilitiesFullScreenExclusiveEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSurfaceCapabilitiesFullScreenExclusiveEXT.PNEXT, value); }
    /** Unsafe version of {@link #fullScreenExclusiveSupported(boolean) fullScreenExclusiveSupported}. */
    public static void nfullScreenExclusiveSupported(long struct, int value) { UNSAFE.putInt(null, struct + VkSurfaceCapabilitiesFullScreenExclusiveEXT.FULLSCREENEXCLUSIVESUPPORTED, value); }

    // -----------------------------------

    /** An array of {@link VkSurfaceCapabilitiesFullScreenExclusiveEXT} structs. */
    public static class Buffer extends StructBuffer<VkSurfaceCapabilitiesFullScreenExclusiveEXT, Buffer> implements NativeResource {

        private static final VkSurfaceCapabilitiesFullScreenExclusiveEXT ELEMENT_FACTORY = VkSurfaceCapabilitiesFullScreenExclusiveEXT.create(-1L);

        /**
         * Creates a new {@code VkSurfaceCapabilitiesFullScreenExclusiveEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSurfaceCapabilitiesFullScreenExclusiveEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkSurfaceCapabilitiesFullScreenExclusiveEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSurfaceCapabilitiesFullScreenExclusiveEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSurfaceCapabilitiesFullScreenExclusiveEXT.nsType(address()); }
        /** @return the value of the {@link VkSurfaceCapabilitiesFullScreenExclusiveEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkSurfaceCapabilitiesFullScreenExclusiveEXT.npNext(address()); }
        /** @return the value of the {@code fullScreenExclusiveSupported} field. */
        @NativeType("VkBool32")
        public boolean fullScreenExclusiveSupported() { return VkSurfaceCapabilitiesFullScreenExclusiveEXT.nfullScreenExclusiveSupported(address()) != 0; }

        /** Sets the specified value to the {@link VkSurfaceCapabilitiesFullScreenExclusiveEXT#sType} field. */
        public VkSurfaceCapabilitiesFullScreenExclusiveEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkSurfaceCapabilitiesFullScreenExclusiveEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTFullScreenExclusive#VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_FULL_SCREEN_EXCLUSIVE_EXT STRUCTURE_TYPE_SURFACE_CAPABILITIES_FULL_SCREEN_EXCLUSIVE_EXT} value to the {@link VkSurfaceCapabilitiesFullScreenExclusiveEXT#sType} field. */
        public VkSurfaceCapabilitiesFullScreenExclusiveEXT.Buffer sType$Default() { return sType(EXTFullScreenExclusive.VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_FULL_SCREEN_EXCLUSIVE_EXT); }
        /** Sets the specified value to the {@link VkSurfaceCapabilitiesFullScreenExclusiveEXT#pNext} field. */
        public VkSurfaceCapabilitiesFullScreenExclusiveEXT.Buffer pNext(@NativeType("void *") long value) { VkSurfaceCapabilitiesFullScreenExclusiveEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code fullScreenExclusiveSupported} field. */
        public VkSurfaceCapabilitiesFullScreenExclusiveEXT.Buffer fullScreenExclusiveSupported(@NativeType("VkBool32") boolean value) { VkSurfaceCapabilitiesFullScreenExclusiveEXT.nfullScreenExclusiveSupported(address(), value ? 1 : 0); return this; }

    }

}