/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.spvc;

/** Enumeration tokens for SPIR-V. */
public final class Spv {

    public static final int SPV_VERSION = 0x10600;

    public static final int SPV_REVISION = 1;

    public static final int SpvMagicNumber = 0x07230203;

    public static final int SpvVersion = 0x00010600;

    public static final int SpvRevision = 1;

    public static final int SpvOpCodeMask = 0xffff;

    public static final int SpvWordCountShift = 16;

    /**
     * {@code SpvSourceLanguage}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvSourceLanguageUnknown SourceLanguageUnknown}</li>
     * <li>{@link #SpvSourceLanguageESSL SourceLanguageESSL}</li>
     * <li>{@link #SpvSourceLanguageGLSL SourceLanguageGLSL}</li>
     * <li>{@link #SpvSourceLanguageOpenCL_C SourceLanguageOpenCL_C}</li>
     * <li>{@link #SpvSourceLanguageOpenCL_CPP SourceLanguageOpenCL_CPP}</li>
     * <li>{@link #SpvSourceLanguageHLSL SourceLanguageHLSL}</li>
     * <li>{@link #SpvSourceLanguageCPP_for_OpenCL SourceLanguageCPP_for_OpenCL}</li>
     * <li>{@link #SpvSourceLanguageMax SourceLanguageMax}</li>
     * </ul>
     */
    public static final int
        SpvSourceLanguageUnknown        = 0,
        SpvSourceLanguageESSL           = 1,
        SpvSourceLanguageGLSL           = 2,
        SpvSourceLanguageOpenCL_C       = 3,
        SpvSourceLanguageOpenCL_CPP     = 4,
        SpvSourceLanguageHLSL           = 5,
        SpvSourceLanguageCPP_for_OpenCL = 6,
        SpvSourceLanguageMax            = 0x7fffffff;

    /**
     * {@code SpvExecutionModel}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvExecutionModelVertex ExecutionModelVertex}</li>
     * <li>{@link #SpvExecutionModelTessellationControl ExecutionModelTessellationControl}</li>
     * <li>{@link #SpvExecutionModelTessellationEvaluation ExecutionModelTessellationEvaluation}</li>
     * <li>{@link #SpvExecutionModelGeometry ExecutionModelGeometry}</li>
     * <li>{@link #SpvExecutionModelFragment ExecutionModelFragment}</li>
     * <li>{@link #SpvExecutionModelGLCompute ExecutionModelGLCompute}</li>
     * <li>{@link #SpvExecutionModelKernel ExecutionModelKernel}</li>
     * <li>{@link #SpvExecutionModelTaskNV ExecutionModelTaskNV}</li>
     * <li>{@link #SpvExecutionModelMeshNV ExecutionModelMeshNV}</li>
     * <li>{@link #SpvExecutionModelRayGenerationKHR ExecutionModelRayGenerationKHR}</li>
     * <li>{@link #SpvExecutionModelRayGenerationNV ExecutionModelRayGenerationNV}</li>
     * <li>{@link #SpvExecutionModelIntersectionKHR ExecutionModelIntersectionKHR}</li>
     * <li>{@link #SpvExecutionModelIntersectionNV ExecutionModelIntersectionNV}</li>
     * <li>{@link #SpvExecutionModelAnyHitKHR ExecutionModelAnyHitKHR}</li>
     * <li>{@link #SpvExecutionModelAnyHitNV ExecutionModelAnyHitNV}</li>
     * <li>{@link #SpvExecutionModelClosestHitKHR ExecutionModelClosestHitKHR}</li>
     * <li>{@link #SpvExecutionModelClosestHitNV ExecutionModelClosestHitNV}</li>
     * <li>{@link #SpvExecutionModelMissKHR ExecutionModelMissKHR}</li>
     * <li>{@link #SpvExecutionModelMissNV ExecutionModelMissNV}</li>
     * <li>{@link #SpvExecutionModelCallableKHR ExecutionModelCallableKHR}</li>
     * <li>{@link #SpvExecutionModelCallableNV ExecutionModelCallableNV}</li>
     * <li>{@link #SpvExecutionModelMax ExecutionModelMax}</li>
     * </ul>
     */
    public static final int
        SpvExecutionModelVertex                 = 0,
        SpvExecutionModelTessellationControl    = 1,
        SpvExecutionModelTessellationEvaluation = 2,
        SpvExecutionModelGeometry               = 3,
        SpvExecutionModelFragment               = 4,
        SpvExecutionModelGLCompute              = 5,
        SpvExecutionModelKernel                 = 6,
        SpvExecutionModelTaskNV                 = 5267,
        SpvExecutionModelMeshNV                 = 5268,
        SpvExecutionModelRayGenerationKHR       = 5313,
        SpvExecutionModelRayGenerationNV        = 5313,
        SpvExecutionModelIntersectionKHR        = 5314,
        SpvExecutionModelIntersectionNV         = 5314,
        SpvExecutionModelAnyHitKHR              = 5315,
        SpvExecutionModelAnyHitNV               = 5315,
        SpvExecutionModelClosestHitKHR          = 5316,
        SpvExecutionModelClosestHitNV           = 5316,
        SpvExecutionModelMissKHR                = 5317,
        SpvExecutionModelMissNV                 = 5317,
        SpvExecutionModelCallableKHR            = 5318,
        SpvExecutionModelCallableNV             = 5318,
        SpvExecutionModelMax                    = 0x7fffffff;

    /**
     * {@code SpvAddressingModel}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvAddressingModelLogical AddressingModelLogical}</li>
     * <li>{@link #SpvAddressingModelPhysical32 AddressingModelPhysical32}</li>
     * <li>{@link #SpvAddressingModelPhysical64 AddressingModelPhysical64}</li>
     * <li>{@link #SpvAddressingModelPhysicalStorageBuffer64 AddressingModelPhysicalStorageBuffer64}</li>
     * <li>{@link #SpvAddressingModelPhysicalStorageBuffer64EXT AddressingModelPhysicalStorageBuffer64EXT}</li>
     * <li>{@link #SpvAddressingModelMax AddressingModelMax}</li>
     * </ul>
     */
    public static final int
        SpvAddressingModelLogical                    = 0,
        SpvAddressingModelPhysical32                 = 1,
        SpvAddressingModelPhysical64                 = 2,
        SpvAddressingModelPhysicalStorageBuffer64    = 5348,
        SpvAddressingModelPhysicalStorageBuffer64EXT = 5348,
        SpvAddressingModelMax                        = 0x7fffffff;

    /**
     * {@code SpvMemoryModel}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvMemoryModelSimple MemoryModelSimple}</li>
     * <li>{@link #SpvMemoryModelGLSL450 MemoryModelGLSL450}</li>
     * <li>{@link #SpvMemoryModelOpenCL MemoryModelOpenCL}</li>
     * <li>{@link #SpvMemoryModelVulkan MemoryModelVulkan}</li>
     * <li>{@link #SpvMemoryModelVulkanKHR MemoryModelVulkanKHR}</li>
     * <li>{@link #SpvMemoryModelMax MemoryModelMax}</li>
     * </ul>
     */
    public static final int
        SpvMemoryModelSimple    = 0,
        SpvMemoryModelGLSL450   = 1,
        SpvMemoryModelOpenCL    = 2,
        SpvMemoryModelVulkan    = 3,
        SpvMemoryModelVulkanKHR = 3,
        SpvMemoryModelMax       = 0x7fffffff;

    /**
     * {@code SpvExecutionMode}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvExecutionModeInvocations ExecutionModeInvocations}</li>
     * <li>{@link #SpvExecutionModeSpacingEqual ExecutionModeSpacingEqual}</li>
     * <li>{@link #SpvExecutionModeSpacingFractionalEven ExecutionModeSpacingFractionalEven}</li>
     * <li>{@link #SpvExecutionModeSpacingFractionalOdd ExecutionModeSpacingFractionalOdd}</li>
     * <li>{@link #SpvExecutionModeVertexOrderCw ExecutionModeVertexOrderCw}</li>
     * <li>{@link #SpvExecutionModeVertexOrderCcw ExecutionModeVertexOrderCcw}</li>
     * <li>{@link #SpvExecutionModePixelCenterInteger ExecutionModePixelCenterInteger}</li>
     * <li>{@link #SpvExecutionModeOriginUpperLeft ExecutionModeOriginUpperLeft}</li>
     * <li>{@link #SpvExecutionModeOriginLowerLeft ExecutionModeOriginLowerLeft}</li>
     * <li>{@link #SpvExecutionModeEarlyFragmentTests ExecutionModeEarlyFragmentTests}</li>
     * <li>{@link #SpvExecutionModePointMode ExecutionModePointMode}</li>
     * <li>{@link #SpvExecutionModeXfb ExecutionModeXfb}</li>
     * <li>{@link #SpvExecutionModeDepthReplacing ExecutionModeDepthReplacing}</li>
     * <li>{@link #SpvExecutionModeDepthGreater ExecutionModeDepthGreater}</li>
     * <li>{@link #SpvExecutionModeDepthLess ExecutionModeDepthLess}</li>
     * <li>{@link #SpvExecutionModeDepthUnchanged ExecutionModeDepthUnchanged}</li>
     * <li>{@link #SpvExecutionModeLocalSize ExecutionModeLocalSize}</li>
     * <li>{@link #SpvExecutionModeLocalSizeHint ExecutionModeLocalSizeHint}</li>
     * <li>{@link #SpvExecutionModeInputPoints ExecutionModeInputPoints}</li>
     * <li>{@link #SpvExecutionModeInputLines ExecutionModeInputLines}</li>
     * <li>{@link #SpvExecutionModeInputLinesAdjacency ExecutionModeInputLinesAdjacency}</li>
     * <li>{@link #SpvExecutionModeTriangles ExecutionModeTriangles}</li>
     * <li>{@link #SpvExecutionModeInputTrianglesAdjacency ExecutionModeInputTrianglesAdjacency}</li>
     * <li>{@link #SpvExecutionModeQuads ExecutionModeQuads}</li>
     * <li>{@link #SpvExecutionModeIsolines ExecutionModeIsolines}</li>
     * <li>{@link #SpvExecutionModeOutputVertices ExecutionModeOutputVertices}</li>
     * <li>{@link #SpvExecutionModeOutputPoints ExecutionModeOutputPoints}</li>
     * <li>{@link #SpvExecutionModeOutputLineStrip ExecutionModeOutputLineStrip}</li>
     * <li>{@link #SpvExecutionModeOutputTriangleStrip ExecutionModeOutputTriangleStrip}</li>
     * <li>{@link #SpvExecutionModeVecTypeHint ExecutionModeVecTypeHint}</li>
     * <li>{@link #SpvExecutionModeContractionOff ExecutionModeContractionOff}</li>
     * <li>{@link #SpvExecutionModeInitializer ExecutionModeInitializer}</li>
     * <li>{@link #SpvExecutionModeFinalizer ExecutionModeFinalizer}</li>
     * <li>{@link #SpvExecutionModeSubgroupSize ExecutionModeSubgroupSize}</li>
     * <li>{@link #SpvExecutionModeSubgroupsPerWorkgroup ExecutionModeSubgroupsPerWorkgroup}</li>
     * <li>{@link #SpvExecutionModeSubgroupsPerWorkgroupId ExecutionModeSubgroupsPerWorkgroupId}</li>
     * <li>{@link #SpvExecutionModeLocalSizeId ExecutionModeLocalSizeId}</li>
     * <li>{@link #SpvExecutionModeLocalSizeHintId ExecutionModeLocalSizeHintId}</li>
     * <li>{@link #SpvExecutionModeSubgroupUniformControlFlowKHR ExecutionModeSubgroupUniformControlFlowKHR}</li>
     * <li>{@link #SpvExecutionModePostDepthCoverage ExecutionModePostDepthCoverage}</li>
     * <li>{@link #SpvExecutionModeDenormPreserve ExecutionModeDenormPreserve}</li>
     * <li>{@link #SpvExecutionModeDenormFlushToZero ExecutionModeDenormFlushToZero}</li>
     * <li>{@link #SpvExecutionModeSignedZeroInfNanPreserve ExecutionModeSignedZeroInfNanPreserve}</li>
     * <li>{@link #SpvExecutionModeRoundingModeRTE ExecutionModeRoundingModeRTE}</li>
     * <li>{@link #SpvExecutionModeRoundingModeRTZ ExecutionModeRoundingModeRTZ}</li>
     * <li>{@link #SpvExecutionModeStencilRefReplacingEXT ExecutionModeStencilRefReplacingEXT}</li>
     * <li>{@link #SpvExecutionModeOutputLinesNV ExecutionModeOutputLinesNV}</li>
     * <li>{@link #SpvExecutionModeOutputPrimitivesNV ExecutionModeOutputPrimitivesNV}</li>
     * <li>{@link #SpvExecutionModeDerivativeGroupQuadsNV ExecutionModeDerivativeGroupQuadsNV}</li>
     * <li>{@link #SpvExecutionModeDerivativeGroupLinearNV ExecutionModeDerivativeGroupLinearNV}</li>
     * <li>{@link #SpvExecutionModeOutputTrianglesNV ExecutionModeOutputTrianglesNV}</li>
     * <li>{@link #SpvExecutionModePixelInterlockOrderedEXT ExecutionModePixelInterlockOrderedEXT}</li>
     * <li>{@link #SpvExecutionModePixelInterlockUnorderedEXT ExecutionModePixelInterlockUnorderedEXT}</li>
     * <li>{@link #SpvExecutionModeSampleInterlockOrderedEXT ExecutionModeSampleInterlockOrderedEXT}</li>
     * <li>{@link #SpvExecutionModeSampleInterlockUnorderedEXT ExecutionModeSampleInterlockUnorderedEXT}</li>
     * <li>{@link #SpvExecutionModeShadingRateInterlockOrderedEXT ExecutionModeShadingRateInterlockOrderedEXT}</li>
     * <li>{@link #SpvExecutionModeShadingRateInterlockUnorderedEXT ExecutionModeShadingRateInterlockUnorderedEXT}</li>
     * <li>{@link #SpvExecutionModeSharedLocalMemorySizeINTEL ExecutionModeSharedLocalMemorySizeINTEL}</li>
     * <li>{@link #SpvExecutionModeRoundingModeRTPINTEL ExecutionModeRoundingModeRTPINTEL}</li>
     * <li>{@link #SpvExecutionModeRoundingModeRTNINTEL ExecutionModeRoundingModeRTNINTEL}</li>
     * <li>{@link #SpvExecutionModeFloatingPointModeALTINTEL ExecutionModeFloatingPointModeALTINTEL}</li>
     * <li>{@link #SpvExecutionModeFloatingPointModeIEEEINTEL ExecutionModeFloatingPointModeIEEEINTEL}</li>
     * <li>{@link #SpvExecutionModeMaxWorkgroupSizeINTEL ExecutionModeMaxWorkgroupSizeINTEL}</li>
     * <li>{@link #SpvExecutionModeMaxWorkDimINTEL ExecutionModeMaxWorkDimINTEL}</li>
     * <li>{@link #SpvExecutionModeNoGlobalOffsetINTEL ExecutionModeNoGlobalOffsetINTEL}</li>
     * <li>{@link #SpvExecutionModeNumSIMDWorkitemsINTEL ExecutionModeNumSIMDWorkitemsINTEL}</li>
     * <li>{@link #SpvExecutionModeSchedulerTargetFmaxMhzINTEL ExecutionModeSchedulerTargetFmaxMhzINTEL}</li>
     * <li>{@link #SpvExecutionModeMax ExecutionModeMax}</li>
     * </ul>
     */
    public static final int
        SpvExecutionModeInvocations                      = 0,
        SpvExecutionModeSpacingEqual                     = 1,
        SpvExecutionModeSpacingFractionalEven            = 2,
        SpvExecutionModeSpacingFractionalOdd             = 3,
        SpvExecutionModeVertexOrderCw                    = 4,
        SpvExecutionModeVertexOrderCcw                   = 5,
        SpvExecutionModePixelCenterInteger               = 6,
        SpvExecutionModeOriginUpperLeft                  = 7,
        SpvExecutionModeOriginLowerLeft                  = 8,
        SpvExecutionModeEarlyFragmentTests               = 9,
        SpvExecutionModePointMode                        = 10,
        SpvExecutionModeXfb                              = 11,
        SpvExecutionModeDepthReplacing                   = 12,
        SpvExecutionModeDepthGreater                     = 14,
        SpvExecutionModeDepthLess                        = 15,
        SpvExecutionModeDepthUnchanged                   = 16,
        SpvExecutionModeLocalSize                        = 17,
        SpvExecutionModeLocalSizeHint                    = 18,
        SpvExecutionModeInputPoints                      = 19,
        SpvExecutionModeInputLines                       = 20,
        SpvExecutionModeInputLinesAdjacency              = 21,
        SpvExecutionModeTriangles                        = 22,
        SpvExecutionModeInputTrianglesAdjacency          = 23,
        SpvExecutionModeQuads                            = 24,
        SpvExecutionModeIsolines                         = 25,
        SpvExecutionModeOutputVertices                   = 26,
        SpvExecutionModeOutputPoints                     = 27,
        SpvExecutionModeOutputLineStrip                  = 28,
        SpvExecutionModeOutputTriangleStrip              = 29,
        SpvExecutionModeVecTypeHint                      = 30,
        SpvExecutionModeContractionOff                   = 31,
        SpvExecutionModeInitializer                      = 33,
        SpvExecutionModeFinalizer                        = 34,
        SpvExecutionModeSubgroupSize                     = 35,
        SpvExecutionModeSubgroupsPerWorkgroup            = 36,
        SpvExecutionModeSubgroupsPerWorkgroupId          = 37,
        SpvExecutionModeLocalSizeId                      = 38,
        SpvExecutionModeLocalSizeHintId                  = 39,
        SpvExecutionModeSubgroupUniformControlFlowKHR    = 4421,
        SpvExecutionModePostDepthCoverage                = 4446,
        SpvExecutionModeDenormPreserve                   = 4459,
        SpvExecutionModeDenormFlushToZero                = 4460,
        SpvExecutionModeSignedZeroInfNanPreserve         = 4461,
        SpvExecutionModeRoundingModeRTE                  = 4462,
        SpvExecutionModeRoundingModeRTZ                  = 4463,
        SpvExecutionModeStencilRefReplacingEXT           = 5027,
        SpvExecutionModeOutputLinesNV                    = 5269,
        SpvExecutionModeOutputPrimitivesNV               = 5270,
        SpvExecutionModeDerivativeGroupQuadsNV           = 5289,
        SpvExecutionModeDerivativeGroupLinearNV          = 5290,
        SpvExecutionModeOutputTrianglesNV                = 5298,
        SpvExecutionModePixelInterlockOrderedEXT         = 5366,
        SpvExecutionModePixelInterlockUnorderedEXT       = 5367,
        SpvExecutionModeSampleInterlockOrderedEXT        = 5368,
        SpvExecutionModeSampleInterlockUnorderedEXT      = 5369,
        SpvExecutionModeShadingRateInterlockOrderedEXT   = 5370,
        SpvExecutionModeShadingRateInterlockUnorderedEXT = 5371,
        SpvExecutionModeSharedLocalMemorySizeINTEL       = 5618,
        SpvExecutionModeRoundingModeRTPINTEL             = 5620,
        SpvExecutionModeRoundingModeRTNINTEL             = 5621,
        SpvExecutionModeFloatingPointModeALTINTEL        = 5622,
        SpvExecutionModeFloatingPointModeIEEEINTEL       = 5623,
        SpvExecutionModeMaxWorkgroupSizeINTEL            = 5893,
        SpvExecutionModeMaxWorkDimINTEL                  = 5894,
        SpvExecutionModeNoGlobalOffsetINTEL              = 5895,
        SpvExecutionModeNumSIMDWorkitemsINTEL            = 5896,
        SpvExecutionModeSchedulerTargetFmaxMhzINTEL      = 5903,
        SpvExecutionModeMax                              = 0x7fffffff;

    /**
     * {@code SpvStorageClass}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvStorageClassUniformConstant StorageClassUniformConstant}</li>
     * <li>{@link #SpvStorageClassInput StorageClassInput}</li>
     * <li>{@link #SpvStorageClassUniform StorageClassUniform}</li>
     * <li>{@link #SpvStorageClassOutput StorageClassOutput}</li>
     * <li>{@link #SpvStorageClassWorkgroup StorageClassWorkgroup}</li>
     * <li>{@link #SpvStorageClassCrossWorkgroup StorageClassCrossWorkgroup}</li>
     * <li>{@link #SpvStorageClassPrivate StorageClassPrivate}</li>
     * <li>{@link #SpvStorageClassFunction StorageClassFunction}</li>
     * <li>{@link #SpvStorageClassGeneric StorageClassGeneric}</li>
     * <li>{@link #SpvStorageClassPushConstant StorageClassPushConstant}</li>
     * <li>{@link #SpvStorageClassAtomicCounter StorageClassAtomicCounter}</li>
     * <li>{@link #SpvStorageClassImage StorageClassImage}</li>
     * <li>{@link #SpvStorageClassStorageBuffer StorageClassStorageBuffer}</li>
     * <li>{@link #SpvStorageClassCallableDataKHR StorageClassCallableDataKHR}</li>
     * <li>{@link #SpvStorageClassCallableDataNV StorageClassCallableDataNV}</li>
     * <li>{@link #SpvStorageClassIncomingCallableDataKHR StorageClassIncomingCallableDataKHR}</li>
     * <li>{@link #SpvStorageClassIncomingCallableDataNV StorageClassIncomingCallableDataNV}</li>
     * <li>{@link #SpvStorageClassRayPayloadKHR StorageClassRayPayloadKHR}</li>
     * <li>{@link #SpvStorageClassRayPayloadNV StorageClassRayPayloadNV}</li>
     * <li>{@link #SpvStorageClassHitAttributeKHR StorageClassHitAttributeKHR}</li>
     * <li>{@link #SpvStorageClassHitAttributeNV StorageClassHitAttributeNV}</li>
     * <li>{@link #SpvStorageClassIncomingRayPayloadKHR StorageClassIncomingRayPayloadKHR}</li>
     * <li>{@link #SpvStorageClassIncomingRayPayloadNV StorageClassIncomingRayPayloadNV}</li>
     * <li>{@link #SpvStorageClassShaderRecordBufferKHR StorageClassShaderRecordBufferKHR}</li>
     * <li>{@link #SpvStorageClassShaderRecordBufferNV StorageClassShaderRecordBufferNV}</li>
     * <li>{@link #SpvStorageClassPhysicalStorageBuffer StorageClassPhysicalStorageBuffer}</li>
     * <li>{@link #SpvStorageClassPhysicalStorageBufferEXT StorageClassPhysicalStorageBufferEXT}</li>
     * <li>{@link #SpvStorageClassCodeSectionINTEL StorageClassCodeSectionINTEL}</li>
     * <li>{@link #SpvStorageClassDeviceOnlyINTEL StorageClassDeviceOnlyINTEL}</li>
     * <li>{@link #SpvStorageClassHostOnlyINTEL StorageClassHostOnlyINTEL}</li>
     * <li>{@link #SpvStorageClassMax StorageClassMax}</li>
     * </ul>
     */
    public static final int
        SpvStorageClassUniformConstant          = 0,
        SpvStorageClassInput                    = 1,
        SpvStorageClassUniform                  = 2,
        SpvStorageClassOutput                   = 3,
        SpvStorageClassWorkgroup                = 4,
        SpvStorageClassCrossWorkgroup           = 5,
        SpvStorageClassPrivate                  = 6,
        SpvStorageClassFunction                 = 7,
        SpvStorageClassGeneric                  = 8,
        SpvStorageClassPushConstant             = 9,
        SpvStorageClassAtomicCounter            = 10,
        SpvStorageClassImage                    = 11,
        SpvStorageClassStorageBuffer            = 12,
        SpvStorageClassCallableDataKHR          = 5328,
        SpvStorageClassCallableDataNV           = 5328,
        SpvStorageClassIncomingCallableDataKHR  = 5329,
        SpvStorageClassIncomingCallableDataNV   = 5329,
        SpvStorageClassRayPayloadKHR            = 5338,
        SpvStorageClassRayPayloadNV             = 5338,
        SpvStorageClassHitAttributeKHR          = 5339,
        SpvStorageClassHitAttributeNV           = 5339,
        SpvStorageClassIncomingRayPayloadKHR    = 5342,
        SpvStorageClassIncomingRayPayloadNV     = 5342,
        SpvStorageClassShaderRecordBufferKHR    = 5343,
        SpvStorageClassShaderRecordBufferNV     = 5343,
        SpvStorageClassPhysicalStorageBuffer    = 5349,
        SpvStorageClassPhysicalStorageBufferEXT = 5349,
        SpvStorageClassCodeSectionINTEL         = 5605,
        SpvStorageClassDeviceOnlyINTEL          = 5936,
        SpvStorageClassHostOnlyINTEL            = 5937,
        SpvStorageClassMax                      = 0x7fffffff;

    /**
     * {@code SpvDim}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvDim1D Dim1D}</li>
     * <li>{@link #SpvDim2D Dim2D}</li>
     * <li>{@link #SpvDim3D Dim3D}</li>
     * <li>{@link #SpvDimCube DimCube}</li>
     * <li>{@link #SpvDimRect DimRect}</li>
     * <li>{@link #SpvDimBuffer DimBuffer}</li>
     * <li>{@link #SpvDimSubpassData DimSubpassData}</li>
     * <li>{@link #SpvDimMax DimMax}</li>
     * </ul>
     */
    public static final int
        SpvDim1D          = 0,
        SpvDim2D          = 1,
        SpvDim3D          = 2,
        SpvDimCube        = 3,
        SpvDimRect        = 4,
        SpvDimBuffer      = 5,
        SpvDimSubpassData = 6,
        SpvDimMax         = 0x7fffffff;

    /**
     * {@code SpvSamplerAddressingMode}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvSamplerAddressingModeNone SamplerAddressingModeNone}</li>
     * <li>{@link #SpvSamplerAddressingModeClampToEdge SamplerAddressingModeClampToEdge}</li>
     * <li>{@link #SpvSamplerAddressingModeClamp SamplerAddressingModeClamp}</li>
     * <li>{@link #SpvSamplerAddressingModeRepeat SamplerAddressingModeRepeat}</li>
     * <li>{@link #SpvSamplerAddressingModeRepeatMirrored SamplerAddressingModeRepeatMirrored}</li>
     * <li>{@link #SpvSamplerAddressingModeMax SamplerAddressingModeMax}</li>
     * </ul>
     */
    public static final int
        SpvSamplerAddressingModeNone           = 0,
        SpvSamplerAddressingModeClampToEdge    = 1,
        SpvSamplerAddressingModeClamp          = 2,
        SpvSamplerAddressingModeRepeat         = 3,
        SpvSamplerAddressingModeRepeatMirrored = 4,
        SpvSamplerAddressingModeMax            = 0x7fffffff;

    /**
     * {@code SpvSamplerFilterMode}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvSamplerFilterModeNearest SamplerFilterModeNearest}</li>
     * <li>{@link #SpvSamplerFilterModeLinear SamplerFilterModeLinear}</li>
     * <li>{@link #SpvSamplerFilterModeMax SamplerFilterModeMax}</li>
     * </ul>
     */
    public static final int
        SpvSamplerFilterModeNearest = 0,
        SpvSamplerFilterModeLinear  = 1,
        SpvSamplerFilterModeMax     = 0x7fffffff;

    /**
     * {@code SpvImageFormat}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvImageFormatUnknown ImageFormatUnknown}</li>
     * <li>{@link #SpvImageFormatRgba32f ImageFormatRgba32f}</li>
     * <li>{@link #SpvImageFormatRgba16f ImageFormatRgba16f}</li>
     * <li>{@link #SpvImageFormatR32f ImageFormatR32f}</li>
     * <li>{@link #SpvImageFormatRgba8 ImageFormatRgba8}</li>
     * <li>{@link #SpvImageFormatRgba8Snorm ImageFormatRgba8Snorm}</li>
     * <li>{@link #SpvImageFormatRg32f ImageFormatRg32f}</li>
     * <li>{@link #SpvImageFormatRg16f ImageFormatRg16f}</li>
     * <li>{@link #SpvImageFormatR11fG11fB10f ImageFormatR11fG11fB10f}</li>
     * <li>{@link #SpvImageFormatR16f ImageFormatR16f}</li>
     * <li>{@link #SpvImageFormatRgba16 ImageFormatRgba16}</li>
     * <li>{@link #SpvImageFormatRgb10A2 ImageFormatRgb10A2}</li>
     * <li>{@link #SpvImageFormatRg16 ImageFormatRg16}</li>
     * <li>{@link #SpvImageFormatRg8 ImageFormatRg8}</li>
     * <li>{@link #SpvImageFormatR16 ImageFormatR16}</li>
     * <li>{@link #SpvImageFormatR8 ImageFormatR8}</li>
     * <li>{@link #SpvImageFormatRgba16Snorm ImageFormatRgba16Snorm}</li>
     * <li>{@link #SpvImageFormatRg16Snorm ImageFormatRg16Snorm}</li>
     * <li>{@link #SpvImageFormatRg8Snorm ImageFormatRg8Snorm}</li>
     * <li>{@link #SpvImageFormatR16Snorm ImageFormatR16Snorm}</li>
     * <li>{@link #SpvImageFormatR8Snorm ImageFormatR8Snorm}</li>
     * <li>{@link #SpvImageFormatRgba32i ImageFormatRgba32i}</li>
     * <li>{@link #SpvImageFormatRgba16i ImageFormatRgba16i}</li>
     * <li>{@link #SpvImageFormatRgba8i ImageFormatRgba8i}</li>
     * <li>{@link #SpvImageFormatR32i ImageFormatR32i}</li>
     * <li>{@link #SpvImageFormatRg32i ImageFormatRg32i}</li>
     * <li>{@link #SpvImageFormatRg16i ImageFormatRg16i}</li>
     * <li>{@link #SpvImageFormatRg8i ImageFormatRg8i}</li>
     * <li>{@link #SpvImageFormatR16i ImageFormatR16i}</li>
     * <li>{@link #SpvImageFormatR8i ImageFormatR8i}</li>
     * <li>{@link #SpvImageFormatRgba32ui ImageFormatRgba32ui}</li>
     * <li>{@link #SpvImageFormatRgba16ui ImageFormatRgba16ui}</li>
     * <li>{@link #SpvImageFormatRgba8ui ImageFormatRgba8ui}</li>
     * <li>{@link #SpvImageFormatR32ui ImageFormatR32ui}</li>
     * <li>{@link #SpvImageFormatRgb10a2ui ImageFormatRgb10a2ui}</li>
     * <li>{@link #SpvImageFormatRg32ui ImageFormatRg32ui}</li>
     * <li>{@link #SpvImageFormatRg16ui ImageFormatRg16ui}</li>
     * <li>{@link #SpvImageFormatRg8ui ImageFormatRg8ui}</li>
     * <li>{@link #SpvImageFormatR16ui ImageFormatR16ui}</li>
     * <li>{@link #SpvImageFormatR8ui ImageFormatR8ui}</li>
     * <li>{@link #SpvImageFormatR64ui ImageFormatR64ui}</li>
     * <li>{@link #SpvImageFormatR64i ImageFormatR64i}</li>
     * <li>{@link #SpvImageFormatMax ImageFormatMax}</li>
     * </ul>
     */
    public static final int
        SpvImageFormatUnknown      = 0,
        SpvImageFormatRgba32f      = 1,
        SpvImageFormatRgba16f      = 2,
        SpvImageFormatR32f         = 3,
        SpvImageFormatRgba8        = 4,
        SpvImageFormatRgba8Snorm   = 5,
        SpvImageFormatRg32f        = 6,
        SpvImageFormatRg16f        = 7,
        SpvImageFormatR11fG11fB10f = 8,
        SpvImageFormatR16f         = 9,
        SpvImageFormatRgba16       = 10,
        SpvImageFormatRgb10A2      = 11,
        SpvImageFormatRg16         = 12,
        SpvImageFormatRg8          = 13,
        SpvImageFormatR16          = 14,
        SpvImageFormatR8           = 15,
        SpvImageFormatRgba16Snorm  = 16,
        SpvImageFormatRg16Snorm    = 17,
        SpvImageFormatRg8Snorm     = 18,
        SpvImageFormatR16Snorm     = 19,
        SpvImageFormatR8Snorm      = 20,
        SpvImageFormatRgba32i      = 21,
        SpvImageFormatRgba16i      = 22,
        SpvImageFormatRgba8i       = 23,
        SpvImageFormatR32i         = 24,
        SpvImageFormatRg32i        = 25,
        SpvImageFormatRg16i        = 26,
        SpvImageFormatRg8i         = 27,
        SpvImageFormatR16i         = 28,
        SpvImageFormatR8i          = 29,
        SpvImageFormatRgba32ui     = 30,
        SpvImageFormatRgba16ui     = 31,
        SpvImageFormatRgba8ui      = 32,
        SpvImageFormatR32ui        = 33,
        SpvImageFormatRgb10a2ui    = 34,
        SpvImageFormatRg32ui       = 35,
        SpvImageFormatRg16ui       = 36,
        SpvImageFormatRg8ui        = 37,
        SpvImageFormatR16ui        = 38,
        SpvImageFormatR8ui         = 39,
        SpvImageFormatR64ui        = 40,
        SpvImageFormatR64i         = 41,
        SpvImageFormatMax          = 0x7fffffff;

    /**
     * {@code SpvImageChannelOrder}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvImageChannelOrderR ImageChannelOrderR}</li>
     * <li>{@link #SpvImageChannelOrderA ImageChannelOrderA}</li>
     * <li>{@link #SpvImageChannelOrderRG ImageChannelOrderRG}</li>
     * <li>{@link #SpvImageChannelOrderRA ImageChannelOrderRA}</li>
     * <li>{@link #SpvImageChannelOrderRGB ImageChannelOrderRGB}</li>
     * <li>{@link #SpvImageChannelOrderRGBA ImageChannelOrderRGBA}</li>
     * <li>{@link #SpvImageChannelOrderBGRA ImageChannelOrderBGRA}</li>
     * <li>{@link #SpvImageChannelOrderARGB ImageChannelOrderARGB}</li>
     * <li>{@link #SpvImageChannelOrderIntensity ImageChannelOrderIntensity}</li>
     * <li>{@link #SpvImageChannelOrderLuminance ImageChannelOrderLuminance}</li>
     * <li>{@link #SpvImageChannelOrderRx ImageChannelOrderRx}</li>
     * <li>{@link #SpvImageChannelOrderRGx ImageChannelOrderRGx}</li>
     * <li>{@link #SpvImageChannelOrderRGBx ImageChannelOrderRGBx}</li>
     * <li>{@link #SpvImageChannelOrderDepth ImageChannelOrderDepth}</li>
     * <li>{@link #SpvImageChannelOrderDepthStencil ImageChannelOrderDepthStencil}</li>
     * <li>{@link #SpvImageChannelOrdersRGB ImageChannelOrdersRGB}</li>
     * <li>{@link #SpvImageChannelOrdersRGBx ImageChannelOrdersRGBx}</li>
     * <li>{@link #SpvImageChannelOrdersRGBA ImageChannelOrdersRGBA}</li>
     * <li>{@link #SpvImageChannelOrdersBGRA ImageChannelOrdersBGRA}</li>
     * <li>{@link #SpvImageChannelOrderABGR ImageChannelOrderABGR}</li>
     * <li>{@link #SpvImageChannelOrderMax ImageChannelOrderMax}</li>
     * </ul>
     */
    public static final int
        SpvImageChannelOrderR            = 0,
        SpvImageChannelOrderA            = 1,
        SpvImageChannelOrderRG           = 2,
        SpvImageChannelOrderRA           = 3,
        SpvImageChannelOrderRGB          = 4,
        SpvImageChannelOrderRGBA         = 5,
        SpvImageChannelOrderBGRA         = 6,
        SpvImageChannelOrderARGB         = 7,
        SpvImageChannelOrderIntensity    = 8,
        SpvImageChannelOrderLuminance    = 9,
        SpvImageChannelOrderRx           = 10,
        SpvImageChannelOrderRGx          = 11,
        SpvImageChannelOrderRGBx         = 12,
        SpvImageChannelOrderDepth        = 13,
        SpvImageChannelOrderDepthStencil = 14,
        SpvImageChannelOrdersRGB         = 15,
        SpvImageChannelOrdersRGBx        = 16,
        SpvImageChannelOrdersRGBA        = 17,
        SpvImageChannelOrdersBGRA        = 18,
        SpvImageChannelOrderABGR         = 19,
        SpvImageChannelOrderMax          = 0x7fffffff;

