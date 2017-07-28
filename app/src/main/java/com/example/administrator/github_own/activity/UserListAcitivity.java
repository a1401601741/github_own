package com.example.administrator.github_own.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.administrator.github_own.R;
import com.example.administrator.github_own.base.BaseActivity;
import com.example.administrator.github_own.component.AppComponent;
import com.example.administrator.github_own.widget.MarkDownView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/7/27 0027.
 */

public class UserListAcitivity extends BaseActivity {


    @Bind(R.id.mdv_markdown)
    MarkDownView mMdvMarkdown;

    private String s;
    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, UserListAcitivity.class));
    }


    @Override
    protected void configViews() {
        mMdvMarkdown.setText(s);
    }

    @Override
    protected void initDatas() {
         s = "IyAzNjAtQ2FwdHVyZS1TREsKVGhpcyBpcyBhIGRldmVsb3BlciBmb2N1c2Vk" +
                "\nIFNESyB0aGF0IGFsbG93cyBnYW1lIGFuZCB2aXJ0dWFsIHJlYWxpdHkgZGV2" +
                "\nZWxvcGVycyB0byBiZSBhYmxlIHRvIGVhc2lseSBhbmQgcXVpY2tseSBpbnRl" +
                "\nZ3JhdGUgMzYwIHBob3RvL3ZpZGVvIGNhcHR1cmUgY2FwYWJpbGl0eSBpbnRv" +
                "\nIHRoZWlyIGFwcGxpY2F0aW9ucy4KCiMgQ29yZSBGZWF0dXJlcyBTdXBwb3J0" +
                "\nZWQKVGhpcyBTREsgZW5hYmxlcyB5b3UgdG8gY2FwdHVyZSwgcmVjb3JkLCBh" +
                "\nbmQgZW5jb2RlIDM2MCBwaG90b3MgYW5kIHZpZGVvcyB3aXRoIHRoZSByZWxl" +
                "\ndmFudCBtZXRhZGF0YSBuZWNlc3NhcnkgZm9yIGRldGVjdGlvbi4gCgpGb3Ig" +
                "\ncGhvdG8gY2FwdHVyZSwgaXQgd2lsbCBzYXZlIHRoZSBjYXB0dXJlZCAzNjAg" +
                "\ncGhvdG8gSlBFRyB0byBhIGZvbGRlciBvbiBkaXNrIHdpdGggcmVsZXZhbnQg" +
                "\ncGhvdG9zcGhlcmUgbWV0YWRhdGEgYWRkZWQuCkZvciB2aWRlbyBjYXB0dXJl" +
                "\nLCBpdCB3aWxsIHNhdmUgdGhlIGNhcHR1cmVkIDM2MCB2aWRlbyBNUDQgdG8g" +
                "\nYSBmb2xkZXIgb24gZGlzayAobWV0YWRhdGEgY29taW5nIHNvb24sIGZvciBu" +
                "\nb3cgeW91IGNhbiBpbmplY3QgdGhlIG1ldGFkYXRhIG1hbnVhbGx5KS4KCldl" +
                "\nIHJlY29yZCB0aGUgZGVmYXVsdCBhdWRpbyBvdXRwdXQgZnJvbSBzcGVha2Vy" +
                "\ncyBhbmQgbXV4IGl0IHdpdGggdGhlIDM2MCB2aWRlbyBjYXB0dXJlZCBvbiBz" +
                "\nY3JlZW4gdG8gY3JlYXRlIGFuIG91dHB1dCBtcDQuCgojIEdhbWUgRW5naW5l" +
                "\nIENvbXBhdGliaWxpdHkKT3VyIFNESyBzb2x1dGlvbiBjYW4gYmUgaW50ZWdy" +
                "\nYXRlZCBpbnRvIAoxLiBVbml0eQoyLiBVbnJlYWwKMy4gQ3VzdG9tIG5hdGl2" +
                "\nZSBlbmdpbmVzCgojIEhhcmR3YXJlIENvbXBhdGliaWxpdHkKV2Ugc3VwcG9y" +
                "\ndCBib3RoIEFNRCBhbmQgTlZJRElBIEdQVSBoYXJkd2FyZSBpbiB0ZXJtcyBv" +
                "\nZiBjb21wYXRpYmlsaXR5IHdpdGggdGhpcyBTREsuIEZvciBkZXRhaWxzLCBw" +
                "\nbGVhc2Ugc2VlIHRoZSBiZWxvdyBkZXRhaWxlZCBzcGVjcy4KCiMjIERldGFp" +
                "\nbGVkIEhhcmR3YXJlIENvbXBhdGliaWxpdHkKKiAqKk5WaWRpYSoqCiAgICAq" +
                "\nIE9wZXJhdGluZyBTeXN0ZW06IFdpbmRvd3MgNywgOCwgMTAsIFNlcnZlciAy" +
                "\nMDA4IFIyLCBTZXJ2ZXIgMjAxMgogICAgKiBHUFU6IE5WSURJQSBRdWFkcm8s" +
                "\nIFRlc2xhLCBHUklEIG9yIEdlRm9yY2UgcHJvZHVjdHMgd2l0aCBLZXBsZXIs" +
                "\nIE1heHdlbGwgYW5kIFBhc2NhbCBnZW5lcmF0aW9uIEdQVXMuIAogICAgKiBO" +
                "\nVmlkaWEgV2luZG93cyBkaXNwbGF5IGRyaXZlcjogMzc1Ljk1IG9yIG5ld2Vy" +
                "\nCgoKKiAqKkFNRCoqCiAgICAqIE9wZXJhdGluZyBTeXN0ZW06IFdpbmRvd3Mg" +
                "\nNywgOCwgMTAKICAgICogR1BVOiBBTUQgR1BVcyBzdXBwb3J0aW5nIGZvbGxv" +
                "\nd2luZyBkcml2ZXIKICAgICogQU1EIFdpbmRvd3MgZGlzcGxheSBkcml2ZXI6" +
                "\nIEFNRCBSYWRlb24gU29mdHdhcmUgQ3JpbXNvbiAxNy4xLjEgb3IgbGF0ZXIK" +
                "\nCiMgU3VwcG9ydGVkIFJlc29sdXRpb25zIGZvciBDYXB0dXJlIE91dHB1dApX" +
                "\nZSd2ZSB0ZXN0ZWQgYW5kIGZvdW5kIG91ciBTREsgY2FuIGNhcHR1cmUgNEsg" +
                "\nMzYwIHZpZGVvcyBpbiByZWFsdGltZS4gWW91IGNhbiBhZGp1c3QgdGhlIHJl" +
                "\nc29sdXRpb24gY2FwdHVyZSBzZXR0aW5ncyBmb3IgcGhvdG9zIGFuZCB2aWRl" +
                "\nb3MgdG8gdGVzdCBob3cgaXQgd29ya3Mgd2l0aCB5b3VyIHRpdGxlLgoKIyBI" +
                "\nb3cgdG8gaW50ZWdyYXRlCgojIyBVbml0eQpXZSd2ZSBwcm92aWRlZCBhIHNh" +
                "\nbXBsZSBpbnRlZ3JhdGlvbiBpbnRvIFVuaXR5IHNob3dpbmcgaG93IHlvdSBt" +
                "\nYXkgdXNlIHRoZSBTREsgdG8gY2FwdHVyZSBhbmQgcmVjb3JkIDM2MCBwaG90" +
                "\nb3MvdmlkZW9zIHdpdGggYSBzaW1wbGUgc2NlbmUuCgpPbmNlIHlvdSBvcGVu" +
                "\nIHRoZSBVbml0eSBzYW1wbGUgcHJvamVjdCBpbiBVbml0eSwgeW91IHdpbGwg" +
                "\nYmUgYWJsZSB0byBmaW5kIOKAnEVuY29kZVBhY2thZ2XigJ0gYW5kIGl0IGlu" +
                "\nY2x1ZGVzIGV2ZXJ5dGhpbmcgd2UgbmVlZCBmb3IgMzYwIGFuZCByZWN0aWxp" +
                "\nbmVhciBjYXB0dXJpbmcgYW5kIGVuY29kaW5nLiBUbyBzZXQgdXAgZW5jb2Rl" +
                "\nIGVudmlyb25tZW50LCB5b3UgbmVlZCB0byBwbGFjZSB0aGUgRW5jb2Rlck9i" +
                "\namVjdCBwcmVmYWIgaW4gdGhlIHNjZW5lIHdoZXJlIHlvdSB3YW50IHRvIHVz" +
                "\nZSBpdCBhcyBhIHNwZWN0YXRvci4KVGhlbiB5b3UgY2FuIHNlbGVjdCBvcHRp" +
                "\nb24gaW4g4oCYQ2FwdHVyZU9wdGlvbi5jc+KAmSB0byBkZXRlcm1pbmUgd2hl" +
                "\ndGhlciB0byBjYXB0dXJlIGluIDM2MCBvciBhcyBhIHN0YW5kYXJkIHJlY3Rp" +
                "\nbGluZWFyLgoKVGhlIEFQSXMgaW4gVW5pdHkgU2NyaXB0IGxheWVyIGFyZSBw" +
                "\ncmV0dHkgc2ltcGxlIHJlZ2FyZGxlc3Mgb2Ygd2hhdCBHUFUgeW91IGFyZSB1" +
                "\nc2luZy4KClRoZSBwbHVnaW4gcHJvdmlkZXMgdHdvIGZ1bmN0aW9ucyBpbiBV" +
                "\nbml0eSBzY3JpcHQgbGF5ZXIgZm9yIHZpZGVvIGVuY29kaW5nIGFuZCB0aGUg" +
                "\nZnVuY3Rpb25zIHdpbGwgY2FsbCB0aGUgcHJvcGVyIGNvZGVjIEFQSXMgaW4g" +
                "\nYmFja2VuZCBkZXBlbmRpbmcgb24gR1BVcy4gQWxsIGZ1bmN0aW9ucyBuZWVk" +
                "\nZWQgZm9yIGVuY29kaW5nIGFyZSBtYW5hZ2VkIGJ5IHRoZSBiYWNrZW5kLiAK" +
                "\nCkJhc2ljYWxseSwgdGhlIHZpZGVvIGlzIGVuY29kZWQgd2l0aCBhIFJlbmRl" +
                "\nclRleHR1cmUgYW5kIHdlIG5lZWQgdG8gYXR0YWNoIHRoZSBSZW5kZXJUZXh0" +
                "\ndXJlIGFzIGEgdGFyZ2V0IHRleHR1cmUgb24gdGhlIGNhbWVyYSBvZiBjaGls" +
                "\nZCBvYmplY3QgaW4gdGhlIEVuY29kZXJPYmplY3QgcHJlZmFiLiBXZSBjYW4g" +
                "\ncGxhY2UgdGhlIHBsdWdpbiBwb3NpdGlvbiB3aGVyZSB3ZSB3YW50IHRvIHVz" +
                "\nZSBhcyBzcGVjdGF0b3IuIElmIHdlIHdhbnQgdG8gY2hhbmdlIHZpZGVvIHJl" +
                "\nc29sdXRpb24sIGl0IGFsaWducyB3aXRoIOKAnEV4dGVybmFsIFdpZHRo4oCd" +
                "\nIGFuZCDigJxFeHRlcm5hbCBIZWlnaHTigJ0gdmFsdWVzIGluIExpdmVTdXJy" +
                "\nb3VuZENhcHR1cmUuY3MgYW5kIE5vblN1cnJvdW5kQ2FwdHVyZS5jcy4KCkZv" +
                "\nciBBdWRpbywgd2UgbmVlZCB0byByZWNvcmQgY29uc2lzdGVudGx5IHdoaWxl" +
                "\nIGdhbWUgaXMgcnVubmluZyBhbmQgd2UgbXVzdCBjYWxsIHRoZSBhdWRpb0Vu" +
                "\nY29kaW5nIGZ1bmN0aW9uIGV2ZXJ5IGZyYW1lIHRvIGtlZXAgd3JpdGluZyBh" +
                "\ndWRpbyBkYXRhIGludG8gYnVmZmVyLgpgYGAKcHJpdmF0ZSBzdGF0aWMgZXh0" +
                "\nZXJuIHZvaWQgYXVkaW9FbmNvZGluZygpOwpgYGAKVGhlIHN0YXJ0RW5jb2Rp" +
                "\nbmcgZnVuY3Rpb24gaXMgZm9yIHBhc3NpbmcgUmVuZGVyVGV4dHVyZSB0byBu" +
                "\nYXRpdmUgZW5jb2RlciBsYXllciBmb3IgZW5jb2RpbmcgdmlkZW8uIElmIHdl" +
                "\nIHdhbnQgdG8gZW5jb2RlIHZpZGVvIHdpdGggMzAgZnBzLCB3ZSBuZWVkIHRv" +
                "\nIHNldCBjYWxsaW5nIGl0IGJ5IDMwIGZwcyBhcyBpbXBsZW1lbnRlZCBpbiDi" +
                "\ngJxTdXJyb3VuZENhcHR1cmUuY3PigJ0gYW5kIOKAnE5vblN1cnJvdW5kQ2Fw\ndHVyZS5jc" +
                "+KAnS4KYGBgCnByaXZhdGUgc3RhdGljIGV4dGVybiB2b2lkIHN0" +
                "\nYXJ0RW5jb2RpbmcoSW50UHRyIHRleHR1cmUsIFN0cmluZyBwYXRoLCBib29s" +
                "\nIGlzTGl2ZSwgYm9vbCBuZWVkc0ZsaXBwaW5nKTsKYGBgClRoZSBzdG9wRW5j" +
                "\nb2RpbmcgZnVuY3Rpb24gaXMgZm9yIGZsdXNoaW5nIGFsbCBpbnB1dHMgd2hp" +
                "\nY2ggd2VyZSBzdGFja2VkIGluIGlucHV0IGJ1ZmZlcnMgYW5kIGl0IG5lZWRz" +
                "\nIHRvIGJlIGNhbGxlZCBvbmNlIHdoZW4gd2Ugd2FudCB0byBzdG9wIGVuY29k" +
                "\naW5nCmBgYApwcml2YXRlIHN0YXRpYyBleHRlcm4gdm9pZCBzdG9wRW5jb2Rp" +
                "\nbmcoKTsKYGBgClRoZSBtdXhpbmdEYXRhIGZ1bmN0aW9uIGlzIGZvciBtdXhp" +
                "\nbmcgYXVkaW8gYW5kIHZpZGVvIGludG8gbXA0IGFuZCBmaW5hbCB2aWRlbyBm" +
                "\naWxlIGlzIGdlbmVyYXRlZCB3aXRoIHRoZSBmdW5jdGlvbi4gSXQgc2hvdWxk" +
                "\nIGJlIGNhbGxlZCBhZnRlciBzdG9wRW5jb2RpbmcgZnVuY3Rpb24uCmBgYApw" +
                "\ncml2YXRlIHN0YXRpYyBleHRlcm4gdm9pZCBtdXhpbmdEYXRhKCk7CmBgYApU" +
                "\naGUgc2F2ZVNjcmVlblNob3QgaXMgZm9yIHRha2luZyBzY3JlZW5zaG90LiBJ" +
                "\nZiB5b3Ugd2FudCB0byB0YWtlIGEgc2NyZWVuc2hvdCwganVzdCBjYWxsIHRo" +
                "\naXMgZnVuY3Rpb24gYW55dGltZS4KYGBgCnByaXZhdGUgc3RhdGljIGV4dGVy" +
                "\nbiB2b2lkIHNhdmVTY3JlZW5zaG90KEludFB0ciB0ZXh0dXJlLCBzdHJpbmcg" +
                "\ncGF0aCwgYm9vbCBuZWVkc0ZsaXBwaW5nKTsKYGBgCiMjIE5hdGl2ZSBFbmdp" +
                "\nbmUgSW50ZWdyYXRpb24gKEludGVyZmFjZSBhbmQgRExML0xpYiB0byBiZSB1" +
                "\ncGxvYWRlZCBzb29uKQpGaXJzdCB3ZSBuZWVkIHRvIHBhc3MgZHgxMSBkZXZp" +
                "\nY2UgcG9pbnRlciB0byBkbGwgYW5kIGl0IHdpbGwgYmUgdXNlZCBmb3Igc2V0" +
                "\ndGluZyB0aGUgcmVsZXZhbnQgZW5jb2RpbmcgU0RLIGZvciB5b3VyIGhhcmR3" +
                "\nYXJlIChBTUQgdnMgTlZJRElBKS4KYGBgCi8qKgoJKiBBbGxvY2F0ZSBJRDNE" +
                "\nMTFEZXZpY2UgZ290IGZyb20gYXBwbGljYXRpb24gdG8gcGFzcyB2aWRlbyBl" +
                "\nbmNvZGVyIGFwaXMKCSogLSBJdCBuZWVkcyB0byBiZSBjYWxsZWQgYmVmb3Jl" +
                "\nIHN0YXJ0RW5jb2RpbmcoKSBhcyBvbmUgcGFydCBvZiBpbml0aWFsaXphdGlv" +
                "\nbgoJKi8KCURsbEV4cG9ydCB2b2lkIFNldEdyYXBoaWNzRGV2aWNlKElEM0Qx" +
                "\nMURldmljZSogZGV2aWNlKTsKYGBgCkFzIG1lbnRpb25lZCBpbiBhYm92ZSBV" +
                "\nbml0eSBwYXJ0LCB3ZSB3YW50IHRvIGNhbGwgQXVkaW9FbmNvZGluZygpIGZ1" +
                "\nbmN0aW9uIGV2ZXJ5IGZyYW1lIGJ5IHRoZSBzYW1lIHRva2VuLgpgYGAKLyoq" +
                "\nCgkqIENhcHR1cmUgYXVkaW8KCSogLSBJdCBuZWVkcyB0byBiZSBjYWxsZWQg" +
                "\nZXZlcnkgZnJhbWUKCSogLSBJdCB3aWxsIGdlbmVyYXRlIHdhdiBmaWxlCgkq" +
                "\nLwoJRGxsRXhwb3J0IHZvaWQgQXVkaW9FbmNvZGluZygpOwpgYGAKVGhpcyBm" +
                "\ndW5jdGlvbiBpcyBmb3IgY2FwdHVyaW5nIHNjcmVlbiBhbmQgd2UgbmVlZCB0" +
                "\nbyBwYXNzIHRleHR1cmUgcG9pbnRlcih2b2lkIHBvaW50ZXIpIGJhc2VkIG9u" +
                "\nIDMwIGZwcyBhcyB3ZSB3YW50IHRvIGdldCAzMCBmcHMgbW92aWUuIFRoZSB0" +
                "\nZXh0dXJlIG5lZWRzIHRvIGJlIHRoZSBjb250ZW50IHlvdSB3YW50IHRvIGVu" +
                "\nY29kZSBhcyBhIHZpZGVvLCBzbyBpdCBzaG91bGQgYWxyZWFkeSBiZSBpbiB0" +
                "\naGUgZm9ybWF0IG9mIGEgMzYwIHZpZGVvIChlcXVpcmVjdGFuZ3VsYXIgb3Ig" +
                "\nY3ViZW1hcCkuIFNlZSBkZXRhaWxzIGJlbG93IGZvciB0ZXh0dXJlIGZvcm1h" +
                "\ndHMgYW5kIGhvdyB0byBjb252ZXJ0IHRoZW0uCmBgYAovKioKCSogQ2FwdHVy" +
                "\nZSBTY3JlZW4gYW5kIGVuY29kZSB0byBoMjY0CgkqIC0gSXQgbmVlZHMgdG8g" +
                "\nYmUgcmVndWxhcmx5IGNhbGxlZCBiYXNlZCBvbiAzMCBmcHMKCSogIGV4KQoJ" +
                "\nKiAgICAgIGZsb2F0IGZwcyA9IDFmIC8gMzAuMGY7CgkqICAgICAgZnBzVGlt" +
                "\nZXIgKz0gVGltZS5kZWx0YVRpbWU7CgkqICAgICAgaWYoZnBzVGltZXIgPj0g" +
                "\nZnBzKXsgZnBzVGltZXIgPSAwLjBmOyAgc3RhcnRFbmNvZGluZyguLi4pOyB9" +
                "\nCgkqCgkqIEBwYXJhbSB0ZXh0dXJlUHRyICAgICAgIElEM0QxMVRleHR1cmUy" +
                "\nRCB0byBlbmNvZGUgaDI2NAoJKiBAcGFyYW0gZnVsbFNhdmVQYXRoICAgICB2" +
                "\naWRlbyBzYXZlIGZvbGRlciBwYXRoIGluY2x1ZGluZyBmaWxlIG5hbWUKCSog" +
                "\nQHBhcmFtIGlzTGl2ZQkJCSAgU2VsZWN0IHdoZXRoZXIgdG8gYmUgbGl2ZSBv" +
                "\nciBWT0QuIChJdCBzaG91bGQgYmUgZmFsc2Ugbm93IHNpbmNlIGxpdmUgaXNu" +
                "\nJ3Qgc3VwcG9ydCB5ZXQpCgkqIEBwYXJhbSBuZWVkRmxpcHBpbmcJICB0cnVl" +
                "\nIGlmIHlvdSB3YW50IHRvIGZsaXAgcGl4ZWxzIHZlcnRpY2FsbHkKCSovCglE" +
                "\nbGxFeHBvcnQgdm9pZCBTdGFydEVuY29kaW5nKGNvbnN0IHZvaWQqIHRleHR1" +
                "\ncmVQdHIsIGNvbnN0IFRDSEFSKiBmdWxsU2F2ZVBhdGgsIGJvb2wgaXNMaXZl" +
                "\nLCBib29sIG5lZWRGbGlwcGluZyk7CmBgYApJdCB3aWxsIHN0b3AgZW5jb2Rp" +
                "\nbmcgYW5kIGNyZWF0ZSBtcDQgZmlsZSBieSBtdXhpbmcgaDI2NCBhbmQgYWFj" +
                "\nIGZpbGUuIFdlIG5lZWQgdG8gY2FsbCB0aGlzIGZ1bmN0aW9uIHdoZW4gd2Ug" +
                "\nd2FudCB0byBzdG9wIGVuY29kaW5nLgpgYGAKLyoqCgkqIEZsdXNoaW5nIGFs" +
                "\nbCBpbnB1dCB2aWRlbyBhbmQgYXVkaW8gZGF0YXMgYW5kIG11eCB0aGVtIGlu" +
                "\ndG8gbXA0CgkqIC0gSXQgbmVlZHMgdG8gYmUgY2FsbGVkIHdoZW4geW91IHdh" +
                "\nbnQgdG8gZmluaXNoIGVuY29kaW5nCgkqIC0gSXQgd2lsbCBnZW5lcmF0ZSBt" +
                "\ncDQgZmlsZQoJKi8KCURsbEV4cG9ydCB2b2lkIFN0b3BFbmNvZGluZygpOwpg" +
                "\nYGAKSXQgd2lsbCB0YWtlIHNjcmVlbnNob3QgYW5kIHlvdSBzaG91bGQgc2V0" +
                "\nIGZpbGUgZm9ybWF0IGFzIEpQRUcgZm9yIHRoZSBmdWxsU2F2ZVBhdGggcGFy" +
                "\nYW1ldGVyLiBOb3RlIHRoYXQgbWV0YWRhdGEgZm9yIDM2MCBpbWFnZSByZWNv" +
                "\nZ25pdGlvbiBpbiBGQiBmZWVkIGlzIGluamVjdGVkIGJ5IGRlZmF1bHQuIFNv" +
                "\nIHlvdSBjYW4gdXBsb2FkIHRoZSBpbWFnZSBpbiBGQiBhcyAzNjAgaW1hZ2Uu" +
                "\nCmBgYAovKioKCSogVGFrZSBTY3JlZW5zaG90CgkqIC0gRmlsZSBmb3JtYXQg" +
                "\nc2hvdWxkIGJlIEpQRUcKCSogQHBhcmFtIHRleHR1cmVQdHIgICAgICAgSUQz" +
                "\nRDExVGV4dHVyZTJEIHRoYXQgeW91IHdhbnQgdG8gY2FwdHVyZSBhbmQgZW5j" +
                "\nb2RlIHRvIGpwZWcKCSogQHBhcmFtIGZ1bGxTYXZlUGF0aCAgICAgaW1hZ2Ug" +
                "\nc2F2ZSBmb2xkZXIgcGF0aCBpbmNsdWRpbmcgZmlsZSBuYW1lCgkqIEBwYXJh" +
                "\nbSBuZWVkRmxpcHBpbmcJICB0cnVlIGlmIHlvdSB3YW50IHRvIGZsaXAgcGl4" +
                "\nZWxzIHZlcnRpY2FsbHkKCSovCglEbGxFeHBvcnQgdm9pZCBTYXZlU2NyZWVu" +
                "\nU2hvdChjb25zdCB2b2lkKiB0ZXh0dXJlUHRyLCBjb25zdCBUQ0hBUiogZnVs" +
                "\nbFNhdmVQYXRoLCBib29sIG5lZWRGbGlwcGluZyk7Cn07CmBgYAojIEpvaW4g" +
                "\ndGhlIDM2MCBDYXB0dXJlIFNESyBjb21tdW5pdHkKClBsZWFzZSB1c2Ugb3Vy" +
                "\nIGlzc3VlcyBwYWdlIHRvIGxldCB1cyBrbm93IG9mIGFueSBwcm9ibGVtcyBv" +
                "\nciBmZWVkYmFjay4gSWYgeW91IGFyZSB3b3JraW5nIG9uIGEgcHJvamVjdCB1" +
                "\nc2luZyB0aGUgMzYwIENhcHR1cmUgU0RLLCBwbGVhc2UgcmVhY2ggb3V0IHRv" +
                "\nIGNnNDM5L2NwZ3VwdGFAZmIuY29tIGZvciBwb3RlbnRpYWwgb3Bwb3J0dW5p" +
                "\ndGllcyB0byBmZWF0dXJlIHlvdXIgd29yayBhcyBjcmVhdGVkIGJ5IHRoZSBT" +
                "\nREsuCgojIExpY2Vuc2UKCjM2MCBDYXB0dXJlIFNESyBpcyBCU0QtbGljZW5z" +
                "\nZWQuIFdlIGFsc28gcHJvdmlkZSBhbiBhZGRpdGlvbmFsIHBhdGVudCBncmFu\ndC4K\n";

    }

    @Override
    protected void initToolBar() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_user_list;
    }

    @Override
    protected void setupActivityComponent(AppComponent appComponent) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
