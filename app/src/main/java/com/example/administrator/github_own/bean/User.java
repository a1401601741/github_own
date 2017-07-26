package com.example.administrator.github_own.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/7/24 0024.
 */

public class User implements Serializable{

    /**
     * total_count : 1281
     * incomplete_results : false
     * items : [{"login":"facebook","id":69631,"avatar_url":"https://avatars3.githubusercontent
     * .com/u/69631?v=4","gravatar_id":"","url":"https://api.github.com/users/facebook",
     * "html_url":"https://github.com/facebook","followers_url":"https://api.github
     * .com/users/facebook/followers","following_url":"https://api.github
     * .com/users/facebook/following{/other_user}","gists_url":"https://api.github
     * .com/users/facebook/gists{/gist_id}","starred_url":"https://api.github
     * .com/users/facebook/starred{/owner}{/repo}","subscriptions_url":"https://api.github
     * .com/users/facebook/subscriptions","organizations_url":"https://api.github
     * .com/users/facebook/orgs","repos_url":"https://api.github.com/users/facebook/repos",
     * "events_url":"https://api.github.com/users/facebook/events{/privacy}",
     * "received_events_url":"https://api.github.com/users/facebook/received_events",
     * "type":"Organization","site_admin":false,"score":47.342133},
     * {"login":"facebook-github-bot","id":6422482,"avatar_url":"https://avatars3
     * .githubusercontent.com/u/6422482?v=4","gravatar_id":"","url":"https://api.github
     * .com/users/facebook-github-bot","html_url":"https://github.com/facebook-github-bot",
     * "followers_url":"https://api.github.com/users/facebook-github-bot/followers",
     * "following_url":"https://api.github.com/users/facebook-github-bot/following{/other_user}",
     * "gists_url":"https://api.github.com/users/facebook-github-bot/gists{/gist_id}",
     * "starred_url":"https://api.github.com/users/facebook-github-bot/starred{/owner}{/repo}",
     * "subscriptions_url":"https://api.github.com/users/facebook-github-bot/subscriptions",
     * "organizations_url":"https://api.github.com/users/facebook-github-bot/orgs",
     * "repos_url":"https://api.github.com/users/facebook-github-bot/repos",
     * "events_url":"https://api.github.com/users/facebook-github-bot/events{/privacy}",
     * "received_events_url":"https://api.github.com/users/facebook-github-bot/received_events",
     * "type":"User","site_admin":false,"score":31.606518},{"login":"wathiq-iq","id":16626260,
     * "avatar_url":"https://avatars2.githubusercontent.com/u/16626260?v=4","gravatar_id":"",
     * "url":"https://api.github.com/users/wathiq-iq","html_url":"https://github.com/wathiq-iq",
     * "followers_url":"https://api.github.com/users/wathiq-iq/followers",
     * "following_url":"https://api.github.com/users/wathiq-iq/following{/other_user}",
     * "gists_url":"https://api.github.com/users/wathiq-iq/gists{/gist_id}",
     * "starred_url":"https://api.github.com/users/wathiq-iq/starred{/owner}{/repo}",
     * "subscriptions_url":"https://api.github.com/users/wathiq-iq/subscriptions",
     * "organizations_url":"https://api.github.com/users/wathiq-iq/orgs","repos_url":"https://api
     * .github.com/users/wathiq-iq/repos","events_url":"https://api.github
     * .com/users/wathiq-iq/events{/privacy}","received_events_url":"https://api.github
     * .com/users/wathiq-iq/received_events","type":"User","site_admin":false,"score":28.235891},
     * {"login":"tawatchaizaball","id":5641646,"avatar_url":"https://avatars0.githubusercontent
     * .com/u/5641646?v=4","gravatar_id":"","url":"https://api.github.com/users/tawatchaizaball",
     * "html_url":"https://github.com/tawatchaizaball","followers_url":"https://api.github
     * .com/users/tawatchaizaball/followers","following_url":"https://api.github
     * .com/users/tawatchaizaball/following{/other_user}","gists_url":"https://api.github
     * .com/users/tawatchaizaball/gists{/gist_id}","starred_url":"https://api.github
     * .com/users/tawatchaizaball/starred{/owner}{/repo}","subscriptions_url":"https://api.github
     * .com/users/tawatchaizaball/subscriptions","organizations_url":"https://api.github
     * .com/users/tawatchaizaball/orgs","repos_url":"https://api.github
     * .com/users/tawatchaizaball/repos","events_url":"https://api.github
     * .com/users/tawatchaizaball/events{/privacy}","received_events_url":"https://api.github
     * .com/users/tawatchaizaball/received_events","type":"User","site_admin":false,"score":25
     * .450184},{"login":"darail","id":4320541,"avatar_url":"https://avatars1.githubusercontent
     * .com/u/4320541?v=4","gravatar_id":"","url":"https://api.github.com/users/darail",
     * "html_url":"https://github.com/darail","followers_url":"https://api.github
     * .com/users/darail/followers","following_url":"https://api.github
     * .com/users/darail/following{/other_user}","gists_url":"https://api.github
     * .com/users/darail/gists{/gist_id}","starred_url":"https://api.github
     * .com/users/darail/starred{/owner}{/repo}","subscriptions_url":"https://api.github
     * .com/users/darail/subscriptions","organizations_url":"https://api.github
     * .com/users/darail/orgs","repos_url":"https://api.github.com/users/darail/repos",
     * "events_url":"https://api.github.com/users/darail/events{/privacy}",
     * "received_events_url":"https://api.github.com/users/darail/received_events","type":"User",
     * "site_admin":false,"score":24.555264},{"login":"Facebook-DevC-Surabaya","id":12748731,
     * "avatar_url":"https://avatars2.githubusercontent.com/u/12748731?v=4","gravatar_id":"",
     * "url":"https://api.github.com/users/Facebook-DevC-Surabaya","html_url":"https://github
     * .com/Facebook-DevC-Surabaya","followers_url":"https://api.github
     * .com/users/Facebook-DevC-Surabaya/followers","following_url":"https://api.github
     * .com/users/Facebook-DevC-Surabaya/following{/other_user}","gists_url":"https://api.github
     * .com/users/Facebook-DevC-Surabaya/gists{/gist_id}","starred_url":"https://api.github
     * .com/users/Facebook-DevC-Surabaya/starred{/owner}{/repo}","subscriptions_url":"https://api
     * .github.com/users/Facebook-DevC-Surabaya/subscriptions","organizations_url":"https://api
     * .github.com/users/Facebook-DevC-Surabaya/orgs","repos_url":"https://api.github
     * .com/users/Facebook-DevC-Surabaya/repos","events_url":"https://api.github
     * .com/users/Facebook-DevC-Surabaya/events{/privacy}","received_events_url":"https://api
     * .github.com/users/Facebook-DevC-Surabaya/received_events","type":"User",
     * "site_admin":false,"score":21.59495},{"login":"ujjwalkarn","id":5948390,
     * "avatar_url":"https://avatars3.githubusercontent.com/u/5948390?v=4","gravatar_id":"",
     * "url":"https://api.github.com/users/ujjwalkarn","html_url":"https://github
     * .com/ujjwalkarn","followers_url":"https://api.github.com/users/ujjwalkarn/followers",
     * "following_url":"https://api.github.com/users/ujjwalkarn/following{/other_user}",
     * "gists_url":"https://api.github.com/users/ujjwalkarn/gists{/gist_id}",
     * "starred_url":"https://api.github.com/users/ujjwalkarn/starred{/owner}{/repo}",
     * "subscriptions_url":"https://api.github.com/users/ujjwalkarn/subscriptions",
     * "organizations_url":"https://api.github.com/users/ujjwalkarn/orgs",
     * "repos_url":"https://api.github.com/users/ujjwalkarn/repos","events_url":"https://api
     * .github.com/users/ujjwalkarn/events{/privacy}","received_events_url":"https://api.github
     * .com/users/ujjwalkarn/received_events","type":"User","site_admin":false,"score":21
     * .458122},{"login":"axbaretto","id":22206500,"avatar_url":"https://avatars3
     * .githubusercontent.com/u/22206500?v=4","gravatar_id":"","url":"https://api.github
     * .com/users/axbaretto","html_url":"https://github.com/axbaretto",
     * "followers_url":"https://api.github.com/users/axbaretto/followers",
     * "following_url":"https://api.github.com/users/axbaretto/following{/other_user}",
     * "gists_url":"https://api.github.com/users/axbaretto/gists{/gist_id}",
     * "starred_url":"https://api.github.com/users/axbaretto/starred{/owner}{/repo}",
     * "subscriptions_url":"https://api.github.com/users/axbaretto/subscriptions",
     * "organizations_url":"https://api.github.com/users/axbaretto/orgs","repos_url":"https://api
     * .github.com/users/axbaretto/repos","events_url":"https://api.github
     * .com/users/axbaretto/events{/privacy}","received_events_url":"https://api.github
     * .com/users/axbaretto/received_events","type":"User","site_admin":false,"score":21.095097},
     * {"login":"tom99098","id":2730741,"avatar_url":"https://avatars2.githubusercontent
     * .com/u/2730741?v=4","gravatar_id":"","url":"https://api.github.com/users/tom99098",
     * "html_url":"https://github.com/tom99098","followers_url":"https://api.github
     * .com/users/tom99098/followers","following_url":"https://api.github
     * .com/users/tom99098/following{/other_user}","gists_url":"https://api.github
     * .com/users/tom99098/gists{/gist_id}","starred_url":"https://api.github
     * .com/users/tom99098/starred{/owner}{/repo}","subscriptions_url":"https://api.github
     * .com/users/tom99098/subscriptions","organizations_url":"https://api.github
     * .com/users/tom99098/orgs","repos_url":"https://api.github.com/users/tom99098/repos",
     * "events_url":"https://api.github.com/users/tom99098/events{/privacy}",
     * "received_events_url":"https://api.github.com/users/tom99098/received_events",
     * "type":"User","site_admin":false,"score":20.995028},{"login":"leebyron","id":50130,
     * "avatar_url":"https://avatars3.githubusercontent.com/u/50130?v=4","gravatar_id":"",
     * "url":"https://api.github.com/users/leebyron","html_url":"https://github.com/leebyron",
     * "followers_url":"https://api.github.com/users/leebyron/followers",
     * "following_url":"https://api.github.com/users/leebyron/following{/other_user}",
     * "gists_url":"https://api.github.com/users/leebyron/gists{/gist_id}",
     * "starred_url":"https://api.github.com/users/leebyron/starred{/owner}{/repo}",
     * "subscriptions_url":"https://api.github.com/users/leebyron/subscriptions",
     * "organizations_url":"https://api.github.com/users/leebyron/orgs","repos_url":"https://api
     * .github.com/users/leebyron/repos","events_url":"https://api.github
     * .com/users/leebyron/events{/privacy}","received_events_url":"https://api.github
     * .com/users/leebyron/received_events","type":"User","site_admin":false,"score":20.238438},
     * {"login":"facebook201","id":7473916,"avatar_url":"https://avatars2.githubusercontent
     * .com/u/7473916?v=4","gravatar_id":"","url":"https://api.github.com/users/facebook201",
     * "html_url":"https://github.com/facebook201","followers_url":"https://api.github
     * .com/users/facebook201/followers","following_url":"https://api.github
     * .com/users/facebook201/following{/other_user}","gists_url":"https://api.github
     * .com/users/facebook201/gists{/gist_id}","starred_url":"https://api.github
     * .com/users/facebook201/starred{/owner}{/repo}","subscriptions_url":"https://api.github
     * .com/users/facebook201/subscriptions","organizations_url":"https://api.github
     * .com/users/facebook201/orgs","repos_url":"https://api.github.com/users/facebook201/repos",
     * "events_url":"https://api.github.com/users/facebook201/events{/privacy}",
     * "received_events_url":"https://api.github.com/users/facebook201/received_events",
     * "type":"User","site_admin":false,"score":20.123686},{"login":"fbopen","id":12476,
     * "avatar_url":"https://avatars3.githubusercontent.com/u/12476?v=4","gravatar_id":"",
     * "url":"https://api.github.com/users/fbopen","html_url":"https://github.com/fbopen",
     * "followers_url":"https://api.github.com/users/fbopen/followers",
     * "following_url":"https://api.github.com/users/fbopen/following{/other_user}",
     * "gists_url":"https://api.github.com/users/fbopen/gists{/gist_id}",
     * "starred_url":"https://api.github.com/users/fbopen/starred{/owner}{/repo}",
     * "subscriptions_url":"https://api.github.com/users/fbopen/subscriptions",
     * "organizations_url":"https://api.github.com/users/fbopen/orgs","repos_url":"https://api
     * .github.com/users/fbopen/repos","events_url":"https://api.github
     * .com/users/fbopen/events{/privacy}","received_events_url":"https://api.github
     * .com/users/fbopen/received_events","type":"User","site_admin":false,"score":20.021936},
     * {"login":"Daniel15","id":91933,"avatar_url":"https://avatars2.githubusercontent
     * .com/u/91933?v=4","gravatar_id":"","url":"https://api.github.com/users/Daniel15",
     * "html_url":"https://github.com/Daniel15","followers_url":"https://api.github
     * .com/users/Daniel15/followers","following_url":"https://api.github
     * .com/users/Daniel15/following{/other_user}","gists_url":"https://api.github
     * .com/users/Daniel15/gists{/gist_id}","starred_url":"https://api.github
     * .com/users/Daniel15/starred{/owner}{/repo}","subscriptions_url":"https://api.github
     * .com/users/Daniel15/subscriptions","organizations_url":"https://api.github
     * .com/users/Daniel15/orgs","repos_url":"https://api.github.com/users/Daniel15/repos",
     * "events_url":"https://api.github.com/users/Daniel15/events{/privacy}",
     * "received_events_url":"https://api.github.com/users/Daniel15/received_events",
     * "type":"User","site_admin":false,"score":19.906057},{"login":"yengtong888","id":6171843,
     * "avatar_url":"https://avatars0.githubusercontent.com/u/6171843?v=4","gravatar_id":"",
     * "url":"https://api.github.com/users/yengtong888","html_url":"https://github
     * .com/yengtong888","followers_url":"https://api.github.com/users/yengtong888/followers",
     * "following_url":"https://api.github.com/users/yengtong888/following{/other_user}",
     * "gists_url":"https://api.github.com/users/yengtong888/gists{/gist_id}",
     * "starred_url":"https://api.github.com/users/yengtong888/starred{/owner}{/repo}",
     * "subscriptions_url":"https://api.github.com/users/yengtong888/subscriptions",
     * "organizations_url":"https://api.github.com/users/yengtong888/orgs",
     * "repos_url":"https://api.github.com/users/yengtong888/repos","events_url":"https://api
     * .github.com/users/yengtong888/events{/privacy}","received_events_url":"https://api.github
     * .com/users/yengtong888/received_events","type":"User","site_admin":false,"score":19
     * .489233},{"login":"passy","id":9906,"avatar_url":"https://avatars1.githubusercontent
     * .com/u/9906?v=4","gravatar_id":"","url":"https://api.github.com/users/passy",
     * "html_url":"https://github.com/passy","followers_url":"https://api.github
     * .com/users/passy/followers","following_url":"https://api.github
     * .com/users/passy/following{/other_user}","gists_url":"https://api.github
     * .com/users/passy/gists{/gist_id}","starred_url":"https://api.github
     * .com/users/passy/starred{/owner}{/repo}","subscriptions_url":"https://api.github
     * .com/users/passy/subscriptions","organizations_url":"https://api.github
     * .com/users/passy/orgs","repos_url":"https://api.github.com/users/passy/repos",
     * "events_url":"https://api.github.com/users/passy/events{/privacy}",
     * "received_events_url":"https://api.github.com/users/passy/received_events","type":"User",
     * "site_admin":false,"score":19.050882},{"login":"petehunt","id":239742,
     * "avatar_url":"https://avatars0.githubusercontent.com/u/239742?v=4","gravatar_id":"",
     * "url":"https://api.github.com/users/petehunt","html_url":"https://github.com/petehunt",
     * "followers_url":"https://api.github.com/users/petehunt/followers",
     * "following_url":"https://api.github.com/users/petehunt/following{/other_user}",
     * "gists_url":"https://api.github.com/users/petehunt/gists{/gist_id}",
     * "starred_url":"https://api.github.com/users/petehunt/starred{/owner}{/repo}",
     * "subscriptions_url":"https://api.github.com/users/petehunt/subscriptions",
     * "organizations_url":"https://api.github.com/users/petehunt/orgs","repos_url":"https://api
     * .github.com/users/petehunt/repos","events_url":"https://api.github
     * .com/users/petehunt/events{/privacy}","received_events_url":"https://api.github
     * .com/users/petehunt/received_events","type":"User","site_admin":false,"score":18.940132},
     * {"login":"nlutsenko","id":606991,"avatar_url":"https://avatars0.githubusercontent
     * .com/u/606991?v=4","gravatar_id":"","url":"https://api.github.com/users/nlutsenko",
     * "html_url":"https://github.com/nlutsenko","followers_url":"https://api.github
     * .com/users/nlutsenko/followers","following_url":"https://api.github
     * .com/users/nlutsenko/following{/other_user}","gists_url":"https://api.github
     * .com/users/nlutsenko/gists{/gist_id}","starred_url":"https://api.github
     * .com/users/nlutsenko/starred{/owner}{/repo}","subscriptions_url":"https://api.github
     * .com/users/nlutsenko/subscriptions","organizations_url":"https://api.github
     * .com/users/nlutsenko/orgs","repos_url":"https://api.github.com/users/nlutsenko/repos",
     * "events_url":"https://api.github.com/users/nlutsenko/events{/privacy}",
     * "received_events_url":"https://api.github.com/users/nlutsenko/received_events",
     * "type":"User","site_admin":false,"score":18.681381},{"login":"YamiOdymel","id":7308718,
     * "avatar_url":"https://avatars0.githubusercontent.com/u/7308718?v=4","gravatar_id":"",
     * "url":"https://api.github.com/users/YamiOdymel","html_url":"https://github
     * .com/YamiOdymel","followers_url":"https://api.github.com/users/YamiOdymel/followers",
     * "following_url":"https://api.github.com/users/YamiOdymel/following{/other_user}",
     * "gists_url":"https://api.github.com/users/YamiOdymel/gists{/gist_id}",
     * "starred_url":"https://api.github.com/users/YamiOdymel/starred{/owner}{/repo}",
     * "subscriptions_url":"https://api.github.com/users/YamiOdymel/subscriptions",
     * "organizations_url":"https://api.github.com/users/YamiOdymel/orgs",
     * "repos_url":"https://api.github.com/users/YamiOdymel/repos","events_url":"https://api
     * .github.com/users/YamiOdymel/events{/privacy}","received_events_url":"https://api.github
     * .com/users/YamiOdymel/received_events","type":"User","site_admin":false,"score":18
     * .610834},{"login":"lily-zhangying","id":1710715,"avatar_url":"https://avatars2
     * .githubusercontent.com/u/1710715?v=4","gravatar_id":"","url":"https://api.github
     * .com/users/lily-zhangying","html_url":"https://github.com/lily-zhangying",
     * "followers_url":"https://api.github.com/users/lily-zhangying/followers",
     * "following_url":"https://api.github.com/users/lily-zhangying/following{/other_user}",
     * "gists_url":"https://api.github.com/users/lily-zhangying/gists{/gist_id}",
     * "starred_url":"https://api.github.com/users/lily-zhangying/starred{/owner}{/repo}",
     * "subscriptions_url":"https://api.github.com/users/lily-zhangying/subscriptions",
     * "organizations_url":"https://api.github.com/users/lily-zhangying/orgs",
     * "repos_url":"https://api.github.com/users/lily-zhangying/repos","events_url":"https://api
     * .github.com/users/lily-zhangying/events{/privacy}","received_events_url":"https://api
     * .github.com/users/lily-zhangying/received_events","type":"User","site_admin":false,
     * "score":18.27921},{"login":"facebookstudio","id":4776437,"avatar_url":"https://avatars3
     * .githubusercontent.com/u/4776437?v=4","gravatar_id":"","url":"https://api.github
     * .com/users/facebookstudio","html_url":"https://github.com/facebookstudio",
     * "followers_url":"https://api.github.com/users/facebookstudio/followers",
     * "following_url":"https://api.github.com/users/facebookstudio/following{/other_user}",
     * "gists_url":"https://api.github.com/users/facebookstudio/gists{/gist_id}",
     * "starred_url":"https://api.github.com/users/facebookstudio/starred{/owner}{/repo}",
     * "subscriptions_url":"https://api.github.com/users/facebookstudio/subscriptions",
     * "organizations_url":"https://api.github.com/users/facebookstudio/orgs",
     * "repos_url":"https://api.github.com/users/facebookstudio/repos","events_url":"https://api
     * .github.com/users/facebookstudio/events{/privacy}","received_events_url":"https://api
     * .github.com/users/facebookstudio/received_events","type":"User","site_admin":false,
     * "score":18.12564},{"login":"alanho","id":71258,"avatar_url":"https://avatars2
     * .githubusercontent.com/u/71258?v=4","gravatar_id":"","url":"https://api.github
     * .com/users/alanho","html_url":"https://github.com/alanho","followers_url":"https://api
     * .github.com/users/alanho/followers","following_url":"https://api.github
     * .com/users/alanho/following{/other_user}","gists_url":"https://api.github
     * .com/users/alanho/gists{/gist_id}","starred_url":"https://api.github
     * .com/users/alanho/starred{/owner}{/repo}","subscriptions_url":"https://api.github
     * .com/users/alanho/subscriptions","organizations_url":"https://api.github
     * .com/users/alanho/orgs","repos_url":"https://api.github.com/users/alanho/repos",
     * "events_url":"https://api.github.com/users/alanho/events{/privacy}",
     * "received_events_url":"https://api.github.com/users/alanho/received_events","type":"User",
     * "site_admin":false,"score":18.076618},{"login":"SJYeo","id":4614168,
     * "avatar_url":"https://avatars3.githubusercontent.com/u/4614168?v=4","gravatar_id":"",
     * "url":"https://api.github.com/users/SJYeo","html_url":"https://github.com/SJYeo",
     * "followers_url":"https://api.github.com/users/SJYeo/followers",
     * "following_url":"https://api.github.com/users/SJYeo/following{/other_user}",
     * "gists_url":"https://api.github.com/users/SJYeo/gists{/gist_id}",
     * "starred_url":"https://api.github.com/users/SJYeo/starred{/owner}{/repo}",
     * "subscriptions_url":"https://api.github.com/users/SJYeo/subscriptions",
     * "organizations_url":"https://api.github.com/users/SJYeo/orgs","repos_url":"https://api
     * .github.com/users/SJYeo/repos","events_url":"https://api.github
     * .com/users/SJYeo/events{/privacy}","received_events_url":"https://api.github
     * .com/users/SJYeo/received_events","type":"User","site_admin":false,"score":17.972944},
     * {"login":"zpao","id":8445,"avatar_url":"https://avatars1.githubusercontent
     * .com/u/8445?v=4","gravatar_id":"","url":"https://api.github.com/users/zpao",
     * "html_url":"https://github.com/zpao","followers_url":"https://api.github
     * .com/users/zpao/followers","following_url":"https://api.github
     * .com/users/zpao/following{/other_user}","gists_url":"https://api.github
     * .com/users/zpao/gists{/gist_id}","starred_url":"https://api.github
     * .com/users/zpao/starred{/owner}{/repo}","subscriptions_url":"https://api.github
     * .com/users/zpao/subscriptions","organizations_url":"https://api.github
     * .com/users/zpao/orgs","repos_url":"https://api.github.com/users/zpao/repos",
     * "events_url":"https://api.github.com/users/zpao/events{/privacy}",
     * "received_events_url":"https://api.github.com/users/zpao/received_events","type":"User",
     * "site_admin":false,"score":17.96896},{"login":"rendro","id":422168,
     * "avatar_url":"https://avatars2.githubusercontent.com/u/422168?v=4","gravatar_id":"",
     * "url":"https://api.github.com/users/rendro","html_url":"https://github.com/rendro",
     * "followers_url":"https://api.github.com/users/rendro/followers",
     * "following_url":"https://api.github.com/users/rendro/following{/other_user}",
     * "gists_url":"https://api.github.com/users/rendro/gists{/gist_id}",
     * "starred_url":"https://api.github.com/users/rendro/starred{/owner}{/repo}",
     * "subscriptions_url":"https://api.github.com/users/rendro/subscriptions",
     * "organizations_url":"https://api.github.com/users/rendro/orgs","repos_url":"https://api
     * .github.com/users/rendro/repos","events_url":"https://api.github
     * .com/users/rendro/events{/privacy}","received_events_url":"https://api.github
     * .com/users/rendro/received_events","type":"User","site_admin":false,"score":17.886665},
     * {"login":"facebookgo","id":6497226,"avatar_url":"https://avatars2.githubusercontent
     * .com/u/6497226?v=4","gravatar_id":"","url":"https://api.github.com/users/facebookgo",
     * "html_url":"https://github.com/facebookgo","followers_url":"https://api.github
     * .com/users/facebookgo/followers","following_url":"https://api.github
     * .com/users/facebookgo/following{/other_user}","gists_url":"https://api.github
     * .com/users/facebookgo/gists{/gist_id}","starred_url":"https://api.github
     * .com/users/facebookgo/starred{/owner}{/repo}","subscriptions_url":"https://api.github
     * .com/users/facebookgo/subscriptions","organizations_url":"https://api.github
     * .com/users/facebookgo/orgs","repos_url":"https://api.github.com/users/facebookgo/repos",
     * "events_url":"https://api.github.com/users/facebookgo/events{/privacy}",
     * "received_events_url":"https://api.github.com/users/facebookgo/received_events",
     * "type":"Organization","site_admin":false,"score":17.769289},
     * {"login":"LalaSatalinDeviluke","id":14029133,"avatar_url":"https://avatars2
     * .githubusercontent.com/u/14029133?v=4","gravatar_id":"","url":"https://api.github
     * .com/users/LalaSatalinDeviluke","html_url":"https://github.com/LalaSatalinDeviluke",
     * "followers_url":"https://api.github.com/users/LalaSatalinDeviluke/followers",
     * "following_url":"https://api.github.com/users/LalaSatalinDeviluke/following{/other_user}",
     * "gists_url":"https://api.github.com/users/LalaSatalinDeviluke/gists{/gist_id}",
     * "starred_url":"https://api.github.com/users/LalaSatalinDeviluke/starred{/owner}{/repo}",
     * "subscriptions_url":"https://api.github.com/users/LalaSatalinDeviluke/subscriptions",
     * "organizations_url":"https://api.github.com/users/LalaSatalinDeviluke/orgs",
     * "repos_url":"https://api.github.com/users/LalaSatalinDeviluke/repos",
     * "events_url":"https://api.github.com/users/LalaSatalinDeviluke/events{/privacy}",
     * "received_events_url":"https://api.github.com/users/LalaSatalinDeviluke/received_events",
     * "type":"User","site_admin":false,"score":17.743479},{"login":"CaptureTheBox","id":5272413,
     * "avatar_url":"https://avatars2.githubusercontent.com/u/5272413?v=4","gravatar_id":"",
     * "url":"https://api.github.com/users/CaptureTheBox","html_url":"https://github
     * .com/CaptureTheBox","followers_url":"https://api.github
     * .com/users/CaptureTheBox/followers","following_url":"https://api.github
     * .com/users/CaptureTheBox/following{/other_user}","gists_url":"https://api.github
     * .com/users/CaptureTheBox/gists{/gist_id}","starred_url":"https://api.github
     * .com/users/CaptureTheBox/starred{/owner}{/repo}","subscriptions_url":"https://api.github
     * .com/users/CaptureTheBox/subscriptions","organizations_url":"https://api.github
     * .com/users/CaptureTheBox/orgs","repos_url":"https://api.github
     * .com/users/CaptureTheBox/repos","events_url":"https://api.github
     * .com/users/CaptureTheBox/events{/privacy}","received_events_url":"https://api.github
     * .com/users/CaptureTheBox/received_events","type":"User","site_admin":false,"score":17
     * .728119},{"login":"dstnbrkr","id":32656,"avatar_url":"https://avatars3.githubusercontent
     * .com/u/32656?v=4","gravatar_id":"","url":"https://api.github.com/users/dstnbrkr",
     * "html_url":"https://github.com/dstnbrkr","followers_url":"https://api.github
     * .com/users/dstnbrkr/followers","following_url":"https://api.github
     * .com/users/dstnbrkr/following{/other_user}","gists_url":"https://api.github
     * .com/users/dstnbrkr/gists{/gist_id}","starred_url":"https://api.github
     * .com/users/dstnbrkr/starred{/owner}{/repo}","subscriptions_url":"https://api.github
     * .com/users/dstnbrkr/subscriptions","organizations_url":"https://api.github
     * .com/users/dstnbrkr/orgs","repos_url":"https://api.github.com/users/dstnbrkr/repos",
     * "events_url":"https://api.github.com/users/dstnbrkr/events{/privacy}",
     * "received_events_url":"https://api.github.com/users/dstnbrkr/received_events",
     * "type":"User","site_admin":false,"score":17.694721},{"login":"facebookscript",
     * "id":6749283,"avatar_url":"https://avatars2.githubusercontent.com/u/6749283?v=4",
     * "gravatar_id":"","url":"https://api.github.com/users/facebookscript",
     * "html_url":"https://github.com/facebookscript","followers_url":"https://api.github
     * .com/users/facebookscript/followers","following_url":"https://api.github
     * .com/users/facebookscript/following{/other_user}","gists_url":"https://api.github
     * .com/users/facebookscript/gists{/gist_id}","starred_url":"https://api.github
     * .com/users/facebookscript/starred{/owner}{/repo}","subscriptions_url":"https://api.github
     * .com/users/facebookscript/subscriptions","organizations_url":"https://api.github
     * .com/users/facebookscript/orgs","repos_url":"https://api.github
     * .com/users/facebookscript/repos","events_url":"https://api.github
     * .com/users/facebookscript/events{/privacy}","received_events_url":"https://api.github
     * .com/users/facebookscript/received_events","type":"User","site_admin":false,"score":17
     * .528656},{"login":"viswanathgs","id":172884,"avatar_url":"https://avatars3
     * .githubusercontent.com/u/172884?v=4","gravatar_id":"","url":"https://api.github
     * .com/users/viswanathgs","html_url":"https://github.com/viswanathgs",
     * "followers_url":"https://api.github.com/users/viswanathgs/followers",
     * "following_url":"https://api.github.com/users/viswanathgs/following{/other_user}",
     * "gists_url":"https://api.github.com/users/viswanathgs/gists{/gist_id}",
     * "starred_url":"https://api.github.com/users/viswanathgs/starred{/owner}{/repo}",
     * "subscriptions_url":"https://api.github.com/users/viswanathgs/subscriptions",
     * "organizations_url":"https://api.github.com/users/viswanathgs/orgs",
     * "repos_url":"https://api.github.com/users/viswanathgs/repos","events_url":"https://api
     * .github.com/users/viswanathgs/events{/privacy}","received_events_url":"https://api.github
     * .com/users/viswanathgs/received_events","type":"User","site_admin":false,"score":17.320175}]
     */

