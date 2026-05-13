/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val AMD_gpa_interface = "AMDGpaInterface".nativeClassVK("AMD_gpa_interface", type = "device", postfix = "AMD") {
    IntConstant(
        "AMD_GPA_INTERFACE_SPEC_VERSION".."1"
    )

    StringConstant(
        "AMD_GPA_INTERFACE_EXTENSION_NAME".."VK_AMD_gpa_interface"
    )

    EnumConstant(
        "OBJECT_TYPE_GPA_SESSION_AMD".."1000133000"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_GPA_FEATURES_AMD".."1000133000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_GPA_PROPERTIES_AMD".."1000133001",
        "STRUCTURE_TYPE_GPA_SAMPLE_BEGIN_INFO_AMD".."1000133002",
        "STRUCTURE_TYPE_GPA_SESSION_CREATE_INFO_AMD".."1000133003",
        "STRUCTURE_TYPE_GPA_DEVICE_CLOCK_MODE_INFO_AMD".."1000133004",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_GPA_PROPERTIES_2_AMD".."1000133005",
        "STRUCTURE_TYPE_GPA_DEVICE_GET_CLOCK_INFO_AMD".."1000133006"
    )

    EnumConstant(
        "GPA_SQ_SHADER_STAGE_PS_BIT_AMD".enum(0x00000001),
        "GPA_SQ_SHADER_STAGE_VS_BIT_AMD".enum(0x00000002),
        "GPA_SQ_SHADER_STAGE_GS_BIT_AMD".enum(0x00000004),
        "GPA_SQ_SHADER_STAGE_ES_BIT_AMD".enum(0x00000008),
        "GPA_SQ_SHADER_STAGE_HS_BIT_AMD".enum(0x00000010),
        "GPA_SQ_SHADER_STAGE_LS_BIT_AMD".enum(0x00000020),
        "GPA_SQ_SHADER_STAGE_CS_BIT_AMD".enum(0x00000040)
    )

    EnumConstant(
        "GPA_PERF_BLOCK_CPF_AMD".."0",
        "GPA_PERF_BLOCK_IA_AMD".."1",
        "GPA_PERF_BLOCK_VGT_AMD".."2",
        "GPA_PERF_BLOCK_PA_AMD".."3",
        "GPA_PERF_BLOCK_SC_AMD".."4",
        "GPA_PERF_BLOCK_SPI_AMD".."5",
        "GPA_PERF_BLOCK_SQ_AMD".."6",
        "GPA_PERF_BLOCK_SX_AMD".."7",
        "GPA_PERF_BLOCK_TA_AMD".."8",
        "GPA_PERF_BLOCK_TD_AMD".."9",
        "GPA_PERF_BLOCK_TCP_AMD".."10",
        "GPA_PERF_BLOCK_TCC_AMD".."11",
        "GPA_PERF_BLOCK_TCA_AMD".."12",
        "GPA_PERF_BLOCK_DB_AMD".."13",
        "GPA_PERF_BLOCK_CB_AMD".."14",
        "GPA_PERF_BLOCK_GDS_AMD".."15",
        "GPA_PERF_BLOCK_SRBM_AMD".."16",
        "GPA_PERF_BLOCK_GRBM_AMD".."17",
        "GPA_PERF_BLOCK_GRBM_SE_AMD".."18",
        "GPA_PERF_BLOCK_RLC_AMD".."19",
        "GPA_PERF_BLOCK_DMA_AMD".."20",
        "GPA_PERF_BLOCK_MC_AMD".."21",
        "GPA_PERF_BLOCK_CPG_AMD".."22",
        "GPA_PERF_BLOCK_CPC_AMD".."23",
        "GPA_PERF_BLOCK_WD_AMD".."24",
        "GPA_PERF_BLOCK_TCS_AMD".."25",
        "GPA_PERF_BLOCK_ATC_AMD".."26",
        "GPA_PERF_BLOCK_ATC_L2_AMD".."27",
        "GPA_PERF_BLOCK_MC_VM_L2_AMD".."28",
        "GPA_PERF_BLOCK_EA_AMD".."29",
        "GPA_PERF_BLOCK_RPB_AMD".."30",
        "GPA_PERF_BLOCK_RMI_AMD".."31",
        "GPA_PERF_BLOCK_UMCCH_AMD".."32",
        "GPA_PERF_BLOCK_GE_AMD".."33",
        "GPA_PERF_BLOCK_GE1_AMD".."33",
        "GPA_PERF_BLOCK_GL1A_AMD".."34",
        "GPA_PERF_BLOCK_GL1C_AMD".."35",
        "GPA_PERF_BLOCK_GL1CG_AMD".."36",
        "GPA_PERF_BLOCK_GL2A_AMD".."37",
        "GPA_PERF_BLOCK_GL2C_AMD".."38",
        "GPA_PERF_BLOCK_CHA_AMD".."39",
        "GPA_PERF_BLOCK_CHC_AMD".."40",
        "GPA_PERF_BLOCK_CHCG_AMD".."41",
        "GPA_PERF_BLOCK_GUS_AMD".."42",
        "GPA_PERF_BLOCK_GCR_AMD".."43",
        "GPA_PERF_BLOCK_PH_AMD".."44",
        "GPA_PERF_BLOCK_UTCL1_AMD".."45",
        "GPA_PERF_BLOCK_GE_DIST_AMD".."46",
        "GPA_PERF_BLOCK_GE_SE_AMD".."47",
        "GPA_PERF_BLOCK_DF_MALL_AMD".."48",
        "GPA_PERF_BLOCK_SQ_WGP_AMD".."49",
        "GPA_PERF_BLOCK_PC_AMD".."50",
        "GPA_PERF_BLOCK_GL1XA_AMD".."51",
        "GPA_PERF_BLOCK_GL1XC_AMD".."52",
        "GPA_PERF_BLOCK_WGS_AMD".."53",
        "GPA_PERF_BLOCK_EACPWD_AMD".."54",
        "GPA_PERF_BLOCK_EASE_AMD".."55",
        "GPA_PERF_BLOCK_RLCUSER_AMD".."56",
        "GPA_PERF_BLOCK_RLCLOCAL_AMD".."56"
    )

    EnumConstant(
        "GPA_SAMPLE_TYPE_CUMULATIVE_AMD".."0",
        "GPA_SAMPLE_TYPE_TRACE_AMD".."1",
        "GPA_SAMPLE_TYPE_TIMING_AMD".."2"
    )

    EnumConstant(
        "GPA_DEVICE_CLOCK_MODE_DEFAULT_AMD".."0",
        "GPA_DEVICE_CLOCK_MODE_QUERY_AMD".."1",
        "GPA_DEVICE_CLOCK_MODE_PROFILING_AMD".."2",
        "GPA_DEVICE_CLOCK_MODE_MIN_MEMORY_AMD".."3",
        "GPA_DEVICE_CLOCK_MODE_MIN_ENGINE_AMD".."4",
        "GPA_DEVICE_CLOCK_MODE_PEAK_AMD".."5"
    )

    VkResult(
        "CreateGpaSessionAMD",

        VkDevice("device"),
        VkGpaSessionCreateInfoAMD.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkGpaSessionAMD.p("pGpaSession")
    )

    void(
        "DestroyGpaSessionAMD",

        VkDevice("device"),
        VkGpaSessionAMD("gpaSession"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    VkResult(
        "SetGpaDeviceClockModeAMD",

        VkDevice("device"),
        VkGpaDeviceClockModeInfoAMD.p("pInfo")
    )

    VkResult(
        "GetGpaDeviceClockInfoAMD",

        VkDevice("device"),
        VkGpaDeviceGetClockInfoAMD.p("pInfo")
    )

    VkResult(
        "CmdBeginGpaSessionAMD",

        VkCommandBuffer("commandBuffer"),
        VkGpaSessionAMD("gpaSession")
    )

    VkResult(
        "CmdEndGpaSessionAMD",

        VkCommandBuffer("commandBuffer"),
        VkGpaSessionAMD("gpaSession")
    )

    VkResult(
        "CmdBeginGpaSampleAMD",

        VkCommandBuffer("commandBuffer"),
        VkGpaSessionAMD("gpaSession"),
        VkGpaSampleBeginInfoAMD.const.p("pGpaSampleBeginInfo"),
        Unsafe..uint32_t.p("pSampleID")
    )

    void(
        "CmdEndGpaSampleAMD",

        VkCommandBuffer("commandBuffer"),
        VkGpaSessionAMD("gpaSession"),
        uint32_t("sampleID")
    )

    VkResult(
        "GetGpaSessionStatusAMD",

        VkDevice("device"),
        VkGpaSessionAMD("gpaSession")
    )

    VkResult(
        "GetGpaSessionResultsAMD",

        VkDevice("device"),
        VkGpaSessionAMD("gpaSession"),
        uint32_t("sampleID"),
        AutoSize("pData")..Check(1)..size_t.p("pSizeInBytes"),
        nullable..void.p("pData")
    )

    VkResult(
        "ResetGpaSessionAMD",

        VkDevice("device"),
        VkGpaSessionAMD("gpaSession")
    )

    void(
        "CmdCopyGpaSessionResultsAMD",

        VkCommandBuffer("commandBuffer"),
        VkGpaSessionAMD("gpaSession")
    )
}