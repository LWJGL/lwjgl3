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
 * Structure defining the intended configuration of a display plane.
 * 
 * <h5>Description</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>This parameter also implicitly specifies a display.</p>
 * </div>
 * 
 * <ul>
 * <li>{@code planeIndex} is the plane which the application intends to use with the display.</li>
 * </ul>
 * 
 * <p>The members of {@link VkDisplayPlaneInfo2KHR} correspond to the arguments to {@link KHRDisplay#vkGetDisplayPlaneCapabilitiesKHR GetDisplayPlaneCapabilitiesKHR}, with {@code sType} and {@code pNext} added for extensibility.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRGetDisplayProperties2#VK_STRUCTURE_TYPE_DISPLAY_PLANE_INFO_2_KHR STRUCTURE_TYPE_DISPLAY_PLANE_INFO_2_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code mode} <b>must</b> be a valid {@code VkDisplayModeKHR} handle</li>
 * </ul>
 * 
 * <h5>Host Synchronization</h5>
 * 
 * <ul>
 * <li>Host access to {@code mode} <b>must</b> be externally synchronized</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRGetDisplayProperties2#vkGetDisplayPlaneCapabilities2KHR GetDisplayPlaneCapabilities2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDisplayPlaneInfo2KHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkDisplayModeKHR {@link #mode};
 *     uint32_t planeIndex;
 * }</code></pre>
 */
