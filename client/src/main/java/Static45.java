import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!client", name = "db", descriptor = "I")
	public static int anInt1196 = 0;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1396() {
		for (@Pc(1) int local1 = 0; local1 < Static373.buildAreaLimitX; local1++) {
			@Pc(6) int[] local6 = Static319.anIntArrayArray51[local1];
			for (@Pc(8) int local8 = 0; local8 < Static242.buildAreaLimitZ; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1398() {
		@Pc(1) int local1 = PlayerList.anInt751;
		@Pc(3) int[] local3 = PlayerList.anIntArray121;
		@Pc(20) boolean local20 = client.preferences.manyIdleAnimations == 1 && local1 > 200 || client.preferences.manyIdleAnimations == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Player local29 = PlayerList.players[local3[local22]];
			if (local29.method4065()) {
				local29.method6078();
				if (local29.aShort103 >= 0 && local29.aShort101 >= 0 && local29.aShort104 < Static373.buildAreaLimitX && local29.aShort102 < Static242.buildAreaLimitZ) {
					local29.aBoolean275 = local29.aBoolean317 ? local20 : false;
					if (local29 == PlayerList.self) {
						local29.anInt4638 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean320) {
							local75++;
						}
						if (local29.anInt4606 > client.cycle) {
							local75 += 2;
						}
						local75 += 5 - local29.getSize() << 2;
						if (Static114.anInt2344 == 0) {
							local75 += 32;
						} else {
							local75 += 128;
						}
						local75 += 256;
						local29.anInt4638 = local75 + 1;
					}
				} else {
					local29.anInt4638 = -1;
				}
			} else {
				local29.anInt4638 = -1;
			}
		}
		for (@Pc(111) int local111 = 0; local111 < NpcList.size; local111++) {
			@Pc(118) Npc local118 = NpcList.npcs[NpcList.ids[local111]];
			if (local118.method4336() && local118.type.method2091(VarpDomain.instance)) {
				local118.method6078();
				if (local118.aShort103 >= 0 && local118.aShort101 >= 0 && local118.aShort104 < Static373.buildAreaLimitX && local118.aShort102 < Static242.buildAreaLimitZ) {
					@Pc(155) int local155 = 0;
					if (!local118.aBoolean320) {
						local155++;
					}
					if (local118.anInt4606 > client.cycle) {
						local155 += 2;
					}
					local155 += 5 - local118.getSize() << 2;
					if (Static114.anInt2344 == 0) {
						if (local118.type.aBoolean148) {
							local155 += 64;
						} else {
							local155 += 128;
						}
					} else if (Static114.anInt2344 == 1) {
						if (local118.type.aBoolean148) {
							local155 += 32;
						} else {
							local155 += 64;
						}
					}
					if (local118.type.aBoolean149) {
						local155 += 1024;
					} else if (!local118.type.aBoolean146) {
						local155 += 256;
					}
					local118.anInt4638 = local155 + 1;
				} else {
					local118.anInt4638 = -1;
				}
			} else {
				local118.anInt4638 = -1;
			}
		}
		for (local75 = 0; local75 < Static50.aClass84Array1.length; local75++) {
			@Pc(221) Class84 local221 = Static50.aClass84Array1[local75];
			if (local221 != null) {
				if (local221.anInt2355 == 1) {
					@Pc(232) Npc local232 = NpcList.npcs[local221.anInt2354];
					if (local232 != null && local232.anInt4638 >= 0) {
						local232.anInt4638 += 2048;
					}
				} else if (local221.anInt2355 == 10) {
					@Pc(253) Player local253 = PlayerList.players[local221.anInt2354];
					if (local253 != null && local253 != PlayerList.self && local253.anInt4638 >= 0) {
						local253.anInt4638 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!nk;IIIIIIIII)V")
	public static void method1400(@OriginalArg(0) Component[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Component local6 = arg0[local1];
			if (local6 != null && local6.layer == arg1) {
				@Pc(17) int local17 = local6.x + arg6;
				@Pc(22) int local22 = local6.y + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.type == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.width;
					@Pc(45) int local45 = local22 + local6.height;
					if (local6.type == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.type == 0 || local6.aBoolean296 || InterfaceList.getServerActiveProperties(local6).events != 0 || local6 == Static301.aClass161_13 || local6.anInt4273 == Static135.anInt2521) {
					if (!method1403(local6)) {
						if (local6 == Cs1ScriptRunner.aClass161_14) {
							Static301.aBoolean403 = true;
							Static168.anInt7248 = local17;
							Static3.anInt61 = local22;
						}
						if (local6.aBoolean282 || local28 < local32 && local30 < local34) {
							if (local6.type == 0 && local6.noClickThrough && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(151) HookRequest local151 = (HookRequest) InterfaceList.lowPriorityRequests.head(); local151 != null; local151 = (HookRequest) InterfaceList.lowPriorityRequests.next()) {
									if (local151.aBoolean157) {
										local151.unlink();
										local151.source.aBoolean294 = false;
									}
								}
								if (Static129.anInt2458 == 0) {
									Cs1ScriptRunner.aClass161_14 = null;
									Static301.aClass161_13 = null;
								}
								InterfaceList.anInt6449 = 0;
								Static206.aBoolean242 = false;
								Static332.aBoolean427 = false;
								if (!Static375.aBoolean477) {
									Static147.method2703();
								}
							}
							@Pc(207) boolean local207;
							if (Mouse.instance.method3304() >= local28 && Mouse.instance.method3313() >= local30 && Mouse.instance.method3304() < local32 && Mouse.instance.method3313() < local34) {
								local207 = true;
							} else {
								local207 = false;
							}
							if (!Static375.aBoolean477 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static6.method142(local6, arg9 - local22, arg8 - local17);
							}
							@Pc(235) boolean local235 = false;
							if (Mouse.instance.method3311() && local207) {
								local235 = true;
							}
							@Pc(245) boolean local245 = false;
							if (Mouse.clickButton != null && Mouse.clickButton.method5247() == 0 && Mouse.clickButton.getY() >= local28 && Mouse.clickButton.getX() >= local30 && Mouse.clickButton.getY() < local32 && Mouse.clickButton.getX() < local34) {
								local245 = true;
							}
							@Pc(278) int local278;
							@Pc(374) int local374;
							if (local6.aByteArray49 != null) {
								for (local278 = 0; local278 < local6.aByteArray49.length; local278++) {
									if (Keyboard.instance.isPressed(local6.aByteArray49[local278])) {
										if (local6.anIntArray275 == null || client.cycle >= local6.anIntArray275[local278]) {
											@Pc(310) byte local310 = local6.aByteArray50[local278];
											if (local310 == 0 || ((local310 & 0x8) == 0 || !Keyboard.instance.isPressed(86) && !Keyboard.instance.isPressed(82) && !Keyboard.instance.isPressed(81)) && ((local310 & 0x2) == 0 || Keyboard.instance.isPressed(86)) && ((local310 & 0x1) == 0 || Keyboard.instance.isPressed(82)) && ((local310 & 0x4) == 0 || Keyboard.instance.isPressed(81))) {
												Protocol.method4681(local6.id, local278 + 1, "", -1);
												local374 = local6.anIntArray276[local278];
												if (local6.anIntArray275 == null) {
													local6.anIntArray275 = new int[local6.aByteArray49.length];
												}
												if (local374 == 0) {
													local6.anIntArray275[local278] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray275[local278] = client.cycle + local374;
												}
											}
										}
									} else if (local6.anIntArray275 != null) {
										local6.anIntArray275[local278] = 0;
									}
								}
							}
							if (local245) {
								Cs1ScriptRunner.method6335(Mouse.clickButton.getY() - local17, Mouse.clickButton.getX() - local22, local6);
							}
							if (Cs1ScriptRunner.aClass161_14 != null && Cs1ScriptRunner.aClass161_14 != local6 && local207 && InterfaceList.getServerActiveProperties(local6).method1853()) {
								Static182.aClass161_7 = local6;
							}
							if (local6 == Static301.aClass161_13) {
								Static278.aBoolean377 = true;
								Static4.anInt88 = local17;
								Static100.anInt2111 = local22;
							}
							if (local6.aBoolean296 || local6.anInt4273 != 0) {
								@Pc(459) HookRequest local459;
								if (local207 && MouseWheel.wheelRotation != 0 && local6.onScrollWheel != null) {
									local459 = new HookRequest();
									local459.aBoolean157 = true;
									local459.source = local6;
									local459.anInt2117 = MouseWheel.wheelRotation;
									local459.anObjectArray4 = local6.onScrollWheel;
									InterfaceList.lowPriorityRequests.addTail(local459);
								}
								if (Cs1ScriptRunner.aClass161_14 != null || Static375.aBoolean477 || local6.anInt4273 != Static91.anInt1909 && InterfaceList.anInt6449 > 0) {
									local245 = false;
									local235 = false;
									local207 = false;
								}
								@Pc(614) int local614;
								if (local6.anInt4273 != 0) {
									if (local6.anInt4273 == Static199.anInt5755 || local6.anInt4273 == Static147.anInt2708) {
										Static20.aClass161_1 = local6;
										if (Static368.aClass43_1 != null) {
											Static368.aClass43_1.method1617(local6.height, Rasteriser.instance);
										}
										if (local6.anInt4273 == Static199.anInt5755) {
											if (!Static375.aBoolean477 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static327.method5574(Rasteriser.instance, arg9, arg8);
												for (@Pc(542) Class12_Sub6 local542 = (Class12_Sub6) Static356.aClass36_10.method1415(); local542 != null; local542 = (Class12_Sub6) Static356.aClass36_10.method1420()) {
													if (arg8 >= local542.anInt4753 && arg8 < local542.anInt4755 && arg9 >= local542.anInt4752 && arg9 < local542.anInt4751) {
														Static147.method2703();
														Static191.method1581(local542.aClass11_Sub5_Sub2_1);
													}
												}
											}
											Static374.method6274(local22, local6, local17);
											continue;
										}
									}
									@Pc(653) int local653;
									if (local6.anInt4273 == Static135.anInt2521) {
										if (local6.method4109(Rasteriser.instance) == null || Static146.anInt2703 != 0 && Static146.anInt2703 != 3 || Static375.aBoolean477 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local278 = arg8 - local17;
										local614 = arg9 - local22;
										local374 = local6.anIntArray282[local614];
										if (local278 < local374 || local278 > local374 + local6.anIntArray280[local614]) {
											continue;
										}
										local278 -= local6.width / 2;
										local614 -= local6.height / 2;
										if (Camera.cameraType == 4) {
											local653 = (int) Camera.yaw & 0x3FFF;
										} else {
											local653 = (int) Camera.yaw + Static6.anInt158 & 0x3FFF;
										}
										@Pc(665) int local665 = RasteriserBase.anIntArray178[local653];
										@Pc(669) int local669 = RasteriserBase.anIntArray177[local653];
										if (Camera.cameraType != 4) {
											local665 = local665 * (Static97.anInt2005 + 256) >> 8;
											local669 = local669 * (Static97.anInt2005 + 256) >> 8;
										}
										@Pc(698) int local698 = local614 * local665 + local278 * local669 >> 15;
										@Pc(708) int local708 = local614 * local669 - local278 * local665 >> 15;
										@Pc(719) int local719;
										@Pc(727) int local727;
										if (Camera.cameraType == 4) {
											local719 = (Static394.anInt7264 >> 7) + (local698 >> 2);
											local727 = (Static348.anInt6448 >> 7) - (local708 >> 2);
										} else {
											@Pc(736) int local736 = (PlayerList.self.getSize() - 1) * 64;
											local719 = (PlayerList.self.xFine - local736 >> 7) + (local698 >> 2);
											local727 = (PlayerList.self.zFine - local736 >> 7) - (local708 >> 2);
										}
										if (Static330.aBoolean419 && (Static115.anInt3837 & 0x40) != 0) {
											@Pc(769) Component local769 = InterfaceList.getCreatedComponent(Static337.anInt6317, Static214.anInt3792);
											if (local769 == null) {
												Static207.method3699();
											} else {
												Static1.method3(local6.objId, true, local727, false, Static91.aString18, local719, 51, " ->", Static41.anInt1044, 1L);
											}
											continue;
										}
										if (client.game == client.GAME_SD) {
											Static1.method3(-1, true, local727, false, Static382.aClass79_147.getLocalized(client.language), local719, 59, "", -1, 1L);
										}
										Static1.method3(-1, true, local727, false, Static330.aString62, local719, 22, "", -1, 1L);
										continue;
									}
									if (local6.anInt4273 == Static91.anInt1909) {
										WorldMap.aClass161_11 = local6;
										if (local207) {
											Static206.aBoolean242 = true;
										}
										if (local245) {
											local278 = (int) ((double) (Mouse.clickButton.getY() - local17 - local6.width / 2) * 2.0D / (double) MapList.aFloat72);
											local614 = (int) -((double) (Mouse.clickButton.getX() - local22 - local6.height / 2) * 2.0D / (double) MapList.aFloat72);
											local374 = WorldMap.anInt2772 + local278 + WorldMap.originX;
											local653 = WorldMap.anInt2003 + local614 + WorldMap.originZ;
											@Pc(883) Map local883 = WorldMap.getCurrentMap();
											if (local883 == null) {
												continue;
											}
											@Pc(888) int[] local888 = new int[3];
											local883.convertDisplayToSource(local888, local653, local374);
											if (local888 != null) {
												if (Keyboard.instance.isPressed(82) && LoginManager.staffModLevel > 0) {
													Cheat.teleport(local888[0], local888[2], local888[1]);
													continue;
												}
												Static332.aBoolean427 = true;
												Static283.anInt5351 = local888[0];
												Static282.anInt5347 = local888[1];
												Static4.anInt89 = local888[2];
											}
											InterfaceList.anInt6449 = 1;
											Static238.aBoolean299 = false;
											Static18.anInt530 = Mouse.instance.method3304();
											Static392.anInt7228 = Mouse.instance.method3313();
											continue;
										}
										if (local235 && InterfaceList.anInt6449 > 0) {
											if (InterfaceList.anInt6449 == 1 && (Static18.anInt530 != Mouse.instance.method3304() || Static392.anInt7228 != Mouse.instance.method3313())) {
												Static334.anInt6242 = WorldMap.anInt2772;
												Static65.anInt1593 = WorldMap.anInt2003;
												InterfaceList.anInt6449 = 2;
											}
											if (InterfaceList.anInt6449 == 2) {
												Static238.aBoolean299 = true;
												Static313.method5337(Static334.anInt6242 + (int) ((double) (Static18.anInt530 - Mouse.instance.method3304()) * 2.0D / (double) MapList.aFloat73));
												Static78.method5697(Static65.anInt1593 - (int) ((double) (Static392.anInt7228 - Mouse.instance.method3313()) * 2.0D / (double) MapList.aFloat73));
											}
											continue;
										}
										if (InterfaceList.anInt6449 > 0 && !Static238.aBoolean299) {
											if ((Static232.anInt4087 == 1 || Static208.method3710()) && Static268.anInt4959 > 2) {
												Static143.method2679(Static392.anInt7228, Static18.anInt530);
											} else if (Static270.method4555()) {
												Static143.method2679(Static392.anInt7228, Static18.anInt530);
											}
										}
										InterfaceList.anInt6449 = 0;
										continue;
									}
									if (local6.anInt4273 == Static56.anInt1462) {
										if (local235) {
											Static200.method3646(Mouse.instance.method3313() - local22, local6.width, Mouse.instance.method3304() - local17, local6.height);
										}
										continue;
									}
									if (local6.anInt4273 == Static133.anInt2489) {
										Static65.method1735(local17, local6, local22);
										continue;
									}
								}
								if (!local6.aBoolean287 && local245) {
									local6.aBoolean287 = true;
									if (local6.onClick != null) {
										local459 = new HookRequest();
										local459.aBoolean157 = true;
										local459.source = local6;
										local459.anInt2116 = Mouse.clickButton.getY() - local17;
										local459.anInt2117 = Mouse.clickButton.getX() - local22;
										local459.anObjectArray4 = local6.onClick;
										InterfaceList.lowPriorityRequests.addTail(local459);
									}
								}
								if (local6.aBoolean287 && local235 && local6.onClickRepeat != null) {
									local459 = new HookRequest();
									local459.aBoolean157 = true;
									local459.source = local6;
									local459.anInt2116 = Mouse.instance.method3304() - local17;
									local459.anInt2117 = Mouse.instance.method3313() - local22;
									local459.anObjectArray4 = local6.onClickRepeat;
									InterfaceList.lowPriorityRequests.addTail(local459);
								}
								if (local6.aBoolean287 && !local235) {
									local6.aBoolean287 = false;
									if (local6.onRelease != null) {
										local459 = new HookRequest();
										local459.aBoolean157 = true;
										local459.source = local6;
										local459.anInt2116 = Mouse.instance.method3304() - local17;
										local459.anInt2117 = Mouse.instance.method3313() - local22;
										local459.anObjectArray4 = local6.onRelease;
										InterfaceList.mediumPriorityRequests.addTail(local459);
									}
								}
								if (local235 && local6.onHold != null) {
									local459 = new HookRequest();
									local459.aBoolean157 = true;
									local459.source = local6;
									local459.anInt2116 = Mouse.instance.method3304() - local17;
									local459.anInt2117 = Mouse.instance.method3313() - local22;
									local459.anObjectArray4 = local6.onHold;
									InterfaceList.lowPriorityRequests.addTail(local459);
								}
								if (!local6.aBoolean294 && local207) {
									local6.aBoolean294 = true;
									if (local6.onMouseOver != null) {
										local459 = new HookRequest();
										local459.aBoolean157 = true;
										local459.source = local6;
										local459.anInt2116 = Mouse.instance.method3304() - local17;
										local459.anInt2117 = Mouse.instance.method3313() - local22;
										local459.anObjectArray4 = local6.onMouseOver;
										InterfaceList.lowPriorityRequests.addTail(local459);
									}
								}
								if (local6.aBoolean294 && local207 && local6.onMouseRepeat != null) {
									local459 = new HookRequest();
									local459.aBoolean157 = true;
									local459.source = local6;
									local459.anInt2116 = Mouse.instance.method3304() - local17;
									local459.anInt2117 = Mouse.instance.method3313() - local22;
									local459.anObjectArray4 = local6.onMouseRepeat;
									InterfaceList.lowPriorityRequests.addTail(local459);
								}
								if (local6.aBoolean294 && !local207) {
									local6.aBoolean294 = false;
									if (local6.onMouseLeave != null) {
										local459 = new HookRequest();
										local459.aBoolean157 = true;
										local459.source = local6;
										local459.anInt2116 = Mouse.instance.method3304() - local17;
										local459.anInt2117 = Mouse.instance.method3313() - local22;
										local459.anObjectArray4 = local6.onMouseLeave;
										InterfaceList.mediumPriorityRequests.addTail(local459);
									}
								}
								if (local6.onTimer != null) {
									local459 = new HookRequest();
									local459.source = local6;
									local459.anObjectArray4 = local6.onTimer;
									InterfaceList.highPriorityRequests.addTail(local459);
								}
								@Pc(1427) HookRequest local1427;
								if (local6.onVarcTransmit != null && VarcDomain.updatedVarcsWriterIndex > local6.anInt4265) {
									if (local6.varcTriggers == null || VarcDomain.updatedVarcsWriterIndex - local6.anInt4265 > 32) {
										local459 = new HookRequest();
										local459.source = local6;
										local459.anObjectArray4 = local6.onVarcTransmit;
										InterfaceList.lowPriorityRequests.addTail(local459);
									} else {
										label659: for (local278 = local6.anInt4265; local278 < VarcDomain.updatedVarcsWriterIndex; local278++) {
											local614 = VarcDomain.updatedVarcs[local278 & 0x1F];
											for (local374 = 0; local374 < local6.varcTriggers.length; local374++) {
												if (local6.varcTriggers[local374] == local614) {
													local1427 = new HookRequest();
													local1427.source = local6;
													local1427.anObjectArray4 = local6.onVarcTransmit;
													InterfaceList.lowPriorityRequests.addTail(local1427);
													break label659;
												}
											}
										}
									}
									local6.anInt4265 = VarcDomain.updatedVarcsWriterIndex;
								}
								if (local6.onVarcStrTransmit != null && VarcDomain.updatedVarcstrsWriterIndex > local6.anInt4244) {
									if (local6.varcStrTriggers == null || VarcDomain.updatedVarcstrsWriterIndex - local6.anInt4244 > 32) {
										local459 = new HookRequest();
										local459.source = local6;
										local459.anObjectArray4 = local6.onVarcStrTransmit;
										InterfaceList.lowPriorityRequests.addTail(local459);
									} else {
										label635: for (local278 = local6.anInt4244; local278 < VarcDomain.updatedVarcstrsWriterIndex; local278++) {
											local614 = VarcDomain.anIntArray444[local278 & 0x1F];
											for (local374 = 0; local374 < local6.varcStrTriggers.length; local374++) {
												if (local6.varcStrTriggers[local374] == local614) {
													local1427 = new HookRequest();
													local1427.source = local6;
													local1427.anObjectArray4 = local6.onVarcStrTransmit;
													InterfaceList.lowPriorityRequests.addTail(local1427);
													break label635;
												}
											}
										}
									}
									local6.anInt4244 = VarcDomain.updatedVarcstrsWriterIndex;
								}
								if (local6.onVarTransmit != null && VarpDomain.updatedVarpsWriterIndex > local6.anInt4282) {
									if (local6.varpTriggers == null || VarpDomain.updatedVarpsWriterIndex - local6.anInt4282 > 32) {
										local459 = new HookRequest();
										local459.source = local6;
										local459.anObjectArray4 = local6.onVarTransmit;
										InterfaceList.lowPriorityRequests.addTail(local459);
									} else {
										label611: for (local278 = local6.anInt4282; local278 < VarpDomain.updatedVarpsWriterIndex; local278++) {
											local614 = VarpDomain.updatedVarps[local278 & 0x1F];
											for (local374 = 0; local374 < local6.varpTriggers.length; local374++) {
												if (local6.varpTriggers[local374] == local614) {
													local1427 = new HookRequest();
													local1427.source = local6;
													local1427.anObjectArray4 = local6.onVarTransmit;
													InterfaceList.lowPriorityRequests.addTail(local1427);
													break label611;
												}
											}
										}
									}
									local6.anInt4282 = VarpDomain.updatedVarpsWriterIndex;
								}
								if (local6.onInvTransmit != null && Static54.anInt1417 > local6.anInt4304) {
									if (local6.invTriggers == null || Static54.anInt1417 - local6.anInt4304 > 32) {
										local459 = new HookRequest();
										local459.source = local6;
										local459.anObjectArray4 = local6.onInvTransmit;
										InterfaceList.lowPriorityRequests.addTail(local459);
									} else {
										label587: for (local278 = local6.anInt4304; local278 < Static54.anInt1417; local278++) {
											local614 = Static106.anIntArray135[local278 & 0x1F];
											for (local374 = 0; local374 < local6.invTriggers.length; local374++) {
												if (local6.invTriggers[local374] == local614) {
													local1427 = new HookRequest();
													local1427.source = local6;
													local1427.anObjectArray4 = local6.onInvTransmit;
													InterfaceList.lowPriorityRequests.addTail(local1427);
													break label587;
												}
											}
										}
									}
									local6.anInt4304 = Static54.anInt1417;
								}
								if (local6.onStatTransmit != null && Static381.anInt7117 > local6.anInt4312) {
									if (local6.statTriggers == null || Static381.anInt7117 - local6.anInt4312 > 32) {
										local459 = new HookRequest();
										local459.source = local6;
										local459.anObjectArray4 = local6.onStatTransmit;
										InterfaceList.lowPriorityRequests.addTail(local459);
									} else {
										label563: for (local278 = local6.anInt4312; local278 < Static381.anInt7117; local278++) {
											local614 = Static208.anIntArray226[local278 & 0x1F];
											for (local374 = 0; local374 < local6.statTriggers.length; local374++) {
												if (local6.statTriggers[local374] == local614) {
													local1427 = new HookRequest();
													local1427.source = local6;
													local1427.anObjectArray4 = local6.onStatTransmit;
													InterfaceList.lowPriorityRequests.addTail(local1427);
													break label563;
												}
											}
										}
									}
									local6.anInt4312 = Static381.anInt7117;
								}
								if (Static21.anInt551 > local6.anInt4314 && local6.onChatTransmit != null) {
									local459 = new HookRequest();
									local459.source = local6;
									local459.anObjectArray4 = local6.onChatTransmit;
									InterfaceList.lowPriorityRequests.addTail(local459);
								}
								if (Static53.anInt3971 > local6.anInt4314 && local6.onFriendTransmit != null) {
									local459 = new HookRequest();
									local459.source = local6;
									local459.anObjectArray4 = local6.onFriendTransmit;
									InterfaceList.lowPriorityRequests.addTail(local459);
								}
								if (Static285.anInt5370 > local6.anInt4314 && local6.onClanTransmit != null) {
									local459 = new HookRequest();
									local459.source = local6;
									local459.anObjectArray4 = local6.onClanTransmit;
									InterfaceList.lowPriorityRequests.addTail(local459);
								}
								if (Static177.anInt3381 > local6.anInt4314 && local6.onStockTransmit != null) {
									local459 = new HookRequest();
									local459.source = local6;
									local459.anObjectArray4 = local6.onStockTransmit;
									InterfaceList.lowPriorityRequests.addTail(local459);
								}
								if (InterfaceList.miscTransmitAt > local6.anInt4314 && local6.onMiscTransmit != null) {
									local459 = new HookRequest();
									local459.source = local6;
									local459.anObjectArray4 = local6.onMiscTransmit;
									InterfaceList.lowPriorityRequests.addTail(local459);
								}
								local6.anInt4314 = InterfaceList.transmitTimer;
								if (local6.onKey != null) {
									for (local278 = 0; local278 < Static6.anInt159; local278++) {
										@Pc(1895) HookRequest local1895 = new HookRequest();
										local1895.source = local6;
										local1895.anInt2114 = Static156.aClass37Array1[local278].method1461();
										local1895.anInt2115 = Static156.aClass37Array1[local278].method1456();
										local1895.anObjectArray4 = local6.onKey;
										InterfaceList.lowPriorityRequests.addTail(local1895);
									}
								}
								if (Static183.aBoolean9 && local6.onCamFinished != null) {
									local459 = new HookRequest();
									local459.source = local6;
									local459.anObjectArray4 = local6.onCamFinished;
									InterfaceList.lowPriorityRequests.addTail(local459);
								}
							}
							if (local6.type == 5 && local6.anInt4280 != -1) {
								local6.method4111(client.SkyboxTypes, client.SkyboxSphereTypes).method1617(local6.height, Rasteriser.instance);
							}
							Static24.method852(local6);
							if (local6.type == 0) {
								method1400(arg0, local6.id, local28, local30, local32, local34, local17 - local6.scrollX, local22 - local6.scrollY, arg8, arg9);
								if (local6.activeComponents != null) {
									method1400(local6.activeComponents, local6.id, local28, local30, local32, local34, local17 - local6.scrollX, local22 - local6.scrollY, arg8, arg9);
								}
								@Pc(2017) SubInterface local2017 = (SubInterface) InterfaceList.subInterfaces.get((long) local6.id);
								if (local2017 != null) {
									if (client.game == client.GAME_RS && local2017.anInt1373 == 0 && !Static375.aBoolean477 && local207 && !Static18.qa_op_test) {
										Static147.method2703();
									}
									Static257.method3927(local17, local34, local32, local30, local22, arg8, local2017.id, arg9, local28);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static24.method852(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)Z")
	public static boolean method1401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static35.method1106(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Scene.scale;
		@Pc(14) int local14 = arg2 << Scene.scale;
		@Pc(23) int local23 = Scene.aClass6Array4[arg0].method5719(arg1, arg2) - 1;
		@Pc(27) int local27 = local23 - 120;
		@Pc(31) int local31 = local23 - 230;
		@Pc(35) int local35 = local23 - 238;
		if (arg3 == 1) {
			if (local10 > Static353.anInt6532) {
				if (!Static46.method1423(local10, local23, local14)) {
					return false;
				}
				if (!Static46.method1423(local10, local23, local14 + Scene.anInt4716)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static46.method1423(local10, local27, local14)) {
					return false;
				}
				if (!Static46.method1423(local10, local27, local14 + Scene.anInt4716)) {
					return false;
				}
			}
			if (Static46.method1423(local10, local31, local14)) {
				return Static46.method1423(local10, local31, local14 + Scene.anInt4716);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static359.anInt6697) {
				if (!Static46.method1423(local10, local23, local14 + Scene.anInt4716)) {
					return false;
				}
				if (!Static46.method1423(local10 + Scene.anInt4716, local23, local14 + Scene.anInt4716)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static46.method1423(local10, local27, local14 + Scene.anInt4716)) {
					return false;
				}
				if (!Static46.method1423(local10 + Scene.anInt4716, local27, local14 + Scene.anInt4716)) {
					return false;
				}
			}
			if (Static46.method1423(local10, local31, local14 + Scene.anInt4716)) {
				return Static46.method1423(local10 + Scene.anInt4716, local31, local14 + Scene.anInt4716);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static353.anInt6532) {
				if (!Static46.method1423(local10 + Scene.anInt4716, local23, local14)) {
					return false;
				}
				if (!Static46.method1423(local10 + Scene.anInt4716, local23, local14 + Scene.anInt4716)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static46.method1423(local10 + Scene.anInt4716, local27, local14)) {
					return false;
				}
				if (!Static46.method1423(local10 + Scene.anInt4716, local27, local14 + Scene.anInt4716)) {
					return false;
				}
			}
			if (Static46.method1423(local10 + Scene.anInt4716, local31, local14)) {
				return Static46.method1423(local10 + Scene.anInt4716, local31, local14 + Scene.anInt4716);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static359.anInt6697) {
				if (!Static46.method1423(local10, local23, local14)) {
					return false;
				}
				if (!Static46.method1423(local10 + Scene.anInt4716, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static46.method1423(local10, local27, local14)) {
					return false;
				}
				if (!Static46.method1423(local10 + Scene.anInt4716, local27, local14)) {
					return false;
				}
			}
			if (Static46.method1423(local10, local31, local14)) {
				return Static46.method1423(local10 + Scene.anInt4716, local31, local14);
			} else {
				return false;
			}
		} else if (!Static46.method1423(local10 + Scene.anInt4693, local35, local14 + Scene.anInt4693)) {
			return false;
		} else if (arg3 == 16) {
			return Static46.method1423(local10, local31, local14 + Scene.anInt4716);
		} else if (arg3 == 32) {
			return Static46.method1423(local10 + Scene.anInt4716, local31, local14 + Scene.anInt4716);
		} else if (arg3 == 64) {
			return Static46.method1423(local10 + Scene.anInt4716, local31, local14);
		} else if (arg3 == 128) {
			return Static46.method1423(local10, local31, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!nk;)Z")
	public static boolean method1403(@OriginalArg(0) Component arg0) {
		if (Static18.qa_op_test) {
			if (InterfaceList.getServerActiveProperties(arg0).events != 0) {
				return false;
			}
			if (arg0.type == 0) {
				return false;
			}
		}
		return arg0.hidden;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1407() {
		Static51.anInt1369 = 0;
		for (@Pc(3) int local3 = 0; local3 < NpcList.size; local3++) {
			@Pc(10) Npc local10 = NpcList.npcs[NpcList.ids[local3]];
			if (local10.aBoolean320 && local10.method4324() != -1) {
				@Pc(28) int local28 = (local10.getSize() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.xFine - local28 >> 7;
				@Pc(42) int local42 = local10.zFine - local28 >> 7;
				@Pc(49) PathingEntity local49 = Static228.method3997(local10.plane, local35, local42);
				if (local49 != null) {
					@Pc(54) int local54 = local49.anInt4619;
					if (local49 instanceof Npc) {
						local54 += 2048;
					}
					if (local49.anInt4625 == 0 && local49.method4324() != -1) {
						Static150.anIntArray175[Static51.anInt1369] = local54;
						Static160.anIntArray186[Static51.anInt1369] = local54;
						Static51.anInt1369++;
						local49.anInt4625++;
					}
					Static150.anIntArray175[Static51.anInt1369] = local54;
					Static160.anIntArray186[Static51.anInt1369] = local10.anInt4619 + 2048;
					Static51.anInt1369++;
					local49.anInt4625++;
				}
			}
		}
		Static125.method6343(Static160.anIntArray186, Static51.anInt1369 - 1, 0, Static150.anIntArray175);
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	public static void method1408(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = PlayerList.anInt751;
		@Pc(3) int[] local3 = PlayerList.anIntArray121;
		for (@Pc(5) int local5 = 0; local5 < local1 + NpcList.size; local5++) {
			@Pc(15) PathingEntity local15;
			if (local5 < local1) {
				local15 = PlayerList.players[local3[local5]];
			} else {
				local15 = NpcList.npcs[NpcList.ids[local5 - local1]];
			}
			if (local15.plane == arg0 && local15.anInt4638 >= 0) {
				@Pc(35) int local35 = local15.getSize();
				if ((local35 & 0x1) == 0) {
					if ((local15.xFine & 0x7F) != 0 || (local15.zFine & 0x7F) != 0) {
						continue;
					}
				} else if ((local15.xFine & 0x7F) != 64 || (local15.zFine & 0x7F) != 64) {
					continue;
				}
				@Pc(71) int local71;
				@Pc(76) int local76;
				@Pc(112) int local112;
				if (local35 == 1) {
					local71 = local15.xFine >> 7;
					local76 = local15.zFine >> 7;
					if (local15.anInt4638 > Static319.anIntArrayArray51[local71][local76]) {
						Static319.anIntArrayArray51[local71][local76] = local15.anInt4638;
						Static301.anIntArrayArray50[local71][local76] = 1;
					} else if (local15.anInt4638 == Static319.anIntArrayArray51[local71][local76]) {
						local112 = Static301.anIntArrayArray50[local71][local76]++;
					}
				} else {
					local71 = (local35 - 1) * 64 + 60;
					local76 = local15.xFine - local71 >> 7;
					@Pc(138) int local138 = local15.zFine - local71 >> 7;
					@Pc(145) int local145 = local15.xFine + local71 >> 7;
					@Pc(152) int local152 = local15.zFine + local71 >> 7;
					for (@Pc(154) int local154 = local76; local154 <= local145; local154++) {
						for (@Pc(157) int local157 = local138; local157 <= local152; local157++) {
							if (local15.anInt4638 > Static319.anIntArrayArray51[local154][local157]) {
								Static319.anIntArrayArray51[local154][local157] = local15.anInt4638;
								Static301.anIntArrayArray50[local154][local157] = 1;
							} else if (local15.anInt4638 == Static319.anIntArrayArray51[local154][local157]) {
								local112 = Static301.anIntArrayArray50[local154][local157]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	public static void method1409(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = PlayerList.anInt751;
		@Pc(3) int[] local3 = PlayerList.anIntArray121;
		@Pc(11) int local11 = Static47.nonpcs ? local1 : local1 + NpcList.size;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) PathingEntity local23;
			if (local13 < local1) {
				local23 = PlayerList.players[local3[local13]];
			} else {
				local23 = NpcList.npcs[NpcList.ids[local13 - local1]];
			}
			if (local23.plane == arg0) {
				local23.anInt4625 = 0;
				if (local23.anInt4638 < 0) {
					local23.aBoolean320 = false;
				} else {
					@Pc(50) int local50 = local23.getSize();
					if ((local50 & 0x1) == 0) {
						if ((local23.xFine & 0x7F) != 0 || (local23.zFine & 0x7F) != 0) {
							local23.aBoolean320 = false;
							continue;
						}
					} else if ((local23.xFine & 0x7F) != 64 || (local23.zFine & 0x7F) != 64) {
						local23.aBoolean320 = false;
						continue;
					}
					@Pc(92) int local92;
					@Pc(97) int local97;
					@Pc(122) int local122;
					if (local50 == 1) {
						local92 = local23.xFine >> 7;
						local97 = local23.zFine >> 7;
						if (local23.anInt4638 != Static319.anIntArrayArray51[local92][local97]) {
							local23.aBoolean320 = true;
							continue;
						}
						if (Static301.anIntArrayArray50[local92][local97] > 1) {
							local122 = Static301.anIntArrayArray50[local92][local97]--;
							local23.aBoolean320 = true;
							continue;
						}
					} else {
						local92 = (local50 - 1) * 64 + 60;
						local97 = local23.xFine - local92 >> 7;
						@Pc(151) int local151 = local23.zFine - local92 >> 7;
						@Pc(158) int local158 = local23.xFine + local92 >> 7;
						@Pc(165) int local165 = local23.zFine + local92 >> 7;
						if (!Static360.method5650(local23.anInt4638, local151, local165, local158, local97)) {
							for (@Pc(176) int local176 = local97; local176 <= local158; local176++) {
								for (@Pc(179) int local179 = local151; local179 <= local165; local179++) {
									if (local23.anInt4638 == Static319.anIntArrayArray51[local176][local179]) {
										local122 = Static301.anIntArrayArray50[local176][local179]--;
									}
								}
							}
							local23.aBoolean320 = true;
							continue;
						}
					}
					if (local23 instanceof Player && local23.aClass2_Sub6_3 != null && client.cycle >= local23.aClass2_Sub6_3.anInt1100 && client.cycle < local23.aClass2_Sub6_3.anInt1118) {
						((Player) local23).aBoolean275 = false;
					}
					local23.aBoolean320 = false;
					local23.anInt6782 = Scene.getTileHeight(local23.xFine, local23.zFine, local23.plane);
					Static329.method5630(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1410() {
		@Pc(1) int local1 = PlayerList.anInt751;
		@Pc(3) int[] local3 = PlayerList.anIntArray121;
		@Pc(11) int local11 = Static47.nonpcs ? local1 : local1 + NpcList.size;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) PathingEntity local23;
			if (local13 < local1) {
				local23 = PlayerList.players[local3[local13]];
			} else {
				local23 = NpcList.npcs[NpcList.ids[local13 - local1]];
			}
			if (local23.anInt4638 >= 0) {
				@Pc(39) int local39 = local23.getSize();
				if ((local39 & 0x1) == 0) {
					if ((local23.xFine & 0x7F) == 0 && (local23.zFine & 0x7F) == 0) {
						continue;
					}
				} else if ((local23.xFine & 0x7F) == 64 && (local23.zFine & 0x7F) == 64) {
					continue;
				}
				if (local23 instanceof Player && local23.aClass2_Sub6_3 != null && client.cycle >= local23.aClass2_Sub6_3.anInt1100 && client.cycle < local23.aClass2_Sub6_3.anInt1118) {
					((Player) local23).aBoolean275 = false;
				}
				local23.anInt6782 = Scene.getTileHeight(local23.xFine, local23.zFine, local23.plane);
				Static329.method5630(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!nk;)Lclient!nk;")
	public static Component method1413(@OriginalArg(0) Component arg0) {
		@Pc(4) int local4 = InterfaceList.getServerActiveProperties(arg0).method1850();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = InterfaceList.getComponent(arg0.layer);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}
}
