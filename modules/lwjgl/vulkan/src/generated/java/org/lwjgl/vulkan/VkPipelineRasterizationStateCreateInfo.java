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
 * Structure specifying parameters of a newly created pipeline rasterization state.
 * 
 * <h5>Description</h5>
 * 
 * <p>The application <b>can</b> also add a {@link VkPipelineRasterizationStateRasterizationOrderAMD} structure to the {@code pNext} chain of a {@link VkPipelineRasterizationStateCreateInfo} structure. This structure enables selecting the rasterization order to use when rendering with the corresponding graphics pipeline as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#primrast-order">Rasterization Order</a>.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-depthClamp">depth clamping</a> feature is not enabled, {@code depthClampEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-fillModeNonSolid">non-solid fill modes</a> feature is not enabled, {@code polygonMode} <b>must</b> be {@link VK10#VK_POLYGON_MODE_FILL POLYGON_MODE_FILL} or {@link NVFillRectangle#VK_POLYGON_MODE_FILL_RECTANGLE_NV POLYGON_MODE_FILL_RECTANGLE_NV}</li>
 * <li>If the {@link NVFillRectangle VK_NV_fill_rectangle} extension is not enabled, {@code polygonMode} <b>must</b> not be {@link NVFillRectangle#VK_POLYGON_MODE_FILL_RECTANGLE_NV POLYGON_MODE_FILL_RECTANGLE_NV}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkPipelineRasterizationConservativeStateCreateInfoEXT}, {@link VkPipelineRasterizationDepthClipStateCreateInfoEXT}, {@link VkPipelineRasterizationLineStateCreateInfoEXT}, {@link VkPipelineRasterizationStateRasterizationOrderAMD}, or {@link VkPipelineRasterizationStateStreamCreateInfoEXT}</li>
 * <li>Each {@code sType} member in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code polygonMode} <b>must</b> be a valid {@code VkPolygonMode} value</li>
 * <li>{@code cullMode} <b>must</b> be a valid combination of {@code VkCullModeFlagBits} values</li>
 * <li>{@code frontFace} <b>must</b> be a valid {@code VkFrontFace} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkGraphicsPipelineCreateInfo}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; reserved for future use.</li>
 * <li>{@code depthClampEnable} &ndash; controls whether to clamp the fragment&#8217;s depth values as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#fragops-depth">Depth Test</a>. If the pipeline is not created with {@link VkPipelineRasterizationDepthClipStateCreateInfoEXT} present then enabling depth clamp will also disable clipping primitives to the z planes of the frustrum as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#vertexpostproc-clipping">Primitive Clipping</a>. Otherwise depth clipping is controlled by the state set in {@link VkPipelineRasterizationDepthClipStateCreateInfoEXT}.</li>
 * <li>{@code rasterizerDiscardEnable} &ndash; controls whether primitives are discarded immediately before the rasterization stage.</li>
 * <li>{@code polygonMode} &ndash; the triangle rendering mode. See {@code VkPolygonMode}.</li>
 * <li>{@code cullMode} &ndash; the triangle facing direction used for primitive culling. See {@code VkCullModeFlagBits}.</li>
 * <li>{@code frontFace} &ndash; a {@code VkFrontFace} value specifying the front-facing triangle orientation to be used for culling.</li>
 * <li>{@code depthBiasEnable} &ndash; controls whether to bias fragment depth values.</li>
 * <li>{@code depthBiasConstantFactor} &ndash; a scalar factor controlling the constant depth value added to each fragment.</li>
 * <li>{@code depthBiasClamp} &ndash; the maximum (or minimum) depth bias of a fragment.</li>
 * <li>{@code depthBiasSlopeFactor} &ndash; a scalar factor applied to a fragment&#8217;s slope in depth bias calculations.</li>
 * <li>{@code lineWidth} &ndash; the width of rasterized line segments.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineRasterizationStateCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipelineRasterizationStateCreateFlags flags;
 *     VkBool32 depthClampEnable;
 *     VkBool32 rasterizerDiscardEnable;
 *     VkPolygonMode polygonMode;
 *     VkCullModeFlags cullMode;
 *     VkFrontFace frontFace;
 *     VkBool32 depthBiasEnable;
 *     float depthBiasConstantFactor;
 *     float depthBiasClamp;
 *     float depthBiasSlopeFactor;
 *     float lineWidth;
 * }</code></pre>
 */
public class VkPipelineRasterizationStateCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        DEPTHCLAMPENABLE,
        RASTERIZERDISCARDENABLE,
        POLYGONMODE,
        CULLMODE,
        FRONTFACE,
        DEPTHBIASENABLE,
        DEPTHBIASCONSTANTFACTOR,
        DEPTHBIASCLAMP,
        DEPTHBIASSLOPEFACTOR,
        LINEWIDTH;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
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
        FLAGS = layout.offsetof(2);
        DEPTHCLAMPENABLE = layout.offsetof(3);
        RASTERIZERDISCARDENABLE = layout.offsetof(4);
        POLYGONMODE = layout.offsetof(5);
        CULLMODE = layout.offsetof(6);
        FRONTFACE = layout.offsetof(7);
        DEPTHBIASENABLE = layout.offsetof(8);
        DEPTHBIASCONSTANTFACTOR = layout.offsetof(9);
        DEPTHBIASCLAMP = layout.offsetof(10);
        DEPTHBIASSLOPEFACTOR = layout.offsetof(11);
        LINEWIDTH = layout.offsetof(12);
    }

    /**
     * Creates a {@code VkPipelineRasterizationStateCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineRasterizationStateCreateInfo(ByteBuffer container) {
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
    @NativeType("VkPipelineRasterizationStateCreateFlags")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code depthClampEnable} field. */
    @NativeType("VkBool32")
    public boolean depthClampEnable() { return ndepthClampEnable(address()) != 0; }
    /** Returns the value of the {@code rasterizerDiscardEnable} field. */
    @NativeType("VkBool32")
    public boolean rasterizerDiscardEnable() { return nrasterizerDiscardEnable(address()) != 0; }
    /** Returns the value of the {@code polygonMode} field. */
    @NativeType("VkPolygonMode")
    public int polygonMode() { return npolygonMode(address()); }
    /** Returns the value of the {@code cullMode} field. */
    @NativeType("VkCullModeFlags")
    public int cullMode() { return ncullMode(address()); }
    /** Returns the value of the {@code frontFace} field. */
    @NativeType("VkFrontFace")
    public int frontFace() { return nfrontFace(address()); }
    /** Returns the value of the {@code depthBiasEnable} field. */
    @NativeType("VkBool32")
    public boolean depthBiasEnable() { return ndepthBiasEnable(address()) != 0; }
    /** Returns the value of the {@code depthBiasConstantFactor} field. */
    public float depthBiasConstantFactor() { return ndepthBiasConstantFactor(address()); }
    /** Returns the value of the {@code depthBiasClamp} field. */
    public float depthBiasClamp() { return ndepthBiasClamp(address()); }
    /** Returns the value of the {@code depthBiasSlopeFactor} field. */
    public float depthBiasSlopeFactor() { return ndepthBiasSlopeFactor(address()); }
    /** Returns the value of the {@code lineWidth} field. */
    public float lineWidth() { return nlineWidth(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineRasterizationStateCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineRasterizationStateCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkPipelineRasterizationStateCreateInfo flags(@NativeType("VkPipelineRasterizationStateCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code depthClampEnable} field. */
    public VkPipelineRasterizationStateCreateInfo depthClampEnable(@NativeType("VkBool32") boolean value) { ndepthClampEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code rasterizerDiscardEnable} field. */
    public VkPipelineRasterizationStateCreateInfo rasterizerDiscardEnable(@NativeType("VkBool32") boolean value) { nrasterizerDiscardEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code polygonMode} field. */
    public VkPipelineRasterizationStateCreateInfo polygonMode(@NativeType("VkPolygonMode") int value) { npolygonMode(address(), value); return this; }
    /** Sets the specified value to the {@code cullMode} field. */
    public VkPipelineRasterizationStateCreateInfo cullMode(@NativeType("VkCullModeFlags") int value) { ncullMode(address(), value); return this; }
    /** Sets the specified value to the {@code frontFace} field. */
    public VkPipelineRasterizationStateCreateInfo frontFace(@NativeType("VkFrontFace") int value) { nfrontFace(address(), value); return this; }
    /** Sets the specified value to the {@code depthBiasEnable} field. */
    public VkPipelineRasterizationStateCreateInfo depthBiasEnable(@NativeType("VkBool32") boolean value) { ndepthBiasEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code depthBiasConstantFactor} field. */
    public VkPipelineRasterizationStateCreateInfo depthBiasConstantFactor(float value) { ndepthBiasConstantFactor(address(), value); return this; }
    /** Sets the specified value to the {@code depthBiasClamp} field. */
    public VkPipelineRasterizationStateCreateInfo depthBiasClamp(float value) { ndepthBiasClamp(address(), value); return this; }
    /** Sets the specified value to the {@code depthBiasSlopeFactor} field. */
    public VkPipelineRasterizationStateCreateInfo depthBiasSlopeFactor(float value) { ndepthBiasSlopeFactor(address(), value); return this; }
    /** Sets the specified value to the {@code lineWidth} field. */
    public VkPipelineRasterizationStateCreateInfo lineWidth(float value) { nlineWidth(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineRasterizationStateCreateInfo set(
        int sType,
        long pNext,
        int flags,
        boolean depthClampEnable,
        boolean rasterizerDiscardEnable,
        int polygonMode,
        int cullMode,
        int frontFace,
        boolean depthBiasEnable,
        float depthBiasConstantFactor,
        float depthBiasClamp,
        float depthBiasSlopeFactor,
        float lineWidth
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        depthClampEnable(depthClampEnable);
        rasterizerDiscardEnable(rasterizerDiscardEnable);
        polygonMode(polygonMode);
        cullMode(cullMode);
        frontFace(frontFace);
        depthBiasEnable(depthBiasEnable);
        depthBiasConstantFactor(depthBiasConstantFactor);
        depthBiasClamp(depthBiasClamp);
        depthBiasSlopeFactor(depthBiasSlopeFactor);
        lineWidth(lineWidth);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineRasterizationStateCreateInfo set(VkPipelineRasterizationStateCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineRasterizationStateCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineRasterizationStateCreateInfo malloc() {
        return wrap(VkPipelineRasterizationStateCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineRasterizationStateCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineRasterizationStateCreateInfo calloc() {
        return wrap(VkPipelineRasterizationStateCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineRasterizationStateCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkPipelineRasterizationStateCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineRasterizationStateCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineRasterizationStateCreateInfo} instance for the specified memory address. */
    public static VkPipelineRasterizationStateCreateInfo create(long address) {
        return wrap(VkPipelineRasterizationStateCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineRasterizationStateCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineRasterizationStateCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationStateCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationStateCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationStateCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationStateCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineRasterizationStateCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationStateCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineRasterizationStateCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineRasterizationStateCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPipelineRasterizationStateCreateInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPipelineRasterizationStateCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPipelineRasterizationStateCreateInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPipelineRasterizationStateCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRasterizationStateCreateInfo mallocStack(MemoryStack stack) {
        return wrap(VkPipelineRasterizationStateCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineRasterizationStateCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRasterizationStateCreateInfo callocStack(MemoryStack stack) {
        return wrap(VkPipelineRasterizationStateCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineRasterizationStateCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationStateCreateInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineRasterizationStateCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationStateCreateInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineRasterizationStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationStateCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationStateCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRasterizationStateCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineRasterizationStateCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRasterizationStateCreateInfo.FLAGS); }
    /** Unsafe version of {@link #depthClampEnable}. */
    public static int ndepthClampEnable(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRasterizationStateCreateInfo.DEPTHCLAMPENABLE); }
    /** Unsafe version of {@link #rasterizerDiscardEnable}. */
    public static int nrasterizerDiscardEnable(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRasterizationStateCreateInfo.RASTERIZERDISCARDENABLE); }
    /** Unsafe version of {@link #polygonMode}. */
    public static int npolygonMode(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRasterizationStateCreateInfo.POLYGONMODE); }
    /** Unsafe version of {@link #cullMode}. */
    public static int ncullMode(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRasterizationStateCreateInfo.CULLMODE); }
    /** Unsafe version of {@link #frontFace}. */
    public static int nfrontFace(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRasterizationStateCreateInfo.FRONTFACE); }
    /** Unsafe version of {@link #depthBiasEnable}. */
    public static int ndepthBiasEnable(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRasterizationStateCreateInfo.DEPTHBIASENABLE); }
    /** Unsafe version of {@link #depthBiasConstantFactor}. */
    public static float ndepthBiasConstantFactor(long struct) { return UNSAFE.getFloat(null, struct + VkPipelineRasterizationStateCreateInfo.DEPTHBIASCONSTANTFACTOR); }
    /** Unsafe version of {@link #depthBiasClamp}. */
    public static float ndepthBiasClamp(long struct) { return UNSAFE.getFloat(null, struct + VkPipelineRasterizationStateCreateInfo.DEPTHBIASCLAMP); }
    /** Unsafe version of {@link #depthBiasSlopeFactor}. */
    public static float ndepthBiasSlopeFactor(long struct) { return UNSAFE.getFloat(null, struct + VkPipelineRasterizationStateCreateInfo.DEPTHBIASSLOPEFACTOR); }
    /** Unsafe version of {@link #lineWidth}. */
    public static float nlineWidth(long struct) { return UNSAFE.getFloat(null, struct + VkPipelineRasterizationStateCreateInfo.LINEWIDTH); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRasterizationStateCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineRasterizationStateCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRasterizationStateCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #depthClampEnable(boolean) depthClampEnable}. */
    public static void ndepthClampEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRasterizationStateCreateInfo.DEPTHCLAMPENABLE, value); }
    /** Unsafe version of {@link #rasterizerDiscardEnable(boolean) rasterizerDiscardEnable}. */
    public static void nrasterizerDiscardEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRasterizationStateCreateInfo.RASTERIZERDISCARDENABLE, value); }
    /** Unsafe version of {@link #polygonMode(int) polygonMode}. */
    public static void npolygonMode(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRasterizationStateCreateInfo.POLYGONMODE, value); }
    /** Unsafe version of {@link #cullMode(int) cullMode}. */
    public static void ncullMode(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRasterizationStateCreateInfo.CULLMODE, value); }
    /** Unsafe version of {@link #frontFace(int) frontFace}. */
    public static void nfrontFace(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRasterizationStateCreateInfo.FRONTFACE, value); }
    /** Unsafe version of {@link #depthBiasEnable(boolean) depthBiasEnable}. */
    public static void ndepthBiasEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRasterizationStateCreateInfo.DEPTHBIASENABLE, value); }
    /** Unsafe version of {@link #depthBiasConstantFactor(float) depthBiasConstantFactor}. */
    public static void ndepthBiasConstantFactor(long struct, float value) { UNSAFE.putFloat(null, struct + VkPipelineRasterizationStateCreateInfo.DEPTHBIASCONSTANTFACTOR, value); }
    /** Unsafe version of {@link #depthBiasClamp(float) depthBiasClamp}. */
    public static void ndepthBiasClamp(long struct, float value) { UNSAFE.putFloat(null, struct + VkPipelineRasterizationStateCreateInfo.DEPTHBIASCLAMP, value); }
    /** Unsafe version of {@link #depthBiasSlopeFactor(float) depthBiasSlopeFactor}. */
    public static void ndepthBiasSlopeFactor(long struct, float value) { UNSAFE.putFloat(null, struct + VkPipelineRasterizationStateCreateInfo.DEPTHBIASSLOPEFACTOR, value); }
    /** Unsafe version of {@link #lineWidth(float) lineWidth}. */
    public static void nlineWidth(long struct, float value) { UNSAFE.putFloat(null, struct + VkPipelineRasterizationStateCreateInfo.LINEWIDTH, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineRasterizationStateCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkPipelineRasterizationStateCreateInfo, Buffer> implements NativeResource {

        private static final VkPipelineRasterizationStateCreateInfo ELEMENT_FACTORY = VkPipelineRasterizationStateCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkPipelineRasterizationStateCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineRasterizationStateCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineRasterizationStateCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineRasterizationStateCreateInfo.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineRasterizationStateCreateInfo.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkPipelineRasterizationStateCreateFlags")
        public int flags() { return VkPipelineRasterizationStateCreateInfo.nflags(address()); }
        /** Returns the value of the {@code depthClampEnable} field. */
        @NativeType("VkBool32")
        public boolean depthClampEnable() { return VkPipelineRasterizationStateCreateInfo.ndepthClampEnable(address()) != 0; }
        /** Returns the value of the {@code rasterizerDiscardEnable} field. */
        @NativeType("VkBool32")
        public boolean rasterizerDiscardEnable() { return VkPipelineRasterizationStateCreateInfo.nrasterizerDiscardEnable(address()) != 0; }
        /** Returns the value of the {@code polygonMode} field. */
        @NativeType("VkPolygonMode")
        public int polygonMode() { return VkPipelineRasterizationStateCreateInfo.npolygonMode(address()); }
        /** Returns the value of the {@code cullMode} field. */
        @NativeType("VkCullModeFlags")
        public int cullMode() { return VkPipelineRasterizationStateCreateInfo.ncullMode(address()); }
        /** Returns the value of the {@code frontFace} field. */
        @NativeType("VkFrontFace")
        public int frontFace() { return VkPipelineRasterizationStateCreateInfo.nfrontFace(address()); }
        /** Returns the value of the {@code depthBiasEnable} field. */
        @NativeType("VkBool32")
        public boolean depthBiasEnable() { return VkPipelineRasterizationStateCreateInfo.ndepthBiasEnable(address()) != 0; }
        /** Returns the value of the {@code depthBiasConstantFactor} field. */
        public float depthBiasConstantFactor() { return VkPipelineRasterizationStateCreateInfo.ndepthBiasConstantFactor(address()); }
        /** Returns the value of the {@code depthBiasClamp} field. */
        public float depthBiasClamp() { return VkPipelineRasterizationStateCreateInfo.ndepthBiasClamp(address()); }
        /** Returns the value of the {@code depthBiasSlopeFactor} field. */
        public float depthBiasSlopeFactor() { return VkPipelineRasterizationStateCreateInfo.ndepthBiasSlopeFactor(address()); }
        /** Returns the value of the {@code lineWidth} field. */
        public float lineWidth() { return VkPipelineRasterizationStateCreateInfo.nlineWidth(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineRasterizationStateCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineRasterizationStateCreateInfo.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineRasterizationStateCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkPipelineRasterizationStateCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkPipelineRasterizationStateCreateInfo.Buffer flags(@NativeType("VkPipelineRasterizationStateCreateFlags") int value) { VkPipelineRasterizationStateCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code depthClampEnable} field. */
        public VkPipelineRasterizationStateCreateInfo.Buffer depthClampEnable(@NativeType("VkBool32") boolean value) { VkPipelineRasterizationStateCreateInfo.ndepthClampEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code rasterizerDiscardEnable} field. */
        public VkPipelineRasterizationStateCreateInfo.Buffer rasterizerDiscardEnable(@NativeType("VkBool32") boolean value) { VkPipelineRasterizationStateCreateInfo.nrasterizerDiscardEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code polygonMode} field. */
        public VkPipelineRasterizationStateCreateInfo.Buffer polygonMode(@NativeType("VkPolygonMode") int value) { VkPipelineRasterizationStateCreateInfo.npolygonMode(address(), value); return this; }
        /** Sets the specified value to the {@code cullMode} field. */
        public VkPipelineRasterizationStateCreateInfo.Buffer cullMode(@NativeType("VkCullModeFlags") int value) { VkPipelineRasterizationStateCreateInfo.ncullMode(address(), value); return this; }
        /** Sets the specified value to the {@code frontFace} field. */
        public VkPipelineRasterizationStateCreateInfo.Buffer frontFace(@NativeType("VkFrontFace") int value) { VkPipelineRasterizationStateCreateInfo.nfrontFace(address(), value); return this; }
        /** Sets the specified value to the {@code depthBiasEnable} field. */
        public VkPipelineRasterizationStateCreateInfo.Buffer depthBiasEnable(@NativeType("VkBool32") boolean value) { VkPipelineRasterizationStateCreateInfo.ndepthBiasEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code depthBiasConstantFactor} field. */
        public VkPipelineRasterizationStateCreateInfo.Buffer depthBiasConstantFactor(float value) { VkPipelineRasterizationStateCreateInfo.ndepthBiasConstantFactor(address(), value); return this; }
        /** Sets the specified value to the {@code depthBiasClamp} field. */
        public VkPipelineRasterizationStateCreateInfo.Buffer depthBiasClamp(float value) { VkPipelineRasterizationStateCreateInfo.ndepthBiasClamp(address(), value); return this; }
        /** Sets the specified value to the {@code depthBiasSlopeFactor} field. */
        public VkPipelineRasterizationStateCreateInfo.Buffer depthBiasSlopeFactor(float value) { VkPipelineRasterizationStateCreateInfo.ndepthBiasSlopeFactor(address(), value); return this; }
        /** Sets the specified value to the {@code lineWidth} field. */
        public VkPipelineRasterizationStateCreateInfo.Buffer lineWidth(float value) { VkPipelineRasterizationStateCreateInfo.nlineWidth(address(), value); return this; }

    }

}