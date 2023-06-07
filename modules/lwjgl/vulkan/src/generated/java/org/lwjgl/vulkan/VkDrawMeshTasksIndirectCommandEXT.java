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
 * Structure specifying a mesh tasks draw indirect command.
 * 
 * <h5>Description</h5>
 * 
 * <p>The members of {@link VkDrawMeshTasksIndirectCommandEXT} have the same meaning as the similarly named parameters of {@link EXTMeshShader#vkCmdDrawMeshTasksEXT CmdDrawMeshTasksEXT}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the current pipeline bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} contains a shader using the {@code TaskEXT} {@code Execution} {@code Model}, {@code groupCountX} <b>must</b> be less than or equal to {@link VkPhysicalDeviceMeshShaderPropertiesEXT}{@code ::maxTaskWorkGroupCount}[0]</li>
 * <li>If the current pipeline bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} contains a shader using the {@code TaskEXT} {@code Execution} {@code Model}, {@code groupCountY} <b>must</b> be less than or equal to {@link VkPhysicalDeviceMeshShaderPropertiesEXT}{@code ::maxTaskWorkGroupCount}[1]</li>
 * <li>If the current pipeline bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} contains a shader using the {@code TaskEXT} {@code Execution} {@code Model}, {@code groupCountZ} <b>must</b> be less than or equal to {@link VkPhysicalDeviceMeshShaderPropertiesEXT}{@code ::maxTaskWorkGroupCount}[2]</li>
 * <li>If the current pipeline bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} contains a shader using the {@code TaskEXT} {@code Execution} {@code Model}, The product of {@code groupCountX}, {@code groupCountY} and {@code groupCountZ} <b>must</b> be less than or equal to {@link VkPhysicalDeviceMeshShaderPropertiesEXT}{@code ::maxTaskWorkGroupTotalCount}</li>
 * <li>If the current pipeline bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} does not contain a shader using the {@code TaskEXT} {@code Execution} {@code Model}, {@code groupCountX} <b>must</b> be less than or equal to {@link VkPhysicalDeviceMeshShaderPropertiesEXT}{@code ::maxMeshWorkGroupCount}[0]</li>
 * <li>If the current pipeline bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} does not contain a shader using the {@code TaskEXT} {@code Execution} {@code Model}, {@code groupCountY} <b>must</b> be less than or equal to {@link VkPhysicalDeviceMeshShaderPropertiesEXT}{@code ::maxMeshWorkGroupCount}[1]</li>
 * <li>If the current pipeline bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} does not contain a shader using the {@code TaskEXT} {@code Execution} {@code Model}, {@code groupCountZ} <b>must</b> be less than or equal to {@link VkPhysicalDeviceMeshShaderPropertiesEXT}{@code ::maxMeshWorkGroupCount}[2]</li>
 * <li>If the current pipeline bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} does not contain a shader using the {@code TaskEXT} {@code Execution} {@code Model}, The product of {@code groupCountX}, {@code groupCountY} and {@code groupCountZ} <b>must</b> be less than or equal to {@link VkPhysicalDeviceMeshShaderPropertiesEXT}{@code ::maxMeshWorkGroupTotalCount}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTMeshShader#vkCmdDrawMeshTasksIndirectEXT CmdDrawMeshTasksIndirectEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDrawMeshTasksIndirectCommandEXT {
 *     uint32_t {@link #groupCountX};
 *     uint32_t {@link #groupCountY};
 *     uint32_t {@link #groupCountZ};
 * }</code></pre>
 */
public class VkDrawMeshTasksIndirectCommandEXT extends Struct<VkDrawMeshTasksIndirectCommandEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        GROUPCOUNTX,
        GROUPCOUNTY,
        GROUPCOUNTZ;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        GROUPCOUNTX = layout.offsetof(0);
        GROUPCOUNTY = layout.offsetof(1);
        GROUPCOUNTZ = layout.offsetof(2);
    }

    protected VkDrawMeshTasksIndirectCommandEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDrawMeshTasksIndirectCommandEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDrawMeshTasksIndirectCommandEXT(address, container);
    }

    /**
     * Creates a {@code VkDrawMeshTasksIndirectCommandEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDrawMeshTasksIndirectCommandEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the number of local workgroups to dispatch in the X dimension. */
    @NativeType("uint32_t")
    public int groupCountX() { return ngroupCountX(address()); }
    /** the number of local workgroups to dispatch in the Y dimension. */
    @NativeType("uint32_t")
    public int groupCountY() { return ngroupCountY(address()); }
    /** the number of local workgroups to dispatch in the Z dimension. */
    @NativeType("uint32_t")
    public int groupCountZ() { return ngroupCountZ(address()); }

    /** Sets the specified value to the {@link #groupCountX} field. */
    public VkDrawMeshTasksIndirectCommandEXT groupCountX(@NativeType("uint32_t") int value) { ngroupCountX(address(), value); return this; }
    /** Sets the specified value to the {@link #groupCountY} field. */
    public VkDrawMeshTasksIndirectCommandEXT groupCountY(@NativeType("uint32_t") int value) { ngroupCountY(address(), value); return this; }
    /** Sets the specified value to the {@link #groupCountZ} field. */
    public VkDrawMeshTasksIndirectCommandEXT groupCountZ(@NativeType("uint32_t") int value) { ngroupCountZ(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDrawMeshTasksIndirectCommandEXT set(
        int groupCountX,
        int groupCountY,
        int groupCountZ
    ) {
        groupCountX(groupCountX);
        groupCountY(groupCountY);
        groupCountZ(groupCountZ);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDrawMeshTasksIndirectCommandEXT set(VkDrawMeshTasksIndirectCommandEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDrawMeshTasksIndirectCommandEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDrawMeshTasksIndirectCommandEXT malloc() {
        return new VkDrawMeshTasksIndirectCommandEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDrawMeshTasksIndirectCommandEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDrawMeshTasksIndirectCommandEXT calloc() {
        return new VkDrawMeshTasksIndirectCommandEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDrawMeshTasksIndirectCommandEXT} instance allocated with {@link BufferUtils}. */
    public static VkDrawMeshTasksIndirectCommandEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDrawMeshTasksIndirectCommandEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDrawMeshTasksIndirectCommandEXT} instance for the specified memory address. */
    public static VkDrawMeshTasksIndirectCommandEXT create(long address) {
        return new VkDrawMeshTasksIndirectCommandEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDrawMeshTasksIndirectCommandEXT createSafe(long address) {
        return address == NULL ? null : new VkDrawMeshTasksIndirectCommandEXT(address, null);
    }

    /**
     * Returns a new {@link VkDrawMeshTasksIndirectCommandEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrawMeshTasksIndirectCommandEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDrawMeshTasksIndirectCommandEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrawMeshTasksIndirectCommandEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDrawMeshTasksIndirectCommandEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrawMeshTasksIndirectCommandEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDrawMeshTasksIndirectCommandEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDrawMeshTasksIndirectCommandEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDrawMeshTasksIndirectCommandEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDrawMeshTasksIndirectCommandEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDrawMeshTasksIndirectCommandEXT malloc(MemoryStack stack) {
        return new VkDrawMeshTasksIndirectCommandEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDrawMeshTasksIndirectCommandEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDrawMeshTasksIndirectCommandEXT calloc(MemoryStack stack) {
        return new VkDrawMeshTasksIndirectCommandEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDrawMeshTasksIndirectCommandEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDrawMeshTasksIndirectCommandEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDrawMeshTasksIndirectCommandEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDrawMeshTasksIndirectCommandEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #groupCountX}. */
    public static int ngroupCountX(long struct) { return UNSAFE.getInt(null, struct + VkDrawMeshTasksIndirectCommandEXT.GROUPCOUNTX); }
    /** Unsafe version of {@link #groupCountY}. */
    public static int ngroupCountY(long struct) { return UNSAFE.getInt(null, struct + VkDrawMeshTasksIndirectCommandEXT.GROUPCOUNTY); }
    /** Unsafe version of {@link #groupCountZ}. */
    public static int ngroupCountZ(long struct) { return UNSAFE.getInt(null, struct + VkDrawMeshTasksIndirectCommandEXT.GROUPCOUNTZ); }

    /** Unsafe version of {@link #groupCountX(int) groupCountX}. */
    public static void ngroupCountX(long struct, int value) { UNSAFE.putInt(null, struct + VkDrawMeshTasksIndirectCommandEXT.GROUPCOUNTX, value); }
    /** Unsafe version of {@link #groupCountY(int) groupCountY}. */
    public static void ngroupCountY(long struct, int value) { UNSAFE.putInt(null, struct + VkDrawMeshTasksIndirectCommandEXT.GROUPCOUNTY, value); }
    /** Unsafe version of {@link #groupCountZ(int) groupCountZ}. */
    public static void ngroupCountZ(long struct, int value) { UNSAFE.putInt(null, struct + VkDrawMeshTasksIndirectCommandEXT.GROUPCOUNTZ, value); }

    // -----------------------------------

    /** An array of {@link VkDrawMeshTasksIndirectCommandEXT} structs. */
    public static class Buffer extends StructBuffer<VkDrawMeshTasksIndirectCommandEXT, Buffer> implements NativeResource {

        private static final VkDrawMeshTasksIndirectCommandEXT ELEMENT_FACTORY = VkDrawMeshTasksIndirectCommandEXT.create(-1L);

        /**
         * Creates a new {@code VkDrawMeshTasksIndirectCommandEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDrawMeshTasksIndirectCommandEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDrawMeshTasksIndirectCommandEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDrawMeshTasksIndirectCommandEXT#groupCountX} field. */
        @NativeType("uint32_t")
        public int groupCountX() { return VkDrawMeshTasksIndirectCommandEXT.ngroupCountX(address()); }
        /** @return the value of the {@link VkDrawMeshTasksIndirectCommandEXT#groupCountY} field. */
        @NativeType("uint32_t")
        public int groupCountY() { return VkDrawMeshTasksIndirectCommandEXT.ngroupCountY(address()); }
        /** @return the value of the {@link VkDrawMeshTasksIndirectCommandEXT#groupCountZ} field. */
        @NativeType("uint32_t")
        public int groupCountZ() { return VkDrawMeshTasksIndirectCommandEXT.ngroupCountZ(address()); }

        /** Sets the specified value to the {@link VkDrawMeshTasksIndirectCommandEXT#groupCountX} field. */
        public VkDrawMeshTasksIndirectCommandEXT.Buffer groupCountX(@NativeType("uint32_t") int value) { VkDrawMeshTasksIndirectCommandEXT.ngroupCountX(address(), value); return this; }
        /** Sets the specified value to the {@link VkDrawMeshTasksIndirectCommandEXT#groupCountY} field. */
        public VkDrawMeshTasksIndirectCommandEXT.Buffer groupCountY(@NativeType("uint32_t") int value) { VkDrawMeshTasksIndirectCommandEXT.ngroupCountY(address(), value); return this; }
        /** Sets the specified value to the {@link VkDrawMeshTasksIndirectCommandEXT#groupCountZ} field. */
        public VkDrawMeshTasksIndirectCommandEXT.Buffer groupCountZ(@NativeType("uint32_t") int value) { VkDrawMeshTasksIndirectCommandEXT.ngroupCountZ(address(), value); return this; }

    }

}