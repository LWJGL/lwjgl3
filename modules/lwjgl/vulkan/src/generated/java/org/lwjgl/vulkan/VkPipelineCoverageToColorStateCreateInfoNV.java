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
 * Structure specifying whether fragment coverage replaces a color.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code coverageToColorEnable} is {@link VK10#VK_TRUE TRUE}, the fragment coverage information is treated as a bitmask with one bit for each sample (as in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#fragops-samplemask">Sample Mask</a> section), and this bitmask replaces the first component of the color value corresponding to the fragment shader output location with {@code Location} equal to {@code coverageToColorLocation} and {@code Index} equal to zero. If the color attachment format has fewer bits than the sample coverage, the low bits of the sample coverage bitmask are taken without any clamping. If the color attachment format has more bits than the sample coverage, the high bits of the sample coverage bitmask are filled with zeros.</p>
 * 
 * <p>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#primsrast-sampleshading">Sample Shading</a> is in use, the coverage bitmask only has bits set for samples that correspond to the fragment shader invocation that shades those samples.</p>
 * 
 * <p>This pipeline stage occurs after sample counting and before blending, and is always performed after fragment shading regardless of the setting of {@code EarlyFragmentTests}.</p>
 * 
 * <p>If {@code coverageToColorEnable} is {@link VK10#VK_FALSE FALSE}, these operations are skipped. If this structure is not present, it is as if {@code coverageToColorEnable} is {@link VK10#VK_FALSE FALSE}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code coverageToColorEnable} is {@link VK10#VK_TRUE TRUE}, then the render pass subpass indicated by {@link VkGraphicsPipelineCreateInfo}{@code ::renderPass} and {@link VkGraphicsPipelineCreateInfo}{@code ::subpass} <b>must</b> have a color attachment at the location selected by {@code coverageToColorLocation}, with a {@code VkFormat} of {@link VK10#VK_FORMAT_R8_UINT FORMAT_R8_UINT}, {@link VK10#VK_FORMAT_R8_SINT FORMAT_R8_SINT}, {@link VK10#VK_FORMAT_R16_UINT FORMAT_R16_UINT}, {@link VK10#VK_FORMAT_R16_SINT FORMAT_R16_SINT}, {@link VK10#VK_FORMAT_R32_UINT FORMAT_R32_UINT}, or {@link VK10#VK_FORMAT_R32_SINT FORMAT_R32_SINT}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVFragmentCoverageToColor#VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_TO_COLOR_STATE_CREATE_INFO_NV STRUCTURE_TYPE_PIPELINE_COVERAGE_TO_COLOR_STATE_CREATE_INFO_NV}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure</li>
 * <li>{@code flags} &ndash; reserved for future use.</li>
 * <li>{@code coverageToColorEnable} &ndash; controls whether the fragment coverage value replaces a fragment color output.</li>
 * <li>{@code coverageToColorLocation} &ndash; controls which fragment shader color output value is replaced.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineCoverageToColorStateCreateInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipelineCoverageToColorStateCreateFlagsNV flags;
 *     VkBool32 coverageToColorEnable;
 *     uint32_t coverageToColorLocation;
 * }</code></pre>
 */
public class VkPipelineCoverageToColorStateCreateInfoNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        COVERAGETOCOLORENABLE,
        COVERAGETOCOLORLOCATION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        COVERAGETOCOLORENABLE = layout.offsetof(3);
        COVERAGETOCOLORLOCATION = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkPipelineCoverageToColorStateCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineCoverageToColorStateCreateInfoNV(ByteBuffer container) {
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
    @NativeType("VkPipelineCoverageToColorStateCreateFlagsNV")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code coverageToColorEnable} field. */
    @NativeType("VkBool32")
    public boolean coverageToColorEnable() { return ncoverageToColorEnable(address()) != 0; }
    /** Returns the value of the {@code coverageToColorLocation} field. */
    @NativeType("uint32_t")
    public int coverageToColorLocation() { return ncoverageToColorLocation(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineCoverageToColorStateCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineCoverageToColorStateCreateInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkPipelineCoverageToColorStateCreateInfoNV flags(@NativeType("VkPipelineCoverageToColorStateCreateFlagsNV") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code coverageToColorEnable} field. */
    public VkPipelineCoverageToColorStateCreateInfoNV coverageToColorEnable(@NativeType("VkBool32") boolean value) { ncoverageToColorEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code coverageToColorLocation} field. */
    public VkPipelineCoverageToColorStateCreateInfoNV coverageToColorLocation(@NativeType("uint32_t") int value) { ncoverageToColorLocation(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineCoverageToColorStateCreateInfoNV set(
        int sType,
        long pNext,
        int flags,
        boolean coverageToColorEnable,
        int coverageToColorLocation
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        coverageToColorEnable(coverageToColorEnable);
        coverageToColorLocation(coverageToColorLocation);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineCoverageToColorStateCreateInfoNV set(VkPipelineCoverageToColorStateCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineCoverageToColorStateCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineCoverageToColorStateCreateInfoNV malloc() {
        return wrap(VkPipelineCoverageToColorStateCreateInfoNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineCoverageToColorStateCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineCoverageToColorStateCreateInfoNV calloc() {
        return wrap(VkPipelineCoverageToColorStateCreateInfoNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineCoverageToColorStateCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkPipelineCoverageToColorStateCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineCoverageToColorStateCreateInfoNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineCoverageToColorStateCreateInfoNV} instance for the specified memory address. */
    public static VkPipelineCoverageToColorStateCreateInfoNV create(long address) {
        return wrap(VkPipelineCoverageToColorStateCreateInfoNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineCoverageToColorStateCreateInfoNV createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineCoverageToColorStateCreateInfoNV.class, address);
    }

    /**
     * Returns a new {@link VkPipelineCoverageToColorStateCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCoverageToColorStateCreateInfoNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCoverageToColorStateCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCoverageToColorStateCreateInfoNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCoverageToColorStateCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCoverageToColorStateCreateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineCoverageToColorStateCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineCoverageToColorStateCreateInfoNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineCoverageToColorStateCreateInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineCoverageToColorStateCreateInfoNV} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPipelineCoverageToColorStateCreateInfoNV mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPipelineCoverageToColorStateCreateInfoNV} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPipelineCoverageToColorStateCreateInfoNV callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPipelineCoverageToColorStateCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineCoverageToColorStateCreateInfoNV mallocStack(MemoryStack stack) {
        return wrap(VkPipelineCoverageToColorStateCreateInfoNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineCoverageToColorStateCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineCoverageToColorStateCreateInfoNV callocStack(MemoryStack stack) {
        return wrap(VkPipelineCoverageToColorStateCreateInfoNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineCoverageToColorStateCreateInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCoverageToColorStateCreateInfoNV.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineCoverageToColorStateCreateInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCoverageToColorStateCreateInfoNV.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineCoverageToColorStateCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineCoverageToColorStateCreateInfoNV.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCoverageToColorStateCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineCoverageToColorStateCreateInfoNV.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineCoverageToColorStateCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineCoverageToColorStateCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkPipelineCoverageToColorStateCreateInfoNV.FLAGS); }
    /** Unsafe version of {@link #coverageToColorEnable}. */
    public static int ncoverageToColorEnable(long struct) { return UNSAFE.getInt(null, struct + VkPipelineCoverageToColorStateCreateInfoNV.COVERAGETOCOLORENABLE); }
    /** Unsafe version of {@link #coverageToColorLocation}. */
    public static int ncoverageToColorLocation(long struct) { return UNSAFE.getInt(null, struct + VkPipelineCoverageToColorStateCreateInfoNV.COVERAGETOCOLORLOCATION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineCoverageToColorStateCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineCoverageToColorStateCreateInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineCoverageToColorStateCreateInfoNV.FLAGS, value); }
    /** Unsafe version of {@link #coverageToColorEnable(boolean) coverageToColorEnable}. */
    public static void ncoverageToColorEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineCoverageToColorStateCreateInfoNV.COVERAGETOCOLORENABLE, value); }
    /** Unsafe version of {@link #coverageToColorLocation(int) coverageToColorLocation}. */
    public static void ncoverageToColorLocation(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineCoverageToColorStateCreateInfoNV.COVERAGETOCOLORLOCATION, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineCoverageToColorStateCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkPipelineCoverageToColorStateCreateInfoNV, Buffer> implements NativeResource {

        private static final VkPipelineCoverageToColorStateCreateInfoNV ELEMENT_FACTORY = VkPipelineCoverageToColorStateCreateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkPipelineCoverageToColorStateCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineCoverageToColorStateCreateInfoNV#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineCoverageToColorStateCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineCoverageToColorStateCreateInfoNV.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineCoverageToColorStateCreateInfoNV.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkPipelineCoverageToColorStateCreateFlagsNV")
        public int flags() { return VkPipelineCoverageToColorStateCreateInfoNV.nflags(address()); }
        /** Returns the value of the {@code coverageToColorEnable} field. */
        @NativeType("VkBool32")
        public boolean coverageToColorEnable() { return VkPipelineCoverageToColorStateCreateInfoNV.ncoverageToColorEnable(address()) != 0; }
        /** Returns the value of the {@code coverageToColorLocation} field. */
        @NativeType("uint32_t")
        public int coverageToColorLocation() { return VkPipelineCoverageToColorStateCreateInfoNV.ncoverageToColorLocation(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineCoverageToColorStateCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineCoverageToColorStateCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineCoverageToColorStateCreateInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkPipelineCoverageToColorStateCreateInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkPipelineCoverageToColorStateCreateInfoNV.Buffer flags(@NativeType("VkPipelineCoverageToColorStateCreateFlagsNV") int value) { VkPipelineCoverageToColorStateCreateInfoNV.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code coverageToColorEnable} field. */
        public VkPipelineCoverageToColorStateCreateInfoNV.Buffer coverageToColorEnable(@NativeType("VkBool32") boolean value) { VkPipelineCoverageToColorStateCreateInfoNV.ncoverageToColorEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code coverageToColorLocation} field. */
        public VkPipelineCoverageToColorStateCreateInfoNV.Buffer coverageToColorLocation(@NativeType("uint32_t") int value) { VkPipelineCoverageToColorStateCreateInfoNV.ncoverageToColorLocation(address(), value); return this; }

    }

}