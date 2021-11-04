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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.system.windows.*;

/**
 * Structure specifying additional creation parameters specific to Win32 fullscreen exclusive mode.
 * 
 * <h5>Description</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>If {@code hmonitor} is invalidated (e.g. the monitor is unplugged) during the lifetime of a swapchain created with this structure, operations on that swapchain will return {@link KHRSwapchain#VK_ERROR_OUT_OF_DATE_KHR ERROR_OUT_OF_DATE_KHR}.</p>
 * </div>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>It is the responsibility of the application to change the display settings of the targeted Win32 display using the appropriate platform APIs. Such changes <b>may</b> alter the surface capabilities reported for the created surface.</p>
 * </div>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code hmonitor} <b>must</b> be a valid {@code HMONITOR}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTFullScreenExclusive#VK_STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_WIN32_INFO_EXT STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_WIN32_INFO_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSurfaceFullScreenExclusiveWin32InfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     HMONITOR {@link #hmonitor};
 * }</code></pre>
 */
public class VkSurfaceFullScreenExclusiveWin32InfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        HMONITOR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        HMONITOR = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkSurfaceFullScreenExclusiveWin32InfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSurfaceFullScreenExclusiveWin32InfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the Win32 {@code HMONITOR} handle identifying the display to create the surface with. */
    @NativeType("HMONITOR")
    public long hmonitor() { return nhmonitor(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSurfaceFullScreenExclusiveWin32InfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTFullScreenExclusive#VK_STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_WIN32_INFO_EXT STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_WIN32_INFO_EXT} value to the {@link #sType} field. */
    public VkSurfaceFullScreenExclusiveWin32InfoEXT sType$Default() { return sType(EXTFullScreenExclusive.VK_STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_WIN32_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSurfaceFullScreenExclusiveWin32InfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #hmonitor} field. */
    public VkSurfaceFullScreenExclusiveWin32InfoEXT hmonitor(@NativeType("HMONITOR") long value) { nhmonitor(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSurfaceFullScreenExclusiveWin32InfoEXT set(
        int sType,
        long pNext,
        long hmonitor
    ) {
        sType(sType);
        pNext(pNext);
        hmonitor(hmonitor);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSurfaceFullScreenExclusiveWin32InfoEXT set(VkSurfaceFullScreenExclusiveWin32InfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSurfaceFullScreenExclusiveWin32InfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSurfaceFullScreenExclusiveWin32InfoEXT malloc() {
        return wrap(VkSurfaceFullScreenExclusiveWin32InfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSurfaceFullScreenExclusiveWin32InfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSurfaceFullScreenExclusiveWin32InfoEXT calloc() {
        return wrap(VkSurfaceFullScreenExclusiveWin32InfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSurfaceFullScreenExclusiveWin32InfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkSurfaceFullScreenExclusiveWin32InfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSurfaceFullScreenExclusiveWin32InfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSurfaceFullScreenExclusiveWin32InfoEXT} instance for the specified memory address. */
    public static VkSurfaceFullScreenExclusiveWin32InfoEXT create(long address) {
        return wrap(VkSurfaceFullScreenExclusiveWin32InfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSurfaceFullScreenExclusiveWin32InfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkSurfaceFullScreenExclusiveWin32InfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkSurfaceFullScreenExclusiveWin32InfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceFullScreenExclusiveWin32InfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceFullScreenExclusiveWin32InfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceFullScreenExclusiveWin32InfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceFullScreenExclusiveWin32InfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceFullScreenExclusiveWin32InfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSurfaceFullScreenExclusiveWin32InfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSurfaceFullScreenExclusiveWin32InfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSurfaceFullScreenExclusiveWin32InfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSurfaceFullScreenExclusiveWin32InfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSurfaceFullScreenExclusiveWin32InfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSurfaceFullScreenExclusiveWin32InfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSurfaceFullScreenExclusiveWin32InfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSurfaceFullScreenExclusiveWin32InfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSurfaceFullScreenExclusiveWin32InfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSurfaceFullScreenExclusiveWin32InfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSurfaceFullScreenExclusiveWin32InfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSurfaceFullScreenExclusiveWin32InfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfaceFullScreenExclusiveWin32InfoEXT malloc(MemoryStack stack) {
        return wrap(VkSurfaceFullScreenExclusiveWin32InfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSurfaceFullScreenExclusiveWin32InfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfaceFullScreenExclusiveWin32InfoEXT calloc(MemoryStack stack) {
        return wrap(VkSurfaceFullScreenExclusiveWin32InfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSurfaceFullScreenExclusiveWin32InfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfaceFullScreenExclusiveWin32InfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceFullScreenExclusiveWin32InfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfaceFullScreenExclusiveWin32InfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSurfaceFullScreenExclusiveWin32InfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSurfaceFullScreenExclusiveWin32InfoEXT.PNEXT); }
    /** Unsafe version of {@link #hmonitor}. */
    public static long nhmonitor(long struct) { return memGetAddress(struct + VkSurfaceFullScreenExclusiveWin32InfoEXT.HMONITOR); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSurfaceFullScreenExclusiveWin32InfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSurfaceFullScreenExclusiveWin32InfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #hmonitor(long) hmonitor}. */
    public static void nhmonitor(long struct, long value) { memPutAddress(struct + VkSurfaceFullScreenExclusiveWin32InfoEXT.HMONITOR, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkSurfaceFullScreenExclusiveWin32InfoEXT.HMONITOR));
    }

    // -----------------------------------

    /** An array of {@link VkSurfaceFullScreenExclusiveWin32InfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkSurfaceFullScreenExclusiveWin32InfoEXT, Buffer> implements NativeResource {

        private static final VkSurfaceFullScreenExclusiveWin32InfoEXT ELEMENT_FACTORY = VkSurfaceFullScreenExclusiveWin32InfoEXT.create(-1L);

        /**
         * Creates a new {@code VkSurfaceFullScreenExclusiveWin32InfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSurfaceFullScreenExclusiveWin32InfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkSurfaceFullScreenExclusiveWin32InfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSurfaceFullScreenExclusiveWin32InfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSurfaceFullScreenExclusiveWin32InfoEXT.nsType(address()); }
        /** @return the value of the {@link VkSurfaceFullScreenExclusiveWin32InfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSurfaceFullScreenExclusiveWin32InfoEXT.npNext(address()); }
        /** @return the value of the {@link VkSurfaceFullScreenExclusiveWin32InfoEXT#hmonitor} field. */
        @NativeType("HMONITOR")
        public long hmonitor() { return VkSurfaceFullScreenExclusiveWin32InfoEXT.nhmonitor(address()); }

        /** Sets the specified value to the {@link VkSurfaceFullScreenExclusiveWin32InfoEXT#sType} field. */
        public VkSurfaceFullScreenExclusiveWin32InfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkSurfaceFullScreenExclusiveWin32InfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTFullScreenExclusive#VK_STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_WIN32_INFO_EXT STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_WIN32_INFO_EXT} value to the {@link VkSurfaceFullScreenExclusiveWin32InfoEXT#sType} field. */
        public VkSurfaceFullScreenExclusiveWin32InfoEXT.Buffer sType$Default() { return sType(EXTFullScreenExclusive.VK_STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_WIN32_INFO_EXT); }
        /** Sets the specified value to the {@link VkSurfaceFullScreenExclusiveWin32InfoEXT#pNext} field. */
        public VkSurfaceFullScreenExclusiveWin32InfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkSurfaceFullScreenExclusiveWin32InfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkSurfaceFullScreenExclusiveWin32InfoEXT#hmonitor} field. */
        public VkSurfaceFullScreenExclusiveWin32InfoEXT.Buffer hmonitor(@NativeType("HMONITOR") long value) { VkSurfaceFullScreenExclusiveWin32InfoEXT.nhmonitor(address(), value); return this; }

    }

}