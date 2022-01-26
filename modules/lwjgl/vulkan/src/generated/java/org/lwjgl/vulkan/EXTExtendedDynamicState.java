/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This extension adds some more dynamic state to support applications that need to reduce the number of pipeline state objects they compile and bind.
 * 
 * <h5>Promotion to Vulkan 1.3</h5>
 * 
 * <p>This extension has been partially promoted. All dynamic state enumerants and entry points in this extension are included in core Vulkan 1.3, with the EXT suffix omitted. The feature structure is not promoted. Extension interfaces that were promoted remain available as aliases of the core functionality.</p>
 * 
 * <h5>VK_EXT_extended_dynamic_state</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_extended_dynamic_state}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>268</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Deprecation state</b></dt>
 * <dd><ul>
 * <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#versions-1.3-promotions">Vulkan 1.3</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Piers Daniell <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_extended_dynamic_state]%20@pdaniell-nv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_extended_dynamic_state%20extension%3E%3E">pdaniell-nv</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2019-12-09</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>Promoted to Vulkan 1.3 Core</li>
 * </ul></dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Dan Ginsburg, Valve Corporation</li>
 * <li>Graeme Leese, Broadcom</li>
 * <li>Hans-Kristian Arntzen, Valve Corporation</li>
 * <li>Jan-Harald Fredriksen, Arm Limited</li>
 * <li>Jason Ekstrand, Intel</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Jesse Hall, Google</li>
 * <li>Philip Rebohle, Valve Corporation</li>
 * <li>Stuart Smith, Imagination Technologies</li>
 * <li>Tobias Hector, AMD</li>
 * </ul></dd>
 * </dl>
 */
public class EXTExtendedDynamicState {

    /** The extension specification version. */
    public static final int VK_EXT_EXTENDED_DYNAMIC_STATE_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_EXTENDED_DYNAMIC_STATE_EXTENSION_NAME = "VK_EXT_extended_dynamic_state";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_FEATURES_EXT = 1000267000;

    /**
     * Extends {@code VkDynamicState}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_DYNAMIC_STATE_CULL_MODE_EXT DYNAMIC_STATE_CULL_MODE_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_FRONT_FACE_EXT DYNAMIC_STATE_FRONT_FACE_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_PRIMITIVE_TOPOLOGY_EXT DYNAMIC_STATE_PRIMITIVE_TOPOLOGY_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT_EXT DYNAMIC_STATE_VIEWPORT_WITH_COUNT_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_SCISSOR_WITH_COUNT_EXT DYNAMIC_STATE_SCISSOR_WITH_COUNT_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_DEPTH_TEST_ENABLE_EXT DYNAMIC_STATE_DEPTH_TEST_ENABLE_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_DEPTH_WRITE_ENABLE_EXT DYNAMIC_STATE_DEPTH_WRITE_ENABLE_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_DEPTH_COMPARE_OP_EXT DYNAMIC_STATE_DEPTH_COMPARE_OP_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE_EXT DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_STENCIL_TEST_ENABLE_EXT DYNAMIC_STATE_STENCIL_TEST_ENABLE_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_STENCIL_OP_EXT DYNAMIC_STATE_STENCIL_OP_EXT}</li>
     * </ul>
     */
    public static final int
        VK_DYNAMIC_STATE_CULL_MODE_EXT                   = 1000267000,
        VK_DYNAMIC_STATE_FRONT_FACE_EXT                  = 1000267001,
        VK_DYNAMIC_STATE_PRIMITIVE_TOPOLOGY_EXT          = 1000267002,
        VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT_EXT         = 1000267003,
        VK_DYNAMIC_STATE_SCISSOR_WITH_COUNT_EXT          = 1000267004,
        VK_DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT = 1000267005,
        VK_DYNAMIC_STATE_DEPTH_TEST_ENABLE_EXT           = 1000267006,
        VK_DYNAMIC_STATE_DEPTH_WRITE_ENABLE_EXT          = 1000267007,
        VK_DYNAMIC_STATE_DEPTH_COMPARE_OP_EXT            = 1000267008,
        VK_DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE_EXT    = 1000267009,
        VK_DYNAMIC_STATE_STENCIL_TEST_ENABLE_EXT         = 1000267010,
        VK_DYNAMIC_STATE_STENCIL_OP_EXT                  = 1000267011;

