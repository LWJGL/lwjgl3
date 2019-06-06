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
 * Structure specifying parameters of a newly created display plane surface object.
 * 
 * <h5>Description</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Creating a display surface <b>must</b> not modify the state of the displays, planes, or other resources it names. For example, it <b>must</b> not apply the specified mode to be set on the associated display. Application of display configuration occurs as a side effect of presenting to a display surface.</p>
 * </div>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code planeIndex} <b>must</b> be less than the number of display planes supported by the device as determined by calling {@code vkGetPhysicalDeviceDisplayPlanePropertiesKHR}</li>
 * <li>If the {@code planeReorderPossible} member of the {@link VkDisplayPropertiesKHR} structure returned by {@code vkGetPhysicalDeviceDisplayPropertiesKHR} for the display corresponding to {@code displayMode} is {@link VK10#VK_TRUE TRUE} then {@code planeStackIndex} <b>must</b> be less than the number of display planes supported by the device as determined by calling {@code vkGetPhysicalDeviceDisplayPlanePropertiesKHR}; otherwise {@code planeStackIndex} <b>must</b> equal the {@code currentStackIndex} member of {@link VkDisplayPlanePropertiesKHR} returned by {@code vkGetPhysicalDeviceDisplayPlanePropertiesKHR} for the display plane corresponding to {@code displayMode}</li>
 * <li>If {@code alphaMode} is {@link KHRDisplay#VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR} then {@code globalAlpha} <b>must</b> be between 0 and 1, inclusive</li>
 * <li>{@code alphaMode} <b>must</b> be 0 or one of the bits present in the {@code supportedAlpha} member of {@link VkDisplayPlaneCapabilitiesKHR} returned by {@code vkGetDisplayPlaneCapabilitiesKHR} for the display plane corresponding to {@code displayMode}</li>
 * <li>The {@code width} and {@code height} members of {@code imageExtent} <b>must</b> be less than the {@code maxImageDimensions2D} member of {@link VkPhysicalDeviceLimits}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRDisplay#VK_STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code displayMode} <b>must</b> be a valid {@code VkDisplayModeKHR} handle</li>
 * <li>{@code transform} <b>must</b> be a valid {@code VkSurfaceTransformFlagBitsKHR} value</li>
 * <li>{@code alphaMode} <b>must</b> be a valid {@code VkDisplayPlaneAlphaFlagBitsKHR} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent2D}, {@link KHRDisplay#vkCreateDisplayPlaneSurfaceKHR CreateDisplayPlaneSurfaceKHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; reserved for future use, and <b>must</b> be zero.</li>
 * <li>{@code displayMode} &ndash; a {@code VkDisplayModeKHR} handle specifying the mode to use when displaying this surface.</li>
 * <li>{@code planeIndex} &ndash; the plane on which this surface appears.</li>
 * <li>{@code planeStackIndex} &ndash; the z-order of the plane.</li>
 * <li>{@code transform} &ndash; a {@code VkSurfaceTransformFlagBitsKHR} value specifying the transformation to apply to images as part of the scanout operation.</li>
 * <li>{@code globalAlpha} &ndash; the global alpha value. This value is ignored if {@code alphaMode} is not {@link KHRDisplay#VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR}.</li>
 * <li>{@code alphaMode} &ndash; a {@code VkDisplayPlaneAlphaFlagBitsKHR} value specifying the type of alpha blending to use.</li>
 * <li>{@code imageExtent} &ndash; The size of the presentable images to use with the surface.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDisplaySurfaceCreateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDisplaySurfaceCreateFlagsKHR flags;
 *     VkDisplayModeKHR displayMode;
 *     uint32_t planeIndex;
 *     uint32_t planeStackIndex;
 *     VkSurfaceTransformFlagBitsKHR transform;
 *     float globalAlpha;
 *     VkDisplayPlaneAlphaFlagBitsKHR alphaMode;
 *     {@link VkExtent2D VkExtent2D} imageExtent;
 * }</code></pre>
 */
public class VkDisplaySurfaceCreateInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        DISPLAYMODE,
        PLANEINDEX,
        PLANESTACKINDEX,
        TRANSFORM,
        GLOBALALPHA,
        ALPHAMODE,
        IMAGEEXTENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        DISPLAYMODE = layout.offsetof(3);
        PLANEINDEX = layout.offsetof(4);
        PLANESTACKINDEX = layout.offsetof(5);
        TRANSFORM = layout.offsetof(6);
        GLOBALALPHA = layout.offsetof(7);
        ALPHAMODE = layout.offsetof(8);
        IMAGEEXTENT = layout.offsetof(9);
    }

    /**
     * Creates a {@code VkDisplaySurfaceCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDisplaySurfaceCreateInfoKHR(ByteBuffer container) {
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
    /** Returns the value of the {@code flags} field. */
    @NativeType("VkDisplaySurfaceCreateFlagsKHR")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code displayMode} field. */
    @NativeType("VkDisplayModeKHR")
    public long displayMode() { return ndisplayMode(address()); }
    /** Returns the value of the {@code planeIndex} field. */
    @NativeType("uint32_t")
    public int planeIndex() { return nplaneIndex(address()); }
    /** Returns the value of the {@code planeStackIndex} field. */
    @NativeType("uint32_t")
    public int planeStackIndex() { return nplaneStackIndex(address()); }
    /** Returns the value of the {@code transform} field. */
    @NativeType("VkSurfaceTransformFlagBitsKHR")
    public int transform() { return ntransform(address()); }
    /** Returns the value of the {@code globalAlpha} field. */
    public float globalAlpha() { return nglobalAlpha(address()); }
    /** Returns the value of the {@code alphaMode} field. */
    @NativeType("VkDisplayPlaneAlphaFlagBitsKHR")
    public int alphaMode() { return nalphaMode(address()); }
    /** Returns a {@link VkExtent2D} view of the {@code imageExtent} field. */
    public VkExtent2D imageExtent() { return nimageExtent(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDisplaySurfaceCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDisplaySurfaceCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkDisplaySurfaceCreateInfoKHR flags(@NativeType("VkDisplaySurfaceCreateFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code displayMode} field. */
    public VkDisplaySurfaceCreateInfoKHR displayMode(@NativeType("VkDisplayModeKHR") long value) { ndisplayMode(address(), value); return this; }
    /** Sets the specified value to the {@code planeIndex} field. */
    public VkDisplaySurfaceCreateInfoKHR planeIndex(@NativeType("uint32_t") int value) { nplaneIndex(address(), value); return this; }
    /** Sets the specified value to the {@code planeStackIndex} field. */
    public VkDisplaySurfaceCreateInfoKHR planeStackIndex(@NativeType("uint32_t") int value) { nplaneStackIndex(address(), value); return this; }
    /** Sets the specified value to the {@code transform} field. */
    public VkDisplaySurfaceCreateInfoKHR transform(@NativeType("VkSurfaceTransformFlagBitsKHR") int value) { ntransform(address(), value); return this; }
    /** Sets the specified value to the {@code globalAlpha} field. */
    public VkDisplaySurfaceCreateInfoKHR globalAlpha(float value) { nglobalAlpha(address(), value); return this; }
    /** Sets the specified value to the {@code alphaMode} field. */
    public VkDisplaySurfaceCreateInfoKHR alphaMode(@NativeType("VkDisplayPlaneAlphaFlagBitsKHR") int value) { nalphaMode(address(), value); return this; }
    /** Copies the specified {@link VkExtent2D} to the {@code imageExtent} field. */
    public VkDisplaySurfaceCreateInfoKHR imageExtent(VkExtent2D value) { nimageExtent(address(), value); return this; }
    /** Passes the {@code imageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkDisplaySurfaceCreateInfoKHR imageExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(imageExtent()); return this; }

    /** Initializes this struct with the specified values. */
    public VkDisplaySurfaceCreateInfoKHR set(
        int sType,
        long pNext,
        int flags,
        long displayMode,
        int planeIndex,
        int planeStackIndex,
        int transform,
        float globalAlpha,
        int alphaMode,
        VkExtent2D imageExtent
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        displayMode(displayMode);
        planeIndex(planeIndex);
        planeStackIndex(planeStackIndex);
        transform(transform);
        globalAlpha(globalAlpha);
        alphaMode(alphaMode);
        imageExtent(imageExtent);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDisplaySurfaceCreateInfoKHR set(VkDisplaySurfaceCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDisplaySurfaceCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDisplaySurfaceCreateInfoKHR malloc() {
        return wrap(VkDisplaySurfaceCreateInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDisplaySurfaceCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDisplaySurfaceCreateInfoKHR calloc() {
        return wrap(VkDisplaySurfaceCreateInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDisplaySurfaceCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkDisplaySurfaceCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDisplaySurfaceCreateInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDisplaySurfaceCreateInfoKHR} instance for the specified memory address. */
    public static VkDisplaySurfaceCreateInfoKHR create(long address) {
        return wrap(VkDisplaySurfaceCreateInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDisplaySurfaceCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkDisplaySurfaceCreateInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkDisplaySurfaceCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplaySurfaceCreateInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDisplaySurfaceCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplaySurfaceCreateInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplaySurfaceCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplaySurfaceCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDisplaySurfaceCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDisplaySurfaceCreateInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDisplaySurfaceCreateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkDisplaySurfaceCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDisplaySurfaceCreateInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkDisplaySurfaceCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDisplaySurfaceCreateInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkDisplaySurfaceCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplaySurfaceCreateInfoKHR mallocStack(MemoryStack stack) {
        return wrap(VkDisplaySurfaceCreateInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDisplaySurfaceCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplaySurfaceCreateInfoKHR callocStack(MemoryStack stack) {
        return wrap(VkDisplaySurfaceCreateInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDisplaySurfaceCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplaySurfaceCreateInfoKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDisplaySurfaceCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplaySurfaceCreateInfoKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDisplaySurfaceCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplaySurfaceCreateInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplaySurfaceCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplaySurfaceCreateInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDisplaySurfaceCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDisplaySurfaceCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkDisplaySurfaceCreateInfoKHR.FLAGS); }
    /** Unsafe version of {@link #displayMode}. */
    public static long ndisplayMode(long struct) { return UNSAFE.getLong(null, struct + VkDisplaySurfaceCreateInfoKHR.DISPLAYMODE); }
    /** Unsafe version of {@link #planeIndex}. */
    public static int nplaneIndex(long struct) { return UNSAFE.getInt(null, struct + VkDisplaySurfaceCreateInfoKHR.PLANEINDEX); }
    /** Unsafe version of {@link #planeStackIndex}. */
    public static int nplaneStackIndex(long struct) { return UNSAFE.getInt(null, struct + VkDisplaySurfaceCreateInfoKHR.PLANESTACKINDEX); }
    /** Unsafe version of {@link #transform}. */
    public static int ntransform(long struct) { return UNSAFE.getInt(null, struct + VkDisplaySurfaceCreateInfoKHR.TRANSFORM); }
    /** Unsafe version of {@link #globalAlpha}. */
    public static float nglobalAlpha(long struct) { return UNSAFE.getFloat(null, struct + VkDisplaySurfaceCreateInfoKHR.GLOBALALPHA); }
    /** Unsafe version of {@link #alphaMode}. */
    public static int nalphaMode(long struct) { return UNSAFE.getInt(null, struct + VkDisplaySurfaceCreateInfoKHR.ALPHAMODE); }
    /** Unsafe version of {@link #imageExtent}. */
    public static VkExtent2D nimageExtent(long struct) { return VkExtent2D.create(struct + VkDisplaySurfaceCreateInfoKHR.IMAGEEXTENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDisplaySurfaceCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDisplaySurfaceCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkDisplaySurfaceCreateInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #displayMode(long) displayMode}. */
    public static void ndisplayMode(long struct, long value) { UNSAFE.putLong(null, struct + VkDisplaySurfaceCreateInfoKHR.DISPLAYMODE, value); }
    /** Unsafe version of {@link #planeIndex(int) planeIndex}. */
    public static void nplaneIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkDisplaySurfaceCreateInfoKHR.PLANEINDEX, value); }
    /** Unsafe version of {@link #planeStackIndex(int) planeStackIndex}. */
    public static void nplaneStackIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkDisplaySurfaceCreateInfoKHR.PLANESTACKINDEX, value); }
    /** Unsafe version of {@link #transform(int) transform}. */
    public static void ntransform(long struct, int value) { UNSAFE.putInt(null, struct + VkDisplaySurfaceCreateInfoKHR.TRANSFORM, value); }
    /** Unsafe version of {@link #globalAlpha(float) globalAlpha}. */
    public static void nglobalAlpha(long struct, float value) { UNSAFE.putFloat(null, struct + VkDisplaySurfaceCreateInfoKHR.GLOBALALPHA, value); }
    /** Unsafe version of {@link #alphaMode(int) alphaMode}. */
    public static void nalphaMode(long struct, int value) { UNSAFE.putInt(null, struct + VkDisplaySurfaceCreateInfoKHR.ALPHAMODE, value); }
    /** Unsafe version of {@link #imageExtent(VkExtent2D) imageExtent}. */
    public static void nimageExtent(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkDisplaySurfaceCreateInfoKHR.IMAGEEXTENT, VkExtent2D.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkDisplaySurfaceCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkDisplaySurfaceCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkDisplaySurfaceCreateInfoKHR ELEMENT_FACTORY = VkDisplaySurfaceCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkDisplaySurfaceCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDisplaySurfaceCreateInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkDisplaySurfaceCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDisplaySurfaceCreateInfoKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDisplaySurfaceCreateInfoKHR.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkDisplaySurfaceCreateFlagsKHR")
        public int flags() { return VkDisplaySurfaceCreateInfoKHR.nflags(address()); }
        /** Returns the value of the {@code displayMode} field. */
        @NativeType("VkDisplayModeKHR")
        public long displayMode() { return VkDisplaySurfaceCreateInfoKHR.ndisplayMode(address()); }
        /** Returns the value of the {@code planeIndex} field. */
        @NativeType("uint32_t")
        public int planeIndex() { return VkDisplaySurfaceCreateInfoKHR.nplaneIndex(address()); }
        /** Returns the value of the {@code planeStackIndex} field. */
        @NativeType("uint32_t")
        public int planeStackIndex() { return VkDisplaySurfaceCreateInfoKHR.nplaneStackIndex(address()); }
        /** Returns the value of the {@code transform} field. */
        @NativeType("VkSurfaceTransformFlagBitsKHR")
        public int transform() { return VkDisplaySurfaceCreateInfoKHR.ntransform(address()); }
        /** Returns the value of the {@code globalAlpha} field. */
        public float globalAlpha() { return VkDisplaySurfaceCreateInfoKHR.nglobalAlpha(address()); }
        /** Returns the value of the {@code alphaMode} field. */
        @NativeType("VkDisplayPlaneAlphaFlagBitsKHR")
        public int alphaMode() { return VkDisplaySurfaceCreateInfoKHR.nalphaMode(address()); }
        /** Returns a {@link VkExtent2D} view of the {@code imageExtent} field. */
        public VkExtent2D imageExtent() { return VkDisplaySurfaceCreateInfoKHR.nimageExtent(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDisplaySurfaceCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDisplaySurfaceCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDisplaySurfaceCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkDisplaySurfaceCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkDisplaySurfaceCreateInfoKHR.Buffer flags(@NativeType("VkDisplaySurfaceCreateFlagsKHR") int value) { VkDisplaySurfaceCreateInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code displayMode} field. */
        public VkDisplaySurfaceCreateInfoKHR.Buffer displayMode(@NativeType("VkDisplayModeKHR") long value) { VkDisplaySurfaceCreateInfoKHR.ndisplayMode(address(), value); return this; }
        /** Sets the specified value to the {@code planeIndex} field. */
        public VkDisplaySurfaceCreateInfoKHR.Buffer planeIndex(@NativeType("uint32_t") int value) { VkDisplaySurfaceCreateInfoKHR.nplaneIndex(address(), value); return this; }
        /** Sets the specified value to the {@code planeStackIndex} field. */
        public VkDisplaySurfaceCreateInfoKHR.Buffer planeStackIndex(@NativeType("uint32_t") int value) { VkDisplaySurfaceCreateInfoKHR.nplaneStackIndex(address(), value); return this; }
        /** Sets the specified value to the {@code transform} field. */
        public VkDisplaySurfaceCreateInfoKHR.Buffer transform(@NativeType("VkSurfaceTransformFlagBitsKHR") int value) { VkDisplaySurfaceCreateInfoKHR.ntransform(address(), value); return this; }
        /** Sets the specified value to the {@code globalAlpha} field. */
        public VkDisplaySurfaceCreateInfoKHR.Buffer globalAlpha(float value) { VkDisplaySurfaceCreateInfoKHR.nglobalAlpha(address(), value); return this; }
        /** Sets the specified value to the {@code alphaMode} field. */
        public VkDisplaySurfaceCreateInfoKHR.Buffer alphaMode(@NativeType("VkDisplayPlaneAlphaFlagBitsKHR") int value) { VkDisplaySurfaceCreateInfoKHR.nalphaMode(address(), value); return this; }
        /** Copies the specified {@link VkExtent2D} to the {@code imageExtent} field. */
        public VkDisplaySurfaceCreateInfoKHR.Buffer imageExtent(VkExtent2D value) { VkDisplaySurfaceCreateInfoKHR.nimageExtent(address(), value); return this; }
        /** Passes the {@code imageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkDisplaySurfaceCreateInfoKHR.Buffer imageExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(imageExtent()); return this; }

    }

}