    /**
     * {@code SpvImageChannelDataType}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvImageChannelDataTypeSnormInt8 ImageChannelDataTypeSnormInt8}</li>
     * <li>{@link #SpvImageChannelDataTypeSnormInt16 ImageChannelDataTypeSnormInt16}</li>
     * <li>{@link #SpvImageChannelDataTypeUnormInt8 ImageChannelDataTypeUnormInt8}</li>
     * <li>{@link #SpvImageChannelDataTypeUnormInt16 ImageChannelDataTypeUnormInt16}</li>
     * <li>{@link #SpvImageChannelDataTypeUnormShort565 ImageChannelDataTypeUnormShort565}</li>
     * <li>{@link #SpvImageChannelDataTypeUnormShort555 ImageChannelDataTypeUnormShort555}</li>
     * <li>{@link #SpvImageChannelDataTypeUnormInt101010 ImageChannelDataTypeUnormInt101010}</li>
     * <li>{@link #SpvImageChannelDataTypeSignedInt8 ImageChannelDataTypeSignedInt8}</li>
     * <li>{@link #SpvImageChannelDataTypeSignedInt16 ImageChannelDataTypeSignedInt16}</li>
     * <li>{@link #SpvImageChannelDataTypeSignedInt32 ImageChannelDataTypeSignedInt32}</li>
     * <li>{@link #SpvImageChannelDataTypeUnsignedInt8 ImageChannelDataTypeUnsignedInt8}</li>
     * <li>{@link #SpvImageChannelDataTypeUnsignedInt16 ImageChannelDataTypeUnsignedInt16}</li>
     * <li>{@link #SpvImageChannelDataTypeUnsignedInt32 ImageChannelDataTypeUnsignedInt32}</li>
     * <li>{@link #SpvImageChannelDataTypeHalfFloat ImageChannelDataTypeHalfFloat}</li>
     * <li>{@link #SpvImageChannelDataTypeFloat ImageChannelDataTypeFloat}</li>
     * <li>{@link #SpvImageChannelDataTypeUnormInt24 ImageChannelDataTypeUnormInt24}</li>
     * <li>{@link #SpvImageChannelDataTypeUnormInt101010_2 ImageChannelDataTypeUnormInt101010_2}</li>
     * <li>{@link #SpvImageChannelDataTypeMax ImageChannelDataTypeMax}</li>
     * </ul>
     */
    public static final int
        SpvImageChannelDataTypeSnormInt8        = 0,
        SpvImageChannelDataTypeSnormInt16       = 1,
        SpvImageChannelDataTypeUnormInt8        = 2,
        SpvImageChannelDataTypeUnormInt16       = 3,
        SpvImageChannelDataTypeUnormShort565    = 4,
        SpvImageChannelDataTypeUnormShort555    = 5,
        SpvImageChannelDataTypeUnormInt101010   = 6,
        SpvImageChannelDataTypeSignedInt8       = 7,
        SpvImageChannelDataTypeSignedInt16      = 8,
        SpvImageChannelDataTypeSignedInt32      = 9,
        SpvImageChannelDataTypeUnsignedInt8     = 10,
        SpvImageChannelDataTypeUnsignedInt16    = 11,
        SpvImageChannelDataTypeUnsignedInt32    = 12,
        SpvImageChannelDataTypeHalfFloat        = 13,
        SpvImageChannelDataTypeFloat            = 14,
        SpvImageChannelDataTypeUnormInt24       = 15,
        SpvImageChannelDataTypeUnormInt101010_2 = 16,
        SpvImageChannelDataTypeMax              = 0x7fffffff;

    /**
     * {@code SpvImageOperandsShift}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvImageOperandsBiasShift ImageOperandsBiasShift}</li>
     * <li>{@link #SpvImageOperandsLodShift ImageOperandsLodShift}</li>
     * <li>{@link #SpvImageOperandsGradShift ImageOperandsGradShift}</li>
     * <li>{@link #SpvImageOperandsConstOffsetShift ImageOperandsConstOffsetShift}</li>
     * <li>{@link #SpvImageOperandsOffsetShift ImageOperandsOffsetShift}</li>
     * <li>{@link #SpvImageOperandsConstOffsetsShift ImageOperandsConstOffsetsShift}</li>
     * <li>{@link #SpvImageOperandsSampleShift ImageOperandsSampleShift}</li>
     * <li>{@link #SpvImageOperandsMinLodShift ImageOperandsMinLodShift}</li>
     * <li>{@link #SpvImageOperandsMakeTexelAvailableShift ImageOperandsMakeTexelAvailableShift}</li>
     * <li>{@link #SpvImageOperandsMakeTexelAvailableKHRShift ImageOperandsMakeTexelAvailableKHRShift}</li>
     * <li>{@link #SpvImageOperandsMakeTexelVisibleShift ImageOperandsMakeTexelVisibleShift}</li>
     * <li>{@link #SpvImageOperandsMakeTexelVisibleKHRShift ImageOperandsMakeTexelVisibleKHRShift}</li>
     * <li>{@link #SpvImageOperandsNonPrivateTexelShift ImageOperandsNonPrivateTexelShift}</li>
     * <li>{@link #SpvImageOperandsNonPrivateTexelKHRShift ImageOperandsNonPrivateTexelKHRShift}</li>
     * <li>{@link #SpvImageOperandsVolatileTexelShift ImageOperandsVolatileTexelShift}</li>
     * <li>{@link #SpvImageOperandsVolatileTexelKHRShift ImageOperandsVolatileTexelKHRShift}</li>
     * <li>{@link #SpvImageOperandsSignExtendShift ImageOperandsSignExtendShift}</li>
     * <li>{@link #SpvImageOperandsZeroExtendShift ImageOperandsZeroExtendShift}</li>
     * <li>{@link #SpvImageOperandsNontemporalShift ImageOperandsNontemporalShift}</li>
     * <li>{@link #SpvImageOperandsOffsetsShift ImageOperandsOffsetsShift}</li>
     * <li>{@link #SpvImageOperandsMax ImageOperandsMax}</li>
     * </ul>
     */
    public static final int
        SpvImageOperandsBiasShift                  = 0,
        SpvImageOperandsLodShift                   = 1,
        SpvImageOperandsGradShift                  = 2,
        SpvImageOperandsConstOffsetShift           = 3,
        SpvImageOperandsOffsetShift                = 4,
        SpvImageOperandsConstOffsetsShift          = 5,
        SpvImageOperandsSampleShift                = 6,
        SpvImageOperandsMinLodShift                = 7,
        SpvImageOperandsMakeTexelAvailableShift    = 8,
        SpvImageOperandsMakeTexelAvailableKHRShift = 8,
        SpvImageOperandsMakeTexelVisibleShift      = 9,
        SpvImageOperandsMakeTexelVisibleKHRShift   = 9,
        SpvImageOperandsNonPrivateTexelShift       = 10,
        SpvImageOperandsNonPrivateTexelKHRShift    = 10,
        SpvImageOperandsVolatileTexelShift         = 11,
        SpvImageOperandsVolatileTexelKHRShift      = 11,
        SpvImageOperandsSignExtendShift            = 12,
        SpvImageOperandsZeroExtendShift            = 13,
        SpvImageOperandsNontemporalShift           = 14,
        SpvImageOperandsOffsetsShift               = 16,
        SpvImageOperandsMax                        = 0x7fffffff;

    /**
     * {@code SpvImageOperandsMask}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvImageOperandsMaskNone ImageOperandsMaskNone}</li>
     * <li>{@link #SpvImageOperandsBiasMask ImageOperandsBiasMask}</li>
     * <li>{@link #SpvImageOperandsLodMask ImageOperandsLodMask}</li>
     * <li>{@link #SpvImageOperandsGradMask ImageOperandsGradMask}</li>
     * <li>{@link #SpvImageOperandsConstOffsetMask ImageOperandsConstOffsetMask}</li>
     * <li>{@link #SpvImageOperandsOffsetMask ImageOperandsOffsetMask}</li>
     * <li>{@link #SpvImageOperandsConstOffsetsMask ImageOperandsConstOffsetsMask}</li>
     * <li>{@link #SpvImageOperandsSampleMask ImageOperandsSampleMask}</li>
     * <li>{@link #SpvImageOperandsMinLodMask ImageOperandsMinLodMask}</li>
     * <li>{@link #SpvImageOperandsMakeTexelAvailableMask ImageOperandsMakeTexelAvailableMask}</li>
     * <li>{@link #SpvImageOperandsMakeTexelAvailableKHRMask ImageOperandsMakeTexelAvailableKHRMask}</li>
     * <li>{@link #SpvImageOperandsMakeTexelVisibleMask ImageOperandsMakeTexelVisibleMask}</li>
     * <li>{@link #SpvImageOperandsMakeTexelVisibleKHRMask ImageOperandsMakeTexelVisibleKHRMask}</li>
     * <li>{@link #SpvImageOperandsNonPrivateTexelMask ImageOperandsNonPrivateTexelMask}</li>
     * <li>{@link #SpvImageOperandsNonPrivateTexelKHRMask ImageOperandsNonPrivateTexelKHRMask}</li>
     * <li>{@link #SpvImageOperandsVolatileTexelMask ImageOperandsVolatileTexelMask}</li>
     * <li>{@link #SpvImageOperandsVolatileTexelKHRMask ImageOperandsVolatileTexelKHRMask}</li>
     * <li>{@link #SpvImageOperandsSignExtendMask ImageOperandsSignExtendMask}</li>
     * <li>{@link #SpvImageOperandsZeroExtendMask ImageOperandsZeroExtendMask}</li>
     * <li>{@link #SpvImageOperandsNontemporalMask ImageOperandsNontemporalMask}</li>
     * <li>{@link #SpvImageOperandsOffsetsMask ImageOperandsOffsetsMask}</li>
     * </ul>
     */
    public static final int
        SpvImageOperandsMaskNone                  = 0,
        SpvImageOperandsBiasMask                  = 0x00000001,
        SpvImageOperandsLodMask                   = 0x00000002,
        SpvImageOperandsGradMask                  = 0x00000004,
        SpvImageOperandsConstOffsetMask           = 0x00000008,
        SpvImageOperandsOffsetMask                = 0x00000010,
        SpvImageOperandsConstOffsetsMask          = 0x00000020,
        SpvImageOperandsSampleMask                = 0x00000040,
        SpvImageOperandsMinLodMask                = 0x00000080,
        SpvImageOperandsMakeTexelAvailableMask    = 0x00000100,
        SpvImageOperandsMakeTexelAvailableKHRMask = 0x00000100,
        SpvImageOperandsMakeTexelVisibleMask      = 0x00000200,
        SpvImageOperandsMakeTexelVisibleKHRMask   = 0x00000200,
        SpvImageOperandsNonPrivateTexelMask       = 0x00000400,
        SpvImageOperandsNonPrivateTexelKHRMask    = 0x00000400,
        SpvImageOperandsVolatileTexelMask         = 0x00000800,
        SpvImageOperandsVolatileTexelKHRMask      = 0x00000800,
        SpvImageOperandsSignExtendMask            = 0x00001000,
        SpvImageOperandsZeroExtendMask            = 0x00002000,
        SpvImageOperandsNontemporalMask           = 0x00004000,
        SpvImageOperandsOffsetsMask               = 0x00010000;

    /**
     * {@code SpvFPFastMathModeShift}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvFPFastMathModeNotNaNShift FPFastMathModeNotNaNShift}</li>
     * <li>{@link #SpvFPFastMathModeNotInfShift FPFastMathModeNotInfShift}</li>
     * <li>{@link #SpvFPFastMathModeNSZShift FPFastMathModeNSZShift}</li>
     * <li>{@link #SpvFPFastMathModeAllowRecipShift FPFastMathModeAllowRecipShift}</li>
     * <li>{@link #SpvFPFastMathModeFastShift FPFastMathModeFastShift}</li>
     * <li>{@link #SpvFPFastMathModeAllowContractFastINTELShift FPFastMathModeAllowContractFastINTELShift}</li>
     * <li>{@link #SpvFPFastMathModeAllowReassocINTELShift FPFastMathModeAllowReassocINTELShift}</li>
     * <li>{@link #SpvFPFastMathModeMax FPFastMathModeMax}</li>
     * </ul>
     */
    public static final int
        SpvFPFastMathModeNotNaNShift                 = 0,
        SpvFPFastMathModeNotInfShift                 = 1,
        SpvFPFastMathModeNSZShift                    = 2,
        SpvFPFastMathModeAllowRecipShift             = 3,
        SpvFPFastMathModeFastShift                   = 4,
        SpvFPFastMathModeAllowContractFastINTELShift = 16,
        SpvFPFastMathModeAllowReassocINTELShift      = 17,
        SpvFPFastMathModeMax                         = 0x7fffffff;

    /**
     * {@code SpvFPFastMathModeMask}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvFPFastMathModeMaskNone FPFastMathModeMaskNone}</li>
     * <li>{@link #SpvFPFastMathModeNotNaNMask FPFastMathModeNotNaNMask}</li>
     * <li>{@link #SpvFPFastMathModeNotInfMask FPFastMathModeNotInfMask}</li>
     * <li>{@link #SpvFPFastMathModeNSZMask FPFastMathModeNSZMask}</li>
     * <li>{@link #SpvFPFastMathModeAllowRecipMask FPFastMathModeAllowRecipMask}</li>
     * <li>{@link #SpvFPFastMathModeFastMask FPFastMathModeFastMask}</li>
     * <li>{@link #SpvFPFastMathModeAllowContractFastINTELMask FPFastMathModeAllowContractFastINTELMask}</li>
     * <li>{@link #SpvFPFastMathModeAllowReassocINTELMask FPFastMathModeAllowReassocINTELMask}</li>
     * </ul>
     */
    public static final int
        SpvFPFastMathModeMaskNone                   = 0,
        SpvFPFastMathModeNotNaNMask                 = 0x00000001,
        SpvFPFastMathModeNotInfMask                 = 0x00000002,
        SpvFPFastMathModeNSZMask                    = 0x00000004,
        SpvFPFastMathModeAllowRecipMask             = 0x00000008,
        SpvFPFastMathModeFastMask                   = 0x00000010,
        SpvFPFastMathModeAllowContractFastINTELMask = 0x00010000,
        SpvFPFastMathModeAllowReassocINTELMask      = 0x00020000;

    /**
     * {@code SpvFPRoundingMode}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvFPRoundingModeRTE FPRoundingModeRTE}</li>
     * <li>{@link #SpvFPRoundingModeRTZ FPRoundingModeRTZ}</li>
     * <li>{@link #SpvFPRoundingModeRTP FPRoundingModeRTP}</li>
     * <li>{@link #SpvFPRoundingModeRTN FPRoundingModeRTN}</li>
     * <li>{@link #SpvFPRoundingModeMax FPRoundingModeMax}</li>
     * </ul>
     */
    public static final int
        SpvFPRoundingModeRTE = 0,
        SpvFPRoundingModeRTZ = 1,
        SpvFPRoundingModeRTP = 2,
        SpvFPRoundingModeRTN = 3,
        SpvFPRoundingModeMax = 0x7fffffff;

    /**
     * {@code SpvLinkageType}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvLinkageTypeExport LinkageTypeExport}</li>
     * <li>{@link #SpvLinkageTypeImport LinkageTypeImport}</li>
     * <li>{@link #SpvLinkageTypeLinkOnceODR LinkageTypeLinkOnceODR}</li>
     * <li>{@link #SpvLinkageTypeMax LinkageTypeMax}</li>
     * </ul>
     */
    public static final int
        SpvLinkageTypeExport      = 0,
        SpvLinkageTypeImport      = 1,
        SpvLinkageTypeLinkOnceODR = 2,
        SpvLinkageTypeMax         = 0x7fffffff;

    /**
     * {@code SpvAccessQualifier}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvAccessQualifierReadOnly AccessQualifierReadOnly}</li>
     * <li>{@link #SpvAccessQualifierWriteOnly AccessQualifierWriteOnly}</li>
     * <li>{@link #SpvAccessQualifierReadWrite AccessQualifierReadWrite}</li>
     * <li>{@link #SpvAccessQualifierMax AccessQualifierMax}</li>
     * </ul>
     */
    public static final int
        SpvAccessQualifierReadOnly  = 0,
        SpvAccessQualifierWriteOnly = 1,
        SpvAccessQualifierReadWrite = 2,
        SpvAccessQualifierMax       = 0x7fffffff;

    /**
     * {@code SpvFunctionParameterAttribute}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvFunctionParameterAttributeZext FunctionParameterAttributeZext}</li>
     * <li>{@link #SpvFunctionParameterAttributeSext FunctionParameterAttributeSext}</li>
     * <li>{@link #SpvFunctionParameterAttributeByVal FunctionParameterAttributeByVal}</li>
     * <li>{@link #SpvFunctionParameterAttributeSret FunctionParameterAttributeSret}</li>
     * <li>{@link #SpvFunctionParameterAttributeNoAlias FunctionParameterAttributeNoAlias}</li>
     * <li>{@link #SpvFunctionParameterAttributeNoCapture FunctionParameterAttributeNoCapture}</li>
     * <li>{@link #SpvFunctionParameterAttributeNoWrite FunctionParameterAttributeNoWrite}</li>
     * <li>{@link #SpvFunctionParameterAttributeNoReadWrite FunctionParameterAttributeNoReadWrite}</li>
     * <li>{@link #SpvFunctionParameterAttributeMax FunctionParameterAttributeMax}</li>
     * </ul>
     */
    public static final int
        SpvFunctionParameterAttributeZext        = 0,
        SpvFunctionParameterAttributeSext        = 1,
        SpvFunctionParameterAttributeByVal       = 2,
        SpvFunctionParameterAttributeSret        = 3,
        SpvFunctionParameterAttributeNoAlias     = 4,
        SpvFunctionParameterAttributeNoCapture   = 5,
        SpvFunctionParameterAttributeNoWrite     = 6,
        SpvFunctionParameterAttributeNoReadWrite = 7,
        SpvFunctionParameterAttributeMax         = 0x7fffffff;

    /**
     * {@code SpvDecoration}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvDecorationRelaxedPrecision DecorationRelaxedPrecision}</li>
     * <li>{@link #SpvDecorationSpecId DecorationSpecId}</li>
     * <li>{@link #SpvDecorationBlock DecorationBlock}</li>
     * <li>{@link #SpvDecorationBufferBlock DecorationBufferBlock}</li>
     * <li>{@link #SpvDecorationRowMajor DecorationRowMajor}</li>
     * <li>{@link #SpvDecorationColMajor DecorationColMajor}</li>
     * <li>{@link #SpvDecorationArrayStride DecorationArrayStride}</li>
     * <li>{@link #SpvDecorationMatrixStride DecorationMatrixStride}</li>
     * <li>{@link #SpvDecorationGLSLShared DecorationGLSLShared}</li>
     * <li>{@link #SpvDecorationGLSLPacked DecorationGLSLPacked}</li>
     * <li>{@link #SpvDecorationCPacked DecorationCPacked}</li>
     * <li>{@link #SpvDecorationBuiltIn DecorationBuiltIn}</li>
     * <li>{@link #SpvDecorationNoPerspective DecorationNoPerspective}</li>
     * <li>{@link #SpvDecorationFlat DecorationFlat}</li>
     * <li>{@link #SpvDecorationPatch DecorationPatch}</li>
     * <li>{@link #SpvDecorationCentroid DecorationCentroid}</li>
     * <li>{@link #SpvDecorationSample DecorationSample}</li>
     * <li>{@link #SpvDecorationInvariant DecorationInvariant}</li>
     * <li>{@link #SpvDecorationRestrict DecorationRestrict}</li>
     * <li>{@link #SpvDecorationAliased DecorationAliased}</li>
     * <li>{@link #SpvDecorationVolatile DecorationVolatile}</li>
     * <li>{@link #SpvDecorationConstant DecorationConstant}</li>
     * <li>{@link #SpvDecorationCoherent DecorationCoherent}</li>
     * <li>{@link #SpvDecorationNonWritable DecorationNonWritable}</li>
     * <li>{@link #SpvDecorationNonReadable DecorationNonReadable}</li>
     * <li>{@link #SpvDecorationUniform DecorationUniform}</li>
     * <li>{@link #SpvDecorationUniformId DecorationUniformId}</li>
     * <li>{@link #SpvDecorationSaturatedConversion DecorationSaturatedConversion}</li>
     * <li>{@link #SpvDecorationStream DecorationStream}</li>
     * <li>{@link #SpvDecorationLocation DecorationLocation}</li>
     * <li>{@link #SpvDecorationComponent DecorationComponent}</li>
     * <li>{@link #SpvDecorationIndex DecorationIndex}</li>
     * <li>{@link #SpvDecorationBinding DecorationBinding}</li>
     * <li>{@link #SpvDecorationDescriptorSet DecorationDescriptorSet}</li>
     * <li>{@link #SpvDecorationOffset DecorationOffset}</li>
     * <li>{@link #SpvDecorationXfbBuffer DecorationXfbBuffer}</li>
     * <li>{@link #SpvDecorationXfbStride DecorationXfbStride}</li>
     * <li>{@link #SpvDecorationFuncParamAttr DecorationFuncParamAttr}</li>
     * <li>{@link #SpvDecorationFPRoundingMode DecorationFPRoundingMode}</li>
     * <li>{@link #SpvDecorationFPFastMathMode DecorationFPFastMathMode}</li>
     * <li>{@link #SpvDecorationLinkageAttributes DecorationLinkageAttributes}</li>
     * <li>{@link #SpvDecorationNoContraction DecorationNoContraction}</li>
     * <li>{@link #SpvDecorationInputAttachmentIndex DecorationInputAttachmentIndex}</li>
     * <li>{@link #SpvDecorationAlignment DecorationAlignment}</li>
     * <li>{@link #SpvDecorationMaxByteOffset DecorationMaxByteOffset}</li>
     * <li>{@link #SpvDecorationAlignmentId DecorationAlignmentId}</li>
     * <li>{@link #SpvDecorationMaxByteOffsetId DecorationMaxByteOffsetId}</li>
     * <li>{@link #SpvDecorationNoSignedWrap DecorationNoSignedWrap}</li>
     * <li>{@link #SpvDecorationNoUnsignedWrap DecorationNoUnsignedWrap}</li>
     * <li>{@link #SpvDecorationExplicitInterpAMD DecorationExplicitInterpAMD}</li>
     * <li>{@link #SpvDecorationOverrideCoverageNV DecorationOverrideCoverageNV}</li>
     * <li>{@link #SpvDecorationPassthroughNV DecorationPassthroughNV}</li>
     * <li>{@link #SpvDecorationViewportRelativeNV DecorationViewportRelativeNV}</li>
     * <li>{@link #SpvDecorationSecondaryViewportRelativeNV DecorationSecondaryViewportRelativeNV}</li>
     * <li>{@link #SpvDecorationPerPrimitiveNV DecorationPerPrimitiveNV}</li>
     * <li>{@link #SpvDecorationPerViewNV DecorationPerViewNV}</li>
     * <li>{@link #SpvDecorationPerTaskNV DecorationPerTaskNV}</li>
     * <li>{@link #SpvDecorationPerVertexKHR DecorationPerVertexKHR}</li>
     * <li>{@link #SpvDecorationPerVertexNV DecorationPerVertexNV}</li>
     * <li>{@link #SpvDecorationNonUniform DecorationNonUniform}</li>
     * <li>{@link #SpvDecorationNonUniformEXT DecorationNonUniformEXT}</li>
     * <li>{@link #SpvDecorationRestrictPointer DecorationRestrictPointer}</li>
     * <li>{@link #SpvDecorationRestrictPointerEXT DecorationRestrictPointerEXT}</li>
     * <li>{@link #SpvDecorationAliasedPointer DecorationAliasedPointer}</li>
     * <li>{@link #SpvDecorationAliasedPointerEXT DecorationAliasedPointerEXT}</li>
     * <li>{@link #SpvDecorationBindlessSamplerNV DecorationBindlessSamplerNV}</li>
     * <li>{@link #SpvDecorationBindlessImageNV DecorationBindlessImageNV}</li>
     * <li>{@link #SpvDecorationBoundSamplerNV DecorationBoundSamplerNV}</li>
     * <li>{@link #SpvDecorationBoundImageNV DecorationBoundImageNV}</li>
     * <li>{@link #SpvDecorationSIMTCallINTEL DecorationSIMTCallINTEL}</li>
     * <li>{@link #SpvDecorationReferencedIndirectlyINTEL DecorationReferencedIndirectlyINTEL}</li>
     * <li>{@link #SpvDecorationClobberINTEL DecorationClobberINTEL}</li>
     * <li>{@link #SpvDecorationSideEffectsINTEL DecorationSideEffectsINTEL}</li>
     * <li>{@link #SpvDecorationVectorComputeVariableINTEL DecorationVectorComputeVariableINTEL}</li>
     * <li>{@link #SpvDecorationFuncParamIOKindINTEL DecorationFuncParamIOKindINTEL}</li>
     * <li>{@link #SpvDecorationVectorComputeFunctionINTEL DecorationVectorComputeFunctionINTEL}</li>
     * <li>{@link #SpvDecorationStackCallINTEL DecorationStackCallINTEL}</li>
     * <li>{@link #SpvDecorationGlobalVariableOffsetINTEL DecorationGlobalVariableOffsetINTEL}</li>
     * <li>{@link #SpvDecorationCounterBuffer DecorationCounterBuffer}</li>
     * <li>{@link #SpvDecorationHlslCounterBufferGOOGLE DecorationHlslCounterBufferGOOGLE}</li>
     * <li>{@link #SpvDecorationHlslSemanticGOOGLE DecorationHlslSemanticGOOGLE}</li>
     * <li>{@link #SpvDecorationUserSemantic DecorationUserSemantic}</li>
     * <li>{@link #SpvDecorationUserTypeGOOGLE DecorationUserTypeGOOGLE}</li>
     * <li>{@link #SpvDecorationFunctionRoundingModeINTEL DecorationFunctionRoundingModeINTEL}</li>
     * <li>{@link #SpvDecorationFunctionDenormModeINTEL DecorationFunctionDenormModeINTEL}</li>
     * <li>{@link #SpvDecorationRegisterINTEL DecorationRegisterINTEL}</li>
     * <li>{@link #SpvDecorationMemoryINTEL DecorationMemoryINTEL}</li>
     * <li>{@link #SpvDecorationNumbanksINTEL DecorationNumbanksINTEL}</li>
     * <li>{@link #SpvDecorationBankwidthINTEL DecorationBankwidthINTEL}</li>
     * <li>{@link #SpvDecorationMaxPrivateCopiesINTEL DecorationMaxPrivateCopiesINTEL}</li>
     * <li>{@link #SpvDecorationSinglepumpINTEL DecorationSinglepumpINTEL}</li>
     * <li>{@link #SpvDecorationDoublepumpINTEL DecorationDoublepumpINTEL}</li>
     * <li>{@link #SpvDecorationMaxReplicatesINTEL DecorationMaxReplicatesINTEL}</li>
     * <li>{@link #SpvDecorationSimpleDualPortINTEL DecorationSimpleDualPortINTEL}</li>
     * <li>{@link #SpvDecorationMergeINTEL DecorationMergeINTEL}</li>
     * <li>{@link #SpvDecorationBankBitsINTEL DecorationBankBitsINTEL}</li>
     * <li>{@link #SpvDecorationForcePow2DepthINTEL DecorationForcePow2DepthINTEL}</li>
     * <li>{@link #SpvDecorationBurstCoalesceINTEL DecorationBurstCoalesceINTEL}</li>
     * <li>{@link #SpvDecorationCacheSizeINTEL DecorationCacheSizeINTEL}</li>
     * <li>{@link #SpvDecorationDontStaticallyCoalesceINTEL DecorationDontStaticallyCoalesceINTEL}</li>
     * <li>{@link #SpvDecorationPrefetchINTEL DecorationPrefetchINTEL}</li>
     * <li>{@link #SpvDecorationStallEnableINTEL DecorationStallEnableINTEL}</li>
     * <li>{@link #SpvDecorationFuseLoopsInFunctionINTEL DecorationFuseLoopsInFunctionINTEL}</li>
     * <li>{@link #SpvDecorationBufferLocationINTEL DecorationBufferLocationINTEL}</li>
     * <li>{@link #SpvDecorationIOPipeStorageINTEL DecorationIOPipeStorageINTEL}</li>
     * <li>{@link #SpvDecorationFunctionFloatingPointModeINTEL DecorationFunctionFloatingPointModeINTEL}</li>
     * <li>{@link #SpvDecorationSingleElementVectorINTEL DecorationSingleElementVectorINTEL}</li>
     * <li>{@link #SpvDecorationVectorComputeCallableFunctionINTEL DecorationVectorComputeCallableFunctionINTEL}</li>
     * <li>{@link #SpvDecorationMediaBlockIOINTEL DecorationMediaBlockIOINTEL}</li>
     * <li>{@link #SpvDecorationMax DecorationMax}</li>
     * </ul>
     */
    public static final int
        SpvDecorationRelaxedPrecision                   = 0,
        SpvDecorationSpecId                             = 1,
        SpvDecorationBlock                              = 2,
        SpvDecorationBufferBlock                        = 3,
        SpvDecorationRowMajor                           = 4,
        SpvDecorationColMajor                           = 5,
        SpvDecorationArrayStride                        = 6,
        SpvDecorationMatrixStride                       = 7,
        SpvDecorationGLSLShared                         = 8,
        SpvDecorationGLSLPacked                         = 9,
        SpvDecorationCPacked                            = 10,
        SpvDecorationBuiltIn                            = 11,
        SpvDecorationNoPerspective                      = 13,
        SpvDecorationFlat                               = 14,
        SpvDecorationPatch                              = 15,
        SpvDecorationCentroid                           = 16,
        SpvDecorationSample                             = 17,
        SpvDecorationInvariant                          = 18,
        SpvDecorationRestrict                           = 19,
        SpvDecorationAliased                            = 20,
        SpvDecorationVolatile                           = 21,
        SpvDecorationConstant                           = 22,
        SpvDecorationCoherent                           = 23,
        SpvDecorationNonWritable                        = 24,
        SpvDecorationNonReadable                        = 25,
        SpvDecorationUniform                            = 26,
        SpvDecorationUniformId                          = 27,
        SpvDecorationSaturatedConversion                = 28,
        SpvDecorationStream                             = 29,
        SpvDecorationLocation                           = 30,
        SpvDecorationComponent                          = 31,
        SpvDecorationIndex                              = 32,
        SpvDecorationBinding                            = 33,
        SpvDecorationDescriptorSet                      = 34,
        SpvDecorationOffset                             = 35,
        SpvDecorationXfbBuffer                          = 36,
        SpvDecorationXfbStride                          = 37,
        SpvDecorationFuncParamAttr                      = 38,
        SpvDecorationFPRoundingMode                     = 39,
        SpvDecorationFPFastMathMode                     = 40,
        SpvDecorationLinkageAttributes                  = 41,
        SpvDecorationNoContraction                      = 42,
        SpvDecorationInputAttachmentIndex               = 43,
        SpvDecorationAlignment                          = 44,
        SpvDecorationMaxByteOffset                      = 45,
        SpvDecorationAlignmentId                        = 46,
        SpvDecorationMaxByteOffsetId                    = 47,
        SpvDecorationNoSignedWrap                       = 4469,
        SpvDecorationNoUnsignedWrap                     = 4470,
        SpvDecorationExplicitInterpAMD                  = 4999,
        SpvDecorationOverrideCoverageNV                 = 5248,
        SpvDecorationPassthroughNV                      = 5250,
        SpvDecorationViewportRelativeNV                 = 5252,
        SpvDecorationSecondaryViewportRelativeNV        = 5256,
        SpvDecorationPerPrimitiveNV                     = 5271,
        SpvDecorationPerViewNV                          = 5272,
        SpvDecorationPerTaskNV                          = 5273,
        SpvDecorationPerVertexKHR                       = 5285,
        SpvDecorationPerVertexNV                        = 5285,
        SpvDecorationNonUniform                         = 5300,
        SpvDecorationNonUniformEXT                      = 5300,
        SpvDecorationRestrictPointer                    = 5355,
        SpvDecorationRestrictPointerEXT                 = 5355,
        SpvDecorationAliasedPointer                     = 5356,
        SpvDecorationAliasedPointerEXT                  = 5356,
        SpvDecorationBindlessSamplerNV                  = 5398,
        SpvDecorationBindlessImageNV                    = 5399,
        SpvDecorationBoundSamplerNV                     = 5400,
        SpvDecorationBoundImageNV                       = 5401,
        SpvDecorationSIMTCallINTEL                      = 5599,
        SpvDecorationReferencedIndirectlyINTEL          = 5602,
        SpvDecorationClobberINTEL                       = 5607,
        SpvDecorationSideEffectsINTEL                   = 5608,
        SpvDecorationVectorComputeVariableINTEL         = 5624,
        SpvDecorationFuncParamIOKindINTEL               = 5625,
        SpvDecorationVectorComputeFunctionINTEL         = 5626,
        SpvDecorationStackCallINTEL                     = 5627,
        SpvDecorationGlobalVariableOffsetINTEL          = 5628,
        SpvDecorationCounterBuffer                      = 5634,
        SpvDecorationHlslCounterBufferGOOGLE            = 5634,
        SpvDecorationHlslSemanticGOOGLE                 = 5635,
        SpvDecorationUserSemantic                       = 5635,
        SpvDecorationUserTypeGOOGLE                     = 5636,
        SpvDecorationFunctionRoundingModeINTEL          = 5822,
        SpvDecorationFunctionDenormModeINTEL            = 5823,
        SpvDecorationRegisterINTEL                      = 5825,
        SpvDecorationMemoryINTEL                        = 5826,
        SpvDecorationNumbanksINTEL                      = 5827,
        SpvDecorationBankwidthINTEL                     = 5828,
        SpvDecorationMaxPrivateCopiesINTEL              = 5829,
        SpvDecorationSinglepumpINTEL                    = 5830,
        SpvDecorationDoublepumpINTEL                    = 5831,
        SpvDecorationMaxReplicatesINTEL                 = 5832,
        SpvDecorationSimpleDualPortINTEL                = 5833,
        SpvDecorationMergeINTEL                         = 5834,
        SpvDecorationBankBitsINTEL                      = 5835,
        SpvDecorationForcePow2DepthINTEL                = 5836,
        SpvDecorationBurstCoalesceINTEL                 = 5899,
        SpvDecorationCacheSizeINTEL                     = 5900,
        SpvDecorationDontStaticallyCoalesceINTEL        = 5901,
        SpvDecorationPrefetchINTEL                      = 5902,
        SpvDecorationStallEnableINTEL                   = 5905,
        SpvDecorationFuseLoopsInFunctionINTEL           = 5907,
        SpvDecorationBufferLocationINTEL                = 5921,
        SpvDecorationIOPipeStorageINTEL                 = 5944,
        SpvDecorationFunctionFloatingPointModeINTEL     = 6080,
        SpvDecorationSingleElementVectorINTEL           = 6085,
        SpvDecorationVectorComputeCallableFunctionINTEL = 6087,
        SpvDecorationMediaBlockIOINTEL                  = 6140,
        SpvDecorationMax                                = 0x7fffffff;