    private int total_count;
    private boolean incomplete_results;
    private List<ItemsBean> items;

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public boolean isIncomplete_results() {
        return incomplete_results;
    }

    public void setIncomplete_results(boolean incomplete_results) {
        this.incomplete_results = incomplete_results;
    }

    public List<ItemsBean> getItems() {
        return items;
    }

    public void setItems(List<ItemsBean> items) {
        this.items = items;
    }

    public static class ItemsBean {
        /**
         * login : facebook
         * id : 69631
         * avatar_url : https://avatars3.githubusercontent.com/u/69631?v=4
         * gravatar_id :
         * url : https://api.github.com/users/facebook
         * html_url : https://github.com/facebook
         * followers_url : https://api.github.com/users/facebook/followers
         * following_url : https://api.github.com/users/facebook/following{/other_user}
         * gists_url : https://api.github.com/users/facebook/gists{/gist_id}
         * starred_url : https://api.github.com/users/facebook/starred{/owner}{/repo}
         * subscriptions_url : https://api.github.com/users/facebook/subscriptions
         * organizations_url : https://api.github.com/users/facebook/orgs
         * repos_url : https://api.github.com/users/facebook/repos
         * events_url : https://api.github.com/users/facebook/events{/privacy}
         * received_events_url : https://api.github.com/users/facebook/received_events
         * type : Organization
         * site_admin : false
         * score : 47.342133
         */

