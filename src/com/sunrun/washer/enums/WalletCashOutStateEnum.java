package com.sunrun.washer.enums;

import java.util.HashMap;
import java.util.Map;

public enum WalletCashOutStateEnum {
	/**
	 * 1.提现申请中
	 */
	CASH_OUT_DO(1, "提现申请中"),
	/**
	 * 2.提现成功
	 */
	SUCCESS(2, "提现成功"),
	/**
	 * 3.提现失败
	 */
	FAIL(3, "提现失败");
	private Integer value;
	private String name;
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private WalletCashOutStateEnum(Integer value, String name) {
		this.value = value;
		this.name = name;
	}
	
	public static String getNameByValue(Integer value) {
		for (WalletCashOutStateEnum walletCashOutStateEnum : WalletCashOutStateEnum.values()) {
			if (walletCashOutStateEnum.getValue().equals(value)) {
				return walletCashOutStateEnum.getName();
			}
		}
		return "";
	}
    public static Map<Integer, String> getMap() {
        Map<Integer,String> map = new HashMap<Integer,String>();
        for (WalletCashOutStateEnum item : WalletCashOutStateEnum.values()) {
            map.put(item.getValue(), item.getName());
        }
        return map;
    }
}