    /**
     * {@code SpvBuiltIn}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvBuiltInPosition BuiltInPosition}</li>
     * <li>{@link #SpvBuiltInPointSize BuiltInPointSize}</li>
     * <li>{@link #SpvBuiltInClipDistance BuiltInClipDistance}</li>
     * <li>{@link #SpvBuiltInCullDistance BuiltInCullDistance}</li>
     * <li>{@link #SpvBuiltInVertexId BuiltInVertexId}</li>
     * <li>{@link #SpvBuiltInInstanceId BuiltInInstanceId}</li>
     * <li>{@link #SpvBuiltInPrimitiveId BuiltInPrimitiveId}</li>
     * <li>{@link #SpvBuiltInInvocationId BuiltInInvocationId}</li>
     * <li>{@link #SpvBuiltInLayer BuiltInLayer}</li>
     * <li>{@link #SpvBuiltInViewportIndex BuiltInViewportIndex}</li>
     * <li>{@link #SpvBuiltInTessLevelOuter BuiltInTessLevelOuter}</li>
     * <li>{@link #SpvBuiltInTessLevelInner BuiltInTessLevelInner}</li>
     * <li>{@link #SpvBuiltInTessCoord BuiltInTessCoord}</li>
     * <li>{@link #SpvBuiltInPatchVertices BuiltInPatchVertices}</li>
     * <li>{@link #SpvBuiltInFragCoord BuiltInFragCoord}</li>
     * <li>{@link #SpvBuiltInPointCoord BuiltInPointCoord}</li>
     * <li>{@link #SpvBuiltInFrontFacing BuiltInFrontFacing}</li>
     * <li>{@link #SpvBuiltInSampleId BuiltInSampleId}</li>
     * <li>{@link #SpvBuiltInSamplePosition BuiltInSamplePosition}</li>
     * <li>{@link #SpvBuiltInSampleMask BuiltInSampleMask}</li>
     * <li>{@link #SpvBuiltInFragDepth BuiltInFragDepth}</li>
     * <li>{@link #SpvBuiltInHelperInvocation BuiltInHelperInvocation}</li>
     * <li>{@link #SpvBuiltInNumWorkgroups BuiltInNumWorkgroups}</li>
     * <li>{@link #SpvBuiltInWorkgroupSize BuiltInWorkgroupSize}</li>
     * <li>{@link #SpvBuiltInWorkgroupId BuiltInWorkgroupId}</li>
     * <li>{@link #SpvBuiltInLocalInvocationId BuiltInLocalInvocationId}</li>
     * <li>{@link #SpvBuiltInGlobalInvocationId BuiltInGlobalInvocationId}</li>
     * <li>{@link #SpvBuiltInLocalInvocationIndex BuiltInLocalInvocationIndex}</li>
     * <li>{@link #SpvBuiltInWorkDim BuiltInWorkDim}</li>
     * <li>{@link #SpvBuiltInGlobalSize BuiltInGlobalSize}</li>
     * <li>{@link #SpvBuiltInEnqueuedWorkgroupSize BuiltInEnqueuedWorkgroupSize}</li>
     * <li>{@link #SpvBuiltInGlobalOffset BuiltInGlobalOffset}</li>
     * <li>{@link #SpvBuiltInGlobalLinearId BuiltInGlobalLinearId}</li>
     * <li>{@link #SpvBuiltInSubgroupSize BuiltInSubgroupSize}</li>
     * <li>{@link #SpvBuiltInSubgroupMaxSize BuiltInSubgroupMaxSize}</li>
     * <li>{@link #SpvBuiltInNumSubgroups BuiltInNumSubgroups}</li>
     * <li>{@link #SpvBuiltInNumEnqueuedSubgroups BuiltInNumEnqueuedSubgroups}</li>
     * <li>{@link #SpvBuiltInSubgroupId BuiltInSubgroupId}</li>
     * <li>{@link #SpvBuiltInSubgroupLocalInvocationId BuiltInSubgroupLocalInvocationId}</li>
     * <li>{@link #SpvBuiltInVertexIndex BuiltInVertexIndex}</li>
     * <li>{@link #SpvBuiltInInstanceIndex BuiltInInstanceIndex}</li>
     * <li>{@link #SpvBuiltInSubgroupEqMask BuiltInSubgroupEqMask}</li>
     * <li>{@link #SpvBuiltInSubgroupEqMaskKHR BuiltInSubgroupEqMaskKHR}</li>
     * <li>{@link #SpvBuiltInSubgroupGeMask BuiltInSubgroupGeMask}</li>
     * <li>{@link #SpvBuiltInSubgroupGeMaskKHR BuiltInSubgroupGeMaskKHR}</li>
     * <li>{@link #SpvBuiltInSubgroupGtMask BuiltInSubgroupGtMask}</li>
     * <li>{@link #SpvBuiltInSubgroupGtMaskKHR BuiltInSubgroupGtMaskKHR}</li>
     * <li>{@link #SpvBuiltInSubgroupLeMask BuiltInSubgroupLeMask}</li>
     * <li>{@link #SpvBuiltInSubgroupLeMaskKHR BuiltInSubgroupLeMaskKHR}</li>
     * <li>{@link #SpvBuiltInSubgroupLtMask BuiltInSubgroupLtMask}</li>
     * <li>{@link #SpvBuiltInSubgroupLtMaskKHR BuiltInSubgroupLtMaskKHR}</li>
     * <li>{@link #SpvBuiltInBaseVertex BuiltInBaseVertex}</li>
     * <li>{@link #SpvBuiltInBaseInstance BuiltInBaseInstance}</li>
     * <li>{@link #SpvBuiltInDrawIndex BuiltInDrawIndex}</li>
     * <li>{@link #SpvBuiltInPrimitiveShadingRateKHR BuiltInPrimitiveShadingRateKHR}</li>
     * <li>{@link #SpvBuiltInDeviceIndex BuiltInDeviceIndex}</li>
     * <li>{@link #SpvBuiltInViewIndex BuiltInViewIndex}</li>
     * <li>{@link #SpvBuiltInShadingRateKHR BuiltInShadingRateKHR}</li>
     * <li>{@link #SpvBuiltInBaryCoordNoPerspAMD BuiltInBaryCoordNoPerspAMD}</li>
     * <li>{@link #SpvBuiltInBaryCoordNoPerspCentroidAMD BuiltInBaryCoordNoPerspCentroidAMD}</li>
     * <li>{@link #SpvBuiltInBaryCoordNoPerspSampleAMD BuiltInBaryCoordNoPerspSampleAMD}</li>
     * <li>{@link #SpvBuiltInBaryCoordSmoothAMD BuiltInBaryCoordSmoothAMD}</li>
     * <li>{@link #SpvBuiltInBaryCoordSmoothCentroidAMD BuiltInBaryCoordSmoothCentroidAMD}</li>
     * <li>{@link #SpvBuiltInBaryCoordSmoothSampleAMD BuiltInBaryCoordSmoothSampleAMD}</li>
     * <li>{@link #SpvBuiltInBaryCoordPullModelAMD BuiltInBaryCoordPullModelAMD}</li>
     * <li>{@link #SpvBuiltInFragStencilRefEXT BuiltInFragStencilRefEXT}</li>
     * <li>{@link #SpvBuiltInViewportMaskNV BuiltInViewportMaskNV}</li>
     * <li>{@link #SpvBuiltInSecondaryPositionNV BuiltInSecondaryPositionNV}</li>
     * <li>{@link #SpvBuiltInSecondaryViewportMaskNV BuiltInSecondaryViewportMaskNV}</li>
     * <li>{@link #SpvBuiltInPositionPerViewNV BuiltInPositionPerViewNV}</li>
     * <li>{@link #SpvBuiltInViewportMaskPerViewNV BuiltInViewportMaskPerViewNV}</li>
     * <li>{@link #SpvBuiltInFullyCoveredEXT BuiltInFullyCoveredEXT}</li>
     * <li>{@link #SpvBuiltInTaskCountNV BuiltInTaskCountNV}</li>
     * <li>{@link #SpvBuiltInPrimitiveCountNV BuiltInPrimitiveCountNV}</li>
     * <li>{@link #SpvBuiltInPrimitiveIndicesNV BuiltInPrimitiveIndicesNV}</li>
     * <li>{@link #SpvBuiltInClipDistancePerViewNV BuiltInClipDistancePerViewNV}</li>
     * <li>{@link #SpvBuiltInCullDistancePerViewNV BuiltInCullDistancePerViewNV}</li>
     * <li>{@link #SpvBuiltInLayerPerViewNV BuiltInLayerPerViewNV}</li>
     * <li>{@link #SpvBuiltInMeshViewCountNV BuiltInMeshViewCountNV}</li>
     * <li>{@link #SpvBuiltInMeshViewIndicesNV BuiltInMeshViewIndicesNV}</li>
     * <li>{@link #SpvBuiltInBaryCoordKHR BuiltInBaryCoordKHR}</li>
     * <li>{@link #SpvBuiltInBaryCoordNV BuiltInBaryCoordNV}</li>
     * <li>{@link #SpvBuiltInBaryCoordNoPerspKHR BuiltInBaryCoordNoPerspKHR}</li>
     * <li>{@link #SpvBuiltInBaryCoordNoPerspNV BuiltInBaryCoordNoPerspNV}</li>
     * <li>{@link #SpvBuiltInFragSizeEXT BuiltInFragSizeEXT}</li>
     * <li>{@link #SpvBuiltInFragmentSizeNV BuiltInFragmentSizeNV}</li>
     * <li>{@link #SpvBuiltInFragInvocationCountEXT BuiltInFragInvocationCountEXT}</li>
     * <li>{@link #SpvBuiltInInvocationsPerPixelNV BuiltInInvocationsPerPixelNV}</li>
     * <li>{@link #SpvBuiltInLaunchIdKHR BuiltInLaunchIdKHR}</li>
     * <li>{@link #SpvBuiltInLaunchIdNV BuiltInLaunchIdNV}</li>
     * <li>{@link #SpvBuiltInLaunchSizeKHR BuiltInLaunchSizeKHR}</li>
     * <li>{@link #SpvBuiltInLaunchSizeNV BuiltInLaunchSizeNV}</li>
     * <li>{@link #SpvBuiltInWorldRayOriginKHR BuiltInWorldRayOriginKHR}</li>
     * <li>{@link #SpvBuiltInWorldRayOriginNV BuiltInWorldRayOriginNV}</li>
     * <li>{@link #SpvBuiltInWorldRayDirectionKHR BuiltInWorldRayDirectionKHR}</li>
     * <li>{@link #SpvBuiltInWorldRayDirectionNV BuiltInWorldRayDirectionNV}</li>
     * <li>{@link #SpvBuiltInObjectRayOriginKHR BuiltInObjectRayOriginKHR}</li>
     * <li>{@link #SpvBuiltInObjectRayOriginNV BuiltInObjectRayOriginNV}</li>
     * <li>{@link #SpvBuiltInObjectRayDirectionKHR BuiltInObjectRayDirectionKHR}</li>
     * <li>{@link #SpvBuiltInObjectRayDirectionNV BuiltInObjectRayDirectionNV}</li>
     * <li>{@link #SpvBuiltInRayTminKHR BuiltInRayTminKHR}</li>
     * <li>{@link #SpvBuiltInRayTminNV BuiltInRayTminNV}</li>
     * <li>{@link #SpvBuiltInRayTmaxKHR BuiltInRayTmaxKHR}</li>
     * <li>{@link #SpvBuiltInRayTmaxNV BuiltInRayTmaxNV}</li>
     * <li>{@link #SpvBuiltInInstanceCustomIndexKHR BuiltInInstanceCustomIndexKHR}</li>
     * <li>{@link #SpvBuiltInInstanceCustomIndexNV BuiltInInstanceCustomIndexNV}</li>
     * <li>{@link #SpvBuiltInObjectToWorldKHR BuiltInObjectToWorldKHR}</li>
     * <li>{@link #SpvBuiltInObjectToWorldNV BuiltInObjectToWorldNV}</li>
     * <li>{@link #SpvBuiltInWorldToObjectKHR BuiltInWorldToObjectKHR}</li>
     * <li>{@link #SpvBuiltInWorldToObjectNV BuiltInWorldToObjectNV}</li>
     * <li>{@link #SpvBuiltInHitTNV BuiltInHitTNV}</li>
     * <li>{@link #SpvBuiltInHitKindKHR BuiltInHitKindKHR}</li>
     * <li>{@link #SpvBuiltInHitKindNV BuiltInHitKindNV}</li>
     * <li>{@link #SpvBuiltInCurrentRayTimeNV BuiltInCurrentRayTimeNV}</li>
     * <li>{@link #SpvBuiltInIncomingRayFlagsKHR BuiltInIncomingRayFlagsKHR}</li>
     * <li>{@link #SpvBuiltInIncomingRayFlagsNV BuiltInIncomingRayFlagsNV}</li>
     * <li>{@link #SpvBuiltInRayGeometryIndexKHR BuiltInRayGeometryIndexKHR}</li>
     * <li>{@link #SpvBuiltInWarpsPerSMNV BuiltInWarpsPerSMNV}</li>
     * <li>{@link #SpvBuiltInSMCountNV BuiltInSMCountNV}</li>
     * <li>{@link #SpvBuiltInWarpIDNV BuiltInWarpIDNV}</li>
     * <li>{@link #SpvBuiltInSMIDNV BuiltInSMIDNV}</li>
     * <li>{@link #SpvBuiltInMax BuiltInMax}</li>
     * </ul>
     */
    public static final int
        SpvBuiltInPosition                    = 0,
        SpvBuiltInPointSize                   = 1,
        SpvBuiltInClipDistance                = 3,
        SpvBuiltInCullDistance                = 4,
        SpvBuiltInVertexId                    = 5,
        SpvBuiltInInstanceId                  = 6,
        SpvBuiltInPrimitiveId                 = 7,
        SpvBuiltInInvocationId                = 8,
        SpvBuiltInLayer                       = 9,
        SpvBuiltInViewportIndex               = 10,
        SpvBuiltInTessLevelOuter              = 11,
        SpvBuiltInTessLevelInner              = 12,
        SpvBuiltInTessCoord                   = 13,
        SpvBuiltInPatchVertices               = 14,
        SpvBuiltInFragCoord                   = 15,
        SpvBuiltInPointCoord                  = 16,
        SpvBuiltInFrontFacing                 = 17,
        SpvBuiltInSampleId                    = 18,
        SpvBuiltInSamplePosition              = 19,
        SpvBuiltInSampleMask                  = 20,
        SpvBuiltInFragDepth                   = 22,
        SpvBuiltInHelperInvocation            = 23,
        SpvBuiltInNumWorkgroups               = 24,
        SpvBuiltInWorkgroupSize               = 25,
        SpvBuiltInWorkgroupId                 = 26,
        SpvBuiltInLocalInvocationId           = 27,
        SpvBuiltInGlobalInvocationId          = 28,
        SpvBuiltInLocalInvocationIndex        = 29,
        SpvBuiltInWorkDim                     = 30,
        SpvBuiltInGlobalSize                  = 31,
        SpvBuiltInEnqueuedWorkgroupSize       = 32,
        SpvBuiltInGlobalOffset                = 33,
        SpvBuiltInGlobalLinearId              = 34,
        SpvBuiltInSubgroupSize                = 36,
        SpvBuiltInSubgroupMaxSize             = 37,
        SpvBuiltInNumSubgroups                = 38,
        SpvBuiltInNumEnqueuedSubgroups        = 39,
        SpvBuiltInSubgroupId                  = 40,
        SpvBuiltInSubgroupLocalInvocationId   = 41,
        SpvBuiltInVertexIndex                 = 42,
        SpvBuiltInInstanceIndex               = 43,
        SpvBuiltInSubgroupEqMask              = 4416,
        SpvBuiltInSubgroupEqMaskKHR           = 4416,
        SpvBuiltInSubgroupGeMask              = 4417,
        SpvBuiltInSubgroupGeMaskKHR           = 4417,
        SpvBuiltInSubgroupGtMask              = 4418,
        SpvBuiltInSubgroupGtMaskKHR           = 4418,
        SpvBuiltInSubgroupLeMask              = 4419,
        SpvBuiltInSubgroupLeMaskKHR           = 4419,
        SpvBuiltInSubgroupLtMask              = 4420,
        SpvBuiltInSubgroupLtMaskKHR           = 4420,
        SpvBuiltInBaseVertex                  = 4424,
        SpvBuiltInBaseInstance                = 4425,
        SpvBuiltInDrawIndex                   = 4426,
        SpvBuiltInPrimitiveShadingRateKHR     = 4432,
        SpvBuiltInDeviceIndex                 = 4438,
        SpvBuiltInViewIndex                   = 4440,
        SpvBuiltInShadingRateKHR              = 4444,
        SpvBuiltInBaryCoordNoPerspAMD         = 4992,
        SpvBuiltInBaryCoordNoPerspCentroidAMD = 4993,
        SpvBuiltInBaryCoordNoPerspSampleAMD   = 4994,
        SpvBuiltInBaryCoordSmoothAMD          = 4995,
        SpvBuiltInBaryCoordSmoothCentroidAMD  = 4996,
        SpvBuiltInBaryCoordSmoothSampleAMD    = 4997,
        SpvBuiltInBaryCoordPullModelAMD       = 4998,
        SpvBuiltInFragStencilRefEXT           = 5014,
        SpvBuiltInViewportMaskNV              = 5253,
        SpvBuiltInSecondaryPositionNV         = 5257,
        SpvBuiltInSecondaryViewportMaskNV     = 5258,
        SpvBuiltInPositionPerViewNV           = 5261,
        SpvBuiltInViewportMaskPerViewNV       = 5262,
        SpvBuiltInFullyCoveredEXT             = 5264,
        SpvBuiltInTaskCountNV                 = 5274,
        SpvBuiltInPrimitiveCountNV            = 5275,
        SpvBuiltInPrimitiveIndicesNV          = 5276,
        SpvBuiltInClipDistancePerViewNV       = 5277,
        SpvBuiltInCullDistancePerViewNV       = 5278,
        SpvBuiltInLayerPerViewNV              = 5279,
        SpvBuiltInMeshViewCountNV             = 5280,
        SpvBuiltInMeshViewIndicesNV           = 5281,
        SpvBuiltInBaryCoordKHR                = 5286,
        SpvBuiltInBaryCoordNV                 = 5286,
        SpvBuiltInBaryCoordNoPerspKHR         = 5287,
        SpvBuiltInBaryCoordNoPerspNV          = 5287,
        SpvBuiltInFragSizeEXT                 = 5292,
        SpvBuiltInFragmentSizeNV              = 5292,
        SpvBuiltInFragInvocationCountEXT      = 5293,
        SpvBuiltInInvocationsPerPixelNV       = 5293,
        SpvBuiltInLaunchIdKHR                 = 5319,
        SpvBuiltInLaunchIdNV                  = 5319,
        SpvBuiltInLaunchSizeKHR               = 5320,
        SpvBuiltInLaunchSizeNV                = 5320,
        SpvBuiltInWorldRayOriginKHR           = 5321,
        SpvBuiltInWorldRayOriginNV            = 5321,
        SpvBuiltInWorldRayDirectionKHR        = 5322,
        SpvBuiltInWorldRayDirectionNV         = 5322,
        SpvBuiltInObjectRayOriginKHR          = 5323,
        SpvBuiltInObjectRayOriginNV           = 5323,
        SpvBuiltInObjectRayDirectionKHR       = 5324,
        SpvBuiltInObjectRayDirectionNV        = 5324,
        SpvBuiltInRayTminKHR                  = 5325,
        SpvBuiltInRayTminNV                   = 5325,
        SpvBuiltInRayTmaxKHR                  = 5326,
        SpvBuiltInRayTmaxNV                   = 5326,
        SpvBuiltInInstanceCustomIndexKHR      = 5327,
        SpvBuiltInInstanceCustomIndexNV       = 5327,
        SpvBuiltInObjectToWorldKHR            = 5330,
        SpvBuiltInObjectToWorldNV             = 5330,
        SpvBuiltInWorldToObjectKHR            = 5331,
        SpvBuiltInWorldToObjectNV             = 5331,
        SpvBuiltInHitTNV                      = 5332,
        SpvBuiltInHitKindKHR                  = 5333,
        SpvBuiltInHitKindNV                   = 5333,
        SpvBuiltInCurrentRayTimeNV            = 5334,
        SpvBuiltInIncomingRayFlagsKHR         = 5351,
        SpvBuiltInIncomingRayFlagsNV          = 5351,
        SpvBuiltInRayGeometryIndexKHR         = 5352,
        SpvBuiltInWarpsPerSMNV                = 5374,
        SpvBuiltInSMCountNV                   = 5375,
        SpvBuiltInWarpIDNV                    = 5376,
        SpvBuiltInSMIDNV                      = 5377,
        SpvBuiltInMax                         = 0x7fffffff;

    /**
     * {@code SpvSelectionControlShift}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvSelectionControlFlattenShift SelectionControlFlattenShift}</li>
     * <li>{@link #SpvSelectionControlDontFlattenShift SelectionControlDontFlattenShift}</li>
     * <li>{@link #SpvSelectionControlMax SelectionControlMax}</li>
     * </ul>
     */
    public static final int
        SpvSelectionControlFlattenShift     = 0,
        SpvSelectionControlDontFlattenShift = 1,
        SpvSelectionControlMax              = 0x7fffffff;

    /**
     * {@code SpvSelectionControlMask}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvSelectionControlMaskNone SelectionControlMaskNone}</li>
     * <li>{@link #SpvSelectionControlFlattenMask SelectionControlFlattenMask}</li>
     * <li>{@link #SpvSelectionControlDontFlattenMask SelectionControlDontFlattenMask}</li>
     * </ul>
     */
    public static final int
        SpvSelectionControlMaskNone        = 0,
        SpvSelectionControlFlattenMask     = 0x00000001,
        SpvSelectionControlDontFlattenMask = 0x00000002;

    /**
     * {@code SpvLoopControlShift}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvLoopControlUnrollShift LoopControlUnrollShift}</li>
     * <li>{@link #SpvLoopControlDontUnrollShift LoopControlDontUnrollShift}</li>
     * <li>{@link #SpvLoopControlDependencyInfiniteShift LoopControlDependencyInfiniteShift}</li>
     * <li>{@link #SpvLoopControlDependencyLengthShift LoopControlDependencyLengthShift}</li>
     * <li>{@link #SpvLoopControlMinIterationsShift LoopControlMinIterationsShift}</li>
     * <li>{@link #SpvLoopControlMaxIterationsShift LoopControlMaxIterationsShift}</li>
     * <li>{@link #SpvLoopControlIterationMultipleShift LoopControlIterationMultipleShift}</li>
     * <li>{@link #SpvLoopControlPeelCountShift LoopControlPeelCountShift}</li>
     * <li>{@link #SpvLoopControlPartialCountShift LoopControlPartialCountShift}</li>
     * <li>{@link #SpvLoopControlInitiationIntervalINTELShift LoopControlInitiationIntervalINTELShift}</li>
     * <li>{@link #SpvLoopControlMaxConcurrencyINTELShift LoopControlMaxConcurrencyINTELShift}</li>
     * <li>{@link #SpvLoopControlDependencyArrayINTELShift LoopControlDependencyArrayINTELShift}</li>
     * <li>{@link #SpvLoopControlPipelineEnableINTELShift LoopControlPipelineEnableINTELShift}</li>
     * <li>{@link #SpvLoopControlLoopCoalesceINTELShift LoopControlLoopCoalesceINTELShift}</li>
     * <li>{@link #SpvLoopControlMaxInterleavingINTELShift LoopControlMaxInterleavingINTELShift}</li>
     * <li>{@link #SpvLoopControlSpeculatedIterationsINTELShift LoopControlSpeculatedIterationsINTELShift}</li>
     * <li>{@link #SpvLoopControlNoFusionINTELShift LoopControlNoFusionINTELShift}</li>
     * <li>{@link #SpvLoopControlMax LoopControlMax}</li>
     * </ul>
     */
    public static final int
        SpvLoopControlUnrollShift                    = 0,
        SpvLoopControlDontUnrollShift                = 1,
        SpvLoopControlDependencyInfiniteShift        = 2,
        SpvLoopControlDependencyLengthShift          = 3,
        SpvLoopControlMinIterationsShift             = 4,
        SpvLoopControlMaxIterationsShift             = 5,
        SpvLoopControlIterationMultipleShift         = 6,
        SpvLoopControlPeelCountShift                 = 7,
        SpvLoopControlPartialCountShift              = 8,
        SpvLoopControlInitiationIntervalINTELShift   = 16,
        SpvLoopControlMaxConcurrencyINTELShift       = 17,
        SpvLoopControlDependencyArrayINTELShift      = 18,
        SpvLoopControlPipelineEnableINTELShift       = 19,
        SpvLoopControlLoopCoalesceINTELShift         = 20,
        SpvLoopControlMaxInterleavingINTELShift      = 21,
        SpvLoopControlSpeculatedIterationsINTELShift = 22,
        SpvLoopControlNoFusionINTELShift             = 23,
        SpvLoopControlMax                            = 0x7fffffff;

    /**
     * {@code SpvLoopControlMask}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvLoopControlMaskNone LoopControlMaskNone}</li>
     * <li>{@link #SpvLoopControlUnrollMask LoopControlUnrollMask}</li>
     * <li>{@link #SpvLoopControlDontUnrollMask LoopControlDontUnrollMask}</li>
     * <li>{@link #SpvLoopControlDependencyInfiniteMask LoopControlDependencyInfiniteMask}</li>
     * <li>{@link #SpvLoopControlDependencyLengthMask LoopControlDependencyLengthMask}</li>
     * <li>{@link #SpvLoopControlMinIterationsMask LoopControlMinIterationsMask}</li>
     * <li>{@link #SpvLoopControlMaxIterationsMask LoopControlMaxIterationsMask}</li>
     * <li>{@link #SpvLoopControlIterationMultipleMask LoopControlIterationMultipleMask}</li>
     * <li>{@link #SpvLoopControlPeelCountMask LoopControlPeelCountMask}</li>
     * <li>{@link #SpvLoopControlPartialCountMask LoopControlPartialCountMask}</li>
     * <li>{@link #SpvLoopControlInitiationIntervalINTELMask LoopControlInitiationIntervalINTELMask}</li>
     * <li>{@link #SpvLoopControlMaxConcurrencyINTELMask LoopControlMaxConcurrencyINTELMask}</li>
     * <li>{@link #SpvLoopControlDependencyArrayINTELMask LoopControlDependencyArrayINTELMask}</li>
     * <li>{@link #SpvLoopControlPipelineEnableINTELMask LoopControlPipelineEnableINTELMask}</li>
     * <li>{@link #SpvLoopControlLoopCoalesceINTELMask LoopControlLoopCoalesceINTELMask}</li>
     * <li>{@link #SpvLoopControlMaxInterleavingINTELMask LoopControlMaxInterleavingINTELMask}</li>
     * <li>{@link #SpvLoopControlSpeculatedIterationsINTELMask LoopControlSpeculatedIterationsINTELMask}</li>
     * <li>{@link #SpvLoopControlNoFusionINTELMask LoopControlNoFusionINTELMask}</li>
     * </ul>
     */
    public static final int
        SpvLoopControlMaskNone                      = 0,
        SpvLoopControlUnrollMask                    = 0x00000001,
        SpvLoopControlDontUnrollMask                = 0x00000002,
        SpvLoopControlDependencyInfiniteMask        = 0x00000004,
        SpvLoopControlDependencyLengthMask          = 0x00000008,
        SpvLoopControlMinIterationsMask             = 0x00000010,
        SpvLoopControlMaxIterationsMask             = 0x00000020,
        SpvLoopControlIterationMultipleMask         = 0x00000040,
        SpvLoopControlPeelCountMask                 = 0x00000080,
        SpvLoopControlPartialCountMask              = 0x00000100,
        SpvLoopControlInitiationIntervalINTELMask   = 0x00010000,
        SpvLoopControlMaxConcurrencyINTELMask       = 0x00020000,
        SpvLoopControlDependencyArrayINTELMask      = 0x00040000,
        SpvLoopControlPipelineEnableINTELMask       = 0x00080000,
        SpvLoopControlLoopCoalesceINTELMask         = 0x00100000,
        SpvLoopControlMaxInterleavingINTELMask      = 0x00200000,
        SpvLoopControlSpeculatedIterationsINTELMask = 0x00400000,
        SpvLoopControlNoFusionINTELMask             = 0x00800000;

    /**
     * {@code SpvFunctionControlShift}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvFunctionControlInlineShift FunctionControlInlineShift}</li>
     * <li>{@link #SpvFunctionControlDontInlineShift FunctionControlDontInlineShift}</li>
     * <li>{@link #SpvFunctionControlPureShift FunctionControlPureShift}</li>
     * <li>{@link #SpvFunctionControlConstShift FunctionControlConstShift}</li>
     * <li>{@link #SpvFunctionControlOptNoneINTELShift FunctionControlOptNoneINTELShift}</li>
     * <li>{@link #SpvFunctionControlMax FunctionControlMax}</li>
     * </ul>
     */
    public static final int
        SpvFunctionControlInlineShift       = 0,
        SpvFunctionControlDontInlineShift   = 1,
        SpvFunctionControlPureShift         = 2,
        SpvFunctionControlConstShift        = 3,
        SpvFunctionControlOptNoneINTELShift = 16,
        SpvFunctionControlMax               = 0x7fffffff;

    /**
     * {@code SpvFunctionControlMask}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvFunctionControlMaskNone FunctionControlMaskNone}</li>
     * <li>{@link #SpvFunctionControlInlineMask FunctionControlInlineMask}</li>
     * <li>{@link #SpvFunctionControlDontInlineMask FunctionControlDontInlineMask}</li>
     * <li>{@link #SpvFunctionControlPureMask FunctionControlPureMask}</li>
     * <li>{@link #SpvFunctionControlConstMask FunctionControlConstMask}</li>
     * <li>{@link #SpvFunctionControlOptNoneINTELMask FunctionControlOptNoneINTELMask}</li>
     * </ul>
     */
    public static final int
        SpvFunctionControlMaskNone         = 0,
        SpvFunctionControlInlineMask       = 0x00000001,
        SpvFunctionControlDontInlineMask   = 0x00000002,
        SpvFunctionControlPureMask         = 0x00000004,
        SpvFunctionControlConstMask        = 0x00000008,
        SpvFunctionControlOptNoneINTELMask = 0x00010000;

    /**
     * {@code SpvMemorySemanticsShift}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvMemorySemanticsAcquireShift MemorySemanticsAcquireShift}</li>
     * <li>{@link #SpvMemorySemanticsReleaseShift MemorySemanticsReleaseShift}</li>
     * <li>{@link #SpvMemorySemanticsAcquireReleaseShift MemorySemanticsAcquireReleaseShift}</li>
     * <li>{@link #SpvMemorySemanticsSequentiallyConsistentShift MemorySemanticsSequentiallyConsistentShift}</li>
     * <li>{@link #SpvMemorySemanticsUniformMemoryShift MemorySemanticsUniformMemoryShift}</li>
     * <li>{@link #SpvMemorySemanticsSubgroupMemoryShift MemorySemanticsSubgroupMemoryShift}</li>
     * <li>{@link #SpvMemorySemanticsWorkgroupMemoryShift MemorySemanticsWorkgroupMemoryShift}</li>
     * <li>{@link #SpvMemorySemanticsCrossWorkgroupMemoryShift MemorySemanticsCrossWorkgroupMemoryShift}</li>
     * <li>{@link #SpvMemorySemanticsAtomicCounterMemoryShift MemorySemanticsAtomicCounterMemoryShift}</li>
     * <li>{@link #SpvMemorySemanticsImageMemoryShift MemorySemanticsImageMemoryShift}</li>
     * <li>{@link #SpvMemorySemanticsOutputMemoryShift MemorySemanticsOutputMemoryShift}</li>
     * <li>{@link #SpvMemorySemanticsOutputMemoryKHRShift MemorySemanticsOutputMemoryKHRShift}</li>
     * <li>{@link #SpvMemorySemanticsMakeAvailableShift MemorySemanticsMakeAvailableShift}</li>
     * <li>{@link #SpvMemorySemanticsMakeAvailableKHRShift MemorySemanticsMakeAvailableKHRShift}</li>
     * <li>{@link #SpvMemorySemanticsMakeVisibleShift MemorySemanticsMakeVisibleShift}</li>
     * <li>{@link #SpvMemorySemanticsMakeVisibleKHRShift MemorySemanticsMakeVisibleKHRShift}</li>
     * <li>{@link #SpvMemorySemanticsVolatileShift MemorySemanticsVolatileShift}</li>
     * <li>{@link #SpvMemorySemanticsMax MemorySemanticsMax}</li>
     * </ul>
     */
    public static final int
        SpvMemorySemanticsAcquireShift                = 1,
        SpvMemorySemanticsReleaseShift                = 2,
        SpvMemorySemanticsAcquireReleaseShift         = 3,
        SpvMemorySemanticsSequentiallyConsistentShift = 4,
        SpvMemorySemanticsUniformMemoryShift          = 6,
        SpvMemorySemanticsSubgroupMemoryShift         = 7,
        SpvMemorySemanticsWorkgroupMemoryShift        = 8,
        SpvMemorySemanticsCrossWorkgroupMemoryShift   = 9,
        SpvMemorySemanticsAtomicCounterMemoryShift    = 10,
        SpvMemorySemanticsImageMemoryShift            = 11,
        SpvMemorySemanticsOutputMemoryShift           = 12,
        SpvMemorySemanticsOutputMemoryKHRShift        = 12,
        SpvMemorySemanticsMakeAvailableShift          = 13,
        SpvMemorySemanticsMakeAvailableKHRShift       = 13,
        SpvMemorySemanticsMakeVisibleShift            = 14,
        SpvMemorySemanticsMakeVisibleKHRShift         = 14,
        SpvMemorySemanticsVolatileShift               = 15,
        SpvMemorySemanticsMax                         = 0x7fffffff;