public class VkDisplayPlaneInfo2KHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MODE,
        PLANEINDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MODE = layout.offsetof(2);
        PLANEINDEX = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkDisplayPlaneInfo2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDisplayPlaneInfo2KHR(ByteBuffer container) {
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
    /** the display mode the application intends to program when using the specified plane. */
    @NativeType("VkDisplayModeKHR")
    public long mode() { return nmode(address()); }
    /** @return the value of the {@code planeIndex} field. */
    @NativeType("uint32_t")
    public int planeIndex() { return nplaneIndex(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDisplayPlaneInfo2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRGetDisplayProperties2#VK_STRUCTURE_TYPE_DISPLAY_PLANE_INFO_2_KHR STRUCTURE_TYPE_DISPLAY_PLANE_INFO_2_KHR} value to the {@link #sType} field. */
    public VkDisplayPlaneInfo2KHR sType$Default() { return sType(KHRGetDisplayProperties2.VK_STRUCTURE_TYPE_DISPLAY_PLANE_INFO_2_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDisplayPlaneInfo2KHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #mode} field. */
    public VkDisplayPlaneInfo2KHR mode(@NativeType("VkDisplayModeKHR") long value) { nmode(address(), value); return this; }
    /** Sets the specified value to the {@code planeIndex} field. */
    public VkDisplayPlaneInfo2KHR planeIndex(@NativeType("uint32_t") int value) { nplaneIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDisplayPlaneInfo2KHR set(
        int sType,
        long pNext,
        long mode,
        int planeIndex
    ) {
        sType(sType);
        pNext(pNext);
        mode(mode);
        planeIndex(planeIndex);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDisplayPlaneInfo2KHR set(VkDisplayPlaneInfo2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDisplayPlaneInfo2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDisplayPlaneInfo2KHR malloc() {
        return wrap(VkDisplayPlaneInfo2KHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDisplayPlaneInfo2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDisplayPlaneInfo2KHR calloc() {
        return wrap(VkDisplayPlaneInfo2KHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDisplayPlaneInfo2KHR} instance allocated with {@link BufferUtils}. */
    public static VkDisplayPlaneInfo2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDisplayPlaneInfo2KHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDisplayPlaneInfo2KHR} instance for the specified memory address. */
    public static VkDisplayPlaneInfo2KHR create(long address) {
        return wrap(VkDisplayPlaneInfo2KHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDisplayPlaneInfo2KHR createSafe(long address) {
        return address == NULL ? null : wrap(VkDisplayPlaneInfo2KHR.class, address);
    }

    /**
     * Returns a new {@link VkDisplayPlaneInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPlaneInfo2KHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDisplayPlaneInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPlaneInfo2KHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayPlaneInfo2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPlaneInfo2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDisplayPlaneInfo2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDisplayPlaneInfo2KHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDisplayPlaneInfo2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayPlaneInfo2KHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayPlaneInfo2KHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayPlaneInfo2KHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayPlaneInfo2KHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayPlaneInfo2KHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayPlaneInfo2KHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayPlaneInfo2KHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayPlaneInfo2KHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDisplayPlaneInfo2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayPlaneInfo2KHR malloc(MemoryStack stack) {
        return wrap(VkDisplayPlaneInfo2KHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDisplayPlaneInfo2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayPlaneInfo2KHR calloc(MemoryStack stack) {
        return wrap(VkDisplayPlaneInfo2KHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDisplayPlaneInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayPlaneInfo2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayPlaneInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayPlaneInfo2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDisplayPlaneInfo2KHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDisplayPlaneInfo2KHR.PNEXT); }
    /** Unsafe version of {@link #mode}. */
    public static long nmode(long struct) { return UNSAFE.getLong(null, struct + VkDisplayPlaneInfo2KHR.MODE); }
    /** Unsafe version of {@link #planeIndex}. */
    public static int nplaneIndex(long struct) { return UNSAFE.getInt(null, struct + VkDisplayPlaneInfo2KHR.PLANEINDEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDisplayPlaneInfo2KHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDisplayPlaneInfo2KHR.PNEXT, value); }
    /** Unsafe version of {@link #mode(long) mode}. */
    public static void nmode(long struct, long value) { UNSAFE.putLong(null, struct + VkDisplayPlaneInfo2KHR.MODE, value); }
    /** Unsafe version of {@link #planeIndex(int) planeIndex}. */
    public static void nplaneIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkDisplayPlaneInfo2KHR.PLANEINDEX, value); }

    // -----------------------------------

    /** An array of {@link VkDisplayPlaneInfo2KHR} structs. */
    public static class Buffer extends StructBuffer<VkDisplayPlaneInfo2KHR, Buffer> implements NativeResource {

        private static final VkDisplayPlaneInfo2KHR ELEMENT_FACTORY = VkDisplayPlaneInfo2KHR.create(-1L);

        /**
         * Creates a new {@code VkDisplayPlaneInfo2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDisplayPlaneInfo2KHR#SIZEOF}, and its mark will be undefined.
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
        protected VkDisplayPlaneInfo2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDisplayPlaneInfo2KHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDisplayPlaneInfo2KHR.nsType(address()); }
        /** @return the value of the {@link VkDisplayPlaneInfo2KHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDisplayPlaneInfo2KHR.npNext(address()); }
        /** @return the value of the {@link VkDisplayPlaneInfo2KHR#mode} field. */
        @NativeType("VkDisplayModeKHR")
        public long mode() { return VkDisplayPlaneInfo2KHR.nmode(address()); }
        /** @return the value of the {@code planeIndex} field. */
        @NativeType("uint32_t")
        public int planeIndex() { return VkDisplayPlaneInfo2KHR.nplaneIndex(address()); }

        /** Sets the specified value to the {@link VkDisplayPlaneInfo2KHR#sType} field. */
        public VkDisplayPlaneInfo2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDisplayPlaneInfo2KHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRGetDisplayProperties2#VK_STRUCTURE_TYPE_DISPLAY_PLANE_INFO_2_KHR STRUCTURE_TYPE_DISPLAY_PLANE_INFO_2_KHR} value to the {@link VkDisplayPlaneInfo2KHR#sType} field. */
        public VkDisplayPlaneInfo2KHR.Buffer sType$Default() { return sType(KHRGetDisplayProperties2.VK_STRUCTURE_TYPE_DISPLAY_PLANE_INFO_2_KHR); }
        /** Sets the specified value to the {@link VkDisplayPlaneInfo2KHR#pNext} field. */
        public VkDisplayPlaneInfo2KHR.Buffer pNext(@NativeType("void const *") long value) { VkDisplayPlaneInfo2KHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkDisplayPlaneInfo2KHR#mode} field. */
        public VkDisplayPlaneInfo2KHR.Buffer mode(@NativeType("VkDisplayModeKHR") long value) { VkDisplayPlaneInfo2KHR.nmode(address(), value); return this; }
        /** Sets the specified value to the {@code planeIndex} field. */
        public VkDisplayPlaneInfo2KHR.Buffer planeIndex(@NativeType("uint32_t") int value) { VkDisplayPlaneInfo2KHR.nplaneIndex(address(), value); return this; }

    }

}