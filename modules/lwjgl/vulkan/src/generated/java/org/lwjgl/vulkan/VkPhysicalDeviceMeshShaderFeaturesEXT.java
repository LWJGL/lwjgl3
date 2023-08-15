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
 * Structure describing mesh shading features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceMeshShaderFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceMeshShaderFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <p>The corresponding features of the {@link VkPhysicalDeviceMeshShaderFeaturesNV} structure <b>must</b> match those in {@link VkPhysicalDeviceMeshShaderFeaturesEXT}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code multiviewMeshShader} is enabled then {@link VkPhysicalDeviceMultiviewFeaturesKHR}{@code ::multiview} <b>must</b> also be enabled</li>
 * <li>If {@code primitiveFragmentShadingRateMeshShader} is enabled then {@link VkPhysicalDeviceFragmentShadingRateFeaturesKHR}{@code ::primitiveFragmentShadingRate} <b>must</b> also be enabled</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTMeshShader#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceMeshShaderFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #taskShader};
 *     VkBool32 {@link #meshShader};
 *     VkBool32 {@link #multiviewMeshShader};
 *     VkBool32 {@link #primitiveFragmentShadingRateMeshShader};
 *     VkBool32 {@link #meshShaderQueries};
 * }</code></pre>
 */
public class VkPhysicalDeviceMeshShaderFeaturesEXT extends Struct<VkPhysicalDeviceMeshShaderFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TASKSHADER,
        MESHSHADER,
        MULTIVIEWMESHSHADER,
        PRIMITIVEFRAGMENTSHADINGRATEMESHSHADER,
        MESHSHADERQUERIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TASKSHADER = layout.offsetof(2);
        MESHSHADER = layout.offsetof(3);
        MULTIVIEWMESHSHADER = layout.offsetof(4);
        PRIMITIVEFRAGMENTSHADINGRATEMESHSHADER = layout.offsetof(5);
        MESHSHADERQUERIES = layout.offsetof(6);
    }

    protected VkPhysicalDeviceMeshShaderFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceMeshShaderFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceMeshShaderFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceMeshShaderFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMeshShaderFeaturesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** specifies whether task shaders are supported. If this feature is not enabled, the {@link EXTMeshShader#VK_SHADER_STAGE_TASK_BIT_EXT SHADER_STAGE_TASK_BIT_EXT} and {@link EXTMeshShader#VK_PIPELINE_STAGE_TASK_SHADER_BIT_EXT PIPELINE_STAGE_TASK_SHADER_BIT_EXT} enum values <b>must</b> not be used. */
    @NativeType("VkBool32")
    public boolean taskShader() { return ntaskShader(address()) != 0; }
    /** specifies whether mesh shaders are supported. If this feature is not enabled, the {@link EXTMeshShader#VK_SHADER_STAGE_MESH_BIT_EXT SHADER_STAGE_MESH_BIT_EXT} and {@link EXTMeshShader#VK_PIPELINE_STAGE_MESH_SHADER_BIT_EXT PIPELINE_STAGE_MESH_SHADER_BIT_EXT} enum values <b>must</b> not be used. */
    @NativeType("VkBool32")
    public boolean meshShader() { return nmeshShader(address()) != 0; }
    /** specifies whether the implementation supports <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-multiview">{@code multiview}</a> rendering within a render pass, with mesh shaders. If this feature is not enabled, then a pipeline compiled against a subpass with a non-zero view mask <b>must</b> not include a mesh shader. */
    @NativeType("VkBool32")
    public boolean multiviewMeshShader() { return nmultiviewMeshShader(address()) != 0; }
    /** indicates that the implementation supports the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-fragment-shading-rate-primitive">primitive fragment shading rate</a> in mesh shaders. */
    @NativeType("VkBool32")
    public boolean primitiveFragmentShadingRateMeshShader() { return nprimitiveFragmentShadingRateMeshShader(address()) != 0; }
    /** indicates that the implementation supports creating query pools using the {@link EXTMeshShader#VK_QUERY_TYPE_MESH_PRIMITIVES_GENERATED_EXT QUERY_TYPE_MESH_PRIMITIVES_GENERATED_EXT} query type and statistic queries containing the {@link EXTMeshShader#VK_QUERY_PIPELINE_STATISTIC_TASK_SHADER_INVOCATIONS_BIT_EXT QUERY_PIPELINE_STATISTIC_TASK_SHADER_INVOCATIONS_BIT_EXT} and {@link EXTMeshShader#VK_QUERY_PIPELINE_STATISTIC_MESH_SHADER_INVOCATIONS_BIT_EXT QUERY_PIPELINE_STATISTIC_MESH_SHADER_INVOCATIONS_BIT_EXT} flags */
    @NativeType("VkBool32")
    public boolean meshShaderQueries() { return nmeshShaderQueries(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceMeshShaderFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTMeshShader#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceMeshShaderFeaturesEXT sType$Default() { return sType(EXTMeshShader.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceMeshShaderFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #taskShader} field. */
    public VkPhysicalDeviceMeshShaderFeaturesEXT taskShader(@NativeType("VkBool32") boolean value) { ntaskShader(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #meshShader} field. */
    public VkPhysicalDeviceMeshShaderFeaturesEXT meshShader(@NativeType("VkBool32") boolean value) { nmeshShader(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #multiviewMeshShader} field. */
    public VkPhysicalDeviceMeshShaderFeaturesEXT multiviewMeshShader(@NativeType("VkBool32") boolean value) { nmultiviewMeshShader(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #primitiveFragmentShadingRateMeshShader} field. */
    public VkPhysicalDeviceMeshShaderFeaturesEXT primitiveFragmentShadingRateMeshShader(@NativeType("VkBool32") boolean value) { nprimitiveFragmentShadingRateMeshShader(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #meshShaderQueries} field. */
    public VkPhysicalDeviceMeshShaderFeaturesEXT meshShaderQueries(@NativeType("VkBool32") boolean value) { nmeshShaderQueries(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceMeshShaderFeaturesEXT set(
        int sType,
        long pNext,
        boolean taskShader,
        boolean meshShader,
        boolean multiviewMeshShader,
        boolean primitiveFragmentShadingRateMeshShader,
        boolean meshShaderQueries
    ) {
        sType(sType);
        pNext(pNext);
        taskShader(taskShader);
        meshShader(meshShader);
        multiviewMeshShader(multiviewMeshShader);
        primitiveFragmentShadingRateMeshShader(primitiveFragmentShadingRateMeshShader);
        meshShaderQueries(meshShaderQueries);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceMeshShaderFeaturesEXT set(VkPhysicalDeviceMeshShaderFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMeshShaderFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMeshShaderFeaturesEXT malloc() {
        return new VkPhysicalDeviceMeshShaderFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMeshShaderFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMeshShaderFeaturesEXT calloc() {
        return new VkPhysicalDeviceMeshShaderFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMeshShaderFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMeshShaderFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMeshShaderFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMeshShaderFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceMeshShaderFeaturesEXT create(long address) {
        return new VkPhysicalDeviceMeshShaderFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMeshShaderFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceMeshShaderFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMeshShaderFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMeshShaderFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMeshShaderFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMeshShaderFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMeshShaderFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMeshShaderFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceMeshShaderFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMeshShaderFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMeshShaderFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMeshShaderFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMeshShaderFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMeshShaderFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMeshShaderFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMeshShaderFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMeshShaderFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMeshShaderFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMeshShaderFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMeshShaderFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMeshShaderFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMeshShaderFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #taskShader}. */
    public static int ntaskShader(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderFeaturesEXT.TASKSHADER); }
    /** Unsafe version of {@link #meshShader}. */
    public static int nmeshShader(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderFeaturesEXT.MESHSHADER); }
    /** Unsafe version of {@link #multiviewMeshShader}. */
    public static int nmultiviewMeshShader(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderFeaturesEXT.MULTIVIEWMESHSHADER); }
    /** Unsafe version of {@link #primitiveFragmentShadingRateMeshShader}. */
    public static int nprimitiveFragmentShadingRateMeshShader(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderFeaturesEXT.PRIMITIVEFRAGMENTSHADINGRATEMESHSHADER); }
    /** Unsafe version of {@link #meshShaderQueries}. */
    public static int nmeshShaderQueries(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderFeaturesEXT.MESHSHADERQUERIES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMeshShaderFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceMeshShaderFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #taskShader(boolean) taskShader}. */
    public static void ntaskShader(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMeshShaderFeaturesEXT.TASKSHADER, value); }
    /** Unsafe version of {@link #meshShader(boolean) meshShader}. */
    public static void nmeshShader(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMeshShaderFeaturesEXT.MESHSHADER, value); }
    /** Unsafe version of {@link #multiviewMeshShader(boolean) multiviewMeshShader}. */
    public static void nmultiviewMeshShader(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMeshShaderFeaturesEXT.MULTIVIEWMESHSHADER, value); }
    /** Unsafe version of {@link #primitiveFragmentShadingRateMeshShader(boolean) primitiveFragmentShadingRateMeshShader}. */
    public static void nprimitiveFragmentShadingRateMeshShader(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMeshShaderFeaturesEXT.PRIMITIVEFRAGMENTSHADINGRATEMESHSHADER, value); }
    /** Unsafe version of {@link #meshShaderQueries(boolean) meshShaderQueries}. */
    public static void nmeshShaderQueries(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMeshShaderFeaturesEXT.MESHSHADERQUERIES, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMeshShaderFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMeshShaderFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceMeshShaderFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceMeshShaderFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMeshShaderFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMeshShaderFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceMeshShaderFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceMeshShaderFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMeshShaderFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMeshShaderFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMeshShaderFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMeshShaderFeaturesEXT#taskShader} field. */
        @NativeType("VkBool32")
        public boolean taskShader() { return VkPhysicalDeviceMeshShaderFeaturesEXT.ntaskShader(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceMeshShaderFeaturesEXT#meshShader} field. */
        @NativeType("VkBool32")
        public boolean meshShader() { return VkPhysicalDeviceMeshShaderFeaturesEXT.nmeshShader(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceMeshShaderFeaturesEXT#multiviewMeshShader} field. */
        @NativeType("VkBool32")
        public boolean multiviewMeshShader() { return VkPhysicalDeviceMeshShaderFeaturesEXT.nmultiviewMeshShader(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceMeshShaderFeaturesEXT#primitiveFragmentShadingRateMeshShader} field. */
        @NativeType("VkBool32")
        public boolean primitiveFragmentShadingRateMeshShader() { return VkPhysicalDeviceMeshShaderFeaturesEXT.nprimitiveFragmentShadingRateMeshShader(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceMeshShaderFeaturesEXT#meshShaderQueries} field. */
        @NativeType("VkBool32")
        public boolean meshShaderQueries() { return VkPhysicalDeviceMeshShaderFeaturesEXT.nmeshShaderQueries(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceMeshShaderFeaturesEXT#sType} field. */
        public VkPhysicalDeviceMeshShaderFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMeshShaderFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTMeshShader#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_FEATURES_EXT} value to the {@link VkPhysicalDeviceMeshShaderFeaturesEXT#sType} field. */
        public VkPhysicalDeviceMeshShaderFeaturesEXT.Buffer sType$Default() { return sType(EXTMeshShader.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceMeshShaderFeaturesEXT#pNext} field. */
        public VkPhysicalDeviceMeshShaderFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMeshShaderFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceMeshShaderFeaturesEXT#taskShader} field. */
        public VkPhysicalDeviceMeshShaderFeaturesEXT.Buffer taskShader(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceMeshShaderFeaturesEXT.ntaskShader(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceMeshShaderFeaturesEXT#meshShader} field. */
        public VkPhysicalDeviceMeshShaderFeaturesEXT.Buffer meshShader(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceMeshShaderFeaturesEXT.nmeshShader(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceMeshShaderFeaturesEXT#multiviewMeshShader} field. */
        public VkPhysicalDeviceMeshShaderFeaturesEXT.Buffer multiviewMeshShader(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceMeshShaderFeaturesEXT.nmultiviewMeshShader(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceMeshShaderFeaturesEXT#primitiveFragmentShadingRateMeshShader} field. */
        public VkPhysicalDeviceMeshShaderFeaturesEXT.Buffer primitiveFragmentShadingRateMeshShader(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceMeshShaderFeaturesEXT.nprimitiveFragmentShadingRateMeshShader(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceMeshShaderFeaturesEXT#meshShaderQueries} field. */
        public VkPhysicalDeviceMeshShaderFeaturesEXT.Buffer meshShaderQueries(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceMeshShaderFeaturesEXT.nmeshShaderQueries(address(), value ? 1 : 0); return this; }

    }

}