    /**
     * {@code SpvMemorySemanticsMask}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvMemorySemanticsMaskNone MemorySemanticsMaskNone}</li>
     * <li>{@link #SpvMemorySemanticsAcquireMask MemorySemanticsAcquireMask}</li>
     * <li>{@link #SpvMemorySemanticsReleaseMask MemorySemanticsReleaseMask}</li>
     * <li>{@link #SpvMemorySemanticsAcquireReleaseMask MemorySemanticsAcquireReleaseMask}</li>
     * <li>{@link #SpvMemorySemanticsSequentiallyConsistentMask MemorySemanticsSequentiallyConsistentMask}</li>
     * <li>{@link #SpvMemorySemanticsUniformMemoryMask MemorySemanticsUniformMemoryMask}</li>
     * <li>{@link #SpvMemorySemanticsSubgroupMemoryMask MemorySemanticsSubgroupMemoryMask}</li>
     * <li>{@link #SpvMemorySemanticsWorkgroupMemoryMask MemorySemanticsWorkgroupMemoryMask}</li>
     * <li>{@link #SpvMemorySemanticsCrossWorkgroupMemoryMask MemorySemanticsCrossWorkgroupMemoryMask}</li>
     * <li>{@link #SpvMemorySemanticsAtomicCounterMemoryMask MemorySemanticsAtomicCounterMemoryMask}</li>
     * <li>{@link #SpvMemorySemanticsImageMemoryMask MemorySemanticsImageMemoryMask}</li>
     * <li>{@link #SpvMemorySemanticsOutputMemoryMask MemorySemanticsOutputMemoryMask}</li>
     * <li>{@link #SpvMemorySemanticsOutputMemoryKHRMask MemorySemanticsOutputMemoryKHRMask}</li>
     * <li>{@link #SpvMemorySemanticsMakeAvailableMask MemorySemanticsMakeAvailableMask}</li>
     * <li>{@link #SpvMemorySemanticsMakeAvailableKHRMask MemorySemanticsMakeAvailableKHRMask}</li>
     * <li>{@link #SpvMemorySemanticsMakeVisibleMask MemorySemanticsMakeVisibleMask}</li>
     * <li>{@link #SpvMemorySemanticsMakeVisibleKHRMask MemorySemanticsMakeVisibleKHRMask}</li>
     * <li>{@link #SpvMemorySemanticsVolatileMask MemorySemanticsVolatileMask}</li>
     * </ul>
     */
    public static final int
        SpvMemorySemanticsMaskNone                   = 0,
        SpvMemorySemanticsAcquireMask                = 0x00000002,
        SpvMemorySemanticsReleaseMask                = 0x00000004,
        SpvMemorySemanticsAcquireReleaseMask         = 0x00000008,
        SpvMemorySemanticsSequentiallyConsistentMask = 0x00000010,
        SpvMemorySemanticsUniformMemoryMask          = 0x00000040,
        SpvMemorySemanticsSubgroupMemoryMask         = 0x00000080,
        SpvMemorySemanticsWorkgroupMemoryMask        = 0x00000100,
        SpvMemorySemanticsCrossWorkgroupMemoryMask   = 0x00000200,
        SpvMemorySemanticsAtomicCounterMemoryMask    = 0x00000400,
        SpvMemorySemanticsImageMemoryMask            = 0x00000800,
        SpvMemorySemanticsOutputMemoryMask           = 0x00001000,
        SpvMemorySemanticsOutputMemoryKHRMask        = 0x00001000,
        SpvMemorySemanticsMakeAvailableMask          = 0x00002000,
        SpvMemorySemanticsMakeAvailableKHRMask       = 0x00002000,
        SpvMemorySemanticsMakeVisibleMask            = 0x00004000,
        SpvMemorySemanticsMakeVisibleKHRMask         = 0x00004000,
        SpvMemorySemanticsVolatileMask               = 0x00008000;

    /**
     * {@code SpvMemoryAccessShift}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvMemoryAccessVolatileShift MemoryAccessVolatileShift}</li>
     * <li>{@link #SpvMemoryAccessAlignedShift MemoryAccessAlignedShift}</li>
     * <li>{@link #SpvMemoryAccessNontemporalShift MemoryAccessNontemporalShift}</li>
     * <li>{@link #SpvMemoryAccessMakePointerAvailableShift MemoryAccessMakePointerAvailableShift}</li>
     * <li>{@link #SpvMemoryAccessMakePointerAvailableKHRShift MemoryAccessMakePointerAvailableKHRShift}</li>
     * <li>{@link #SpvMemoryAccessMakePointerVisibleShift MemoryAccessMakePointerVisibleShift}</li>
     * <li>{@link #SpvMemoryAccessMakePointerVisibleKHRShift MemoryAccessMakePointerVisibleKHRShift}</li>
     * <li>{@link #SpvMemoryAccessNonPrivatePointerShift MemoryAccessNonPrivatePointerShift}</li>
     * <li>{@link #SpvMemoryAccessNonPrivatePointerKHRShift MemoryAccessNonPrivatePointerKHRShift}</li>
     * <li>{@link #SpvMemoryAccessMax MemoryAccessMax}</li>
     * </ul>
     */
    public static final int
        SpvMemoryAccessVolatileShift                = 0,
        SpvMemoryAccessAlignedShift                 = 1,
        SpvMemoryAccessNontemporalShift             = 2,
        SpvMemoryAccessMakePointerAvailableShift    = 3,
        SpvMemoryAccessMakePointerAvailableKHRShift = 3,
        SpvMemoryAccessMakePointerVisibleShift      = 4,
        SpvMemoryAccessMakePointerVisibleKHRShift   = 4,
        SpvMemoryAccessNonPrivatePointerShift       = 5,
        SpvMemoryAccessNonPrivatePointerKHRShift    = 5,
        SpvMemoryAccessMax                          = 0x7fffffff;

    /**
     * {@code SpvMemoryAccessMask}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvMemoryAccessMaskNone MemoryAccessMaskNone}</li>
     * <li>{@link #SpvMemoryAccessVolatileMask MemoryAccessVolatileMask}</li>
     * <li>{@link #SpvMemoryAccessAlignedMask MemoryAccessAlignedMask}</li>
     * <li>{@link #SpvMemoryAccessNontemporalMask MemoryAccessNontemporalMask}</li>
     * <li>{@link #SpvMemoryAccessMakePointerAvailableMask MemoryAccessMakePointerAvailableMask}</li>
     * <li>{@link #SpvMemoryAccessMakePointerAvailableKHRMask MemoryAccessMakePointerAvailableKHRMask}</li>
     * <li>{@link #SpvMemoryAccessMakePointerVisibleMask MemoryAccessMakePointerVisibleMask}</li>
     * <li>{@link #SpvMemoryAccessMakePointerVisibleKHRMask MemoryAccessMakePointerVisibleKHRMask}</li>
     * <li>{@link #SpvMemoryAccessNonPrivatePointerMask MemoryAccessNonPrivatePointerMask}</li>
     * <li>{@link #SpvMemoryAccessNonPrivatePointerKHRMask MemoryAccessNonPrivatePointerKHRMask}</li>
     * </ul>
     */
    public static final int
        SpvMemoryAccessMaskNone                    = 0,
        SpvMemoryAccessVolatileMask                = 0x00000001,
        SpvMemoryAccessAlignedMask                 = 0x00000002,
        SpvMemoryAccessNontemporalMask             = 0x00000004,
        SpvMemoryAccessMakePointerAvailableMask    = 0x00000008,
        SpvMemoryAccessMakePointerAvailableKHRMask = 0x00000008,
        SpvMemoryAccessMakePointerVisibleMask      = 0x00000010,
        SpvMemoryAccessMakePointerVisibleKHRMask   = 0x00000010,
        SpvMemoryAccessNonPrivatePointerMask       = 0x00000020,
        SpvMemoryAccessNonPrivatePointerKHRMask    = 0x00000020;

    /**
     * {@code SpvScope}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvScopeCrossDevice ScopeCrossDevice}</li>
     * <li>{@link #SpvScopeDevice ScopeDevice}</li>
     * <li>{@link #SpvScopeWorkgroup ScopeWorkgroup}</li>
     * <li>{@link #SpvScopeSubgroup ScopeSubgroup}</li>
     * <li>{@link #SpvScopeInvocation ScopeInvocation}</li>
     * <li>{@link #SpvScopeQueueFamily ScopeQueueFamily}</li>
     * <li>{@link #SpvScopeQueueFamilyKHR ScopeQueueFamilyKHR}</li>
     * <li>{@link #SpvScopeShaderCallKHR ScopeShaderCallKHR}</li>
     * <li>{@link #SpvScopeMax ScopeMax}</li>
     * </ul>
     */
    public static final int
        SpvScopeCrossDevice    = 0,
        SpvScopeDevice         = 1,
        SpvScopeWorkgroup      = 2,
        SpvScopeSubgroup       = 3,
        SpvScopeInvocation     = 4,
        SpvScopeQueueFamily    = 5,
        SpvScopeQueueFamilyKHR = 5,
        SpvScopeShaderCallKHR  = 6,
        SpvScopeMax            = 0x7fffffff;

    /**
     * {@code SpvGroupOperation}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvGroupOperationReduce GroupOperationReduce}</li>
     * <li>{@link #SpvGroupOperationInclusiveScan GroupOperationInclusiveScan}</li>
     * <li>{@link #SpvGroupOperationExclusiveScan GroupOperationExclusiveScan}</li>
     * <li>{@link #SpvGroupOperationClusteredReduce GroupOperationClusteredReduce}</li>
     * <li>{@link #SpvGroupOperationPartitionedReduceNV GroupOperationPartitionedReduceNV}</li>
     * <li>{@link #SpvGroupOperationPartitionedInclusiveScanNV GroupOperationPartitionedInclusiveScanNV}</li>
     * <li>{@link #SpvGroupOperationPartitionedExclusiveScanNV GroupOperationPartitionedExclusiveScanNV}</li>
     * <li>{@link #SpvGroupOperationMax GroupOperationMax}</li>
     * </ul>
     */
    public static final int
        SpvGroupOperationReduce                     = 0,
        SpvGroupOperationInclusiveScan              = 1,
        SpvGroupOperationExclusiveScan              = 2,
        SpvGroupOperationClusteredReduce            = 3,
        SpvGroupOperationPartitionedReduceNV        = 6,
        SpvGroupOperationPartitionedInclusiveScanNV = 7,
        SpvGroupOperationPartitionedExclusiveScanNV = 8,
        SpvGroupOperationMax                        = 0x7fffffff;

    /**
     * {@code SpvKernelEnqueueFlags}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvKernelEnqueueFlagsNoWait KernelEnqueueFlagsNoWait}</li>
     * <li>{@link #SpvKernelEnqueueFlagsWaitKernel KernelEnqueueFlagsWaitKernel}</li>
     * <li>{@link #SpvKernelEnqueueFlagsWaitWorkGroup KernelEnqueueFlagsWaitWorkGroup}</li>
     * <li>{@link #SpvKernelEnqueueFlagsMax KernelEnqueueFlagsMax}</li>
     * </ul>
     */
    public static final int
        SpvKernelEnqueueFlagsNoWait        = 0,
        SpvKernelEnqueueFlagsWaitKernel    = 1,
        SpvKernelEnqueueFlagsWaitWorkGroup = 2,
        SpvKernelEnqueueFlagsMax           = 0x7fffffff;

    /**
     * {@code SpvKernelProfilingInfoShift}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvKernelProfilingInfoCmdExecTimeShift KernelProfilingInfoCmdExecTimeShift}</li>
     * <li>{@link #SpvKernelProfilingInfoMax KernelProfilingInfoMax}</li>
     * </ul>
     */
    public static final int
        SpvKernelProfilingInfoCmdExecTimeShift = 0,
        SpvKernelProfilingInfoMax              = 0x7fffffff;

    /**
     * {@code SpvKernelProfilingInfoMask}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvKernelProfilingInfoMaskNone KernelProfilingInfoMaskNone}</li>
     * <li>{@link #SpvKernelProfilingInfoCmdExecTimeMask KernelProfilingInfoCmdExecTimeMask}</li>
     * </ul>
     */
    public static final int
        SpvKernelProfilingInfoMaskNone        = 0,
        SpvKernelProfilingInfoCmdExecTimeMask = 0x00000001;

    /**
     * {@code SpvCapability}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvCapabilityMatrix CapabilityMatrix}</li>
     * <li>{@link #SpvCapabilityShader CapabilityShader}</li>
     * <li>{@link #SpvCapabilityGeometry CapabilityGeometry}</li>
     * <li>{@link #SpvCapabilityTessellation CapabilityTessellation}</li>
     * <li>{@link #SpvCapabilityAddresses CapabilityAddresses}</li>
     * <li>{@link #SpvCapabilityLinkage CapabilityLinkage}</li>
     * <li>{@link #SpvCapabilityKernel CapabilityKernel}</li>
     * <li>{@link #SpvCapabilityVector16 CapabilityVector16}</li>
     * <li>{@link #SpvCapabilityFloat16Buffer CapabilityFloat16Buffer}</li>
     * <li>{@link #SpvCapabilityFloat16 CapabilityFloat16}</li>
     * <li>{@link #SpvCapabilityFloat64 CapabilityFloat64}</li>
     * <li>{@link #SpvCapabilityInt64 CapabilityInt64}</li>
     * <li>{@link #SpvCapabilityInt64Atomics CapabilityInt64Atomics}</li>
     * <li>{@link #SpvCapabilityImageBasic CapabilityImageBasic}</li>
     * <li>{@link #SpvCapabilityImageReadWrite CapabilityImageReadWrite}</li>
     * <li>{@link #SpvCapabilityImageMipmap CapabilityImageMipmap}</li>
     * <li>{@link #SpvCapabilityPipes CapabilityPipes}</li>
     * <li>{@link #SpvCapabilityGroups CapabilityGroups}</li>
     * <li>{@link #SpvCapabilityDeviceEnqueue CapabilityDeviceEnqueue}</li>
     * <li>{@link #SpvCapabilityLiteralSampler CapabilityLiteralSampler}</li>
     * <li>{@link #SpvCapabilityAtomicStorage CapabilityAtomicStorage}</li>
     * <li>{@link #SpvCapabilityInt16 CapabilityInt16}</li>
     * <li>{@link #SpvCapabilityTessellationPointSize CapabilityTessellationPointSize}</li>
     * <li>{@link #SpvCapabilityGeometryPointSize CapabilityGeometryPointSize}</li>
     * <li>{@link #SpvCapabilityImageGatherExtended CapabilityImageGatherExtended}</li>
     * <li>{@link #SpvCapabilityStorageImageMultisample CapabilityStorageImageMultisample}</li>
     * <li>{@link #SpvCapabilityUniformBufferArrayDynamicIndexing CapabilityUniformBufferArrayDynamicIndexing}</li>
     * <li>{@link #SpvCapabilitySampledImageArrayDynamicIndexing CapabilitySampledImageArrayDynamicIndexing}</li>
     * <li>{@link #SpvCapabilityStorageBufferArrayDynamicIndexing CapabilityStorageBufferArrayDynamicIndexing}</li>
     * <li>{@link #SpvCapabilityStorageImageArrayDynamicIndexing CapabilityStorageImageArrayDynamicIndexing}</li>
     * <li>{@link #SpvCapabilityClipDistance CapabilityClipDistance}</li>
     * <li>{@link #SpvCapabilityCullDistance CapabilityCullDistance}</li>
     * <li>{@link #SpvCapabilityImageCubeArray CapabilityImageCubeArray}</li>
     * <li>{@link #SpvCapabilitySampleRateShading CapabilitySampleRateShading}</li>
     * <li>{@link #SpvCapabilityImageRect CapabilityImageRect}</li>
     * <li>{@link #SpvCapabilitySampledRect CapabilitySampledRect}</li>
     * <li>{@link #SpvCapabilityGenericPointer CapabilityGenericPointer}</li>
     * <li>{@link #SpvCapabilityInt8 CapabilityInt8}</li>
     * <li>{@link #SpvCapabilityInputAttachment CapabilityInputAttachment}</li>
     * <li>{@link #SpvCapabilitySparseResidency CapabilitySparseResidency}</li>
     * <li>{@link #SpvCapabilityMinLod CapabilityMinLod}</li>
     * <li>{@link #SpvCapabilitySampled1D CapabilitySampled1D}</li>
     * <li>{@link #SpvCapabilityImage1D CapabilityImage1D}</li>
     * <li>{@link #SpvCapabilitySampledCubeArray CapabilitySampledCubeArray}</li>
     * <li>{@link #SpvCapabilitySampledBuffer CapabilitySampledBuffer}</li>
     * <li>{@link #SpvCapabilityImageBuffer CapabilityImageBuffer}</li>
     * <li>{@link #SpvCapabilityImageMSArray CapabilityImageMSArray}</li>
     * <li>{@link #SpvCapabilityStorageImageExtendedFormats CapabilityStorageImageExtendedFormats}</li>
     * <li>{@link #SpvCapabilityImageQuery CapabilityImageQuery}</li>
     * <li>{@link #SpvCapabilityDerivativeControl CapabilityDerivativeControl}</li>
     * <li>{@link #SpvCapabilityInterpolationFunction CapabilityInterpolationFunction}</li>
     * <li>{@link #SpvCapabilityTransformFeedback CapabilityTransformFeedback}</li>
     * <li>{@link #SpvCapabilityGeometryStreams CapabilityGeometryStreams}</li>
     * <li>{@link #SpvCapabilityStorageImageReadWithoutFormat CapabilityStorageImageReadWithoutFormat}</li>
     * <li>{@link #SpvCapabilityStorageImageWriteWithoutFormat CapabilityStorageImageWriteWithoutFormat}</li>
     * <li>{@link #SpvCapabilityMultiViewport CapabilityMultiViewport}</li>
     * <li>{@link #SpvCapabilitySubgroupDispatch CapabilitySubgroupDispatch}</li>
     * <li>{@link #SpvCapabilityNamedBarrier CapabilityNamedBarrier}</li>
     * <li>{@link #SpvCapabilityPipeStorage CapabilityPipeStorage}</li>
     * <li>{@link #SpvCapabilityGroupNonUniform CapabilityGroupNonUniform}</li>
     * <li>{@link #SpvCapabilityGroupNonUniformVote CapabilityGroupNonUniformVote}</li>
     * <li>{@link #SpvCapabilityGroupNonUniformArithmetic CapabilityGroupNonUniformArithmetic}</li>
     * <li>{@link #SpvCapabilityGroupNonUniformBallot CapabilityGroupNonUniformBallot}</li>
     * <li>{@link #SpvCapabilityGroupNonUniformShuffle CapabilityGroupNonUniformShuffle}</li>
     * <li>{@link #SpvCapabilityGroupNonUniformShuffleRelative CapabilityGroupNonUniformShuffleRelative}</li>
     * <li>{@link #SpvCapabilityGroupNonUniformClustered CapabilityGroupNonUniformClustered}</li>
     * <li>{@link #SpvCapabilityGroupNonUniformQuad CapabilityGroupNonUniformQuad}</li>
     * <li>{@link #SpvCapabilityShaderLayer CapabilityShaderLayer}</li>
     * <li>{@link #SpvCapabilityShaderViewportIndex CapabilityShaderViewportIndex}</li>
     * <li>{@link #SpvCapabilityUniformDecoration CapabilityUniformDecoration}</li>
     * <li>{@link #SpvCapabilityFragmentShadingRateKHR CapabilityFragmentShadingRateKHR}</li>
     * <li>{@link #SpvCapabilitySubgroupBallotKHR CapabilitySubgroupBallotKHR}</li>
     * <li>{@link #SpvCapabilityDrawParameters CapabilityDrawParameters}</li>
     * <li>{@link #SpvCapabilityWorkgroupMemoryExplicitLayoutKHR CapabilityWorkgroupMemoryExplicitLayoutKHR}</li>
     * <li>{@link #SpvCapabilityWorkgroupMemoryExplicitLayout8BitAccessKHR CapabilityWorkgroupMemoryExplicitLayout8BitAccessKHR}</li>
     * <li>{@link #SpvCapabilityWorkgroupMemoryExplicitLayout16BitAccessKHR CapabilityWorkgroupMemoryExplicitLayout16BitAccessKHR}</li>
     * <li>{@link #SpvCapabilitySubgroupVoteKHR CapabilitySubgroupVoteKHR}</li>
     * <li>{@link #SpvCapabilityStorageBuffer16BitAccess CapabilityStorageBuffer16BitAccess}</li>
     * <li>{@link #SpvCapabilityStorageUniformBufferBlock16 CapabilityStorageUniformBufferBlock16}</li>
     * <li>{@link #SpvCapabilityStorageUniform16 CapabilityStorageUniform16}</li>
     * <li>{@link #SpvCapabilityUniformAndStorageBuffer16BitAccess CapabilityUniformAndStorageBuffer16BitAccess}</li>
     * <li>{@link #SpvCapabilityStoragePushConstant16 CapabilityStoragePushConstant16}</li>
     * <li>{@link #SpvCapabilityStorageInputOutput16 CapabilityStorageInputOutput16}</li>
     * <li>{@link #SpvCapabilityDeviceGroup CapabilityDeviceGroup}</li>
     * <li>{@link #SpvCapabilityMultiView CapabilityMultiView}</li>
     * <li>{@link #SpvCapabilityVariablePointersStorageBuffer CapabilityVariablePointersStorageBuffer}</li>
     * <li>{@link #SpvCapabilityVariablePointers CapabilityVariablePointers}</li>
     * <li>{@link #SpvCapabilityAtomicStorageOps CapabilityAtomicStorageOps}</li>
     * <li>{@link #SpvCapabilitySampleMaskPostDepthCoverage CapabilitySampleMaskPostDepthCoverage}</li>
     * <li>{@link #SpvCapabilityStorageBuffer8BitAccess CapabilityStorageBuffer8BitAccess}</li>
     * <li>{@link #SpvCapabilityUniformAndStorageBuffer8BitAccess CapabilityUniformAndStorageBuffer8BitAccess}</li>
     * <li>{@link #SpvCapabilityStoragePushConstant8 CapabilityStoragePushConstant8}</li>
     * <li>{@link #SpvCapabilityDenormPreserve CapabilityDenormPreserve}</li>
     * <li>{@link #SpvCapabilityDenormFlushToZero CapabilityDenormFlushToZero}</li>
     * <li>{@link #SpvCapabilitySignedZeroInfNanPreserve CapabilitySignedZeroInfNanPreserve}</li>
     * <li>{@link #SpvCapabilityRoundingModeRTE CapabilityRoundingModeRTE}</li>
     * <li>{@link #SpvCapabilityRoundingModeRTZ CapabilityRoundingModeRTZ}</li>
     * <li>{@link #SpvCapabilityRayQueryProvisionalKHR CapabilityRayQueryProvisionalKHR}</li>
     * <li>{@link #SpvCapabilityRayQueryKHR CapabilityRayQueryKHR}</li>
     * <li>{@link #SpvCapabilityRayTraversalPrimitiveCullingKHR CapabilityRayTraversalPrimitiveCullingKHR}</li>
     * <li>{@link #SpvCapabilityRayTracingKHR CapabilityRayTracingKHR}</li>
     * <li>{@link #SpvCapabilityFloat16ImageAMD CapabilityFloat16ImageAMD}</li>
     * <li>{@link #SpvCapabilityImageGatherBiasLodAMD CapabilityImageGatherBiasLodAMD}</li>
     * <li>{@link #SpvCapabilityFragmentMaskAMD CapabilityFragmentMaskAMD}</li>
     * <li>{@link #SpvCapabilityStencilExportEXT CapabilityStencilExportEXT}</li>
     * <li>{@link #SpvCapabilityImageReadWriteLodAMD CapabilityImageReadWriteLodAMD}</li>
     * <li>{@link #SpvCapabilityInt64ImageEXT CapabilityInt64ImageEXT}</li>
     * <li>{@link #SpvCapabilityShaderClockKHR CapabilityShaderClockKHR}</li>
     * <li>{@link #SpvCapabilitySampleMaskOverrideCoverageNV CapabilitySampleMaskOverrideCoverageNV}</li>
     * <li>{@link #SpvCapabilityGeometryShaderPassthroughNV CapabilityGeometryShaderPassthroughNV}</li>
     * <li>{@link #SpvCapabilityShaderViewportIndexLayerEXT CapabilityShaderViewportIndexLayerEXT}</li>
     * <li>{@link #SpvCapabilityShaderViewportIndexLayerNV CapabilityShaderViewportIndexLayerNV}</li>
     * <li>{@link #SpvCapabilityShaderViewportMaskNV CapabilityShaderViewportMaskNV}</li>
     * <li>{@link #SpvCapabilityShaderStereoViewNV CapabilityShaderStereoViewNV}</li>
     * <li>{@link #SpvCapabilityPerViewAttributesNV CapabilityPerViewAttributesNV}</li>
     * <li>{@link #SpvCapabilityFragmentFullyCoveredEXT CapabilityFragmentFullyCoveredEXT}</li>
     * <li>{@link #SpvCapabilityMeshShadingNV CapabilityMeshShadingNV}</li>
     * <li>{@link #SpvCapabilityImageFootprintNV CapabilityImageFootprintNV}</li>
     * <li>{@link #SpvCapabilityFragmentBarycentricKHR CapabilityFragmentBarycentricKHR}</li>
     * <li>{@link #SpvCapabilityFragmentBarycentricNV CapabilityFragmentBarycentricNV}</li>
     * <li>{@link #SpvCapabilityComputeDerivativeGroupQuadsNV CapabilityComputeDerivativeGroupQuadsNV}</li>
     * <li>{@link #SpvCapabilityFragmentDensityEXT CapabilityFragmentDensityEXT}</li>
     * <li>{@link #SpvCapabilityShadingRateNV CapabilityShadingRateNV}</li>
     * <li>{@link #SpvCapabilityGroupNonUniformPartitionedNV CapabilityGroupNonUniformPartitionedNV}</li>
     * <li>{@link #SpvCapabilityShaderNonUniform CapabilityShaderNonUniform}</li>
     * <li>{@link #SpvCapabilityShaderNonUniformEXT CapabilityShaderNonUniformEXT}</li>
     * <li>{@link #SpvCapabilityRuntimeDescriptorArray CapabilityRuntimeDescriptorArray}</li>
     * <li>{@link #SpvCapabilityRuntimeDescriptorArrayEXT CapabilityRuntimeDescriptorArrayEXT}</li>
     * <li>{@link #SpvCapabilityInputAttachmentArrayDynamicIndexing CapabilityInputAttachmentArrayDynamicIndexing}</li>
     * <li>{@link #SpvCapabilityInputAttachmentArrayDynamicIndexingEXT CapabilityInputAttachmentArrayDynamicIndexingEXT}</li>
     * <li>{@link #SpvCapabilityUniformTexelBufferArrayDynamicIndexing CapabilityUniformTexelBufferArrayDynamicIndexing}</li>
     * <li>{@link #SpvCapabilityUniformTexelBufferArrayDynamicIndexingEXT CapabilityUniformTexelBufferArrayDynamicIndexingEXT}</li>
     * <li>{@link #SpvCapabilityStorageTexelBufferArrayDynamicIndexing CapabilityStorageTexelBufferArrayDynamicIndexing}</li>
     * <li>{@link #SpvCapabilityStorageTexelBufferArrayDynamicIndexingEXT CapabilityStorageTexelBufferArrayDynamicIndexingEXT}</li>
     * <li>{@link #SpvCapabilityUniformBufferArrayNonUniformIndexing CapabilityUniformBufferArrayNonUniformIndexing}</li>
     * <li>{@link #SpvCapabilityUniformBufferArrayNonUniformIndexingEXT CapabilityUniformBufferArrayNonUniformIndexingEXT}</li>
     * <li>{@link #SpvCapabilitySampledImageArrayNonUniformIndexing CapabilitySampledImageArrayNonUniformIndexing}</li>
     * <li>{@link #SpvCapabilitySampledImageArrayNonUniformIndexingEXT CapabilitySampledImageArrayNonUniformIndexingEXT}</li>
     * <li>{@link #SpvCapabilityStorageBufferArrayNonUniformIndexing CapabilityStorageBufferArrayNonUniformIndexing}</li>
     * <li>{@link #SpvCapabilityStorageBufferArrayNonUniformIndexingEXT CapabilityStorageBufferArrayNonUniformIndexingEXT}</li>
     * <li>{@link #SpvCapabilityStorageImageArrayNonUniformIndexing CapabilityStorageImageArrayNonUniformIndexing}</li>
     * <li>{@link #SpvCapabilityStorageImageArrayNonUniformIndexingEXT CapabilityStorageImageArrayNonUniformIndexingEXT}</li>
     * <li>{@link #SpvCapabilityInputAttachmentArrayNonUniformIndexing CapabilityInputAttachmentArrayNonUniformIndexing}</li>
     * <li>{@link #SpvCapabilityInputAttachmentArrayNonUniformIndexingEXT CapabilityInputAttachmentArrayNonUniformIndexingEXT}</li>
     * <li>{@link #SpvCapabilityUniformTexelBufferArrayNonUniformIndexing CapabilityUniformTexelBufferArrayNonUniformIndexing}</li>
     * <li>{@link #SpvCapabilityUniformTexelBufferArrayNonUniformIndexingEXT CapabilityUniformTexelBufferArrayNonUniformIndexingEXT}</li>
     * <li>{@link #SpvCapabilityStorageTexelBufferArrayNonUniformIndexing CapabilityStorageTexelBufferArrayNonUniformIndexing}</li>
     * <li>{@link #SpvCapabilityStorageTexelBufferArrayNonUniformIndexingEXT CapabilityStorageTexelBufferArrayNonUniformIndexingEXT}</li>
     * <li>{@link #SpvCapabilityRayTracingNV CapabilityRayTracingNV}</li>
     * <li>{@link #SpvCapabilityRayTracingMotionBlurNV CapabilityRayTracingMotionBlurNV}</li>
     * <li>{@link #SpvCapabilityVulkanMemoryModel CapabilityVulkanMemoryModel}</li>
     * <li>{@link #SpvCapabilityVulkanMemoryModelKHR CapabilityVulkanMemoryModelKHR}</li>
     * <li>{@link #SpvCapabilityVulkanMemoryModelDeviceScope CapabilityVulkanMemoryModelDeviceScope}</li>
     * <li>{@link #SpvCapabilityVulkanMemoryModelDeviceScopeKHR CapabilityVulkanMemoryModelDeviceScopeKHR}</li>
     * <li>{@link #SpvCapabilityPhysicalStorageBufferAddresses CapabilityPhysicalStorageBufferAddresses}</li>
     * <li>{@link #SpvCapabilityPhysicalStorageBufferAddressesEXT CapabilityPhysicalStorageBufferAddressesEXT}</li>
     * <li>{@link #SpvCapabilityComputeDerivativeGroupLinearNV CapabilityComputeDerivativeGroupLinearNV}</li>
     * <li>{@link #SpvCapabilityRayTracingProvisionalKHR CapabilityRayTracingProvisionalKHR}</li>
     * <li>{@link #SpvCapabilityCooperativeMatrixNV CapabilityCooperativeMatrixNV}</li>
     * <li>{@link #SpvCapabilityFragmentShaderSampleInterlockEXT CapabilityFragmentShaderSampleInterlockEXT}</li>
     * <li>{@link #SpvCapabilityFragmentShaderShadingRateInterlockEXT CapabilityFragmentShaderShadingRateInterlockEXT}</li>
     * <li>{@link #SpvCapabilityShaderSMBuiltinsNV CapabilityShaderSMBuiltinsNV}</li>
     * <li>{@link #SpvCapabilityFragmentShaderPixelInterlockEXT CapabilityFragmentShaderPixelInterlockEXT}</li>
     * <li>{@link #SpvCapabilityDemoteToHelperInvocation CapabilityDemoteToHelperInvocation}</li>
     * <li>{@link #SpvCapabilityDemoteToHelperInvocationEXT CapabilityDemoteToHelperInvocationEXT}</li>
     * <li>{@link #SpvCapabilityBindlessTextureNV CapabilityBindlessTextureNV}</li>
     * <li>{@link #SpvCapabilitySubgroupShuffleINTEL CapabilitySubgroupShuffleINTEL}</li>
     * <li>{@link #SpvCapabilitySubgroupBufferBlockIOINTEL CapabilitySubgroupBufferBlockIOINTEL}</li>
     * <li>{@link #SpvCapabilitySubgroupImageBlockIOINTEL CapabilitySubgroupImageBlockIOINTEL}</li>
     * <li>{@link #SpvCapabilitySubgroupImageMediaBlockIOINTEL CapabilitySubgroupImageMediaBlockIOINTEL}</li>
     * <li>{@link #SpvCapabilityRoundToInfinityINTEL CapabilityRoundToInfinityINTEL}</li>
     * <li>{@link #SpvCapabilityFloatingPointModeINTEL CapabilityFloatingPointModeINTEL}</li>
     * <li>{@link #SpvCapabilityIntegerFunctions2INTEL CapabilityIntegerFunctions2INTEL}</li>
     * <li>{@link #SpvCapabilityFunctionPointersINTEL CapabilityFunctionPointersINTEL}</li>
     * <li>{@link #SpvCapabilityIndirectReferencesINTEL CapabilityIndirectReferencesINTEL}</li>
     * <li>{@link #SpvCapabilityAsmINTEL CapabilityAsmINTEL}</li>
     * <li>{@link #SpvCapabilityAtomicFloat32MinMaxEXT CapabilityAtomicFloat32MinMaxEXT}</li>
     * <li>{@link #SpvCapabilityAtomicFloat64MinMaxEXT CapabilityAtomicFloat64MinMaxEXT}</li>
     * <li>{@link #SpvCapabilityAtomicFloat16MinMaxEXT CapabilityAtomicFloat16MinMaxEXT}</li>
     * <li>{@link #SpvCapabilityVectorComputeINTEL CapabilityVectorComputeINTEL}</li>
     * <li>{@link #SpvCapabilityVectorAnyINTEL CapabilityVectorAnyINTEL}</li>
     * <li>{@link #SpvCapabilityExpectAssumeKHR CapabilityExpectAssumeKHR}</li>
     * <li>{@link #SpvCapabilitySubgroupAvcMotionEstimationINTEL CapabilitySubgroupAvcMotionEstimationINTEL}</li>
     * <li>{@link #SpvCapabilitySubgroupAvcMotionEstimationIntraINTEL CapabilitySubgroupAvcMotionEstimationIntraINTEL}</li>
     * <li>{@link #SpvCapabilitySubgroupAvcMotionEstimationChromaINTEL CapabilitySubgroupAvcMotionEstimationChromaINTEL}</li>
     * <li>{@link #SpvCapabilityVariableLengthArrayINTEL CapabilityVariableLengthArrayINTEL}</li>
     * <li>{@link #SpvCapabilityFunctionFloatControlINTEL CapabilityFunctionFloatControlINTEL}</li>
     * <li>{@link #SpvCapabilityFPGAMemoryAttributesINTEL CapabilityFPGAMemoryAttributesINTEL}</li>
     * <li>{@link #SpvCapabilityFPFastMathModeINTEL CapabilityFPFastMathModeINTEL}</li>
     * <li>{@link #SpvCapabilityArbitraryPrecisionIntegersINTEL CapabilityArbitraryPrecisionIntegersINTEL}</li>
     * <li>{@link #SpvCapabilityArbitraryPrecisionFloatingPointINTEL CapabilityArbitraryPrecisionFloatingPointINTEL}</li>
     * <li>{@link #SpvCapabilityUnstructuredLoopControlsINTEL CapabilityUnstructuredLoopControlsINTEL}</li>
     * <li>{@link #SpvCapabilityFPGALoopControlsINTEL CapabilityFPGALoopControlsINTEL}</li>
     * <li>{@link #SpvCapabilityKernelAttributesINTEL CapabilityKernelAttributesINTEL}</li>
     * <li>{@link #SpvCapabilityFPGAKernelAttributesINTEL CapabilityFPGAKernelAttributesINTEL}</li>
     * <li>{@link #SpvCapabilityFPGAMemoryAccessesINTEL CapabilityFPGAMemoryAccessesINTEL}</li>
     * <li>{@link #SpvCapabilityFPGAClusterAttributesINTEL CapabilityFPGAClusterAttributesINTEL}</li>
     * <li>{@link #SpvCapabilityLoopFuseINTEL CapabilityLoopFuseINTEL}</li>
     * <li>{@link #SpvCapabilityFPGABufferLocationINTEL CapabilityFPGABufferLocationINTEL}</li>
     * <li>{@link #SpvCapabilityArbitraryPrecisionFixedPointINTEL CapabilityArbitraryPrecisionFixedPointINTEL}</li>
     * <li>{@link #SpvCapabilityUSMStorageClassesINTEL CapabilityUSMStorageClassesINTEL}</li>
     * <li>{@link #SpvCapabilityIOPipesINTEL CapabilityIOPipesINTEL}</li>
     * <li>{@link #SpvCapabilityBlockingPipesINTEL CapabilityBlockingPipesINTEL}</li>
     * <li>{@link #SpvCapabilityFPGARegINTEL CapabilityFPGARegINTEL}</li>
     * <li>{@link #SpvCapabilityDotProductInputAll CapabilityDotProductInputAll}</li>
     * <li>{@link #SpvCapabilityDotProductInputAllKHR CapabilityDotProductInputAllKHR}</li>
     * <li>{@link #SpvCapabilityDotProductInput4x8Bit CapabilityDotProductInput4x8Bit}</li>
     * <li>{@link #SpvCapabilityDotProductInput4x8BitKHR CapabilityDotProductInput4x8BitKHR}</li>
     * <li>{@link #SpvCapabilityDotProductInput4x8BitPacked CapabilityDotProductInput4x8BitPacked}</li>
     * <li>{@link #SpvCapabilityDotProductInput4x8BitPackedKHR CapabilityDotProductInput4x8BitPackedKHR}</li>
     * <li>{@link #SpvCapabilityDotProduct CapabilityDotProduct}</li>
     * <li>{@link #SpvCapabilityDotProductKHR CapabilityDotProductKHR}</li>
     * <li>{@link #SpvCapabilityBitInstructions CapabilityBitInstructions}</li>
     * <li>{@link #SpvCapabilityAtomicFloat32AddEXT CapabilityAtomicFloat32AddEXT}</li>
     * <li>{@link #SpvCapabilityAtomicFloat64AddEXT CapabilityAtomicFloat64AddEXT}</li>
     * <li>{@link #SpvCapabilityLongConstantCompositeINTEL CapabilityLongConstantCompositeINTEL}</li>
     * <li>{@link #SpvCapabilityOptNoneINTEL CapabilityOptNoneINTEL}</li>
     * <li>{@link #SpvCapabilityAtomicFloat16AddEXT CapabilityAtomicFloat16AddEXT}</li>
     * <li>{@link #SpvCapabilityDebugInfoModuleINTEL CapabilityDebugInfoModuleINTEL}</li>
     * <li>{@link #SpvCapabilityMax CapabilityMax}</li>
     * </ul>
     */
    public static final int
        SpvCapabilityMatrix                                       = 0,
        SpvCapabilityShader                                       = 1,
        SpvCapabilityGeometry                                     = 2,
        SpvCapabilityTessellation                                 = 3,
        SpvCapabilityAddresses                                    = 4,
        SpvCapabilityLinkage                                      = 5,
        SpvCapabilityKernel                                       = 6,
        SpvCapabilityVector16                                     = 7,
        SpvCapabilityFloat16Buffer                                = 8,
        SpvCapabilityFloat16                                      = 9,
        SpvCapabilityFloat64                                      = 10,
        SpvCapabilityInt64                                        = 11,
        SpvCapabilityInt64Atomics                                 = 12,
        SpvCapabilityImageBasic                                   = 13,
        SpvCapabilityImageReadWrite                               = 14,
        SpvCapabilityImageMipmap                                  = 15,
        SpvCapabilityPipes                                        = 17,
        SpvCapabilityGroups                                       = 18,
        SpvCapabilityDeviceEnqueue                                = 19,
        SpvCapabilityLiteralSampler                               = 20,
        SpvCapabilityAtomicStorage                                = 21,
        SpvCapabilityInt16                                        = 22,
        SpvCapabilityTessellationPointSize                        = 23,
        SpvCapabilityGeometryPointSize                            = 24,
        SpvCapabilityImageGatherExtended                          = 25,
        SpvCapabilityStorageImageMultisample                      = 27,
        SpvCapabilityUniformBufferArrayDynamicIndexing            = 28,
        SpvCapabilitySampledImageArrayDynamicIndexing             = 29,
        SpvCapabilityStorageBufferArrayDynamicIndexing            = 30,
        SpvCapabilityStorageImageArrayDynamicIndexing             = 31,
        SpvCapabilityClipDistance                                 = 32,
        SpvCapabilityCullDistance                                 = 33,
        SpvCapabilityImageCubeArray                               = 34,
        SpvCapabilitySampleRateShading                            = 35,
        SpvCapabilityImageRect                                    = 36,
        SpvCapabilitySampledRect                                  = 37,
        SpvCapabilityGenericPointer                               = 38,
        SpvCapabilityInt8                                         = 39,
        SpvCapabilityInputAttachment                              = 40,
        SpvCapabilitySparseResidency                              = 41,
        SpvCapabilityMinLod                                       = 42,
        SpvCapabilitySampled1D                                    = 43,
        SpvCapabilityImage1D                                      = 44,
        SpvCapabilitySampledCubeArray                             = 45,
        SpvCapabilitySampledBuffer                                = 46,
        SpvCapabilityImageBuffer                                  = 47,
        SpvCapabilityImageMSArray                                 = 48,
        SpvCapabilityStorageImageExtendedFormats                  = 49,
        SpvCapabilityImageQuery                                   = 50,
        SpvCapabilityDerivativeControl                            = 51,
        SpvCapabilityInterpolationFunction                        = 52,
        SpvCapabilityTransformFeedback                            = 53,
        SpvCapabilityGeometryStreams                              = 54,
        SpvCapabilityStorageImageReadWithoutFormat                = 55,
        SpvCapabilityStorageImageWriteWithoutFormat               = 56,
        SpvCapabilityMultiViewport                                = 57,
        SpvCapabilitySubgroupDispatch                             = 58,
        SpvCapabilityNamedBarrier                                 = 59,
        SpvCapabilityPipeStorage                                  = 60,
        SpvCapabilityGroupNonUniform                              = 61,
        SpvCapabilityGroupNonUniformVote                          = 62,
        SpvCapabilityGroupNonUniformArithmetic                    = 63,
        SpvCapabilityGroupNonUniformBallot                        = 64,
        SpvCapabilityGroupNonUniformShuffle                       = 65,
        SpvCapabilityGroupNonUniformShuffleRelative               = 66,
        SpvCapabilityGroupNonUniformClustered                     = 67,
        SpvCapabilityGroupNonUniformQuad                          = 68,
        SpvCapabilityShaderLayer                                  = 69,
        SpvCapabilityShaderViewportIndex                          = 70,
        SpvCapabilityUniformDecoration                            = 71,
        SpvCapabilityFragmentShadingRateKHR                       = 4422,
        SpvCapabilitySubgroupBallotKHR                            = 4423,
        SpvCapabilityDrawParameters                               = 4427,
        SpvCapabilityWorkgroupMemoryExplicitLayoutKHR             = 4428,
        SpvCapabilityWorkgroupMemoryExplicitLayout8BitAccessKHR   = 4429,
        SpvCapabilityWorkgroupMemoryExplicitLayout16BitAccessKHR  = 4430,
        SpvCapabilitySubgroupVoteKHR                              = 4431,
        SpvCapabilityStorageBuffer16BitAccess                     = 4433,
        SpvCapabilityStorageUniformBufferBlock16                  = 4433,
        SpvCapabilityStorageUniform16                             = 4434,
        SpvCapabilityUniformAndStorageBuffer16BitAccess           = 4434,
        SpvCapabilityStoragePushConstant16                        = 4435,
        SpvCapabilityStorageInputOutput16                         = 4436,
        SpvCapabilityDeviceGroup                                  = 4437,
        SpvCapabilityMultiView                                    = 4439,
        SpvCapabilityVariablePointersStorageBuffer                = 4441,
        SpvCapabilityVariablePointers                             = 4442,
        SpvCapabilityAtomicStorageOps                             = 4445,
        SpvCapabilitySampleMaskPostDepthCoverage                  = 4447,
        SpvCapabilityStorageBuffer8BitAccess                      = 4448,
        SpvCapabilityUniformAndStorageBuffer8BitAccess            = 4449,
        SpvCapabilityStoragePushConstant8                         = 4450,
        SpvCapabilityDenormPreserve                               = 4464,
        SpvCapabilityDenormFlushToZero                            = 4465,
        SpvCapabilitySignedZeroInfNanPreserve                     = 4466,
        SpvCapabilityRoundingModeRTE                              = 4467,
        SpvCapabilityRoundingModeRTZ                              = 4468,
        SpvCapabilityRayQueryProvisionalKHR                       = 4471,
        SpvCapabilityRayQueryKHR                                  = 4472,
        SpvCapabilityRayTraversalPrimitiveCullingKHR              = 4478,
        SpvCapabilityRayTracingKHR                                = 4479,
        SpvCapabilityFloat16ImageAMD                              = 5008,
        SpvCapabilityImageGatherBiasLodAMD                        = 5009,
        SpvCapabilityFragmentMaskAMD                              = 5010,
        SpvCapabilityStencilExportEXT                             = 5013,
        SpvCapabilityImageReadWriteLodAMD                         = 5015,
        SpvCapabilityInt64ImageEXT                                = 5016,
        SpvCapabilityShaderClockKHR                               = 5055,
        SpvCapabilitySampleMaskOverrideCoverageNV                 = 5249,
        SpvCapabilityGeometryShaderPassthroughNV                  = 5251,
        SpvCapabilityShaderViewportIndexLayerEXT                  = 5254,
        SpvCapabilityShaderViewportIndexLayerNV                   = 5254,
        SpvCapabilityShaderViewportMaskNV                         = 5255,
        SpvCapabilityShaderStereoViewNV                           = 5259,
        SpvCapabilityPerViewAttributesNV                          = 5260,
        SpvCapabilityFragmentFullyCoveredEXT                      = 5265,
        SpvCapabilityMeshShadingNV                                = 5266,
        SpvCapabilityImageFootprintNV                             = 5282,
        SpvCapabilityFragmentBarycentricKHR                       = 5284,
        SpvCapabilityFragmentBarycentricNV                        = 5284,
        SpvCapabilityComputeDerivativeGroupQuadsNV                = 5288,
        SpvCapabilityFragmentDensityEXT                           = 5291,
        SpvCapabilityShadingRateNV                                = 5291,
        SpvCapabilityGroupNonUniformPartitionedNV                 = 5297,
        SpvCapabilityShaderNonUniform                             = 5301,
        SpvCapabilityShaderNonUniformEXT                          = 5301,
        SpvCapabilityRuntimeDescriptorArray                       = 5302,
        SpvCapabilityRuntimeDescriptorArrayEXT                    = 5302,
        SpvCapabilityInputAttachmentArrayDynamicIndexing          = 5303,
        SpvCapabilityInputAttachmentArrayDynamicIndexingEXT       = 5303,
        SpvCapabilityUniformTexelBufferArrayDynamicIndexing       = 5304,
        SpvCapabilityUniformTexelBufferArrayDynamicIndexingEXT    = 5304,
        SpvCapabilityStorageTexelBufferArrayDynamicIndexing       = 5305,
        SpvCapabilityStorageTexelBufferArrayDynamicIndexingEXT    = 5305,
        SpvCapabilityUniformBufferArrayNonUniformIndexing         = 5306,
        SpvCapabilityUniformBufferArrayNonUniformIndexingEXT      = 5306,
        SpvCapabilitySampledImageArrayNonUniformIndexing          = 5307,
        SpvCapabilitySampledImageArrayNonUniformIndexingEXT       = 5307,
        SpvCapabilityStorageBufferArrayNonUniformIndexing         = 5308,
        SpvCapabilityStorageBufferArrayNonUniformIndexingEXT      = 5308,
        SpvCapabilityStorageImageArrayNonUniformIndexing          = 5309,
        SpvCapabilityStorageImageArrayNonUniformIndexingEXT       = 5309,
        SpvCapabilityInputAttachmentArrayNonUniformIndexing       = 5310,
        SpvCapabilityInputAttachmentArrayNonUniformIndexingEXT    = 5310,
        SpvCapabilityUniformTexelBufferArrayNonUniformIndexing    = 5311,
        SpvCapabilityUniformTexelBufferArrayNonUniformIndexingEXT = 5311,
        SpvCapabilityStorageTexelBufferArrayNonUniformIndexing    = 5312,
        SpvCapabilityStorageTexelBufferArrayNonUniformIndexingEXT = 5312,
        SpvCapabilityRayTracingNV                                 = 5340,
        SpvCapabilityRayTracingMotionBlurNV                       = 5341,
        SpvCapabilityVulkanMemoryModel                            = 5345,
        SpvCapabilityVulkanMemoryModelKHR                         = 5345,
        SpvCapabilityVulkanMemoryModelDeviceScope                 = 5346,
        SpvCapabilityVulkanMemoryModelDeviceScopeKHR              = 5346,
        SpvCapabilityPhysicalStorageBufferAddresses               = 5347,
        SpvCapabilityPhysicalStorageBufferAddressesEXT            = 5347,
        SpvCapabilityComputeDerivativeGroupLinearNV               = 5350,
        SpvCapabilityRayTracingProvisionalKHR                     = 5353,
        SpvCapabilityCooperativeMatrixNV                          = 5357,
        SpvCapabilityFragmentShaderSampleInterlockEXT             = 5363,
        SpvCapabilityFragmentShaderShadingRateInterlockEXT        = 5372,
        SpvCapabilityShaderSMBuiltinsNV                           = 5373,
        SpvCapabilityFragmentShaderPixelInterlockEXT              = 5378,
        SpvCapabilityDemoteToHelperInvocation                     = 5379,
        SpvCapabilityDemoteToHelperInvocationEXT                  = 5379,
        SpvCapabilityBindlessTextureNV                            = 5390,
        SpvCapabilitySubgroupShuffleINTEL                         = 5568,
        SpvCapabilitySubgroupBufferBlockIOINTEL                   = 5569,
        SpvCapabilitySubgroupImageBlockIOINTEL                    = 5570,
        SpvCapabilitySubgroupImageMediaBlockIOINTEL               = 5579,
        SpvCapabilityRoundToInfinityINTEL                         = 5582,
        SpvCapabilityFloatingPointModeINTEL                       = 5583,
        SpvCapabilityIntegerFunctions2INTEL                       = 5584,
        SpvCapabilityFunctionPointersINTEL                        = 5603,
        SpvCapabilityIndirectReferencesINTEL                      = 5604,
        SpvCapabilityAsmINTEL                                     = 5606,
        SpvCapabilityAtomicFloat32MinMaxEXT                       = 5612,
        SpvCapabilityAtomicFloat64MinMaxEXT                       = 5613,
        SpvCapabilityAtomicFloat16MinMaxEXT                       = 5616,
        SpvCapabilityVectorComputeINTEL                           = 5617,
        SpvCapabilityVectorAnyINTEL                               = 5619,
        SpvCapabilityExpectAssumeKHR                              = 5629,
        SpvCapabilitySubgroupAvcMotionEstimationINTEL             = 5696,
        SpvCapabilitySubgroupAvcMotionEstimationIntraINTEL        = 5697,
        SpvCapabilitySubgroupAvcMotionEstimationChromaINTEL       = 5698,
        SpvCapabilityVariableLengthArrayINTEL                     = 5817,
        SpvCapabilityFunctionFloatControlINTEL                    = 5821,
        SpvCapabilityFPGAMemoryAttributesINTEL                    = 5824,
        SpvCapabilityFPFastMathModeINTEL                          = 5837,
        SpvCapabilityArbitraryPrecisionIntegersINTEL              = 5844,
        SpvCapabilityArbitraryPrecisionFloatingPointINTEL         = 5845,
        SpvCapabilityUnstructuredLoopControlsINTEL                = 5886,
        SpvCapabilityFPGALoopControlsINTEL                        = 5888,
        SpvCapabilityKernelAttributesINTEL                        = 5892,
        SpvCapabilityFPGAKernelAttributesINTEL                    = 5897,
        SpvCapabilityFPGAMemoryAccessesINTEL                      = 5898,
        SpvCapabilityFPGAClusterAttributesINTEL                   = 5904,
        SpvCapabilityLoopFuseINTEL                                = 5906,
        SpvCapabilityFPGABufferLocationINTEL                      = 5920,
        SpvCapabilityArbitraryPrecisionFixedPointINTEL            = 5922,
        SpvCapabilityUSMStorageClassesINTEL                       = 5935,
        SpvCapabilityIOPipesINTEL                                 = 5943,
        SpvCapabilityBlockingPipesINTEL                           = 5945,
        SpvCapabilityFPGARegINTEL                                 = 5948,
        SpvCapabilityDotProductInputAll                           = 6016,
        SpvCapabilityDotProductInputAllKHR                        = 6016,
        SpvCapabilityDotProductInput4x8Bit                        = 6017,
        SpvCapabilityDotProductInput4x8BitKHR                     = 6017,
        SpvCapabilityDotProductInput4x8BitPacked                  = 6018,
        SpvCapabilityDotProductInput4x8BitPackedKHR               = 6018,
        SpvCapabilityDotProduct                                   = 6019,
        SpvCapabilityDotProductKHR                                = 6019,
        SpvCapabilityBitInstructions                              = 6025,
        SpvCapabilityAtomicFloat32AddEXT                          = 6033,
        SpvCapabilityAtomicFloat64AddEXT                          = 6034,
        SpvCapabilityLongConstantCompositeINTEL                   = 6089,
        SpvCapabilityOptNoneINTEL                                 = 6094,
        SpvCapabilityAtomicFloat16AddEXT                          = 6095,
        SpvCapabilityDebugInfoModuleINTEL                         = 6114,
        SpvCapabilityMax                                          = 0x7fffffff;