        private String login;
        private int id;
        private String avatar_url;
        private String gravatar_id;
        private String url;
        private String html_url;
        private String followers_url;
        private String following_url;
        private String gists_url;
        private String starred_url;
        private String subscriptions_url;
        private String organizations_url;
        private String repos_url;
        private String events_url;
        private String received_events_url;
        private String type;
        private boolean site_admin;
        private double score;

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getAvatar_url() {
            return avatar_url;
        }

        public void setAvatar_url(String avatar_url) {
            this.avatar_url = avatar_url;
        }

        public String getGravatar_id() {
            return gravatar_id;
        }

        public void setGravatar_id(String gravatar_id) {
            this.gravatar_id = gravatar_id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getHtml_url() {
            return html_url;
        }

        public void setHtml_url(String html_url) {
            this.html_url = html_url;
        }

        public String getFollowers_url() {
            return followers_url;
        }

        public void setFollowers_url(String followers_url) {
            this.followers_url = followers_url;
        }

        public String getFollowing_url() {
            return following_url;
        }

        public void setFollowing_url(String following_url) {
            this.following_url = following_url;
        }

        public String getGists_url() {
            return gists_url;
        }

        public void setGists_url(String gists_url) {
            this.gists_url = gists_url;
        }

        public String getStarred_url() {
            return starred_url;
        }

        public void setStarred_url(String starred_url) {
            this.starred_url = starred_url;
        }

        public String getSubscriptions_url() {
            return subscriptions_url;
        }

        public void setSubscriptions_url(String subscriptions_url) {
            this.subscriptions_url = subscriptions_url;
        }

        public String getOrganizations_url() {
            return organizations_url;
        }

        public void setOrganizations_url(String organizations_url) {
            this.organizations_url = organizations_url;
        }

        public String getRepos_url() {
            return repos_url;
        }

        public void setRepos_url(String repos_url) {
            this.repos_url = repos_url;
        }

        public String getEvents_url() {
            return events_url;
        }

        public void setEvents_url(String events_url) {
            this.events_url = events_url;
        }

        public String getReceived_events_url() {
            return received_events_url;
        }

        public void setReceived_events_url(String received_events_url) {
            this.received_events_url = received_events_url;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public boolean isSite_admin() {
            return site_admin;
        }

        public void setSite_admin(boolean site_admin) {
            this.site_admin = site_admin;
        }

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }
    }
}
