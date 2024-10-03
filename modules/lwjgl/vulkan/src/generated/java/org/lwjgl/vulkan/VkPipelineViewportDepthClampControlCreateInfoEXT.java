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
 * Structure specifying parameters of a newly created pipeline depth clamp control state.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure extends {@link VkPipelineViewportStateCreateInfo} and specifies the depth clamp range used in the pipeline. If this structure is not provided in the next chain then {@code depthClampMode} defaults to {@link EXTShaderObject#VK_DEPTH_CLAMP_MODE_VIEWPORT_RANGE_EXT DEPTH_CLAMP_MODE_VIEWPORT_RANGE_EXT}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code depthClampMode} is set to {@link EXTShaderObject#VK_DEPTH_CLAMP_MODE_USER_DEFINED_RANGE_EXT DEPTH_CLAMP_MODE_USER_DEFINED_RANGE_EXT}, and the pipeline is not created with {@link EXTDepthClampControl#VK_DYNAMIC_STATE_DEPTH_CLAMP_RANGE_EXT DYNAMIC_STATE_DEPTH_CLAMP_RANGE_EXT}, then {@code pDepthClampRange} must be a valid pointer to a valid {@link VkDepthClampRangeEXT} structure.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDepthClampControl#VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLAMP_CONTROL_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLAMP_CONTROL_CREATE_INFO_EXT}</li>
 * <li>{@code depthClampMode} <b>must</b> be a valid {@code VkDepthClampModeEXT} value</li>
 * <li>If {@code pDepthClampRange} is not {@code NULL}, {@code pDepthClampRange} <b>must</b> be a valid pointer to a valid {@link VkDepthClampRangeEXT} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDepthClampRangeEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineViewportDepthClampControlCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkDepthClampModeEXT {@link #depthClampMode};
 *     {@link VkDepthClampRangeEXT VkDepthClampRangeEXT} const * {@link #pDepthClampRange};
 * }</code></pre>
 */
public class VkPipelineViewportDepthClampControlCreateInfoEXT extends Struct<VkPipelineViewportDepthClampControlCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEPTHCLAMPMODE,
        PDEPTHCLAMPRANGE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEPTHCLAMPMODE = layout.offsetof(2);
        PDEPTHCLAMPRANGE = layout.offsetof(3);
    }

    protected VkPipelineViewportDepthClampControlCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineViewportDepthClampControlCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineViewportDepthClampControlCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkPipelineViewportDepthClampControlCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineViewportDepthClampControlCreateInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** determines how the clamp range is determined for each viewport. */
    @NativeType("VkDepthClampModeEXT")
    public int depthClampMode() { return ndepthClampMode(address()); }
    /** sets the depth clamp range for all viewports if {@code depthClampMode} is set to {@link EXTShaderObject#VK_DEPTH_CLAMP_MODE_USER_DEFINED_RANGE_EXT DEPTH_CLAMP_MODE_USER_DEFINED_RANGE_EXT}. */
    @Nullable
    @NativeType("VkDepthClampRangeEXT const *")
    public VkDepthClampRangeEXT pDepthClampRange() { return npDepthClampRange(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPipelineViewportDepthClampControlCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDepthClampControl#VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLAMP_CONTROL_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLAMP_CONTROL_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkPipelineViewportDepthClampControlCreateInfoEXT sType$Default() { return sType(EXTDepthClampControl.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLAMP_CONTROL_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPipelineViewportDepthClampControlCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #depthClampMode} field. */
    public VkPipelineViewportDepthClampControlCreateInfoEXT depthClampMode(@NativeType("VkDepthClampModeEXT") int value) { ndepthClampMode(address(), value); return this; }
    /** Sets the address of the specified {@link VkDepthClampRangeEXT} to the {@link #pDepthClampRange} field. */
    public VkPipelineViewportDepthClampControlCreateInfoEXT pDepthClampRange(@Nullable @NativeType("VkDepthClampRangeEXT const *") VkDepthClampRangeEXT value) { npDepthClampRange(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineViewportDepthClampControlCreateInfoEXT set(
        int sType,
        long pNext,
        int depthClampMode,
        @Nullable VkDepthClampRangeEXT pDepthClampRange
    ) {
        sType(sType);
        pNext(pNext);
        depthClampMode(depthClampMode);
        pDepthClampRange(pDepthClampRange);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineViewportDepthClampControlCreateInfoEXT set(VkPipelineViewportDepthClampControlCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineViewportDepthClampControlCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineViewportDepthClampControlCreateInfoEXT malloc() {
        return new VkPipelineViewportDepthClampControlCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineViewportDepthClampControlCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineViewportDepthClampControlCreateInfoEXT calloc() {
        return new VkPipelineViewportDepthClampControlCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineViewportDepthClampControlCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkPipelineViewportDepthClampControlCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineViewportDepthClampControlCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineViewportDepthClampControlCreateInfoEXT} instance for the specified memory address. */
    public static VkPipelineViewportDepthClampControlCreateInfoEXT create(long address) {
        return new VkPipelineViewportDepthClampControlCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineViewportDepthClampControlCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkPipelineViewportDepthClampControlCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineViewportDepthClampControlCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineViewportDepthClampControlCreateInfoEXT malloc(MemoryStack stack) {
        return new VkPipelineViewportDepthClampControlCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineViewportDepthClampControlCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineViewportDepthClampControlCreateInfoEXT calloc(MemoryStack stack) {
        return new VkPipelineViewportDepthClampControlCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineViewportDepthClampControlCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineViewportDepthClampControlCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #depthClampMode}. */
    public static int ndepthClampMode(long struct) { return UNSAFE.getInt(null, struct + VkPipelineViewportDepthClampControlCreateInfoEXT.DEPTHCLAMPMODE); }
    /** Unsafe version of {@link #pDepthClampRange}. */
    @Nullable public static VkDepthClampRangeEXT npDepthClampRange(long struct) { return VkDepthClampRangeEXT.createSafe(memGetAddress(struct + VkPipelineViewportDepthClampControlCreateInfoEXT.PDEPTHCLAMPRANGE)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineViewportDepthClampControlCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineViewportDepthClampControlCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #depthClampMode(int) depthClampMode}. */
    public static void ndepthClampMode(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineViewportDepthClampControlCreateInfoEXT.DEPTHCLAMPMODE, value); }
    /** Unsafe version of {@link #pDepthClampRange(VkDepthClampRangeEXT) pDepthClampRange}. */
    public static void npDepthClampRange(long struct, @Nullable VkDepthClampRangeEXT value) { memPutAddress(struct + VkPipelineViewportDepthClampControlCreateInfoEXT.PDEPTHCLAMPRANGE, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link VkPipelineViewportDepthClampControlCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkPipelineViewportDepthClampControlCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkPipelineViewportDepthClampControlCreateInfoEXT ELEMENT_FACTORY = VkPipelineViewportDepthClampControlCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineViewportDepthClampControlCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineViewportDepthClampControlCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineViewportDepthClampControlCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineViewportDepthClampControlCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkPipelineViewportDepthClampControlCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineViewportDepthClampControlCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkPipelineViewportDepthClampControlCreateInfoEXT#depthClampMode} field. */
        @NativeType("VkDepthClampModeEXT")
        public int depthClampMode() { return VkPipelineViewportDepthClampControlCreateInfoEXT.ndepthClampMode(address()); }
        /** @return a {@link VkDepthClampRangeEXT} view of the struct pointed to by the {@link VkPipelineViewportDepthClampControlCreateInfoEXT#pDepthClampRange} field. */
        @Nullable
        @NativeType("VkDepthClampRangeEXT const *")
        public VkDepthClampRangeEXT pDepthClampRange() { return VkPipelineViewportDepthClampControlCreateInfoEXT.npDepthClampRange(address()); }

        /** Sets the specified value to the {@link VkPipelineViewportDepthClampControlCreateInfoEXT#sType} field. */
        public VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineViewportDepthClampControlCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDepthClampControl#VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLAMP_CONTROL_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLAMP_CONTROL_CREATE_INFO_EXT} value to the {@link VkPipelineViewportDepthClampControlCreateInfoEXT#sType} field. */
        public VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer sType$Default() { return sType(EXTDepthClampControl.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLAMP_CONTROL_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkPipelineViewportDepthClampControlCreateInfoEXT#pNext} field. */
        public VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkPipelineViewportDepthClampControlCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineViewportDepthClampControlCreateInfoEXT#depthClampMode} field. */
        public VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer depthClampMode(@NativeType("VkDepthClampModeEXT") int value) { VkPipelineViewportDepthClampControlCreateInfoEXT.ndepthClampMode(address(), value); return this; }
        /** Sets the address of the specified {@link VkDepthClampRangeEXT} to the {@link VkPipelineViewportDepthClampControlCreateInfoEXT#pDepthClampRange} field. */
        public VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer pDepthClampRange(@Nullable @NativeType("VkDepthClampRangeEXT const *") VkDepthClampRangeEXT value) { VkPipelineViewportDepthClampControlCreateInfoEXT.npDepthClampRange(address(), value); return this; }

    }

}