    /**
     * {@code SpvRayFlagsShift}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvRayFlagsOpaqueKHRShift RayFlagsOpaqueKHRShift}</li>
     * <li>{@link #SpvRayFlagsNoOpaqueKHRShift RayFlagsNoOpaqueKHRShift}</li>
     * <li>{@link #SpvRayFlagsTerminateOnFirstHitKHRShift RayFlagsTerminateOnFirstHitKHRShift}</li>
     * <li>{@link #SpvRayFlagsSkipClosestHitShaderKHRShift RayFlagsSkipClosestHitShaderKHRShift}</li>
     * <li>{@link #SpvRayFlagsCullBackFacingTrianglesKHRShift RayFlagsCullBackFacingTrianglesKHRShift}</li>
     * <li>{@link #SpvRayFlagsCullFrontFacingTrianglesKHRShift RayFlagsCullFrontFacingTrianglesKHRShift}</li>
     * <li>{@link #SpvRayFlagsCullOpaqueKHRShift RayFlagsCullOpaqueKHRShift}</li>
     * <li>{@link #SpvRayFlagsCullNoOpaqueKHRShift RayFlagsCullNoOpaqueKHRShift}</li>
     * <li>{@link #SpvRayFlagsSkipTrianglesKHRShift RayFlagsSkipTrianglesKHRShift}</li>
     * <li>{@link #SpvRayFlagsSkipAABBsKHRShift RayFlagsSkipAABBsKHRShift}</li>
     * <li>{@link #SpvRayFlagsMax RayFlagsMax}</li>
     * </ul>
     */
    public static final int
        SpvRayFlagsOpaqueKHRShift                   = 0,
        SpvRayFlagsNoOpaqueKHRShift                 = 1,
        SpvRayFlagsTerminateOnFirstHitKHRShift      = 2,
        SpvRayFlagsSkipClosestHitShaderKHRShift     = 3,
        SpvRayFlagsCullBackFacingTrianglesKHRShift  = 4,
        SpvRayFlagsCullFrontFacingTrianglesKHRShift = 5,
        SpvRayFlagsCullOpaqueKHRShift               = 6,
        SpvRayFlagsCullNoOpaqueKHRShift             = 7,
        SpvRayFlagsSkipTrianglesKHRShift            = 8,
        SpvRayFlagsSkipAABBsKHRShift                = 9,
        SpvRayFlagsMax                              = 0x7fffffff;

    /**
     * {@code SpvRayFlagsMask}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvRayFlagsMaskNone RayFlagsMaskNone}</li>
     * <li>{@link #SpvRayFlagsOpaqueKHRMask RayFlagsOpaqueKHRMask}</li>
     * <li>{@link #SpvRayFlagsNoOpaqueKHRMask RayFlagsNoOpaqueKHRMask}</li>
     * <li>{@link #SpvRayFlagsTerminateOnFirstHitKHRMask RayFlagsTerminateOnFirstHitKHRMask}</li>
     * <li>{@link #SpvRayFlagsSkipClosestHitShaderKHRMask RayFlagsSkipClosestHitShaderKHRMask}</li>
     * <li>{@link #SpvRayFlagsCullBackFacingTrianglesKHRMask RayFlagsCullBackFacingTrianglesKHRMask}</li>
     * <li>{@link #SpvRayFlagsCullFrontFacingTrianglesKHRMask RayFlagsCullFrontFacingTrianglesKHRMask}</li>
     * <li>{@link #SpvRayFlagsCullOpaqueKHRMask RayFlagsCullOpaqueKHRMask}</li>
     * <li>{@link #SpvRayFlagsCullNoOpaqueKHRMask RayFlagsCullNoOpaqueKHRMask}</li>
     * <li>{@link #SpvRayFlagsSkipTrianglesKHRMask RayFlagsSkipTrianglesKHRMask}</li>
     * <li>{@link #SpvRayFlagsSkipAABBsKHRMask RayFlagsSkipAABBsKHRMask}</li>
     * </ul>
     */
    public static final int
        SpvRayFlagsMaskNone                        = 0,
        SpvRayFlagsOpaqueKHRMask                   = 0x00000001,
        SpvRayFlagsNoOpaqueKHRMask                 = 0x00000002,
        SpvRayFlagsTerminateOnFirstHitKHRMask      = 0x00000004,
        SpvRayFlagsSkipClosestHitShaderKHRMask     = 0x00000008,
        SpvRayFlagsCullBackFacingTrianglesKHRMask  = 0x00000010,
        SpvRayFlagsCullFrontFacingTrianglesKHRMask = 0x00000020,
        SpvRayFlagsCullOpaqueKHRMask               = 0x00000040,
        SpvRayFlagsCullNoOpaqueKHRMask             = 0x00000080,
        SpvRayFlagsSkipTrianglesKHRMask            = 0x00000100,
        SpvRayFlagsSkipAABBsKHRMask                = 0x00000200;

    /**
     * {@code SpvRayQueryIntersection}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvRayQueryIntersectionRayQueryCandidateIntersectionKHR RayQueryIntersectionRayQueryCandidateIntersectionKHR}</li>
     * <li>{@link #SpvRayQueryIntersectionRayQueryCommittedIntersectionKHR RayQueryIntersectionRayQueryCommittedIntersectionKHR}</li>
     * <li>{@link #SpvRayQueryIntersectionMax RayQueryIntersectionMax}</li>
     * </ul>
     */
    public static final int
        SpvRayQueryIntersectionRayQueryCandidateIntersectionKHR = 0,
        SpvRayQueryIntersectionRayQueryCommittedIntersectionKHR = 1,
        SpvRayQueryIntersectionMax                              = 0x7fffffff;

    /**
     * {@code SpvRayQueryCommittedIntersectionType}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvRayQueryCommittedIntersectionTypeRayQueryCommittedIntersectionNoneKHR RayQueryCommittedIntersectionTypeRayQueryCommittedIntersectionNoneKHR}</li>
     * <li>{@link #SpvRayQueryCommittedIntersectionTypeRayQueryCommittedIntersectionTriangleKHR RayQueryCommittedIntersectionTypeRayQueryCommittedIntersectionTriangleKHR}</li>
     * <li>{@link #SpvRayQueryCommittedIntersectionTypeRayQueryCommittedIntersectionGeneratedKHR RayQueryCommittedIntersectionTypeRayQueryCommittedIntersectionGeneratedKHR}</li>
     * <li>{@link #SpvRayQueryCommittedIntersectionTypeMax RayQueryCommittedIntersectionTypeMax}</li>
     * </ul>
     */
    public static final int
        SpvRayQueryCommittedIntersectionTypeRayQueryCommittedIntersectionNoneKHR      = 0,
        SpvRayQueryCommittedIntersectionTypeRayQueryCommittedIntersectionTriangleKHR  = 1,
        SpvRayQueryCommittedIntersectionTypeRayQueryCommittedIntersectionGeneratedKHR = 2,
        SpvRayQueryCommittedIntersectionTypeMax                                       = 0x7fffffff;

    /**
     * {@code SpvRayQueryCandidateIntersectionType}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvRayQueryCandidateIntersectionTypeRayQueryCandidateIntersectionTriangleKHR RayQueryCandidateIntersectionTypeRayQueryCandidateIntersectionTriangleKHR}</li>
     * <li>{@link #SpvRayQueryCandidateIntersectionTypeRayQueryCandidateIntersectionAABBKHR RayQueryCandidateIntersectionTypeRayQueryCandidateIntersectionAABBKHR}</li>
     * <li>{@link #SpvRayQueryCandidateIntersectionTypeMax RayQueryCandidateIntersectionTypeMax}</li>
     * </ul>
     */
    public static final int
        SpvRayQueryCandidateIntersectionTypeRayQueryCandidateIntersectionTriangleKHR = 0,
        SpvRayQueryCandidateIntersectionTypeRayQueryCandidateIntersectionAABBKHR     = 1,
        SpvRayQueryCandidateIntersectionTypeMax                                      = 0x7fffffff;

    /**
     * {@code SpvFragmentShadingRateShift}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvFragmentShadingRateVertical2PixelsShift FragmentShadingRateVertical2PixelsShift}</li>
     * <li>{@link #SpvFragmentShadingRateVertical4PixelsShift FragmentShadingRateVertical4PixelsShift}</li>
     * <li>{@link #SpvFragmentShadingRateHorizontal2PixelsShift FragmentShadingRateHorizontal2PixelsShift}</li>
     * <li>{@link #SpvFragmentShadingRateHorizontal4PixelsShift FragmentShadingRateHorizontal4PixelsShift}</li>
     * <li>{@link #SpvFragmentShadingRateMax FragmentShadingRateMax}</li>
     * </ul>
     */
    public static final int
        SpvFragmentShadingRateVertical2PixelsShift   = 0,
        SpvFragmentShadingRateVertical4PixelsShift   = 1,
        SpvFragmentShadingRateHorizontal2PixelsShift = 2,
        SpvFragmentShadingRateHorizontal4PixelsShift = 3,
        SpvFragmentShadingRateMax                    = 0x7fffffff;

    /**
     * {@code SpvFragmentShadingRateMask}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvFragmentShadingRateMaskNone FragmentShadingRateMaskNone}</li>
     * <li>{@link #SpvFragmentShadingRateVertical2PixelsMask FragmentShadingRateVertical2PixelsMask}</li>
     * <li>{@link #SpvFragmentShadingRateVertical4PixelsMask FragmentShadingRateVertical4PixelsMask}</li>
     * <li>{@link #SpvFragmentShadingRateHorizontal2PixelsMask FragmentShadingRateHorizontal2PixelsMask}</li>
     * <li>{@link #SpvFragmentShadingRateHorizontal4PixelsMask FragmentShadingRateHorizontal4PixelsMask}</li>
     * </ul>
     */
    public static final int
        SpvFragmentShadingRateMaskNone              = 0,
        SpvFragmentShadingRateVertical2PixelsMask   = 0x00000001,
        SpvFragmentShadingRateVertical4PixelsMask   = 0x00000002,
        SpvFragmentShadingRateHorizontal2PixelsMask = 0x00000004,
        SpvFragmentShadingRateHorizontal4PixelsMask = 0x00000008;

    /**
     * {@code SpvFPDenormMode}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvFPDenormModePreserve FPDenormModePreserve}</li>
     * <li>{@link #SpvFPDenormModeFlushToZero FPDenormModeFlushToZero}</li>
     * <li>{@link #SpvFPDenormModeMax FPDenormModeMax}</li>
     * </ul>
     */
    public static final int
        SpvFPDenormModePreserve    = 0,
        SpvFPDenormModeFlushToZero = 1,
        SpvFPDenormModeMax         = 0x7fffffff;

    /**
     * {@code SpvFPOperationMode}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvFPOperationModeIEEE FPOperationModeIEEE}</li>
     * <li>{@link #SpvFPOperationModeALT FPOperationModeALT}</li>
     * <li>{@link #SpvFPOperationModeMax FPOperationModeMax}</li>
     * </ul>
     */
    public static final int
        SpvFPOperationModeIEEE = 0,
        SpvFPOperationModeALT  = 1,
        SpvFPOperationModeMax  = 0x7fffffff;

    /**
     * {@code SpvQuantizationModes}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvQuantizationModesTRN QuantizationModesTRN}</li>
     * <li>{@link #SpvQuantizationModesTRN_ZERO QuantizationModesTRN_ZERO}</li>
     * <li>{@link #SpvQuantizationModesRND QuantizationModesRND}</li>
     * <li>{@link #SpvQuantizationModesRND_ZERO QuantizationModesRND_ZERO}</li>
     * <li>{@link #SpvQuantizationModesRND_INF QuantizationModesRND_INF}</li>
     * <li>{@link #SpvQuantizationModesRND_MIN_INF QuantizationModesRND_MIN_INF}</li>
     * <li>{@link #SpvQuantizationModesRND_CONV QuantizationModesRND_CONV}</li>
     * <li>{@link #SpvQuantizationModesRND_CONV_ODD QuantizationModesRND_CONV_ODD}</li>
     * <li>{@link #SpvQuantizationModesMax QuantizationModesMax}</li>
     * </ul>
     */
    public static final int
        SpvQuantizationModesTRN          = 0,
        SpvQuantizationModesTRN_ZERO     = 1,
        SpvQuantizationModesRND          = 2,
        SpvQuantizationModesRND_ZERO     = 3,
        SpvQuantizationModesRND_INF      = 4,
        SpvQuantizationModesRND_MIN_INF  = 5,
        SpvQuantizationModesRND_CONV     = 6,
        SpvQuantizationModesRND_CONV_ODD = 7,
        SpvQuantizationModesMax          = 0x7fffffff;

    /**
     * {@code SpvOverflowModes}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvOverflowModesWRAP OverflowModesWRAP}</li>
     * <li>{@link #SpvOverflowModesSAT OverflowModesSAT}</li>
     * <li>{@link #SpvOverflowModesSAT_ZERO OverflowModesSAT_ZERO}</li>
     * <li>{@link #SpvOverflowModesSAT_SYM OverflowModesSAT_SYM}</li>
     * <li>{@link #SpvOverflowModesMax OverflowModesMax}</li>
     * </ul>
     */
    public static final int
        SpvOverflowModesWRAP     = 0,
        SpvOverflowModesSAT      = 1,
        SpvOverflowModesSAT_ZERO = 2,
        SpvOverflowModesSAT_SYM  = 3,
        SpvOverflowModesMax      = 0x7fffffff;

    /**
     * {@code SpvPackedVectorFormat}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvPackedVectorFormatPackedVectorFormat4x8Bit PackedVectorFormatPackedVectorFormat4x8Bit}</li>
     * <li>{@link #SpvPackedVectorFormatPackedVectorFormat4x8BitKHR PackedVectorFormatPackedVectorFormat4x8BitKHR}</li>
     * <li>{@link #SpvPackedVectorFormatMax PackedVectorFormatMax}</li>
     * </ul>
     */
    public static final int
        SpvPackedVectorFormatPackedVectorFormat4x8Bit    = 0,
        SpvPackedVectorFormatPackedVectorFormat4x8BitKHR = 0,
        SpvPackedVectorFormatMax                         = 0x7fffffff;