    protected EXTExtendedDynamicState() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdSetCullModeEXT ] ---

    /**
     * See {@link VK13#vkCmdSetCullMode CmdSetCullMode}.
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param cullMode      specifies the cull mode property to use for drawing.
     */
    public static void vkCmdSetCullModeEXT(VkCommandBuffer commandBuffer, @NativeType("VkCullModeFlags") int cullMode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCullModeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), cullMode, __functionAddress);
    }

    // --- [ vkCmdSetFrontFaceEXT ] ---

    /**
     * See {@link VK13#vkCmdSetFrontFace CmdSetFrontFace}.
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param frontFace     a {@code VkFrontFace} value specifying the front-facing triangle orientation to be used for culling.
     */
    public static void vkCmdSetFrontFaceEXT(VkCommandBuffer commandBuffer, @NativeType("VkFrontFace") int frontFace) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetFrontFaceEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), frontFace, __functionAddress);
    }

    // --- [ vkCmdSetPrimitiveTopologyEXT ] ---

    /**
     * See {@link VK13#vkCmdSetPrimitiveTopology CmdSetPrimitiveTopology}.
     *
     * @param commandBuffer     the command buffer into which the command will be recorded.
     * @param primitiveTopology specifies the primitive topology to use for drawing.
     */
    public static void vkCmdSetPrimitiveTopologyEXT(VkCommandBuffer commandBuffer, @NativeType("VkPrimitiveTopology") int primitiveTopology) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetPrimitiveTopologyEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), primitiveTopology, __functionAddress);
    }

    // --- [ vkCmdSetViewportWithCountEXT ] ---

    /**
     * Unsafe version of: {@link #vkCmdSetViewportWithCountEXT CmdSetViewportWithCountEXT}
     *
     * @param viewportCount specifies the viewport count.
     */
    public static void nvkCmdSetViewportWithCountEXT(VkCommandBuffer commandBuffer, int viewportCount, long pViewports) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetViewportWithCountEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), viewportCount, pViewports, __functionAddress);
    }

    /**
     * See {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}.
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param pViewports    specifies the viewports to use for drawing.
     */
    public static void vkCmdSetViewportWithCountEXT(VkCommandBuffer commandBuffer, @NativeType("VkViewport const *") VkViewport.Buffer pViewports) {
        nvkCmdSetViewportWithCountEXT(commandBuffer, pViewports.remaining(), pViewports.address());
    }

    // --- [ vkCmdSetScissorWithCountEXT ] ---

    /**
     * Unsafe version of: {@link #vkCmdSetScissorWithCountEXT CmdSetScissorWithCountEXT}
     *
     * @param scissorCount specifies the scissor count.
     */
    public static void nvkCmdSetScissorWithCountEXT(VkCommandBuffer commandBuffer, int scissorCount, long pScissors) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetScissorWithCountEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), scissorCount, pScissors, __functionAddress);
    }

    /**
     * See {@link VK13#vkCmdSetScissorWithCount CmdSetScissorWithCount}.
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param pScissors     specifies the scissors to use for drawing.
     */
    public static void vkCmdSetScissorWithCountEXT(VkCommandBuffer commandBuffer, @NativeType("VkRect2D const *") VkRect2D.Buffer pScissors) {
        nvkCmdSetScissorWithCountEXT(commandBuffer, pScissors.remaining(), pScissors.address());
    }

    // --- [ vkCmdBindVertexBuffers2EXT ] ---

    /**
     * Unsafe version of: {@link #vkCmdBindVertexBuffers2EXT CmdBindVertexBuffers2EXT}
     *
     * @param bindingCount the number of vertex input bindings whose state is updated by the command.
     */
    public static void nvkCmdBindVertexBuffers2EXT(VkCommandBuffer commandBuffer, int firstBinding, int bindingCount, long pBuffers, long pOffsets, long pSizes, long pStrides) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindVertexBuffers2EXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPPV(commandBuffer.address(), firstBinding, bindingCount, pBuffers, pOffsets, pSizes, pStrides, __functionAddress);
    }

    /**
     * See {@link VK13#vkCmdBindVertexBuffers2 CmdBindVertexBuffers2}.
     *
     * @param commandBuffer the command buffer into which the command is recorded.
     * @param firstBinding  the index of the first vertex input binding whose state is updated by the command.
     * @param pBuffers      a pointer to an array of buffer handles.
     * @param pOffsets      a pointer to an array of buffer offsets.
     * @param pSizes        {@code NULL} or a pointer to an array of the size in bytes of vertex data bound from {@code pBuffers}.
     * @param pStrides      {@code NULL} or a pointer to an array of buffer strides.
     */
    public static void vkCmdBindVertexBuffers2EXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstBinding, @NativeType("VkBuffer const *") LongBuffer pBuffers, @NativeType("VkDeviceSize const *") LongBuffer pOffsets, @Nullable @NativeType("VkDeviceSize const *") LongBuffer pSizes, @Nullable @NativeType("VkDeviceSize const *") LongBuffer pStrides) {
        if (CHECKS) {
            check(pOffsets, pBuffers.remaining());
            checkSafe(pSizes, pBuffers.remaining());
            checkSafe(pStrides, pBuffers.remaining());
        }
        nvkCmdBindVertexBuffers2EXT(commandBuffer, firstBinding, pBuffers.remaining(), memAddress(pBuffers), memAddress(pOffsets), memAddressSafe(pSizes), memAddressSafe(pStrides));
    }

    // --- [ vkCmdSetDepthTestEnableEXT ] ---

    /**
     * See {@link VK13#vkCmdSetDepthTestEnable CmdSetDepthTestEnable}.
     *
     * @param commandBuffer   the command buffer into which the command will be recorded.
     * @param depthTestEnable specifies if the depth test is enabled.
     */
    public static void vkCmdSetDepthTestEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean depthTestEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthTestEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), depthTestEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetDepthWriteEnableEXT ] ---

    /**
     * See {@link VK13#vkCmdSetDepthWriteEnable CmdSetDepthWriteEnable}.
     *
     * @param commandBuffer    the command buffer into which the command will be recorded.
     * @param depthWriteEnable specifies if depth writes are enabled.
     */
    public static void vkCmdSetDepthWriteEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean depthWriteEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthWriteEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), depthWriteEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetDepthCompareOpEXT ] ---

    /**
     * See {@link VK13#vkCmdSetDepthCompareOp CmdSetDepthCompareOp}.
     *
     * @param commandBuffer  the command buffer into which the command will be recorded.
     * @param depthCompareOp specifies the depth comparison operator.
     */
    public static void vkCmdSetDepthCompareOpEXT(VkCommandBuffer commandBuffer, @NativeType("VkCompareOp") int depthCompareOp) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthCompareOpEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), depthCompareOp, __functionAddress);
    }

    // --- [ vkCmdSetDepthBoundsTestEnableEXT ] ---

    /**
     * See {@link VK13#vkCmdSetDepthBoundsTestEnable CmdSetDepthBoundsTestEnable}.
     *
     * @param commandBuffer         the command buffer into which the command will be recorded.
     * @param depthBoundsTestEnable specifies if the depth bounds test is enabled.
     */
    public static void vkCmdSetDepthBoundsTestEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean depthBoundsTestEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthBoundsTestEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), depthBoundsTestEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetStencilTestEnableEXT ] ---

    /**
     * See {@link VK13#vkCmdSetStencilTestEnable CmdSetStencilTestEnable}.
     *
     * @param commandBuffer     the command buffer into which the command will be recorded.
     * @param stencilTestEnable specifies if the stencil test is enabled.
     */
    public static void vkCmdSetStencilTestEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean stencilTestEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetStencilTestEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), stencilTestEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetStencilOpEXT ] ---

    /**
     * See {@link VK13#vkCmdSetStencilOp CmdSetStencilOp}.
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param faceMask      a bitmask of {@code VkStencilFaceFlagBits} specifying the set of stencil state for which to update the stencil operation.
     * @param failOp        a {@code VkStencilOp} value specifying the action performed on samples that fail the stencil test.
     * @param passOp        a {@code VkStencilOp} value specifying the action performed on samples that pass both the depth and stencil tests.
     * @param depthFailOp   a {@code VkStencilOp} value specifying the action performed on samples that pass the stencil test and fail the depth test.
     * @param compareOp     a {@code VkCompareOp} value specifying the comparison operator used in the stencil test.
     */
    public static void vkCmdSetStencilOpEXT(VkCommandBuffer commandBuffer, @NativeType("VkStencilFaceFlags") int faceMask, @NativeType("VkStencilOp") int failOp, @NativeType("VkStencilOp") int passOp, @NativeType("VkStencilOp") int depthFailOp, @NativeType("VkCompareOp") int compareOp) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetStencilOpEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), faceMask, failOp, passOp, depthFailOp, compareOp, __functionAddress);
    }

    /** Array version of: {@link #vkCmdBindVertexBuffers2EXT CmdBindVertexBuffers2EXT} */
    public static void vkCmdBindVertexBuffers2EXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstBinding, @NativeType("VkBuffer const *") long[] pBuffers, @NativeType("VkDeviceSize const *") long[] pOffsets, @Nullable @NativeType("VkDeviceSize const *") long[] pSizes, @Nullable @NativeType("VkDeviceSize const *") long[] pStrides) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindVertexBuffers2EXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pOffsets, pBuffers.length);
            checkSafe(pSizes, pBuffers.length);
            checkSafe(pStrides, pBuffers.length);
        }
        callPPPPPV(commandBuffer.address(), firstBinding, pBuffers.length, pBuffers, pOffsets, pSizes, pStrides, __functionAddress);
    }

}