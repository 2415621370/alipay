package com.sihai.utils;

public class AlipayConfig {

	public static String app_id = "2016091900547822";//�ں�̨��ȡ���������ã�
	
	public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCyQHaseKZDe2C9uQwUmZHutL3b6JQcCqdT71W65RY+ZoXjv9105TfhffwrGGITEY+xbXgJovWOi/jON/O7pAxFmH5kw2R7zuyR06uhPFe3oH+bPwayKiD7C/Uij7lTRZjTbH0pffZCT5SqCGEZNVhDfCG3RfUpSgv/jOTo73p/b3mLq0DMYOZQal5FCzH9CLFWqiP51C+I5ZtA+GJU/XIUpA5hln8qlGH4JHYE4j6caXFSDowAPlI8qd/qtY9IbZezi6j29QCLrGKYmVx8hosmu/V0EiPFCkJ7BzB8V+h3G0Dqd9GV/jZB+et3Ju/CN6yyH/N+/3cbKorogiQWOciXAgMBAAECggEAP5L6QH0vX3YLhN8QzfAPukFATcRfvriWATulKek2y76pFheCFoUCLyxN2djycbabtz5Bx74VMmf9rx8JkOzra4791VZS6k1c1o3V8sWgy18049vQuY6JAMC9BzyXbnmuDgntgfTo9bGIZjRi3SjHeBo3tDQBQl6kdNp9cg6nc/dm1wUPXKnTuN7n3DT9GUn8AnGduC6zMhN/iblO5tetDPWzRMrcwodeeUZrDOq36dsjTWySGDiYR57jGIxklaWINAVldpCYw8LGP2SSKcweIDRp+BrWQZJNZNZnI1mqzlZOeLqyZy0LkcLiN5bHlAn0+uMkOFCmTNKtmnB5CSPe4QKBgQDvWu+4p912CzFbohu5vyA+hNeMCCuwYqETxFi9rAoTxPbznx4JGWINgAShBaSU7GTPmZkUuzbYOZntvWmjzCsz+/l7g77e3fp603PwRzXEBANrpwNz31XZfM2CmDn8WQHKVcKzuCIxu3OLzvreDVZwLohB6AEd6v28EH1bjUvuTwKBgQC+pb+aFelxxjDJvOIX8iC6tMJcQYSfpcRpuhQw75ZAtgdONVZWrzcui5Dg5gf3It/tvts9hS4y118foqVBs6etrBNPr/8Mcu4C/uv4uQZ6YMr1TbHZ4lNGMindRgs8Ze9EFEoZkyBwkouswZeyK9lnvp/UgwdjZstqRGb3QwV3OQKBgGanHoaYX89/j2SYSsHH6YFGodbprisQsbpzjAeUoCHIaI0lYdFPNJFLpTCV5fcEx1uNqWyNukDTu2ONx5+7MZAy8dV6NEMK+qDwzRlwwOtXOUxTLZTlZMFI2C65MK08Uxs+2qkPQIMJvM1qMIdJOxgTrNZvNQNqw/WDMPAx0i3bAoGBAJSELqTsmPUm/e7KlB8vYkvQcPDJoXV0/3OVoBEXM6eppjtI1b+ls4kw9GYfDOl7Y5Kj8csVKw40NUhBvhdWyzNCL7EOW9Po3H289TrHeMJxEOrT4c7ovxKaFX7pB+u/RQt1+tu9f7Hyl5i3H2OPQUfOelhk0qae96wLKWNJ9MIRAoGACw6jNukGeuahEpfhk1d4ToOOqfc2xIcFOudRqU8VVM6WaPI4tEDsGcwA3fYIPldBLux211K44bYuMHcgOjPOM94u6HzWKAC3iDzOnyPKgKz1/Y34+GpRTpO0H2HTMg8OW+GpzfkV2KURMqerxdzFmJmacFM5WF1aHu7HwZ+gecM=";//�̳̲鿴��ȡ��ʽ���������ã�

	public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhMZSF4SoEJeBHH8+80V/x06Ez2p5A7Zw2k78zgJZ/vyX5k/0WAzFsz/zkTpKcuhLa21u6CsNkoa+KMtNP2MUpdAGeQufkH2dHtxMvnh1cdEN6MxGYkQZLNrvMWIM4zWcQ8p9OBlgcoaAEglSDglcDBB9MKaI47wOYIv5ozGxf7+b3BWUrNtiY9wHHfUA4C/fystAt7or24MKmTJop+rg4aTsTBCgBsDIBlYRaoMkWhgEaysxufIIyP71z6lCGxxjItkM18Se8xXhuzKrHwerqYYzcgAMvCXeFAKhRM0PFWuSfhjg5W6zV17jOkhPNA06n025oPJnr3ECzlETKN0rDQIDAQAB";//�̳̲鿴��ȡ��ʽ���������ã�

	/**
	 * 异步回调通知URL
	 */
	public static String notify_url = "http://localhost:8080/alipay/alipayNotifyNotice.action";


	/**
	 * 同步回调通知URL
	 */
	public static String return_url = "http://localhost:8080/alipay/alipayReturnNotice.action";
	
	public static String sign_type = "RSA2";
	
	public static String charset = "utf-8";
	
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";//ע�⣺ɳ����Ի�������ʽ����Ϊ��https://openapi.alipay.com/gateway.do
}