    /**
     * {@code SpvOp}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SpvOpNop OpNop}</li>
     * <li>{@link #SpvOpUndef OpUndef}</li>
     * <li>{@link #SpvOpSourceContinued OpSourceContinued}</li>
     * <li>{@link #SpvOpSource OpSource}</li>
     * <li>{@link #SpvOpSourceExtension OpSourceExtension}</li>
     * <li>{@link #SpvOpName OpName}</li>
     * <li>{@link #SpvOpMemberName OpMemberName}</li>
     * <li>{@link #SpvOpString OpString}</li>
     * <li>{@link #SpvOpLine OpLine}</li>
     * <li>{@link #SpvOpExtension OpExtension}</li>
     * <li>{@link #SpvOpExtInstImport OpExtInstImport}</li>
     * <li>{@link #SpvOpExtInst OpExtInst}</li>
     * <li>{@link #SpvOpMemoryModel OpMemoryModel}</li>
     * <li>{@link #SpvOpEntryPoint OpEntryPoint}</li>
     * <li>{@link #SpvOpExecutionMode OpExecutionMode}</li>
     * <li>{@link #SpvOpCapability OpCapability}</li>
     * <li>{@link #SpvOpTypeVoid OpTypeVoid}</li>
     * <li>{@link #SpvOpTypeBool OpTypeBool}</li>
     * <li>{@link #SpvOpTypeInt OpTypeInt}</li>
     * <li>{@link #SpvOpTypeFloat OpTypeFloat}</li>
     * <li>{@link #SpvOpTypeVector OpTypeVector}</li>
     * <li>{@link #SpvOpTypeMatrix OpTypeMatrix}</li>
     * <li>{@link #SpvOpTypeImage OpTypeImage}</li>
     * <li>{@link #SpvOpTypeSampler OpTypeSampler}</li>
     * <li>{@link #SpvOpTypeSampledImage OpTypeSampledImage}</li>
     * <li>{@link #SpvOpTypeArray OpTypeArray}</li>
     * <li>{@link #SpvOpTypeRuntimeArray OpTypeRuntimeArray}</li>
     * <li>{@link #SpvOpTypeStruct OpTypeStruct}</li>
     * <li>{@link #SpvOpTypeOpaque OpTypeOpaque}</li>
     * <li>{@link #SpvOpTypePointer OpTypePointer}</li>
     * <li>{@link #SpvOpTypeFunction OpTypeFunction}</li>
     * <li>{@link #SpvOpTypeEvent OpTypeEvent}</li>
     * <li>{@link #SpvOpTypeDeviceEvent OpTypeDeviceEvent}</li>
     * <li>{@link #SpvOpTypeReserveId OpTypeReserveId}</li>
     * <li>{@link #SpvOpTypeQueue OpTypeQueue}</li>
     * <li>{@link #SpvOpTypePipe OpTypePipe}</li>
     * <li>{@link #SpvOpTypeForwardPointer OpTypeForwardPointer}</li>
     * <li>{@link #SpvOpConstantTrue OpConstantTrue}</li>
     * <li>{@link #SpvOpConstantFalse OpConstantFalse}</li>
     * <li>{@link #SpvOpConstant OpConstant}</li>
     * <li>{@link #SpvOpConstantComposite OpConstantComposite}</li>
     * <li>{@link #SpvOpConstantSampler OpConstantSampler}</li>
     * <li>{@link #SpvOpConstantNull OpConstantNull}</li>
     * <li>{@link #SpvOpSpecConstantTrue OpSpecConstantTrue}</li>
     * <li>{@link #SpvOpSpecConstantFalse OpSpecConstantFalse}</li>
     * <li>{@link #SpvOpSpecConstant OpSpecConstant}</li>
     * <li>{@link #SpvOpSpecConstantComposite OpSpecConstantComposite}</li>
     * <li>{@link #SpvOpSpecConstantOp OpSpecConstantOp}</li>
     * <li>{@link #SpvOpFunction OpFunction}</li>
     * <li>{@link #SpvOpFunctionParameter OpFunctionParameter}</li>
     * <li>{@link #SpvOpFunctionEnd OpFunctionEnd}</li>
     * <li>{@link #SpvOpFunctionCall OpFunctionCall}</li>
     * <li>{@link #SpvOpVariable OpVariable}</li>
     * <li>{@link #SpvOpImageTexelPointer OpImageTexelPointer}</li>
     * <li>{@link #SpvOpLoad OpLoad}</li>
     * <li>{@link #SpvOpStore OpStore}</li>
     * <li>{@link #SpvOpCopyMemory OpCopyMemory}</li>
     * <li>{@link #SpvOpCopyMemorySized OpCopyMemorySized}</li>
     * <li>{@link #SpvOpAccessChain OpAccessChain}</li>
     * <li>{@link #SpvOpInBoundsAccessChain OpInBoundsAccessChain}</li>
     * <li>{@link #SpvOpPtrAccessChain OpPtrAccessChain}</li>
     * <li>{@link #SpvOpArrayLength OpArrayLength}</li>
     * <li>{@link #SpvOpGenericPtrMemSemantics OpGenericPtrMemSemantics}</li>
     * <li>{@link #SpvOpInBoundsPtrAccessChain OpInBoundsPtrAccessChain}</li>
     * <li>{@link #SpvOpDecorate OpDecorate}</li>
     * <li>{@link #SpvOpMemberDecorate OpMemberDecorate}</li>
     * <li>{@link #SpvOpDecorationGroup OpDecorationGroup}</li>
     * <li>{@link #SpvOpGroupDecorate OpGroupDecorate}</li>
     * <li>{@link #SpvOpGroupMemberDecorate OpGroupMemberDecorate}</li>
     * <li>{@link #SpvOpVectorExtractDynamic OpVectorExtractDynamic}</li>
     * <li>{@link #SpvOpVectorInsertDynamic OpVectorInsertDynamic}</li>
     * <li>{@link #SpvOpVectorShuffle OpVectorShuffle}</li>
     * <li>{@link #SpvOpCompositeConstruct OpCompositeConstruct}</li>
     * <li>{@link #SpvOpCompositeExtract OpCompositeExtract}</li>
     * <li>{@link #SpvOpCompositeInsert OpCompositeInsert}</li>
     * <li>{@link #SpvOpCopyObject OpCopyObject}</li>
     * <li>{@link #SpvOpTranspose OpTranspose}</li>
     * <li>{@link #SpvOpSampledImage OpSampledImage}</li>
     * <li>{@link #SpvOpImageSampleImplicitLod OpImageSampleImplicitLod}</li>
     * <li>{@link #SpvOpImageSampleExplicitLod OpImageSampleExplicitLod}</li>
     * <li>{@link #SpvOpImageSampleDrefImplicitLod OpImageSampleDrefImplicitLod}</li>
     * <li>{@link #SpvOpImageSampleDrefExplicitLod OpImageSampleDrefExplicitLod}</li>
     * <li>{@link #SpvOpImageSampleProjImplicitLod OpImageSampleProjImplicitLod}</li>
     * <li>{@link #SpvOpImageSampleProjExplicitLod OpImageSampleProjExplicitLod}</li>
     * <li>{@link #SpvOpImageSampleProjDrefImplicitLod OpImageSampleProjDrefImplicitLod}</li>
     * <li>{@link #SpvOpImageSampleProjDrefExplicitLod OpImageSampleProjDrefExplicitLod}</li>
     * <li>{@link #SpvOpImageFetch OpImageFetch}</li>
     * <li>{@link #SpvOpImageGather OpImageGather}</li>
     * <li>{@link #SpvOpImageDrefGather OpImageDrefGather}</li>
     * <li>{@link #SpvOpImageRead OpImageRead}</li>
     * <li>{@link #SpvOpImageWrite OpImageWrite}</li>
     * <li>{@link #SpvOpImage OpImage}</li>
     * <li>{@link #SpvOpImageQueryFormat OpImageQueryFormat}</li>
     * <li>{@link #SpvOpImageQueryOrder OpImageQueryOrder}</li>
     * <li>{@link #SpvOpImageQuerySizeLod OpImageQuerySizeLod}</li>
     * <li>{@link #SpvOpImageQuerySize OpImageQuerySize}</li>
     * <li>{@link #SpvOpImageQueryLod OpImageQueryLod}</li>
     * <li>{@link #SpvOpImageQueryLevels OpImageQueryLevels}</li>
     * <li>{@link #SpvOpImageQuerySamples OpImageQuerySamples}</li>
     * <li>{@link #SpvOpConvertFToU OpConvertFToU}</li>
     * <li>{@link #SpvOpConvertFToS OpConvertFToS}</li>
     * <li>{@link #SpvOpConvertSToF OpConvertSToF}</li>
     * <li>{@link #SpvOpConvertUToF OpConvertUToF}</li>
     * <li>{@link #SpvOpUConvert OpUConvert}</li>
     * <li>{@link #SpvOpSConvert OpSConvert}</li>
     * <li>{@link #SpvOpFConvert OpFConvert}</li>
     * <li>{@link #SpvOpQuantizeToF16 OpQuantizeToF16}</li>
     * <li>{@link #SpvOpConvertPtrToU OpConvertPtrToU}</li>
     * <li>{@link #SpvOpSatConvertSToU OpSatConvertSToU}</li>
     * <li>{@link #SpvOpSatConvertUToS OpSatConvertUToS}</li>
     * <li>{@link #SpvOpConvertUToPtr OpConvertUToPtr}</li>
     * <li>{@link #SpvOpPtrCastToGeneric OpPtrCastToGeneric}</li>
     * <li>{@link #SpvOpGenericCastToPtr OpGenericCastToPtr}</li>
     * <li>{@link #SpvOpGenericCastToPtrExplicit OpGenericCastToPtrExplicit}</li>
     * <li>{@link #SpvOpBitcast OpBitcast}</li>
     * <li>{@link #SpvOpSNegate OpSNegate}</li>
     * <li>{@link #SpvOpFNegate OpFNegate}</li>
     * <li>{@link #SpvOpIAdd OpIAdd}</li>
     * <li>{@link #SpvOpFAdd OpFAdd}</li>
     * <li>{@link #SpvOpISub OpISub}</li>
     * <li>{@link #SpvOpFSub OpFSub}</li>
     * <li>{@link #SpvOpIMul OpIMul}</li>
     * <li>{@link #SpvOpFMul OpFMul}</li>
     * <li>{@link #SpvOpUDiv OpUDiv}</li>
     * <li>{@link #SpvOpSDiv OpSDiv}</li>
     * <li>{@link #SpvOpFDiv OpFDiv}</li>
     * <li>{@link #SpvOpUMod OpUMod}</li>
     * <li>{@link #SpvOpSRem OpSRem}</li>
     * <li>{@link #SpvOpSMod OpSMod}</li>
     * <li>{@link #SpvOpFRem OpFRem}</li>
     * <li>{@link #SpvOpFMod OpFMod}</li>
     * <li>{@link #SpvOpVectorTimesScalar OpVectorTimesScalar}</li>
     * <li>{@link #SpvOpMatrixTimesScalar OpMatrixTimesScalar}</li>
     * <li>{@link #SpvOpVectorTimesMatrix OpVectorTimesMatrix}</li>
     * <li>{@link #SpvOpMatrixTimesVector OpMatrixTimesVector}</li>
     * <li>{@link #SpvOpMatrixTimesMatrix OpMatrixTimesMatrix}</li>
     * <li>{@link #SpvOpOuterProduct OpOuterProduct}</li>
     * <li>{@link #SpvOpDot OpDot}</li>
     * <li>{@link #SpvOpIAddCarry OpIAddCarry}</li>
     * <li>{@link #SpvOpISubBorrow OpISubBorrow}</li>
     * <li>{@link #SpvOpUMulExtended OpUMulExtended}</li>
     * <li>{@link #SpvOpSMulExtended OpSMulExtended}</li>
     * <li>{@link #SpvOpAny OpAny}</li>
     * <li>{@link #SpvOpAll OpAll}</li>
     * <li>{@link #SpvOpIsNan OpIsNan}</li>
     * <li>{@link #SpvOpIsInf OpIsInf}</li>
     * <li>{@link #SpvOpIsFinite OpIsFinite}</li>
     * <li>{@link #SpvOpIsNormal OpIsNormal}</li>
     * <li>{@link #SpvOpSignBitSet OpSignBitSet}</li>
     * <li>{@link #SpvOpLessOrGreater OpLessOrGreater}</li>
     * <li>{@link #SpvOpOrdered OpOrdered}</li>
     * <li>{@link #SpvOpUnordered OpUnordered}</li>
     * <li>{@link #SpvOpLogicalEqual OpLogicalEqual}</li>
     * <li>{@link #SpvOpLogicalNotEqual OpLogicalNotEqual}</li>
     * <li>{@link #SpvOpLogicalOr OpLogicalOr}</li>
     * <li>{@link #SpvOpLogicalAnd OpLogicalAnd}</li>
     * <li>{@link #SpvOpLogicalNot OpLogicalNot}</li>
     * <li>{@link #SpvOpSelect OpSelect}</li>
     * <li>{@link #SpvOpIEqual OpIEqual}</li>
     * <li>{@link #SpvOpINotEqual OpINotEqual}</li>
     * <li>{@link #SpvOpUGreaterThan OpUGreaterThan}</li>
     * <li>{@link #SpvOpSGreaterThan OpSGreaterThan}</li>
     * <li>{@link #SpvOpUGreaterThanEqual OpUGreaterThanEqual}</li>
     * <li>{@link #SpvOpSGreaterThanEqual OpSGreaterThanEqual}</li>
     * <li>{@link #SpvOpULessThan OpULessThan}</li>
     * <li>{@link #SpvOpSLessThan OpSLessThan}</li>
     * <li>{@link #SpvOpULessThanEqual OpULessThanEqual}</li>
     * <li>{@link #SpvOpSLessThanEqual OpSLessThanEqual}</li>
     * <li>{@link #SpvOpFOrdEqual OpFOrdEqual}</li>
     * <li>{@link #SpvOpFUnordEqual OpFUnordEqual}</li>
     * <li>{@link #SpvOpFOrdNotEqual OpFOrdNotEqual}</li>
     * <li>{@link #SpvOpFUnordNotEqual OpFUnordNotEqual}</li>
     * <li>{@link #SpvOpFOrdLessThan OpFOrdLessThan}</li>
     * <li>{@link #SpvOpFUnordLessThan OpFUnordLessThan}</li>
     * <li>{@link #SpvOpFOrdGreaterThan OpFOrdGreaterThan}</li>
     * <li>{@link #SpvOpFUnordGreaterThan OpFUnordGreaterThan}</li>
     * <li>{@link #SpvOpFOrdLessThanEqual OpFOrdLessThanEqual}</li>
     * <li>{@link #SpvOpFUnordLessThanEqual OpFUnordLessThanEqual}</li>
     * <li>{@link #SpvOpFOrdGreaterThanEqual OpFOrdGreaterThanEqual}</li>
     * <li>{@link #SpvOpFUnordGreaterThanEqual OpFUnordGreaterThanEqual}</li>
     * <li>{@link #SpvOpShiftRightLogical OpShiftRightLogical}</li>
     * <li>{@link #SpvOpShiftRightArithmetic OpShiftRightArithmetic}</li>
     * <li>{@link #SpvOpShiftLeftLogical OpShiftLeftLogical}</li>
     * <li>{@link #SpvOpBitwiseOr OpBitwiseOr}</li>
     * <li>{@link #SpvOpBitwiseXor OpBitwiseXor}</li>
     * <li>{@link #SpvOpBitwiseAnd OpBitwiseAnd}</li>
     * <li>{@link #SpvOpNot OpNot}</li>
     * <li>{@link #SpvOpBitFieldInsert OpBitFieldInsert}</li>
     * <li>{@link #SpvOpBitFieldSExtract OpBitFieldSExtract}</li>
     * <li>{@link #SpvOpBitFieldUExtract OpBitFieldUExtract}</li>
     * <li>{@link #SpvOpBitReverse OpBitReverse}</li>
     * <li>{@link #SpvOpBitCount OpBitCount}</li>
     * <li>{@link #SpvOpDPdx OpDPdx}</li>
     * <li>{@link #SpvOpDPdy OpDPdy}</li>
     * <li>{@link #SpvOpFwidth OpFwidth}</li>
     * <li>{@link #SpvOpDPdxFine OpDPdxFine}</li>
     * <li>{@link #SpvOpDPdyFine OpDPdyFine}</li>
     * <li>{@link #SpvOpFwidthFine OpFwidthFine}</li>
     * <li>{@link #SpvOpDPdxCoarse OpDPdxCoarse}</li>
     * <li>{@link #SpvOpDPdyCoarse OpDPdyCoarse}</li>
     * <li>{@link #SpvOpFwidthCoarse OpFwidthCoarse}</li>
     * <li>{@link #SpvOpEmitVertex OpEmitVertex}</li>
     * <li>{@link #SpvOpEndPrimitive OpEndPrimitive}</li>
     * <li>{@link #SpvOpEmitStreamVertex OpEmitStreamVertex}</li>
     * <li>{@link #SpvOpEndStreamPrimitive OpEndStreamPrimitive}</li>
     * <li>{@link #SpvOpControlBarrier OpControlBarrier}</li>
     * <li>{@link #SpvOpMemoryBarrier OpMemoryBarrier}</li>
     * <li>{@link #SpvOpAtomicLoad OpAtomicLoad}</li>
     * <li>{@link #SpvOpAtomicStore OpAtomicStore}</li>
     * <li>{@link #SpvOpAtomicExchange OpAtomicExchange}</li>
     * <li>{@link #SpvOpAtomicCompareExchange OpAtomicCompareExchange}</li>
     * <li>{@link #SpvOpAtomicCompareExchangeWeak OpAtomicCompareExchangeWeak}</li>
     * <li>{@link #SpvOpAtomicIIncrement OpAtomicIIncrement}</li>
     * <li>{@link #SpvOpAtomicIDecrement OpAtomicIDecrement}</li>
     * <li>{@link #SpvOpAtomicIAdd OpAtomicIAdd}</li>
     * <li>{@link #SpvOpAtomicISub OpAtomicISub}</li>
     * <li>{@link #SpvOpAtomicSMin OpAtomicSMin}</li>
     * <li>{@link #SpvOpAtomicUMin OpAtomicUMin}</li>
     * <li>{@link #SpvOpAtomicSMax OpAtomicSMax}</li>
     * <li>{@link #SpvOpAtomicUMax OpAtomicUMax}</li>
     * <li>{@link #SpvOpAtomicAnd OpAtomicAnd}</li>
     * <li>{@link #SpvOpAtomicOr OpAtomicOr}</li>
     * <li>{@link #SpvOpAtomicXor OpAtomicXor}</li>
     * <li>{@link #SpvOpPhi OpPhi}</li>
     * <li>{@link #SpvOpLoopMerge OpLoopMerge}</li>
     * <li>{@link #SpvOpSelectionMerge OpSelectionMerge}</li>
     * <li>{@link #SpvOpLabel OpLabel}</li>
     * <li>{@link #SpvOpBranch OpBranch}</li>
     * <li>{@link #SpvOpBranchConditional OpBranchConditional}</li>
     * <li>{@link #SpvOpSwitch OpSwitch}</li>
     * <li>{@link #SpvOpKill OpKill}</li>
     * <li>{@link #SpvOpReturn OpReturn}</li>
     * <li>{@link #SpvOpReturnValue OpReturnValue}</li>
     * <li>{@link #SpvOpUnreachable OpUnreachable}</li>
     * <li>{@link #SpvOpLifetimeStart OpLifetimeStart}</li>
     * <li>{@link #SpvOpLifetimeStop OpLifetimeStop}</li>
     * <li>{@link #SpvOpGroupAsyncCopy OpGroupAsyncCopy}</li>
     * <li>{@link #SpvOpGroupWaitEvents OpGroupWaitEvents}</li>
     * <li>{@link #SpvOpGroupAll OpGroupAll}</li>
     * <li>{@link #SpvOpGroupAny OpGroupAny}</li>
     * <li>{@link #SpvOpGroupBroadcast OpGroupBroadcast}</li>
     * <li>{@link #SpvOpGroupIAdd OpGroupIAdd}</li>
     * <li>{@link #SpvOpGroupFAdd OpGroupFAdd}</li>
     * <li>{@link #SpvOpGroupFMin OpGroupFMin}</li>
     * <li>{@link #SpvOpGroupUMin OpGroupUMin}</li>
     * <li>{@link #SpvOpGroupSMin OpGroupSMin}</li>
     * <li>{@link #SpvOpGroupFMax OpGroupFMax}</li>
     * <li>{@link #SpvOpGroupUMax OpGroupUMax}</li>
     * <li>{@link #SpvOpGroupSMax OpGroupSMax}</li>
     * <li>{@link #SpvOpReadPipe OpReadPipe}</li>
     * <li>{@link #SpvOpWritePipe OpWritePipe}</li>
     * <li>{@link #SpvOpReservedReadPipe OpReservedReadPipe}</li>
     * <li>{@link #SpvOpReservedWritePipe OpReservedWritePipe}</li>
     * <li>{@link #SpvOpReserveReadPipePackets OpReserveReadPipePackets}</li>
     * <li>{@link #SpvOpReserveWritePipePackets OpReserveWritePipePackets}</li>
     * <li>{@link #SpvOpCommitReadPipe OpCommitReadPipe}</li>
     * <li>{@link #SpvOpCommitWritePipe OpCommitWritePipe}</li>
     * <li>{@link #SpvOpIsValidReserveId OpIsValidReserveId}</li>
     * <li>{@link #SpvOpGetNumPipePackets OpGetNumPipePackets}</li>
     * <li>{@link #SpvOpGetMaxPipePackets OpGetMaxPipePackets}</li>
     * <li>{@link #SpvOpGroupReserveReadPipePackets OpGroupReserveReadPipePackets}</li>
     * <li>{@link #SpvOpGroupReserveWritePipePackets OpGroupReserveWritePipePackets}</li>
     * <li>{@link #SpvOpGroupCommitReadPipe OpGroupCommitReadPipe}</li>
     * <li>{@link #SpvOpGroupCommitWritePipe OpGroupCommitWritePipe}</li>
     * <li>{@link #SpvOpEnqueueMarker OpEnqueueMarker}</li>
     * <li>{@link #SpvOpEnqueueKernel OpEnqueueKernel}</li>
     * <li>{@link #SpvOpGetKernelNDrangeSubGroupCount OpGetKernelNDrangeSubGroupCount}</li>
     * <li>{@link #SpvOpGetKernelNDrangeMaxSubGroupSize OpGetKernelNDrangeMaxSubGroupSize}</li>
     * <li>{@link #SpvOpGetKernelWorkGroupSize OpGetKernelWorkGroupSize}</li>
     * <li>{@link #SpvOpGetKernelPreferredWorkGroupSizeMultiple OpGetKernelPreferredWorkGroupSizeMultiple}</li>
     * <li>{@link #SpvOpRetainEvent OpRetainEvent}</li>
     * <li>{@link #SpvOpReleaseEvent OpReleaseEvent}</li>
     * <li>{@link #SpvOpCreateUserEvent OpCreateUserEvent}</li>
     * <li>{@link #SpvOpIsValidEvent OpIsValidEvent}</li>
     * <li>{@link #SpvOpSetUserEventStatus OpSetUserEventStatus}</li>
     * <li>{@link #SpvOpCaptureEventProfilingInfo OpCaptureEventProfilingInfo}</li>
     * <li>{@link #SpvOpGetDefaultQueue OpGetDefaultQueue}</li>
     * <li>{@link #SpvOpBuildNDRange OpBuildNDRange}</li>
     * <li>{@link #SpvOpImageSparseSampleImplicitLod OpImageSparseSampleImplicitLod}</li>
     * <li>{@link #SpvOpImageSparseSampleExplicitLod OpImageSparseSampleExplicitLod}</li>
     * <li>{@link #SpvOpImageSparseSampleDrefImplicitLod OpImageSparseSampleDrefImplicitLod}</li>
     * <li>{@link #SpvOpImageSparseSampleDrefExplicitLod OpImageSparseSampleDrefExplicitLod}</li>
     * <li>{@link #SpvOpImageSparseSampleProjImplicitLod OpImageSparseSampleProjImplicitLod}</li>
     * <li>{@link #SpvOpImageSparseSampleProjExplicitLod OpImageSparseSampleProjExplicitLod}</li>
     * <li>{@link #SpvOpImageSparseSampleProjDrefImplicitLod OpImageSparseSampleProjDrefImplicitLod}</li>
     * <li>{@link #SpvOpImageSparseSampleProjDrefExplicitLod OpImageSparseSampleProjDrefExplicitLod}</li>
     * <li>{@link #SpvOpImageSparseFetch OpImageSparseFetch}</li>
     * <li>{@link #SpvOpImageSparseGather OpImageSparseGather}</li>
     * <li>{@link #SpvOpImageSparseDrefGather OpImageSparseDrefGather}</li>
     * <li>{@link #SpvOpImageSparseTexelsResident OpImageSparseTexelsResident}</li>
     * <li>{@link #SpvOpNoLine OpNoLine}</li>
     * <li>{@link #SpvOpAtomicFlagTestAndSet OpAtomicFlagTestAndSet}</li>
     * <li>{@link #SpvOpAtomicFlagClear OpAtomicFlagClear}</li>
     * <li>{@link #SpvOpImageSparseRead OpImageSparseRead}</li>
     * <li>{@link #SpvOpSizeOf OpSizeOf}</li>
     * <li>{@link #SpvOpTypePipeStorage OpTypePipeStorage}</li>
     * <li>{@link #SpvOpConstantPipeStorage OpConstantPipeStorage}</li>
     * <li>{@link #SpvOpCreatePipeFromPipeStorage OpCreatePipeFromPipeStorage}</li>
     * <li>{@link #SpvOpGetKernelLocalSizeForSubgroupCount OpGetKernelLocalSizeForSubgroupCount}</li>
     * <li>{@link #SpvOpGetKernelMaxNumSubgroups OpGetKernelMaxNumSubgroups}</li>
     * <li>{@link #SpvOpTypeNamedBarrier OpTypeNamedBarrier}</li>
     * <li>{@link #SpvOpNamedBarrierInitialize OpNamedBarrierInitialize}</li>
     * <li>{@link #SpvOpMemoryNamedBarrier OpMemoryNamedBarrier}</li>
     * <li>{@link #SpvOpModuleProcessed OpModuleProcessed}</li>
     * <li>{@link #SpvOpExecutionModeId OpExecutionModeId}</li>
     * <li>{@link #SpvOpDecorateId OpDecorateId}</li>
     * <li>{@link #SpvOpGroupNonUniformElect OpGroupNonUniformElect}</li>
     * <li>{@link #SpvOpGroupNonUniformAll OpGroupNonUniformAll}</li>
     * <li>{@link #SpvOpGroupNonUniformAny OpGroupNonUniformAny}</li>
     * <li>{@link #SpvOpGroupNonUniformAllEqual OpGroupNonUniformAllEqual}</li>
     * <li>{@link #SpvOpGroupNonUniformBroadcast OpGroupNonUniformBroadcast}</li>
     * <li>{@link #SpvOpGroupNonUniformBroadcastFirst OpGroupNonUniformBroadcastFirst}</li>
     * <li>{@link #SpvOpGroupNonUniformBallot OpGroupNonUniformBallot}</li>
     * <li>{@link #SpvOpGroupNonUniformInverseBallot OpGroupNonUniformInverseBallot}</li>
     * <li>{@link #SpvOpGroupNonUniformBallotBitExtract OpGroupNonUniformBallotBitExtract}</li>
     * <li>{@link #SpvOpGroupNonUniformBallotBitCount OpGroupNonUniformBallotBitCount}</li>
     * <li>{@link #SpvOpGroupNonUniformBallotFindLSB OpGroupNonUniformBallotFindLSB}</li>
     * <li>{@link #SpvOpGroupNonUniformBallotFindMSB OpGroupNonUniformBallotFindMSB}</li>
     * <li>{@link #SpvOpGroupNonUniformShuffle OpGroupNonUniformShuffle}</li>
     * <li>{@link #SpvOpGroupNonUniformShuffleXor OpGroupNonUniformShuffleXor}</li>
     * <li>{@link #SpvOpGroupNonUniformShuffleUp OpGroupNonUniformShuffleUp}</li>
     * <li>{@link #SpvOpGroupNonUniformShuffleDown OpGroupNonUniformShuffleDown}</li>
     * <li>{@link #SpvOpGroupNonUniformIAdd OpGroupNonUniformIAdd}</li>
     * <li>{@link #SpvOpGroupNonUniformFAdd OpGroupNonUniformFAdd}</li>
     * <li>{@link #SpvOpGroupNonUniformIMul OpGroupNonUniformIMul}</li>
     * <li>{@link #SpvOpGroupNonUniformFMul OpGroupNonUniformFMul}</li>
     * <li>{@link #SpvOpGroupNonUniformSMin OpGroupNonUniformSMin}</li>
     * <li>{@link #SpvOpGroupNonUniformUMin OpGroupNonUniformUMin}</li>
     * <li>{@link #SpvOpGroupNonUniformFMin OpGroupNonUniformFMin}</li>
     * <li>{@link #SpvOpGroupNonUniformSMax OpGroupNonUniformSMax}</li>
     * <li>{@link #SpvOpGroupNonUniformUMax OpGroupNonUniformUMax}</li>
     * <li>{@link #SpvOpGroupNonUniformFMax OpGroupNonUniformFMax}</li>
     * <li>{@link #SpvOpGroupNonUniformBitwiseAnd OpGroupNonUniformBitwiseAnd}</li>
     * <li>{@link #SpvOpGroupNonUniformBitwiseOr OpGroupNonUniformBitwiseOr}</li>
     * <li>{@link #SpvOpGroupNonUniformBitwiseXor OpGroupNonUniformBitwiseXor}</li>
     * <li>{@link #SpvOpGroupNonUniformLogicalAnd OpGroupNonUniformLogicalAnd}</li>
     * <li>{@link #SpvOpGroupNonUniformLogicalOr OpGroupNonUniformLogicalOr}</li>
     * <li>{@link #SpvOpGroupNonUniformLogicalXor OpGroupNonUniformLogicalXor}</li>
     * <li>{@link #SpvOpGroupNonUniformQuadBroadcast OpGroupNonUniformQuadBroadcast}</li>
     * <li>{@link #SpvOpGroupNonUniformQuadSwap OpGroupNonUniformQuadSwap}</li>
     * <li>{@link #SpvOpCopyLogical OpCopyLogical}</li>
     * <li>{@link #SpvOpPtrEqual OpPtrEqual}</li>
     * <li>{@link #SpvOpPtrNotEqual OpPtrNotEqual}</li>
     * <li>{@link #SpvOpPtrDiff OpPtrDiff}</li>
     * <li>{@link #SpvOpTerminateInvocation OpTerminateInvocation}</li>
     * <li>{@link #SpvOpSubgroupBallotKHR OpSubgroupBallotKHR}</li>
     * <li>{@link #SpvOpSubgroupFirstInvocationKHR OpSubgroupFirstInvocationKHR}</li>
     * <li>{@link #SpvOpSubgroupAllKHR OpSubgroupAllKHR}</li>
     * <li>{@link #SpvOpSubgroupAnyKHR OpSubgroupAnyKHR}</li>
     * <li>{@link #SpvOpSubgroupAllEqualKHR OpSubgroupAllEqualKHR}</li>
     * <li>{@link #SpvOpSubgroupReadInvocationKHR OpSubgroupReadInvocationKHR}</li>
     * <li>{@link #SpvOpTraceRayKHR OpTraceRayKHR}</li>
     * <li>{@link #SpvOpExecuteCallableKHR OpExecuteCallableKHR}</li>
     * <li>{@link #SpvOpConvertUToAccelerationStructureKHR OpConvertUToAccelerationStructureKHR}</li>
     * <li>{@link #SpvOpIgnoreIntersectionKHR OpIgnoreIntersectionKHR}</li>
     * <li>{@link #SpvOpTerminateRayKHR OpTerminateRayKHR}</li>
     * <li>{@link #SpvOpSDot OpSDot}</li>
     * <li>{@link #SpvOpSDotKHR OpSDotKHR}</li>
     * <li>{@link #SpvOpUDot OpUDot}</li>
     * <li>{@link #SpvOpUDotKHR OpUDotKHR}</li>
     * <li>{@link #SpvOpSUDot OpSUDot}</li>
     * <li>{@link #SpvOpSUDotKHR OpSUDotKHR}</li>
     * <li>{@link #SpvOpSDotAccSat OpSDotAccSat}</li>
     * <li>{@link #SpvOpSDotAccSatKHR OpSDotAccSatKHR}</li>
     * <li>{@link #SpvOpUDotAccSat OpUDotAccSat}</li>
     * <li>{@link #SpvOpUDotAccSatKHR OpUDotAccSatKHR}</li>
     * <li>{@link #SpvOpSUDotAccSat OpSUDotAccSat}</li>
     * <li>{@link #SpvOpSUDotAccSatKHR OpSUDotAccSatKHR}</li>
     * <li>{@link #SpvOpTypeRayQueryKHR OpTypeRayQueryKHR}</li>
     * <li>{@link #SpvOpRayQueryInitializeKHR OpRayQueryInitializeKHR}</li>
     * <li>{@link #SpvOpRayQueryTerminateKHR OpRayQueryTerminateKHR}</li>
     * <li>{@link #SpvOpRayQueryGenerateIntersectionKHR OpRayQueryGenerateIntersectionKHR}</li>
     * <li>{@link #SpvOpRayQueryConfirmIntersectionKHR OpRayQueryConfirmIntersectionKHR}</li>
     * <li>{@link #SpvOpRayQueryProceedKHR OpRayQueryProceedKHR}</li>
     * <li>{@link #SpvOpRayQueryGetIntersectionTypeKHR OpRayQueryGetIntersectionTypeKHR}</li>
     * <li>{@link #SpvOpGroupIAddNonUniformAMD OpGroupIAddNonUniformAMD}</li>
     * <li>{@link #SpvOpGroupFAddNonUniformAMD OpGroupFAddNonUniformAMD}</li>
     * <li>{@link #SpvOpGroupFMinNonUniformAMD OpGroupFMinNonUniformAMD}</li>
     * <li>{@link #SpvOpGroupUMinNonUniformAMD OpGroupUMinNonUniformAMD}</li>
     * <li>{@link #SpvOpGroupSMinNonUniformAMD OpGroupSMinNonUniformAMD}</li>
     * <li>{@link #SpvOpGroupFMaxNonUniformAMD OpGroupFMaxNonUniformAMD}</li>
     * <li>{@link #SpvOpGroupUMaxNonUniformAMD OpGroupUMaxNonUniformAMD}</li>
     * <li>{@link #SpvOpGroupSMaxNonUniformAMD OpGroupSMaxNonUniformAMD}</li>
     * <li>{@link #SpvOpFragmentMaskFetchAMD OpFragmentMaskFetchAMD}</li>
     * <li>{@link #SpvOpFragmentFetchAMD OpFragmentFetchAMD}</li>
     * <li>{@link #SpvOpReadClockKHR OpReadClockKHR}</li>
     * <li>{@link #SpvOpImageSampleFootprintNV OpImageSampleFootprintNV}</li>
     * <li>{@link #SpvOpGroupNonUniformPartitionNV OpGroupNonUniformPartitionNV}</li>
     * <li>{@link #SpvOpWritePackedPrimitiveIndices4x8NV OpWritePackedPrimitiveIndices4x8NV}</li>
     * <li>{@link #SpvOpReportIntersectionKHR OpReportIntersectionKHR}</li>
     * <li>{@link #SpvOpReportIntersectionNV OpReportIntersectionNV}</li>
     * <li>{@link #SpvOpIgnoreIntersectionNV OpIgnoreIntersectionNV}</li>
     * <li>{@link #SpvOpTerminateRayNV OpTerminateRayNV}</li>
     * <li>{@link #SpvOpTraceNV OpTraceNV}</li>
     * <li>{@link #SpvOpTraceMotionNV OpTraceMotionNV}</li>
     * <li>{@link #SpvOpTraceRayMotionNV OpTraceRayMotionNV}</li>
     * <li>{@link #SpvOpTypeAccelerationStructureKHR OpTypeAccelerationStructureKHR}</li>
     * <li>{@link #SpvOpTypeAccelerationStructureNV OpTypeAccelerationStructureNV}</li>
     * <li>{@link #SpvOpExecuteCallableNV OpExecuteCallableNV}</li>
     * <li>{@link #SpvOpTypeCooperativeMatrixNV OpTypeCooperativeMatrixNV}</li>
     * <li>{@link #SpvOpCooperativeMatrixLoadNV OpCooperativeMatrixLoadNV}</li>
     * <li>{@link #SpvOpCooperativeMatrixStoreNV OpCooperativeMatrixStoreNV}</li>
     * <li>{@link #SpvOpCooperativeMatrixMulAddNV OpCooperativeMatrixMulAddNV}</li>
     * <li>{@link #SpvOpCooperativeMatrixLengthNV OpCooperativeMatrixLengthNV}</li>
     * <li>{@link #SpvOpBeginInvocationInterlockEXT OpBeginInvocationInterlockEXT}</li>
     * <li>{@link #SpvOpEndInvocationInterlockEXT OpEndInvocationInterlockEXT}</li>
     * <li>{@link #SpvOpDemoteToHelperInvocation OpDemoteToHelperInvocation}</li>
     * <li>{@link #SpvOpDemoteToHelperInvocationEXT OpDemoteToHelperInvocationEXT}</li>
     * <li>{@link #SpvOpIsHelperInvocationEXT OpIsHelperInvocationEXT}</li>
     * <li>{@link #SpvOpConvertUToImageNV OpConvertUToImageNV}</li>
     * <li>{@link #SpvOpConvertUToSamplerNV OpConvertUToSamplerNV}</li>
     * <li>{@link #SpvOpConvertImageToUNV OpConvertImageToUNV}</li>
     * <li>{@link #SpvOpConvertSamplerToUNV OpConvertSamplerToUNV}</li>
     * <li>{@link #SpvOpConvertUToSampledImageNV OpConvertUToSampledImageNV}</li>
     * <li>{@link #SpvOpConvertSampledImageToUNV OpConvertSampledImageToUNV}</li>
     * <li>{@link #SpvOpSamplerImageAddressingModeNV OpSamplerImageAddressingModeNV}</li>
     * <li>{@link #SpvOpSubgroupShuffleINTEL OpSubgroupShuffleINTEL}</li>
     * <li>{@link #SpvOpSubgroupShuffleDownINTEL OpSubgroupShuffleDownINTEL}</li>
     * <li>{@link #SpvOpSubgroupShuffleUpINTEL OpSubgroupShuffleUpINTEL}</li>
     * <li>{@link #SpvOpSubgroupShuffleXorINTEL OpSubgroupShuffleXorINTEL}</li>
     * <li>{@link #SpvOpSubgroupBlockReadINTEL OpSubgroupBlockReadINTEL}</li>
     * <li>{@link #SpvOpSubgroupBlockWriteINTEL OpSubgroupBlockWriteINTEL}</li>
     * <li>{@link #SpvOpSubgroupImageBlockReadINTEL OpSubgroupImageBlockReadINTEL}</li>
     * <li>{@link #SpvOpSubgroupImageBlockWriteINTEL OpSubgroupImageBlockWriteINTEL}</li>
     * <li>{@link #SpvOpSubgroupImageMediaBlockReadINTEL OpSubgroupImageMediaBlockReadINTEL}</li>
     * <li>{@link #SpvOpSubgroupImageMediaBlockWriteINTEL OpSubgroupImageMediaBlockWriteINTEL}</li>
     * <li>{@link #SpvOpUCountLeadingZerosINTEL OpUCountLeadingZerosINTEL}</li>
     * <li>{@link #SpvOpUCountTrailingZerosINTEL OpUCountTrailingZerosINTEL}</li>
     * <li>{@link #SpvOpAbsISubINTEL OpAbsISubINTEL}</li>
     * <li>{@link #SpvOpAbsUSubINTEL OpAbsUSubINTEL}</li>
     * <li>{@link #SpvOpIAddSatINTEL OpIAddSatINTEL}</li>
     * <li>{@link #SpvOpUAddSatINTEL OpUAddSatINTEL}</li>
     * <li>{@link #SpvOpIAverageINTEL OpIAverageINTEL}</li>
     * <li>{@link #SpvOpUAverageINTEL OpUAverageINTEL}</li>
     * <li>{@link #SpvOpIAverageRoundedINTEL OpIAverageRoundedINTEL}</li>
     * <li>{@link #SpvOpUAverageRoundedINTEL OpUAverageRoundedINTEL}</li>
     * <li>{@link #SpvOpISubSatINTEL OpISubSatINTEL}</li>
     * <li>{@link #SpvOpUSubSatINTEL OpUSubSatINTEL}</li>
     * <li>{@link #SpvOpIMul32x16INTEL OpIMul32x16INTEL}</li>
     * <li>{@link #SpvOpUMul32x16INTEL OpUMul32x16INTEL}</li>
     * <li>{@link #SpvOpConstantFunctionPointerINTEL OpConstantFunctionPointerINTEL}</li>
     * <li>{@link #SpvOpFunctionPointerCallINTEL OpFunctionPointerCallINTEL}</li>
     * <li>{@link #SpvOpAsmTargetINTEL OpAsmTargetINTEL}</li>
     * <li>{@link #SpvOpAsmINTEL OpAsmINTEL}</li>
     * <li>{@link #SpvOpAsmCallINTEL OpAsmCallINTEL}</li>
     * <li>{@link #SpvOpAtomicFMinEXT OpAtomicFMinEXT}</li>
     * <li>{@link #SpvOpAtomicFMaxEXT OpAtomicFMaxEXT}</li>
     * <li>{@link #SpvOpAssumeTrueKHR OpAssumeTrueKHR}</li>
     * <li>{@link #SpvOpExpectKHR OpExpectKHR}</li>
     * <li>{@link #SpvOpDecorateString OpDecorateString}</li>
     * <li>{@link #SpvOpDecorateStringGOOGLE OpDecorateStringGOOGLE}</li>
     * <li>{@link #SpvOpMemberDecorateString OpMemberDecorateString}</li>
     * <li>{@link #SpvOpMemberDecorateStringGOOGLE OpMemberDecorateStringGOOGLE}</li>
     * <li>{@link #SpvOpVmeImageINTEL OpVmeImageINTEL}</li>
     * <li>{@link #SpvOpTypeVmeImageINTEL OpTypeVmeImageINTEL}</li>
     * <li>{@link #SpvOpTypeAvcImePayloadINTEL OpTypeAvcImePayloadINTEL}</li>
     * <li>{@link #SpvOpTypeAvcRefPayloadINTEL OpTypeAvcRefPayloadINTEL}</li>
     * <li>{@link #SpvOpTypeAvcSicPayloadINTEL OpTypeAvcSicPayloadINTEL}</li>
     * <li>{@link #SpvOpTypeAvcMcePayloadINTEL OpTypeAvcMcePayloadINTEL}</li>
     * <li>{@link #SpvOpTypeAvcMceResultINTEL OpTypeAvcMceResultINTEL}</li>
     * <li>{@link #SpvOpTypeAvcImeResultINTEL OpTypeAvcImeResultINTEL}</li>
     * <li>{@link #SpvOpTypeAvcImeResultSingleReferenceStreamoutINTEL OpTypeAvcImeResultSingleReferenceStreamoutINTEL}</li>
     * <li>{@link #SpvOpTypeAvcImeResultDualReferenceStreamoutINTEL OpTypeAvcImeResultDualReferenceStreamoutINTEL}</li>
     * <li>{@link #SpvOpTypeAvcImeSingleReferenceStreaminINTEL OpTypeAvcImeSingleReferenceStreaminINTEL}</li>
     * <li>{@link #SpvOpTypeAvcImeDualReferenceStreaminINTEL OpTypeAvcImeDualReferenceStreaminINTEL}</li>
     * <li>{@link #SpvOpTypeAvcRefResultINTEL OpTypeAvcRefResultINTEL}</li>
     * <li>{@link #SpvOpTypeAvcSicResultINTEL OpTypeAvcSicResultINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcMceGetDefaultInterBaseMultiReferencePenaltyINTEL OpSubgroupAvcMceGetDefaultInterBaseMultiReferencePenaltyINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcMceSetInterBaseMultiReferencePenaltyINTEL OpSubgroupAvcMceSetInterBaseMultiReferencePenaltyINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcMceGetDefaultInterShapePenaltyINTEL OpSubgroupAvcMceGetDefaultInterShapePenaltyINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcMceSetInterShapePenaltyINTEL OpSubgroupAvcMceSetInterShapePenaltyINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcMceGetDefaultInterDirectionPenaltyINTEL OpSubgroupAvcMceGetDefaultInterDirectionPenaltyINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcMceSetInterDirectionPenaltyINTEL OpSubgroupAvcMceSetInterDirectionPenaltyINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcMceGetDefaultIntraLumaShapePenaltyINTEL OpSubgroupAvcMceGetDefaultIntraLumaShapePenaltyINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcMceGetDefaultInterMotionVectorCostTableINTEL OpSubgroupAvcMceGetDefaultInterMotionVectorCostTableINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcMceGetDefaultHighPenaltyCostTableINTEL OpSubgroupAvcMceGetDefaultHighPenaltyCostTableINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcMceGetDefaultMediumPenaltyCostTableINTEL OpSubgroupAvcMceGetDefaultMediumPenaltyCostTableINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcMceGetDefaultLowPenaltyCostTableINTEL OpSubgroupAvcMceGetDefaultLowPenaltyCostTableINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcMceSetMotionVectorCostFunctionINTEL OpSubgroupAvcMceSetMotionVectorCostFunctionINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcMceGetDefaultIntraLumaModePenaltyINTEL OpSubgroupAvcMceGetDefaultIntraLumaModePenaltyINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcMceGetDefaultNonDcLumaIntraPenaltyINTEL OpSubgroupAvcMceGetDefaultNonDcLumaIntraPenaltyINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcMceGetDefaultIntraChromaModeBasePenaltyINTEL OpSubgroupAvcMceGetDefaultIntraChromaModeBasePenaltyINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcMceSetAcOnlyHaarINTEL OpSubgroupAvcMceSetAcOnlyHaarINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcMceSetSourceInterlacedFieldPolarityINTEL OpSubgroupAvcMceSetSourceInterlacedFieldPolarityINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcMceSetSingleReferenceInterlacedFieldPolarityINTEL OpSubgroupAvcMceSetSingleReferenceInterlacedFieldPolarityINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcMceSetDualReferenceInterlacedFieldPolaritiesINTEL OpSubgroupAvcMceSetDualReferenceInterlacedFieldPolaritiesINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcMceConvertToImePayloadINTEL OpSubgroupAvcMceConvertToImePayloadINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcMceConvertToImeResultINTEL OpSubgroupAvcMceConvertToImeResultINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcMceConvertToRefPayloadINTEL OpSubgroupAvcMceConvertToRefPayloadINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcMceConvertToRefResultINTEL OpSubgroupAvcMceConvertToRefResultINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcMceConvertToSicPayloadINTEL OpSubgroupAvcMceConvertToSicPayloadINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcMceConvertToSicResultINTEL OpSubgroupAvcMceConvertToSicResultINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcMceGetMotionVectorsINTEL OpSubgroupAvcMceGetMotionVectorsINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcMceGetInterDistortionsINTEL OpSubgroupAvcMceGetInterDistortionsINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcMceGetBestInterDistortionsINTEL OpSubgroupAvcMceGetBestInterDistortionsINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcMceGetInterMajorShapeINTEL OpSubgroupAvcMceGetInterMajorShapeINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcMceGetInterMinorShapeINTEL OpSubgroupAvcMceGetInterMinorShapeINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcMceGetInterDirectionsINTEL OpSubgroupAvcMceGetInterDirectionsINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcMceGetInterMotionVectorCountINTEL OpSubgroupAvcMceGetInterMotionVectorCountINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcMceGetInterReferenceIdsINTEL OpSubgroupAvcMceGetInterReferenceIdsINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcMceGetInterReferenceInterlacedFieldPolaritiesINTEL OpSubgroupAvcMceGetInterReferenceInterlacedFieldPolaritiesINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcImeInitializeINTEL OpSubgroupAvcImeInitializeINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcImeSetSingleReferenceINTEL OpSubgroupAvcImeSetSingleReferenceINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcImeSetDualReferenceINTEL OpSubgroupAvcImeSetDualReferenceINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcImeRefWindowSizeINTEL OpSubgroupAvcImeRefWindowSizeINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcImeAdjustRefOffsetINTEL OpSubgroupAvcImeAdjustRefOffsetINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcImeConvertToMcePayloadINTEL OpSubgroupAvcImeConvertToMcePayloadINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcImeSetMaxMotionVectorCountINTEL OpSubgroupAvcImeSetMaxMotionVectorCountINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcImeSetUnidirectionalMixDisableINTEL OpSubgroupAvcImeSetUnidirectionalMixDisableINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcImeSetEarlySearchTerminationThresholdINTEL OpSubgroupAvcImeSetEarlySearchTerminationThresholdINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcImeSetWeightedSadINTEL OpSubgroupAvcImeSetWeightedSadINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcImeEvaluateWithSingleReferenceINTEL OpSubgroupAvcImeEvaluateWithSingleReferenceINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcImeEvaluateWithDualReferenceINTEL OpSubgroupAvcImeEvaluateWithDualReferenceINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcImeEvaluateWithSingleReferenceStreaminINTEL OpSubgroupAvcImeEvaluateWithSingleReferenceStreaminINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcImeEvaluateWithDualReferenceStreaminINTEL OpSubgroupAvcImeEvaluateWithDualReferenceStreaminINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcImeEvaluateWithSingleReferenceStreamoutINTEL OpSubgroupAvcImeEvaluateWithSingleReferenceStreamoutINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcImeEvaluateWithDualReferenceStreamoutINTEL OpSubgroupAvcImeEvaluateWithDualReferenceStreamoutINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcImeEvaluateWithSingleReferenceStreaminoutINTEL OpSubgroupAvcImeEvaluateWithSingleReferenceStreaminoutINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcImeEvaluateWithDualReferenceStreaminoutINTEL OpSubgroupAvcImeEvaluateWithDualReferenceStreaminoutINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcImeConvertToMceResultINTEL OpSubgroupAvcImeConvertToMceResultINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcImeGetSingleReferenceStreaminINTEL OpSubgroupAvcImeGetSingleReferenceStreaminINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcImeGetDualReferenceStreaminINTEL OpSubgroupAvcImeGetDualReferenceStreaminINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcImeStripSingleReferenceStreamoutINTEL OpSubgroupAvcImeStripSingleReferenceStreamoutINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcImeStripDualReferenceStreamoutINTEL OpSubgroupAvcImeStripDualReferenceStreamoutINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcImeGetStreamoutSingleReferenceMajorShapeMotionVectorsINTEL OpSubgroupAvcImeGetStreamoutSingleReferenceMajorShapeMotionVectorsINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcImeGetStreamoutSingleReferenceMajorShapeDistortionsINTEL OpSubgroupAvcImeGetStreamoutSingleReferenceMajorShapeDistortionsINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcImeGetStreamoutSingleReferenceMajorShapeReferenceIdsINTEL OpSubgroupAvcImeGetStreamoutSingleReferenceMajorShapeReferenceIdsINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcImeGetStreamoutDualReferenceMajorShapeMotionVectorsINTEL OpSubgroupAvcImeGetStreamoutDualReferenceMajorShapeMotionVectorsINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcImeGetStreamoutDualReferenceMajorShapeDistortionsINTEL OpSubgroupAvcImeGetStreamoutDualReferenceMajorShapeDistortionsINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcImeGetStreamoutDualReferenceMajorShapeReferenceIdsINTEL OpSubgroupAvcImeGetStreamoutDualReferenceMajorShapeReferenceIdsINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcImeGetBorderReachedINTEL OpSubgroupAvcImeGetBorderReachedINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcImeGetTruncatedSearchIndicationINTEL OpSubgroupAvcImeGetTruncatedSearchIndicationINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcImeGetUnidirectionalEarlySearchTerminationINTEL OpSubgroupAvcImeGetUnidirectionalEarlySearchTerminationINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcImeGetWeightingPatternMinimumMotionVectorINTEL OpSubgroupAvcImeGetWeightingPatternMinimumMotionVectorINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcImeGetWeightingPatternMinimumDistortionINTEL OpSubgroupAvcImeGetWeightingPatternMinimumDistortionINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcFmeInitializeINTEL OpSubgroupAvcFmeInitializeINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcBmeInitializeINTEL OpSubgroupAvcBmeInitializeINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcRefConvertToMcePayloadINTEL OpSubgroupAvcRefConvertToMcePayloadINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcRefSetBidirectionalMixDisableINTEL OpSubgroupAvcRefSetBidirectionalMixDisableINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcRefSetBilinearFilterEnableINTEL OpSubgroupAvcRefSetBilinearFilterEnableINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcRefEvaluateWithSingleReferenceINTEL OpSubgroupAvcRefEvaluateWithSingleReferenceINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcRefEvaluateWithDualReferenceINTEL OpSubgroupAvcRefEvaluateWithDualReferenceINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcRefEvaluateWithMultiReferenceINTEL OpSubgroupAvcRefEvaluateWithMultiReferenceINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcRefEvaluateWithMultiReferenceInterlacedINTEL OpSubgroupAvcRefEvaluateWithMultiReferenceInterlacedINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcRefConvertToMceResultINTEL OpSubgroupAvcRefConvertToMceResultINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcSicInitializeINTEL OpSubgroupAvcSicInitializeINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcSicConfigureSkcINTEL OpSubgroupAvcSicConfigureSkcINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcSicConfigureIpeLumaINTEL OpSubgroupAvcSicConfigureIpeLumaINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcSicConfigureIpeLumaChromaINTEL OpSubgroupAvcSicConfigureIpeLumaChromaINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcSicGetMotionVectorMaskINTEL OpSubgroupAvcSicGetMotionVectorMaskINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcSicConvertToMcePayloadINTEL OpSubgroupAvcSicConvertToMcePayloadINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcSicSetIntraLumaShapePenaltyINTEL OpSubgroupAvcSicSetIntraLumaShapePenaltyINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcSicSetIntraLumaModeCostFunctionINTEL OpSubgroupAvcSicSetIntraLumaModeCostFunctionINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcSicSetIntraChromaModeCostFunctionINTEL OpSubgroupAvcSicSetIntraChromaModeCostFunctionINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcSicSetBilinearFilterEnableINTEL OpSubgroupAvcSicSetBilinearFilterEnableINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcSicSetSkcForwardTransformEnableINTEL OpSubgroupAvcSicSetSkcForwardTransformEnableINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcSicSetBlockBasedRawSkipSadINTEL OpSubgroupAvcSicSetBlockBasedRawSkipSadINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcSicEvaluateIpeINTEL OpSubgroupAvcSicEvaluateIpeINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcSicEvaluateWithSingleReferenceINTEL OpSubgroupAvcSicEvaluateWithSingleReferenceINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcSicEvaluateWithDualReferenceINTEL OpSubgroupAvcSicEvaluateWithDualReferenceINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcSicEvaluateWithMultiReferenceINTEL OpSubgroupAvcSicEvaluateWithMultiReferenceINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcSicEvaluateWithMultiReferenceInterlacedINTEL OpSubgroupAvcSicEvaluateWithMultiReferenceInterlacedINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcSicConvertToMceResultINTEL OpSubgroupAvcSicConvertToMceResultINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcSicGetIpeLumaShapeINTEL OpSubgroupAvcSicGetIpeLumaShapeINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcSicGetBestIpeLumaDistortionINTEL OpSubgroupAvcSicGetBestIpeLumaDistortionINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcSicGetBestIpeChromaDistortionINTEL OpSubgroupAvcSicGetBestIpeChromaDistortionINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcSicGetPackedIpeLumaModesINTEL OpSubgroupAvcSicGetPackedIpeLumaModesINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcSicGetIpeChromaModeINTEL OpSubgroupAvcSicGetIpeChromaModeINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcSicGetPackedSkcLumaCountThresholdINTEL OpSubgroupAvcSicGetPackedSkcLumaCountThresholdINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcSicGetPackedSkcLumaSumThresholdINTEL OpSubgroupAvcSicGetPackedSkcLumaSumThresholdINTEL}</li>
     * <li>{@link #SpvOpSubgroupAvcSicGetInterRawSadsINTEL OpSubgroupAvcSicGetInterRawSadsINTEL}</li>
     * <li>{@link #SpvOpVariableLengthArrayINTEL OpVariableLengthArrayINTEL}</li>
     * <li>{@link #SpvOpSaveMemoryINTEL OpSaveMemoryINTEL}</li>
     * <li>{@link #SpvOpRestoreMemoryINTEL OpRestoreMemoryINTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatSinCosPiINTEL OpArbitraryFloatSinCosPiINTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatCastINTEL OpArbitraryFloatCastINTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatCastFromIntINTEL OpArbitraryFloatCastFromIntINTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatCastToIntINTEL OpArbitraryFloatCastToIntINTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatAddINTEL OpArbitraryFloatAddINTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatSubINTEL OpArbitraryFloatSubINTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatMulINTEL OpArbitraryFloatMulINTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatDivINTEL OpArbitraryFloatDivINTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatGTINTEL OpArbitraryFloatGTINTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatGEINTEL OpArbitraryFloatGEINTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatLTINTEL OpArbitraryFloatLTINTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatLEINTEL OpArbitraryFloatLEINTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatEQINTEL OpArbitraryFloatEQINTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatRecipINTEL OpArbitraryFloatRecipINTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatRSqrtINTEL OpArbitraryFloatRSqrtINTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatCbrtINTEL OpArbitraryFloatCbrtINTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatHypotINTEL OpArbitraryFloatHypotINTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatSqrtINTEL OpArbitraryFloatSqrtINTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatLogINTEL OpArbitraryFloatLogINTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatLog2INTEL OpArbitraryFloatLog2INTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatLog10INTEL OpArbitraryFloatLog10INTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatLog1pINTEL OpArbitraryFloatLog1pINTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatExpINTEL OpArbitraryFloatExpINTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatExp2INTEL OpArbitraryFloatExp2INTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatExp10INTEL OpArbitraryFloatExp10INTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatExpm1INTEL OpArbitraryFloatExpm1INTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatSinINTEL OpArbitraryFloatSinINTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatCosINTEL OpArbitraryFloatCosINTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatSinCosINTEL OpArbitraryFloatSinCosINTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatSinPiINTEL OpArbitraryFloatSinPiINTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatCosPiINTEL OpArbitraryFloatCosPiINTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatASinINTEL OpArbitraryFloatASinINTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatASinPiINTEL OpArbitraryFloatASinPiINTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatACosINTEL OpArbitraryFloatACosINTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatACosPiINTEL OpArbitraryFloatACosPiINTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatATanINTEL OpArbitraryFloatATanINTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatATanPiINTEL OpArbitraryFloatATanPiINTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatATan2INTEL OpArbitraryFloatATan2INTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatPowINTEL OpArbitraryFloatPowINTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatPowRINTEL OpArbitraryFloatPowRINTEL}</li>
     * <li>{@link #SpvOpArbitraryFloatPowNINTEL OpArbitraryFloatPowNINTEL}</li>
     * <li>{@link #SpvOpLoopControlINTEL OpLoopControlINTEL}</li>
     * <li>{@link #SpvOpFixedSqrtINTEL OpFixedSqrtINTEL}</li>
     * <li>{@link #SpvOpFixedRecipINTEL OpFixedRecipINTEL}</li>
     * <li>{@link #SpvOpFixedRsqrtINTEL OpFixedRsqrtINTEL}</li>
     * <li>{@link #SpvOpFixedSinINTEL OpFixedSinINTEL}</li>
     * <li>{@link #SpvOpFixedCosINTEL OpFixedCosINTEL}</li>
     * <li>{@link #SpvOpFixedSinCosINTEL OpFixedSinCosINTEL}</li>
     * <li>{@link #SpvOpFixedSinPiINTEL OpFixedSinPiINTEL}</li>
     * <li>{@link #SpvOpFixedCosPiINTEL OpFixedCosPiINTEL}</li>
     * <li>{@link #SpvOpFixedSinCosPiINTEL OpFixedSinCosPiINTEL}</li>
     * <li>{@link #SpvOpFixedLogINTEL OpFixedLogINTEL}</li>
     * <li>{@link #SpvOpFixedExpINTEL OpFixedExpINTEL}</li>
     * <li>{@link #SpvOpPtrCastToCrossWorkgroupINTEL OpPtrCastToCrossWorkgroupINTEL}</li>
     * <li>{@link #SpvOpCrossWorkgroupCastToPtrINTEL OpCrossWorkgroupCastToPtrINTEL}</li>
     * <li>{@link #SpvOpReadPipeBlockingINTEL OpReadPipeBlockingINTEL}</li>
     * <li>{@link #SpvOpWritePipeBlockingINTEL OpWritePipeBlockingINTEL}</li>
     * <li>{@link #SpvOpFPGARegINTEL OpFPGARegINTEL}</li>
     * <li>{@link #SpvOpRayQueryGetRayTMinKHR OpRayQueryGetRayTMinKHR}</li>
     * <li>{@link #SpvOpRayQueryGetRayFlagsKHR OpRayQueryGetRayFlagsKHR}</li>
     * <li>{@link #SpvOpRayQueryGetIntersectionTKHR OpRayQueryGetIntersectionTKHR}</li>
     * <li>{@link #SpvOpRayQueryGetIntersectionInstanceCustomIndexKHR OpRayQueryGetIntersectionInstanceCustomIndexKHR}</li>
     * <li>{@link #SpvOpRayQueryGetIntersectionInstanceIdKHR OpRayQueryGetIntersectionInstanceIdKHR}</li>
     * <li>{@link #SpvOpRayQueryGetIntersectionInstanceShaderBindingTableRecordOffsetKHR OpRayQueryGetIntersectionInstanceShaderBindingTableRecordOffsetKHR}</li>
     * <li>{@link #SpvOpRayQueryGetIntersectionGeometryIndexKHR OpRayQueryGetIntersectionGeometryIndexKHR}</li>
     * <li>{@link #SpvOpRayQueryGetIntersectionPrimitiveIndexKHR OpRayQueryGetIntersectionPrimitiveIndexKHR}</li>
     * <li>{@link #SpvOpRayQueryGetIntersectionBarycentricsKHR OpRayQueryGetIntersectionBarycentricsKHR}</li>
     * <li>{@link #SpvOpRayQueryGetIntersectionFrontFaceKHR OpRayQueryGetIntersectionFrontFaceKHR}</li>
     * <li>{@link #SpvOpRayQueryGetIntersectionCandidateAABBOpaqueKHR OpRayQueryGetIntersectionCandidateAABBOpaqueKHR}</li>
     * <li>{@link #SpvOpRayQueryGetIntersectionObjectRayDirectionKHR OpRayQueryGetIntersectionObjectRayDirectionKHR}</li>
     * <li>{@link #SpvOpRayQueryGetIntersectionObjectRayOriginKHR OpRayQueryGetIntersectionObjectRayOriginKHR}</li>
     * <li>{@link #SpvOpRayQueryGetWorldRayDirectionKHR OpRayQueryGetWorldRayDirectionKHR}</li>
     * <li>{@link #SpvOpRayQueryGetWorldRayOriginKHR OpRayQueryGetWorldRayOriginKHR}</li>
     * <li>{@link #SpvOpRayQueryGetIntersectionObjectToWorldKHR OpRayQueryGetIntersectionObjectToWorldKHR}</li>
     * <li>{@link #SpvOpRayQueryGetIntersectionWorldToObjectKHR OpRayQueryGetIntersectionWorldToObjectKHR}</li>
     * <li>{@link #SpvOpAtomicFAddEXT OpAtomicFAddEXT}</li>
     * <li>{@link #SpvOpTypeBufferSurfaceINTEL OpTypeBufferSurfaceINTEL}</li>
     * <li>{@link #SpvOpTypeStructContinuedINTEL OpTypeStructContinuedINTEL}</li>
     * <li>{@link #SpvOpConstantCompositeContinuedINTEL OpConstantCompositeContinuedINTEL}</li>
     * <li>{@link #SpvOpSpecConstantCompositeContinuedINTEL OpSpecConstantCompositeContinuedINTEL}</li>
     * <li>{@link #SpvOpMax OpMax}</li>
     * </ul>
     */
    public static final int
        SpvOpNop                                                                   = 0,
        SpvOpUndef                                                                 = 1,
        SpvOpSourceContinued                                                       = 2,
        SpvOpSource                                                                = 3,
        SpvOpSourceExtension                                                       = 4,
        SpvOpName                                                                  = 5,
        SpvOpMemberName                                                            = 6,
        SpvOpString                                                                = 7,
        SpvOpLine                                                                  = 8,
        SpvOpExtension                                                             = 10,
        SpvOpExtInstImport                                                         = 11,
        SpvOpExtInst                                                               = 12,
        SpvOpMemoryModel                                                           = 14,
        SpvOpEntryPoint                                                            = 15,
        SpvOpExecutionMode                                                         = 16,
        SpvOpCapability                                                            = 17,
        SpvOpTypeVoid                                                              = 19,
        SpvOpTypeBool                                                              = 20,
        SpvOpTypeInt                                                               = 21,
        SpvOpTypeFloat                                                             = 22,
        SpvOpTypeVector                                                            = 23,
        SpvOpTypeMatrix                                                            = 24,
        SpvOpTypeImage                                                             = 25,
        SpvOpTypeSampler                                                           = 26,
        SpvOpTypeSampledImage                                                      = 27,
        SpvOpTypeArray                                                             = 28,
        SpvOpTypeRuntimeArray                                                      = 29,
        SpvOpTypeStruct                                                            = 30,
        SpvOpTypeOpaque                                                            = 31,
        SpvOpTypePointer                                                           = 32,
        SpvOpTypeFunction                                                          = 33,
        SpvOpTypeEvent                                                             = 34,
        SpvOpTypeDeviceEvent                                                       = 35,
        SpvOpTypeReserveId                                                         = 36,
        SpvOpTypeQueue                                                             = 37,
        SpvOpTypePipe                                                              = 38,
        SpvOpTypeForwardPointer                                                    = 39,
        SpvOpConstantTrue                                                          = 41,
        SpvOpConstantFalse                                                         = 42,
        SpvOpConstant                                                              = 43,
        SpvOpConstantComposite                                                     = 44,
        SpvOpConstantSampler                                                       = 45,
        SpvOpConstantNull                                                          = 46,
        SpvOpSpecConstantTrue                                                      = 48,
        SpvOpSpecConstantFalse                                                     = 49,
        SpvOpSpecConstant                                                          = 50,
        SpvOpSpecConstantComposite                                                 = 51,
        SpvOpSpecConstantOp                                                        = 52,
        SpvOpFunction                                                              = 54,
        SpvOpFunctionParameter                                                     = 55,
        SpvOpFunctionEnd                                                           = 56,
        SpvOpFunctionCall                                                          = 57,
        SpvOpVariable                                                              = 59,
        SpvOpImageTexelPointer                                                     = 60,
        SpvOpLoad                                                                  = 61,
        SpvOpStore                                                                 = 62,
        SpvOpCopyMemory                                                            = 63,
        SpvOpCopyMemorySized                                                       = 64,
        SpvOpAccessChain                                                           = 65,
        SpvOpInBoundsAccessChain                                                   = 66,
        SpvOpPtrAccessChain                                                        = 67,
        SpvOpArrayLength                                                           = 68,
        SpvOpGenericPtrMemSemantics                                                = 69,
        SpvOpInBoundsPtrAccessChain                                                = 70,
        SpvOpDecorate                                                              = 71,
        SpvOpMemberDecorate                                                        = 72,
        SpvOpDecorationGroup                                                       = 73,
        SpvOpGroupDecorate                                                         = 74,
        SpvOpGroupMemberDecorate                                                   = 75,
        SpvOpVectorExtractDynamic                                                  = 77,
        SpvOpVectorInsertDynamic                                                   = 78,
        SpvOpVectorShuffle                                                         = 79,
        SpvOpCompositeConstruct                                                    = 80,
        SpvOpCompositeExtract                                                      = 81,
        SpvOpCompositeInsert                                                       = 82,
        SpvOpCopyObject                                                            = 83,
        SpvOpTranspose                                                             = 84,
        SpvOpSampledImage                                                          = 86,
        SpvOpImageSampleImplicitLod                                                = 87,
        SpvOpImageSampleExplicitLod                                                = 88,
        SpvOpImageSampleDrefImplicitLod                                            = 89,
        SpvOpImageSampleDrefExplicitLod                                            = 90,
        SpvOpImageSampleProjImplicitLod                                            = 91,
        SpvOpImageSampleProjExplicitLod                                            = 92,
        SpvOpImageSampleProjDrefImplicitLod                                        = 93,
        SpvOpImageSampleProjDrefExplicitLod                                        = 94,
        SpvOpImageFetch                                                            = 95,
        SpvOpImageGather                                                           = 96,
        SpvOpImageDrefGather                                                       = 97,
        SpvOpImageRead                                                             = 98,
        SpvOpImageWrite                                                            = 99,
        SpvOpImage                                                                 = 100,
        SpvOpImageQueryFormat                                                      = 101,
        SpvOpImageQueryOrder                                                       = 102,
        SpvOpImageQuerySizeLod                                                     = 103,
        SpvOpImageQuerySize                                                        = 104,
        SpvOpImageQueryLod                                                         = 105,
        SpvOpImageQueryLevels                                                      = 106,
        SpvOpImageQuerySamples                                                     = 107,
        SpvOpConvertFToU                                                           = 109,
        SpvOpConvertFToS                                                           = 110,
        SpvOpConvertSToF                                                           = 111,
        SpvOpConvertUToF                                                           = 112,
        SpvOpUConvert                                                              = 113,
        SpvOpSConvert                                                              = 114,
        SpvOpFConvert                                                              = 115,
        SpvOpQuantizeToF16                                                         = 116,
        SpvOpConvertPtrToU                                                         = 117,
        SpvOpSatConvertSToU                                                        = 118,
        SpvOpSatConvertUToS                                                        = 119,
        SpvOpConvertUToPtr                                                         = 120,
        SpvOpPtrCastToGeneric                                                      = 121,
        SpvOpGenericCastToPtr                                                      = 122,
        SpvOpGenericCastToPtrExplicit                                              = 123,
        SpvOpBitcast                                                               = 124,
        SpvOpSNegate                                                               = 126,
        SpvOpFNegate                                                               = 127,
        SpvOpIAdd                                                                  = 128,
        SpvOpFAdd                                                                  = 129,
        SpvOpISub                                                                  = 130,
        SpvOpFSub                                                                  = 131,
        SpvOpIMul                                                                  = 132,
        SpvOpFMul                                                                  = 133,
        SpvOpUDiv                                                                  = 134,
        SpvOpSDiv                                                                  = 135,
        SpvOpFDiv                                                                  = 136,
        SpvOpUMod                                                                  = 137,
        SpvOpSRem                                                                  = 138,
        SpvOpSMod                                                                  = 139,
        SpvOpFRem                                                                  = 140,
        SpvOpFMod                                                                  = 141,
        SpvOpVectorTimesScalar                                                     = 142,
        SpvOpMatrixTimesScalar                                                     = 143,
        SpvOpVectorTimesMatrix                                                     = 144,
        SpvOpMatrixTimesVector                                                     = 145,
        SpvOpMatrixTimesMatrix                                                     = 146,
        SpvOpOuterProduct                                                          = 147,
        SpvOpDot                                                                   = 148,
        SpvOpIAddCarry                                                             = 149,
        SpvOpISubBorrow                                                            = 150,
        SpvOpUMulExtended                                                          = 151,
        SpvOpSMulExtended                                                          = 152,
        SpvOpAny                                                                   = 154,
        SpvOpAll                                                                   = 155,
        SpvOpIsNan                                                                 = 156,
        SpvOpIsInf                                                                 = 157,
        SpvOpIsFinite                                                              = 158,
        SpvOpIsNormal                                                              = 159,
        SpvOpSignBitSet                                                            = 160,
        SpvOpLessOrGreater                                                         = 161,
        SpvOpOrdered                                                               = 162,
        SpvOpUnordered                                                             = 163,
        SpvOpLogicalEqual                                                          = 164,
        SpvOpLogicalNotEqual                                                       = 165,
        SpvOpLogicalOr                                                             = 166,
        SpvOpLogicalAnd                                                            = 167,
        SpvOpLogicalNot                                                            = 168,
        SpvOpSelect                                                                = 169,
        SpvOpIEqual                                                                = 170,
        SpvOpINotEqual                                                             = 171,
        SpvOpUGreaterThan                                                          = 172,
        SpvOpSGreaterThan                                                          = 173,
        SpvOpUGreaterThanEqual                                                     = 174,
        SpvOpSGreaterThanEqual                                                     = 175,
        SpvOpULessThan                                                             = 176,
        SpvOpSLessThan                                                             = 177,
        SpvOpULessThanEqual                                                        = 178,
        SpvOpSLessThanEqual                                                        = 179,
        SpvOpFOrdEqual                                                             = 180,
        SpvOpFUnordEqual                                                           = 181,
        SpvOpFOrdNotEqual                                                          = 182,
        SpvOpFUnordNotEqual                                                        = 183,
        SpvOpFOrdLessThan                                                          = 184,
        SpvOpFUnordLessThan                                                        = 185,
        SpvOpFOrdGreaterThan                                                       = 186,
        SpvOpFUnordGreaterThan                                                     = 187,
        SpvOpFOrdLessThanEqual                                                     = 188,
        SpvOpFUnordLessThanEqual                                                   = 189,
        SpvOpFOrdGreaterThanEqual                                                  = 190,
        SpvOpFUnordGreaterThanEqual                                                = 191,
        SpvOpShiftRightLogical                                                     = 194,
        SpvOpShiftRightArithmetic                                                  = 195,
        SpvOpShiftLeftLogical                                                      = 196,
        SpvOpBitwiseOr                                                             = 197,
        SpvOpBitwiseXor                                                            = 198,
        SpvOpBitwiseAnd                                                            = 199,
        SpvOpNot                                                                   = 200,
        SpvOpBitFieldInsert                                                        = 201,
        SpvOpBitFieldSExtract                                                      = 202,
        SpvOpBitFieldUExtract                                                      = 203,
        SpvOpBitReverse                                                            = 204,
        SpvOpBitCount                                                              = 205,
        SpvOpDPdx                                                                  = 207,
        SpvOpDPdy                                                                  = 208,
        SpvOpFwidth                                                                = 209,
        SpvOpDPdxFine                                                              = 210,
        SpvOpDPdyFine                                                              = 211,
        SpvOpFwidthFine                                                            = 212,
        SpvOpDPdxCoarse                                                            = 213,
        SpvOpDPdyCoarse                                                            = 214,
        SpvOpFwidthCoarse                                                          = 215,
        SpvOpEmitVertex                                                            = 218,
        SpvOpEndPrimitive                                                          = 219,
        SpvOpEmitStreamVertex                                                      = 220,
        SpvOpEndStreamPrimitive                                                    = 221,
        SpvOpControlBarrier                                                        = 224,
        SpvOpMemoryBarrier                                                         = 225,
        SpvOpAtomicLoad                                                            = 227,
        SpvOpAtomicStore                                                           = 228,
        SpvOpAtomicExchange                                                        = 229,
        SpvOpAtomicCompareExchange                                                 = 230,
        SpvOpAtomicCompareExchangeWeak                                             = 231,
        SpvOpAtomicIIncrement                                                      = 232,
        SpvOpAtomicIDecrement                                                      = 233,
        SpvOpAtomicIAdd                                                            = 234,
        SpvOpAtomicISub                                                            = 235,
        SpvOpAtomicSMin                                                            = 236,
        SpvOpAtomicUMin                                                            = 237,
        SpvOpAtomicSMax                                                            = 238,
        SpvOpAtomicUMax                                                            = 239,
        SpvOpAtomicAnd                                                             = 240,
        SpvOpAtomicOr                                                              = 241,
        SpvOpAtomicXor                                                             = 242,
        SpvOpPhi                                                                   = 245,
        SpvOpLoopMerge                                                             = 246,
        SpvOpSelectionMerge                                                        = 247,
        SpvOpLabel                                                                 = 248,
        SpvOpBranch                                                                = 249,
        SpvOpBranchConditional                                                     = 250,
        SpvOpSwitch                                                                = 251,
        SpvOpKill                                                                  = 252,
        SpvOpReturn                                                                = 253,
        SpvOpReturnValue                                                           = 254,
        SpvOpUnreachable                                                           = 255,
        SpvOpLifetimeStart                                                         = 256,
        SpvOpLifetimeStop                                                          = 257,
        SpvOpGroupAsyncCopy                                                        = 259,
        SpvOpGroupWaitEvents                                                       = 260,
        SpvOpGroupAll                                                              = 261,
        SpvOpGroupAny                                                              = 262,
        SpvOpGroupBroadcast                                                        = 263,
        SpvOpGroupIAdd                                                             = 264,
        SpvOpGroupFAdd                                                             = 265,
        SpvOpGroupFMin                                                             = 266,
        SpvOpGroupUMin                                                             = 267,
        SpvOpGroupSMin                                                             = 268,
        SpvOpGroupFMax                                                             = 269,
        SpvOpGroupUMax                                                             = 270,
        SpvOpGroupSMax                                                             = 271,
        SpvOpReadPipe                                                              = 274,
        SpvOpWritePipe                                                             = 275,
        SpvOpReservedReadPipe                                                      = 276,
        SpvOpReservedWritePipe                                                     = 277,
        SpvOpReserveReadPipePackets                                                = 278,
        SpvOpReserveWritePipePackets                                               = 279,
        SpvOpCommitReadPipe                                                        = 280,
        SpvOpCommitWritePipe                                                       = 281,
        SpvOpIsValidReserveId                                                      = 282,
        SpvOpGetNumPipePackets                                                     = 283,
        SpvOpGetMaxPipePackets                                                     = 284,
        SpvOpGroupReserveReadPipePackets                                           = 285,
        SpvOpGroupReserveWritePipePackets                                          = 286,
        SpvOpGroupCommitReadPipe                                                   = 287,
        SpvOpGroupCommitWritePipe                                                  = 288,
        SpvOpEnqueueMarker                                                         = 291,
        SpvOpEnqueueKernel                                                         = 292,
        SpvOpGetKernelNDrangeSubGroupCount                                         = 293,
        SpvOpGetKernelNDrangeMaxSubGroupSize                                       = 294,
        SpvOpGetKernelWorkGroupSize                                                = 295,
        SpvOpGetKernelPreferredWorkGroupSizeMultiple                               = 296,
        SpvOpRetainEvent                                                           = 297,
        SpvOpReleaseEvent                                                          = 298,
        SpvOpCreateUserEvent                                                       = 299,
        SpvOpIsValidEvent                                                          = 300,
        SpvOpSetUserEventStatus                                                    = 301,
        SpvOpCaptureEventProfilingInfo                                             = 302,
        SpvOpGetDefaultQueue                                                       = 303,
        SpvOpBuildNDRange                                                          = 304,
        SpvOpImageSparseSampleImplicitLod                                          = 305,
        SpvOpImageSparseSampleExplicitLod                                          = 306,
        SpvOpImageSparseSampleDrefImplicitLod                                      = 307,
        SpvOpImageSparseSampleDrefExplicitLod                                      = 308,
        SpvOpImageSparseSampleProjImplicitLod                                      = 309,
        SpvOpImageSparseSampleProjExplicitLod                                      = 310,
        SpvOpImageSparseSampleProjDrefImplicitLod                                  = 311,
        SpvOpImageSparseSampleProjDrefExplicitLod                                  = 312,
        SpvOpImageSparseFetch                                                      = 313,
        SpvOpImageSparseGather                                                     = 314,
        SpvOpImageSparseDrefGather                                                 = 315,
        SpvOpImageSparseTexelsResident                                             = 316,
        SpvOpNoLine                                                                = 317,
        SpvOpAtomicFlagTestAndSet                                                  = 318,
        SpvOpAtomicFlagClear                                                       = 319,
        SpvOpImageSparseRead                                                       = 320,
        SpvOpSizeOf                                                                = 321,
        SpvOpTypePipeStorage                                                       = 322,
        SpvOpConstantPipeStorage                                                   = 323,
        SpvOpCreatePipeFromPipeStorage                                             = 324,
        SpvOpGetKernelLocalSizeForSubgroupCount                                    = 325,
        SpvOpGetKernelMaxNumSubgroups                                              = 326,
        SpvOpTypeNamedBarrier                                                      = 327,
        SpvOpNamedBarrierInitialize                                                = 328,
        SpvOpMemoryNamedBarrier                                                    = 329,
        SpvOpModuleProcessed                                                       = 330,
        SpvOpExecutionModeId                                                       = 331,
        SpvOpDecorateId                                                            = 332,
        SpvOpGroupNonUniformElect                                                  = 333,
        SpvOpGroupNonUniformAll                                                    = 334,
        SpvOpGroupNonUniformAny                                                    = 335,
        SpvOpGroupNonUniformAllEqual                                               = 336,
        SpvOpGroupNonUniformBroadcast                                              = 337,
        SpvOpGroupNonUniformBroadcastFirst                                         = 338,
        SpvOpGroupNonUniformBallot                                                 = 339,
        SpvOpGroupNonUniformInverseBallot                                          = 340,
        SpvOpGroupNonUniformBallotBitExtract                                       = 341,
        SpvOpGroupNonUniformBallotBitCount                                         = 342,
        SpvOpGroupNonUniformBallotFindLSB                                          = 343,
        SpvOpGroupNonUniformBallotFindMSB                                          = 344,
        SpvOpGroupNonUniformShuffle                                                = 345,
        SpvOpGroupNonUniformShuffleXor                                             = 346,
        SpvOpGroupNonUniformShuffleUp                                              = 347,
        SpvOpGroupNonUniformShuffleDown                                            = 348,
        SpvOpGroupNonUniformIAdd                                                   = 349,
        SpvOpGroupNonUniformFAdd                                                   = 350,
        SpvOpGroupNonUniformIMul                                                   = 351,
        SpvOpGroupNonUniformFMul                                                   = 352,
        SpvOpGroupNonUniformSMin                                                   = 353,
        SpvOpGroupNonUniformUMin                                                   = 354,
        SpvOpGroupNonUniformFMin                                                   = 355,
        SpvOpGroupNonUniformSMax                                                   = 356,
        SpvOpGroupNonUniformUMax                                                   = 357,
        SpvOpGroupNonUniformFMax                                                   = 358,
        SpvOpGroupNonUniformBitwiseAnd                                             = 359,
        SpvOpGroupNonUniformBitwiseOr                                              = 360,
        SpvOpGroupNonUniformBitwiseXor                                             = 361,
        SpvOpGroupNonUniformLogicalAnd                                             = 362,
        SpvOpGroupNonUniformLogicalOr                                              = 363,
        SpvOpGroupNonUniformLogicalXor                                             = 364,
        SpvOpGroupNonUniformQuadBroadcast                                          = 365,
        SpvOpGroupNonUniformQuadSwap                                               = 366,
        SpvOpCopyLogical                                                           = 400,
        SpvOpPtrEqual                                                              = 401,
        SpvOpPtrNotEqual                                                           = 402,
        SpvOpPtrDiff                                                               = 403,
        SpvOpTerminateInvocation                                                   = 4416,
        SpvOpSubgroupBallotKHR                                                     = 4421,
        SpvOpSubgroupFirstInvocationKHR                                            = 4422,
        SpvOpSubgroupAllKHR                                                        = 4428,
        SpvOpSubgroupAnyKHR                                                        = 4429,
        SpvOpSubgroupAllEqualKHR                                                   = 4430,
        SpvOpSubgroupReadInvocationKHR                                             = 4432,
        SpvOpTraceRayKHR                                                           = 4445,
        SpvOpExecuteCallableKHR                                                    = 4446,
        SpvOpConvertUToAccelerationStructureKHR                                    = 4447,
        SpvOpIgnoreIntersectionKHR                                                 = 4448,
        SpvOpTerminateRayKHR                                                       = 4449,
        SpvOpSDot                                                                  = 4450,
        SpvOpSDotKHR                                                               = 4450,
        SpvOpUDot                                                                  = 4451,
        SpvOpUDotKHR                                                               = 4451,
        SpvOpSUDot                                                                 = 4452,
        SpvOpSUDotKHR                                                              = 4452,
        SpvOpSDotAccSat                                                            = 4453,
        SpvOpSDotAccSatKHR                                                         = 4453,
        SpvOpUDotAccSat                                                            = 4454,
        SpvOpUDotAccSatKHR                                                         = 4454,
        SpvOpSUDotAccSat                                                           = 4455,
        SpvOpSUDotAccSatKHR                                                        = 4455,
        SpvOpTypeRayQueryKHR                                                       = 4472,
        SpvOpRayQueryInitializeKHR                                                 = 4473,
        SpvOpRayQueryTerminateKHR                                                  = 4474,
        SpvOpRayQueryGenerateIntersectionKHR                                       = 4475,
        SpvOpRayQueryConfirmIntersectionKHR                                        = 4476,
        SpvOpRayQueryProceedKHR                                                    = 4477,
        SpvOpRayQueryGetIntersectionTypeKHR                                        = 4479,
        SpvOpGroupIAddNonUniformAMD                                                = 5000,
        SpvOpGroupFAddNonUniformAMD                                                = 5001,
        SpvOpGroupFMinNonUniformAMD                                                = 5002,
        SpvOpGroupUMinNonUniformAMD                                                = 5003,
        SpvOpGroupSMinNonUniformAMD                                                = 5004,
        SpvOpGroupFMaxNonUniformAMD                                                = 5005,
        SpvOpGroupUMaxNonUniformAMD                                                = 5006,
        SpvOpGroupSMaxNonUniformAMD                                                = 5007,
        SpvOpFragmentMaskFetchAMD                                                  = 5011,
        SpvOpFragmentFetchAMD                                                      = 5012,
        SpvOpReadClockKHR                                                          = 5056,
        SpvOpImageSampleFootprintNV                                                = 5283,
        SpvOpGroupNonUniformPartitionNV                                            = 5296,
        SpvOpWritePackedPrimitiveIndices4x8NV                                      = 5299,
        SpvOpReportIntersectionKHR                                                 = 5334,
        SpvOpReportIntersectionNV                                                  = 5334,
        SpvOpIgnoreIntersectionNV                                                  = 5335,
        SpvOpTerminateRayNV                                                        = 5336,
        SpvOpTraceNV                                                               = 5337,
        SpvOpTraceMotionNV                                                         = 5338,
        SpvOpTraceRayMotionNV                                                      = 5339,
        SpvOpTypeAccelerationStructureKHR                                          = 5341,
        SpvOpTypeAccelerationStructureNV                                           = 5341,
        SpvOpExecuteCallableNV                                                     = 5344,
        SpvOpTypeCooperativeMatrixNV                                               = 5358,
        SpvOpCooperativeMatrixLoadNV                                               = 5359,
        SpvOpCooperativeMatrixStoreNV                                              = 5360,
        SpvOpCooperativeMatrixMulAddNV                                             = 5361,
        SpvOpCooperativeMatrixLengthNV                                             = 5362,
        SpvOpBeginInvocationInterlockEXT                                           = 5364,
        SpvOpEndInvocationInterlockEXT                                             = 5365,
        SpvOpDemoteToHelperInvocation                                              = 5380,
        SpvOpDemoteToHelperInvocationEXT                                           = 5380,
        SpvOpIsHelperInvocationEXT                                                 = 5381,
        SpvOpConvertUToImageNV                                                     = 5391,
        SpvOpConvertUToSamplerNV                                                   = 5392,
        SpvOpConvertImageToUNV                                                     = 5393,
        SpvOpConvertSamplerToUNV                                                   = 5394,
        SpvOpConvertUToSampledImageNV                                              = 5395,
        SpvOpConvertSampledImageToUNV                                              = 5396,
        SpvOpSamplerImageAddressingModeNV                                          = 5397,
        SpvOpSubgroupShuffleINTEL                                                  = 5571,
        SpvOpSubgroupShuffleDownINTEL                                              = 5572,
        SpvOpSubgroupShuffleUpINTEL                                                = 5573,
        SpvOpSubgroupShuffleXorINTEL                                               = 5574,
        SpvOpSubgroupBlockReadINTEL                                                = 5575,
        SpvOpSubgroupBlockWriteINTEL                                               = 5576,
        SpvOpSubgroupImageBlockReadINTEL                                           = 5577,
        SpvOpSubgroupImageBlockWriteINTEL                                          = 5578,
        SpvOpSubgroupImageMediaBlockReadINTEL                                      = 5580,
        SpvOpSubgroupImageMediaBlockWriteINTEL                                     = 5581,
        SpvOpUCountLeadingZerosINTEL                                               = 5585,
        SpvOpUCountTrailingZerosINTEL                                              = 5586,
        SpvOpAbsISubINTEL                                                          = 5587,
        SpvOpAbsUSubINTEL                                                          = 5588,
        SpvOpIAddSatINTEL                                                          = 5589,
        SpvOpUAddSatINTEL                                                          = 5590,
        SpvOpIAverageINTEL                                                         = 5591,
        SpvOpUAverageINTEL                                                         = 5592,
        SpvOpIAverageRoundedINTEL                                                  = 5593,
        SpvOpUAverageRoundedINTEL                                                  = 5594,
        SpvOpISubSatINTEL                                                          = 5595,
        SpvOpUSubSatINTEL                                                          = 5596,
        SpvOpIMul32x16INTEL                                                        = 5597,
        SpvOpUMul32x16INTEL                                                        = 5598,
        SpvOpConstantFunctionPointerINTEL                                          = 5600,
        SpvOpFunctionPointerCallINTEL                                              = 5601,
        SpvOpAsmTargetINTEL                                                        = 5609,
        SpvOpAsmINTEL                                                              = 5610,
        SpvOpAsmCallINTEL                                                          = 5611,
        SpvOpAtomicFMinEXT                                                         = 5614,
        SpvOpAtomicFMaxEXT                                                         = 5615,
        SpvOpAssumeTrueKHR                                                         = 5630,
        SpvOpExpectKHR                                                             = 5631,
        SpvOpDecorateString                                                        = 5632,
        SpvOpDecorateStringGOOGLE                                                  = 5632,
        SpvOpMemberDecorateString                                                  = 5633,
        SpvOpMemberDecorateStringGOOGLE                                            = 5633,
        SpvOpVmeImageINTEL                                                         = 5699,
        SpvOpTypeVmeImageINTEL                                                     = 5700,
        SpvOpTypeAvcImePayloadINTEL                                                = 5701,
        SpvOpTypeAvcRefPayloadINTEL                                                = 5702,
        SpvOpTypeAvcSicPayloadINTEL                                                = 5703,
        SpvOpTypeAvcMcePayloadINTEL                                                = 5704,
        SpvOpTypeAvcMceResultINTEL                                                 = 5705,
        SpvOpTypeAvcImeResultINTEL                                                 = 5706,
        SpvOpTypeAvcImeResultSingleReferenceStreamoutINTEL                         = 5707,
        SpvOpTypeAvcImeResultDualReferenceStreamoutINTEL                           = 5708,
        SpvOpTypeAvcImeSingleReferenceStreaminINTEL                                = 5709,
        SpvOpTypeAvcImeDualReferenceStreaminINTEL                                  = 5710,
        SpvOpTypeAvcRefResultINTEL                                                 = 5711,
        SpvOpTypeAvcSicResultINTEL                                                 = 5712,
        SpvOpSubgroupAvcMceGetDefaultInterBaseMultiReferencePenaltyINTEL           = 5713,
        SpvOpSubgroupAvcMceSetInterBaseMultiReferencePenaltyINTEL                  = 5714,
        SpvOpSubgroupAvcMceGetDefaultInterShapePenaltyINTEL                        = 5715,
        SpvOpSubgroupAvcMceSetInterShapePenaltyINTEL                               = 5716,
        SpvOpSubgroupAvcMceGetDefaultInterDirectionPenaltyINTEL                    = 5717,
        SpvOpSubgroupAvcMceSetInterDirectionPenaltyINTEL                           = 5718,
        SpvOpSubgroupAvcMceGetDefaultIntraLumaShapePenaltyINTEL                    = 5719,
        SpvOpSubgroupAvcMceGetDefaultInterMotionVectorCostTableINTEL               = 5720,
        SpvOpSubgroupAvcMceGetDefaultHighPenaltyCostTableINTEL                     = 5721,
        SpvOpSubgroupAvcMceGetDefaultMediumPenaltyCostTableINTEL                   = 5722,
        SpvOpSubgroupAvcMceGetDefaultLowPenaltyCostTableINTEL                      = 5723,
        SpvOpSubgroupAvcMceSetMotionVectorCostFunctionINTEL                        = 5724,
        SpvOpSubgroupAvcMceGetDefaultIntraLumaModePenaltyINTEL                     = 5725,
        SpvOpSubgroupAvcMceGetDefaultNonDcLumaIntraPenaltyINTEL                    = 5726,
        SpvOpSubgroupAvcMceGetDefaultIntraChromaModeBasePenaltyINTEL               = 5727,
        SpvOpSubgroupAvcMceSetAcOnlyHaarINTEL                                      = 5728,
        SpvOpSubgroupAvcMceSetSourceInterlacedFieldPolarityINTEL                   = 5729,
        SpvOpSubgroupAvcMceSetSingleReferenceInterlacedFieldPolarityINTEL          = 5730,
        SpvOpSubgroupAvcMceSetDualReferenceInterlacedFieldPolaritiesINTEL          = 5731,
        SpvOpSubgroupAvcMceConvertToImePayloadINTEL                                = 5732,
        SpvOpSubgroupAvcMceConvertToImeResultINTEL                                 = 5733,
        SpvOpSubgroupAvcMceConvertToRefPayloadINTEL                                = 5734,
        SpvOpSubgroupAvcMceConvertToRefResultINTEL                                 = 5735,
        SpvOpSubgroupAvcMceConvertToSicPayloadINTEL                                = 5736,
        SpvOpSubgroupAvcMceConvertToSicResultINTEL                                 = 5737,
        SpvOpSubgroupAvcMceGetMotionVectorsINTEL                                   = 5738,
        SpvOpSubgroupAvcMceGetInterDistortionsINTEL                                = 5739,
        SpvOpSubgroupAvcMceGetBestInterDistortionsINTEL                            = 5740,
        SpvOpSubgroupAvcMceGetInterMajorShapeINTEL                                 = 5741,
        SpvOpSubgroupAvcMceGetInterMinorShapeINTEL                                 = 5742,
        SpvOpSubgroupAvcMceGetInterDirectionsINTEL                                 = 5743,
        SpvOpSubgroupAvcMceGetInterMotionVectorCountINTEL                          = 5744,
        SpvOpSubgroupAvcMceGetInterReferenceIdsINTEL                               = 5745,
        SpvOpSubgroupAvcMceGetInterReferenceInterlacedFieldPolaritiesINTEL         = 5746,
        SpvOpSubgroupAvcImeInitializeINTEL                                         = 5747,
        SpvOpSubgroupAvcImeSetSingleReferenceINTEL                                 = 5748,
        SpvOpSubgroupAvcImeSetDualReferenceINTEL                                   = 5749,
        SpvOpSubgroupAvcImeRefWindowSizeINTEL                                      = 5750,
        SpvOpSubgroupAvcImeAdjustRefOffsetINTEL                                    = 5751,
        SpvOpSubgroupAvcImeConvertToMcePayloadINTEL                                = 5752,
        SpvOpSubgroupAvcImeSetMaxMotionVectorCountINTEL                            = 5753,
        SpvOpSubgroupAvcImeSetUnidirectionalMixDisableINTEL                        = 5754,
        SpvOpSubgroupAvcImeSetEarlySearchTerminationThresholdINTEL                 = 5755,
        SpvOpSubgroupAvcImeSetWeightedSadINTEL                                     = 5756,
        SpvOpSubgroupAvcImeEvaluateWithSingleReferenceINTEL                        = 5757,
        SpvOpSubgroupAvcImeEvaluateWithDualReferenceINTEL                          = 5758,
        SpvOpSubgroupAvcImeEvaluateWithSingleReferenceStreaminINTEL                = 5759,
        SpvOpSubgroupAvcImeEvaluateWithDualReferenceStreaminINTEL                  = 5760,
        SpvOpSubgroupAvcImeEvaluateWithSingleReferenceStreamoutINTEL               = 5761,
        SpvOpSubgroupAvcImeEvaluateWithDualReferenceStreamoutINTEL                 = 5762,
        SpvOpSubgroupAvcImeEvaluateWithSingleReferenceStreaminoutINTEL             = 5763,
        SpvOpSubgroupAvcImeEvaluateWithDualReferenceStreaminoutINTEL               = 5764,
        SpvOpSubgroupAvcImeConvertToMceResultINTEL                                 = 5765,
        SpvOpSubgroupAvcImeGetSingleReferenceStreaminINTEL                         = 5766,
        SpvOpSubgroupAvcImeGetDualReferenceStreaminINTEL                           = 5767,
        SpvOpSubgroupAvcImeStripSingleReferenceStreamoutINTEL                      = 5768,
        SpvOpSubgroupAvcImeStripDualReferenceStreamoutINTEL                        = 5769,
        SpvOpSubgroupAvcImeGetStreamoutSingleReferenceMajorShapeMotionVectorsINTEL = 5770,
        SpvOpSubgroupAvcImeGetStreamoutSingleReferenceMajorShapeDistortionsINTEL   = 5771,
        SpvOpSubgroupAvcImeGetStreamoutSingleReferenceMajorShapeReferenceIdsINTEL  = 5772,
        SpvOpSubgroupAvcImeGetStreamoutDualReferenceMajorShapeMotionVectorsINTEL   = 5773,
        SpvOpSubgroupAvcImeGetStreamoutDualReferenceMajorShapeDistortionsINTEL     = 5774,
        SpvOpSubgroupAvcImeGetStreamoutDualReferenceMajorShapeReferenceIdsINTEL    = 5775,
        SpvOpSubgroupAvcImeGetBorderReachedINTEL                                   = 5776,
        SpvOpSubgroupAvcImeGetTruncatedSearchIndicationINTEL                       = 5777,
        SpvOpSubgroupAvcImeGetUnidirectionalEarlySearchTerminationINTEL            = 5778,
        SpvOpSubgroupAvcImeGetWeightingPatternMinimumMotionVectorINTEL             = 5779,
        SpvOpSubgroupAvcImeGetWeightingPatternMinimumDistortionINTEL               = 5780,
        SpvOpSubgroupAvcFmeInitializeINTEL                                         = 5781,
        SpvOpSubgroupAvcBmeInitializeINTEL                                         = 5782,
        SpvOpSubgroupAvcRefConvertToMcePayloadINTEL                                = 5783,
        SpvOpSubgroupAvcRefSetBidirectionalMixDisableINTEL                         = 5784,
        SpvOpSubgroupAvcRefSetBilinearFilterEnableINTEL                            = 5785,
        SpvOpSubgroupAvcRefEvaluateWithSingleReferenceINTEL                        = 5786,
        SpvOpSubgroupAvcRefEvaluateWithDualReferenceINTEL                          = 5787,
        SpvOpSubgroupAvcRefEvaluateWithMultiReferenceINTEL                         = 5788,
        SpvOpSubgroupAvcRefEvaluateWithMultiReferenceInterlacedINTEL               = 5789,
        SpvOpSubgroupAvcRefConvertToMceResultINTEL                                 = 5790,
        SpvOpSubgroupAvcSicInitializeINTEL                                         = 5791,
        SpvOpSubgroupAvcSicConfigureSkcINTEL                                       = 5792,
        SpvOpSubgroupAvcSicConfigureIpeLumaINTEL                                   = 5793,
        SpvOpSubgroupAvcSicConfigureIpeLumaChromaINTEL                             = 5794,
        SpvOpSubgroupAvcSicGetMotionVectorMaskINTEL                                = 5795,
        SpvOpSubgroupAvcSicConvertToMcePayloadINTEL                                = 5796,
        SpvOpSubgroupAvcSicSetIntraLumaShapePenaltyINTEL                           = 5797,
        SpvOpSubgroupAvcSicSetIntraLumaModeCostFunctionINTEL                       = 5798,
        SpvOpSubgroupAvcSicSetIntraChromaModeCostFunctionINTEL                     = 5799,
        SpvOpSubgroupAvcSicSetBilinearFilterEnableINTEL                            = 5800,
        SpvOpSubgroupAvcSicSetSkcForwardTransformEnableINTEL                       = 5801,
        SpvOpSubgroupAvcSicSetBlockBasedRawSkipSadINTEL                            = 5802,
        SpvOpSubgroupAvcSicEvaluateIpeINTEL                                        = 5803,
        SpvOpSubgroupAvcSicEvaluateWithSingleReferenceINTEL                        = 5804,
        SpvOpSubgroupAvcSicEvaluateWithDualReferenceINTEL                          = 5805,
        SpvOpSubgroupAvcSicEvaluateWithMultiReferenceINTEL                         = 5806,
        SpvOpSubgroupAvcSicEvaluateWithMultiReferenceInterlacedINTEL               = 5807,
        SpvOpSubgroupAvcSicConvertToMceResultINTEL                                 = 5808,
        SpvOpSubgroupAvcSicGetIpeLumaShapeINTEL                                    = 5809,
        SpvOpSubgroupAvcSicGetBestIpeLumaDistortionINTEL                           = 5810,
        SpvOpSubgroupAvcSicGetBestIpeChromaDistortionINTEL                         = 5811,
        SpvOpSubgroupAvcSicGetPackedIpeLumaModesINTEL                              = 5812,
        SpvOpSubgroupAvcSicGetIpeChromaModeINTEL                                   = 5813,
        SpvOpSubgroupAvcSicGetPackedSkcLumaCountThresholdINTEL                     = 5814,
        SpvOpSubgroupAvcSicGetPackedSkcLumaSumThresholdINTEL                       = 5815,
        SpvOpSubgroupAvcSicGetInterRawSadsINTEL                                    = 5816,
        SpvOpVariableLengthArrayINTEL                                              = 5818,
        SpvOpSaveMemoryINTEL                                                       = 5819,
        SpvOpRestoreMemoryINTEL                                                    = 5820,
        SpvOpArbitraryFloatSinCosPiINTEL                                           = 5840,
        SpvOpArbitraryFloatCastINTEL                                               = 5841,
        SpvOpArbitraryFloatCastFromIntINTEL                                        = 5842,
        SpvOpArbitraryFloatCastToIntINTEL                                          = 5843,
        SpvOpArbitraryFloatAddINTEL                                                = 5846,
        SpvOpArbitraryFloatSubINTEL                                                = 5847,
        SpvOpArbitraryFloatMulINTEL                                                = 5848,
        SpvOpArbitraryFloatDivINTEL                                                = 5849,
        SpvOpArbitraryFloatGTINTEL                                                 = 5850,
        SpvOpArbitraryFloatGEINTEL                                                 = 5851,
        SpvOpArbitraryFloatLTINTEL                                                 = 5852,
        SpvOpArbitraryFloatLEINTEL                                                 = 5853,
        SpvOpArbitraryFloatEQINTEL                                                 = 5854,
        SpvOpArbitraryFloatRecipINTEL                                              = 5855,
        SpvOpArbitraryFloatRSqrtINTEL                                              = 5856,
        SpvOpArbitraryFloatCbrtINTEL                                               = 5857,
        SpvOpArbitraryFloatHypotINTEL                                              = 5858,
        SpvOpArbitraryFloatSqrtINTEL                                               = 5859,
        SpvOpArbitraryFloatLogINTEL                                                = 5860,
        SpvOpArbitraryFloatLog2INTEL                                               = 5861,
        SpvOpArbitraryFloatLog10INTEL                                              = 5862,
        SpvOpArbitraryFloatLog1pINTEL                                              = 5863,
        SpvOpArbitraryFloatExpINTEL                                                = 5864,
        SpvOpArbitraryFloatExp2INTEL                                               = 5865,
        SpvOpArbitraryFloatExp10INTEL                                              = 5866,
        SpvOpArbitraryFloatExpm1INTEL                                              = 5867,
        SpvOpArbitraryFloatSinINTEL                                                = 5868,
        SpvOpArbitraryFloatCosINTEL                                                = 5869,
        SpvOpArbitraryFloatSinCosINTEL                                             = 5870,
        SpvOpArbitraryFloatSinPiINTEL                                              = 5871,
        SpvOpArbitraryFloatCosPiINTEL                                              = 5872,
        SpvOpArbitraryFloatASinINTEL                                               = 5873,
        SpvOpArbitraryFloatASinPiINTEL                                             = 5874,
        SpvOpArbitraryFloatACosINTEL                                               = 5875,
        SpvOpArbitraryFloatACosPiINTEL                                             = 5876,
        SpvOpArbitraryFloatATanINTEL                                               = 5877,
        SpvOpArbitraryFloatATanPiINTEL                                             = 5878,
        SpvOpArbitraryFloatATan2INTEL                                              = 5879,
        SpvOpArbitraryFloatPowINTEL                                                = 5880,
        SpvOpArbitraryFloatPowRINTEL                                               = 5881,
        SpvOpArbitraryFloatPowNINTEL                                               = 5882,
        SpvOpLoopControlINTEL                                                      = 5887,
        SpvOpFixedSqrtINTEL                                                        = 5923,
        SpvOpFixedRecipINTEL                                                       = 5924,
        SpvOpFixedRsqrtINTEL                                                       = 5925,
        SpvOpFixedSinINTEL                                                         = 5926,
        SpvOpFixedCosINTEL                                                         = 5927,
        SpvOpFixedSinCosINTEL                                                      = 5928,
        SpvOpFixedSinPiINTEL                                                       = 5929,
        SpvOpFixedCosPiINTEL                                                       = 5930,
        SpvOpFixedSinCosPiINTEL                                                    = 5931,
        SpvOpFixedLogINTEL                                                         = 5932,
        SpvOpFixedExpINTEL                                                         = 5933,
        SpvOpPtrCastToCrossWorkgroupINTEL                                          = 5934,
        SpvOpCrossWorkgroupCastToPtrINTEL                                          = 5938,
        SpvOpReadPipeBlockingINTEL                                                 = 5946,
        SpvOpWritePipeBlockingINTEL                                                = 5947,
        SpvOpFPGARegINTEL                                                          = 5949,
        SpvOpRayQueryGetRayTMinKHR                                                 = 6016,
        SpvOpRayQueryGetRayFlagsKHR                                                = 6017,
        SpvOpRayQueryGetIntersectionTKHR                                           = 6018,
        SpvOpRayQueryGetIntersectionInstanceCustomIndexKHR                         = 6019,
        SpvOpRayQueryGetIntersectionInstanceIdKHR                                  = 6020,
        SpvOpRayQueryGetIntersectionInstanceShaderBindingTableRecordOffsetKHR      = 6021,
        SpvOpRayQueryGetIntersectionGeometryIndexKHR                               = 6022,
        SpvOpRayQueryGetIntersectionPrimitiveIndexKHR                              = 6023,
        SpvOpRayQueryGetIntersectionBarycentricsKHR                                = 6024,
        SpvOpRayQueryGetIntersectionFrontFaceKHR                                   = 6025,
        SpvOpRayQueryGetIntersectionCandidateAABBOpaqueKHR                         = 6026,
        SpvOpRayQueryGetIntersectionObjectRayDirectionKHR                          = 6027,
        SpvOpRayQueryGetIntersectionObjectRayOriginKHR                             = 6028,
        SpvOpRayQueryGetWorldRayDirectionKHR                                       = 6029,
        SpvOpRayQueryGetWorldRayOriginKHR                                          = 6030,
        SpvOpRayQueryGetIntersectionObjectToWorldKHR                               = 6031,
        SpvOpRayQueryGetIntersectionWorldToObjectKHR                               = 6032,
        SpvOpAtomicFAddEXT                                                         = 6035,
        SpvOpTypeBufferSurfaceINTEL                                                = 6086,
        SpvOpTypeStructContinuedINTEL                                              = 6090,
        SpvOpConstantCompositeContinuedINTEL                                       = 6091,
        SpvOpSpecConstantCompositeContinuedINTEL                                   = 6092,
        SpvOpMax                                                                   = 0x7fffffff;

    private Spv() {}

}